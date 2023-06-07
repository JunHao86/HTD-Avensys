import {render} from "react-dom"
import { MyChart } from "./my_chart.js"

function App()
{
    return(
        <div style={{width:800, height:600}}> 
            <h1> Welcome</h1>
            <MyChart/>
        </div>
    )
}

render(<App/>,document.getElementById("root"))