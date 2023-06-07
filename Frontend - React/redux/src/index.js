import {render} from "react-dom"
import { Provider } from "react-redux"
// 050623 Todo re-write
import { Component1 } from "./Components/aComponent1"
// 070623 Example
import { Component2 } from "./Components/aComponent2"
import { Component3 } from "./Components/aComponent3"
import { Component4 } from "./Components/aComponent4"
import { taskStore } from "./Components/redux"
// 070623 Assignment
import { FakeStoreAPI } from "./Components/aComponent5"
import { Component6 } from "./Components/aComponent6"
import { Component7 } from "./Components/aComponent7"
import { fakestoreStore } from "./Components/redux2"

function App()
{
    return(
        <div>
            <h1> Welcome</h1>
            {/* Used to see if can interact and insert data into redux */}
            {/* <Component2/> */}

            {/* Used to see if other components, multiple components can read data */}
            {/* For use with Component2,taskStore */}
            {/* <Component3/>
            <Component4/> */}

            {/* For use with 070623 assignment */}

            {/* Store details of FakeStore API in Redux Store */}
            <FakeStoreAPI/>

            {/* Used to see if other components, multiple components can read data */}
            {/* For use with FakeStore API */}
            <Component6/>
            <Component7/>
        </div>
    )
}

//Switch to second render statement for 070623 assignment

// render(<Provider store={taskStore}><App/></Provider>,document.getElementById("root"))
render(<Provider store={fakestoreStore}><App/></Provider>,document.getElementById("root"))