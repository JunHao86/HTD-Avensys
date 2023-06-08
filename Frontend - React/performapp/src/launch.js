import { useState,useMemo } from "react"

export function Launch(){
    //Proof of re-render/re-execute via change of state in Component
    //Performance issue
    // console.log("*******") 

    const [number,setNumber] = useState(0)

    const [enteredName, setEnteredName] = useState("")

    // enteredName = "Raju"

    function cube(num)
    {
        let i = 0
        let anotherNum
        //Logic to exhibit performance issue (comment either)
        while (i<100000000)
        {
            anotherNum = num * num * num
            i++
        }
        //Standard Logic to find cube of number (comment either)
        // anotherNum = num * num * num
        
        return anotherNum
    }

    //Cube function called when data in number variable changes
    let result = useMemo(function(){
        return cube(number)
    },[number])

    function increaseIt(){
        setNumber(number+1)
    }

    function decreaseIt(){
        setNumber(number-1)
    }

    function collectIt(event){
        setEnteredName(event.target.value)
    }



    return(
        <div>
            <h2> Number is {number}, Cube is {result} </h2>
            <button onClick={increaseIt}>Increase</button>
            <button onClick={decreaseIt}>Decrease</button>

            <h2> Name is {enteredName}</h2>
            Enter name: <input type="text" onChange={collectIt}></input>
        </div>
    )
}