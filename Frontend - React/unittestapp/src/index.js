import {render} from "react-dom"

function App(){
    return(
        <div>
            <h1> Unit Test</h1>
            <h2> Testing React Code</h2>
        </div>
    )
}

render(<App/>,document.getElementById("root"))