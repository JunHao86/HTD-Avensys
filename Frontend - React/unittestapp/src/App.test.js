import {render,screen} from "@testing-library/react"
import {App} from "./index.js"

//Test one

test("Check if App component return Testing",function(){

    //Testing App Component
    //screen variable stores <App>
    render(<App/>)
    const myData = screen.findByText("Testing React Code")

    //myData = <h2>Testing React Code</h2>


    //Check data/code is present in component
    expect(myData).toBeInTheDocument()

})