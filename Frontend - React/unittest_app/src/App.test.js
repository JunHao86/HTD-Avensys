import {render,screen} from "@testing-library/react"
import App from "./App.js"

//Test Suite 1
describe("First collection of Tests, async/onClick",function(){
  //Test Case 1
  test("TC-1, await find TRC",async function(){

    //Testing App Component
    //screen variable stores <App>
    render(<App/>)

    // Does not take as much time as findByText (1-2s), getByText
    // If text is to be loaded into application eventually, async+await findByText
    const myData = await screen.findByText("Testing React Code")
    //myData = <h2>Testing React Code</h2>

    //Check data/code is present in component
    expect(myData).toBeInTheDocument()
  })  

  //Test Case 2
  test("TC-2, get TRC",  function(){
    
    render(<App/>) 
    const myData2 =  screen.getByText("Testing React Code")
    expect(myData2).toBeInTheDocument()
  })

  //Test Case 3
  test("TC-3, countvalue initial = 0", function(){
    // logic
    render(<App/>)
    const myData = Number(screen.getByTestId("countvalue").innerHTML)
    expect(myData).toEqual(0)
  })

  //Test Case 4
  // test("TC-4, async countvalue increase", async function(){
    
  //   render(<App/>) 
  //   const myButton = screen.getByRole("button",{name:"Increase"})
  //   await userEvent.click(myButton)

  //   const newCount = Number(screen.getByTestId("countvalue").innerHTML)
    
  //   expect(newCount).toEqual(1)

  //   const myData2 =  screen.getByText("Testing React Code")
  //   expect(myData2).toBeInTheDocument()
  // })
})

describe("Second collection of Tests, axios/useEffect", function(){
  test("TC-1, li tag length minimum = 1", async function(){

    render(<App/>)
    const allListItems = await screen.findAllByRole("listitem")
    //["a","b","c",...]
    expect(allListItems).toHaveLength(20)
  })  
})