import {useState} from "react"

//Re-written version of Todo.js from 050623

export function Component1(){

    //default array
    const [data,setData] = useState(["Default1","Default2"])

    //setTask function updates data to variable variable
    const [input,setInput] = useState()

    //called for every change in textbox
    function collectData(event)
    {
        let deliverable = event.target.value
        setInput(deliverable)
    }

    function saveToData()
    {
        //button logic to send data to array, and update it
        //...array - takes all old elements in current array
        //input     - value in textbox e.g. coding 
        //setData- takes both data sources and sets it
        setData([...data,input])
    }

    return(
        <div>
            <div>
                Enter input here : <input type="text" onChange={collectData}/>
                <button onClick={saveToData}>Submit</button>
            </div>
            <div>
            {
                data.map(function(i)
                {
                    return <li>{i}</li>
                })
            }
            </div>
        </div>
    )
}