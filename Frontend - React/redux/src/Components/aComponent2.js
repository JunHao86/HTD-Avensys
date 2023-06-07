import {useState} from "react"
import { add } from "./redux"
import { useDispatch } from "react-redux"

//Re-written version of Todo.js from 050623
//Implementing redux (install redux/react-redux first)

export function Component2(){

    const dp = useDispatch()
    ////For dealing with onChange in text input box

    //setTask function updates data to variable variable
    const [input,setInput] = useState()

    //called for every change in textbox
    function collectData(event)
    {
        let deliverable = event.target.value
        setInput(deliverable)
    }

    ////For dealing with onClick in button
    function sendData()
    {
        //Task and Redux Store can be in different file
        //Task(Playing) and Redux Store must be in Same File
        //Logic to send the data in task variable(Playing)
        //Send to Redux store in Redux file

        dp(add(input))
    }


    //For each React component to manage/pass data, use a Provider tag
    //  -Inefficient, slows down system if there are many tags
    //
    //Better alternative, wrap Provider tag in App Component (index.js)
    return(
        <div>
            <h2> From aComponent2 </h2>

            <div>
                Enter input here : <input type="text" onChange={collectData}/>
                <button onClick={sendData}>Submit</button>
            </div>
            <div>
            {
                // data.map(function(i)
                // {
                //     return <li>{i}</li>
                // })
            }
            </div>
        </div>
    )
}