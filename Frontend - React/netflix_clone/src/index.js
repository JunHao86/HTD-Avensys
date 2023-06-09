import {render} from "react-dom"
import { Navbar } from "./Components/navbar"
import ActionMovies from "./Components/ActionMovies"
import ComedyMovies from "./Components/ComedyMovies"
import "./Components/style.css"

// Use The Movie Database

//  1.  Header (Navbar)
//  2.  Main Carousell
//  3.  Carousell based on Genre
//  4.  Google Authentication in Navbar
//  5.  Trailers for movies (npm install react-youtube, movie-trailer)
//      movie-trailer -> for movie if available or not in youtube
//      if no trailer available: nothing can be done
//
//      react-youtube -> 
//      if trailer    availabe: get link, use in React app
      

// API Key @ TMDB : 7698c174ffb539d18437d31eba0ecbde
// Usage: https://api.themoviedb.org/3/discover/movie?api_key=<key here>&with_genres=<genre num>
// https://api.themoviedb.org/3/discover/movie?api_key=7698c174ffb539d18437d31eba0ecbde&with_genres=28

function App()
{
    return(
        <div class="p-3 mb-2 bg-black text-white">
            <Navbar/>
    
            <h2> Action Movies </h2>
            <ActionMovies/>

            <br/>

            <h2> Comedy Movies </h2>
            <ComedyMovies/>

            <br/>

            <h1> and much more ... </h1>
        </div>
    )
}

render(<App/>,document.getElementById("root"))