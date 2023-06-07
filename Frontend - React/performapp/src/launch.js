import { useState } from "react"

export function Launch(){
    //Proof of re-render/re-execute via change of state in Component
    //Performance issue
    // console.log("*******") 

    const [number,setNumber] = useState(0)

    function cube(num)
    {
        //Logic to find cube of number
        return num * num * num
    }

    let zxc = cube(number)

    function increaseIt(){
        setNumber(number+1)
    }

    function decreaseIt(){
        setNumber(number-1)
    }

    return(
        <div>
            <h2> Number is {number}, Cube is {zxc} </h2>
            <button onClick={increaseIt}>Increase</button>
            <button onClick={decreaseIt}>Decrease</button>
        </div>
    )
}