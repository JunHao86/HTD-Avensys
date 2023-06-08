import {useState,useEffect} from "react"
import { db } from "./Firebase"

export function Data()
{
    const [myTitle,setMyTitle] = useState("")
    const [myDescription,setMyDescription] = useState("")
    const [mySnapshot,setMySnapshot] = useState([])

    function collectTitle(event){
        setMyTitle(event.target.value)
    }

    function collectDescription(event){
        setMyDescription(event.target.value)
    }

    function saveData(){
        try{
        db.collection("myData").add({ "title" :myTitle, "description": myDescription})
        }catch(e){
            alert(e)
        }
    }

    useEffect(function(){
        //Logic to read data from firestore database
        db.collection("myData").onSnapshot(function(snapshotData){
            //snapshotData=[Doc1,Doc2,Doc3]
            //Use const to store via useState
            const ssdata = snapshotData.docs.map(function(i){
                
                //console.log(i.data())
                return(
                    i.data()
                )
            })
            setMySnapshot(ssdata)
        })
    },[])
    
    

    return(
        <div>
            <h2>From Data()</h2>
            Enter Title: <input type="text" onChange={collectTitle}/><br/>
            Enter Description: <textarea onChange={collectDescription}/>


            <h3>myTitle = "{myTitle}"</h3>
            <h4>myDescription = "{myDescription}"</h4>
            <button onClick={saveData}>Save</button>


            <table>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>
                    </tr>
                <tbody>
                {
                    mySnapshot.map((data,index) => (
                        <tr key={index}>
                            <td>{data.title}</td>
                            <td>{data.description}</td>
                        </tr>
                ))}
                </tbody>
                
            </table>
        </div>
    )
}