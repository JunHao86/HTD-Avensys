import React from 'react'
import get from "axios"
import {useEffect, useState} from "react"
import "./style.css"
import movieTrailer from "movie-trailer"
import Youtube from "react-youtube"

//https://api.themoviedb.org/3/discover/movie?api_key=7698c174ffb539d18437d31eba0ecbde&with_genres=35

export function ComedyMovies() {
    const imageprefix = "https://image.tmdb.org/t/p/original"
    const [comedyMovies,setComedyMovies] = useState([])
    const [videoId, setVideoId] = useState("")
    const controls = {width:"100%",height:"500px",playerVars:{autoplay:1}}

    useEffect(function(){
        get("https://api.themoviedb.org/3/discover/movie?api_key=7698c174ffb539d18437d31eba0ecbde&with_genres=35")
        .then(function(output){
            console.log(output.data.results)
            setComedyMovies(output.data.results)
        })
        .catch(function(error){
            console.log(error)
        })
    },[])

    //Trailer Step 2: Handle onClick function
    function handleClick(movieName)
    {
        // If trailer is there, provides output
        // Else provides error
        movieTrailer(movieName)
        .then(function(trailerLink){
            
            //Extract videoId
            const myVideoId = new URLSearchParams(new URL(trailerLink).search).get("v")
            //useState and set
            setVideoId(myVideoId)
        })
        .catch(function(error){
            console.log(error)
        })
    }


    return (
    <div>
        <div className="imagecontainer" style={{display:"flex", overflowX: "auto" }}>
        {
            comedyMovies.map(function(i){
                const path = imageprefix + i.poster_path
                //Trailer Step 1: onClick function to get title of movie
                return <img onClick={()=>{handleClick(i.title)}} 
                src={path} width={100} height={150} 
                style={{margin:10}}/>
            })
        }
        </div>
        <div>
            {/* Play trailer */}
            {/* Trailer Step 3 : Pass videoId and play video */}
            {videoId && <Youtube videoId={videoId} opts={controls}/>}
        </div>
    </div>
    )
}

export default ComedyMovies