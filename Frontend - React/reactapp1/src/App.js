
import './App.css';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom'
import { Login } from './Components/login';
import { Mobile } from './Components/mobile';
import { Contact } from './Components/contact';
import { useState,createContext } from "react"
export const myBasket = createContext()


function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false)
  //isLoggedIn = true (User is logged in)


  function pleaseLogOut()
  {
    console.log("logout")

    //Logic to logout from application, and redirect to login page
    setIsLoggedIn(false)
    window.location.pathname="/login"
  } 

  return (
    <div className="App" >
        <h1> Welcome to React</h1>
        {/* --------------------------------- */}
        {/* Routing */}
        {/* mobile.js */}
        <br/>

        <div style={{display:"flex"}}>
          <BrowserRouter>
            <Link to="/mobile">Mobile</Link>
            <Routes>
              <Route path="/mobile" element={<Mobile/>}/>
            </Routes>
          </BrowserRouter>
        </div>

        {/* --------------------------------- */}
        {/* Login/Logout Auth using Google Authentication */}
        {/* firebase.js, login.js */}
        <br/>

        <div style={{display:"flex"}}>
          <BrowserRouter>
            {/* display button */}
            {isLoggedIn ? <button onClick={pleaseLogOut}>Logout</button> : <Link to="/login">Login</Link>} 
            <br/> 
            
            <Routes>
              {/* login.js for use with firebase.js */}
              <Route path="/login" element=
              {
                <myBasket.Provider value={{ set : setIsLoggedIn }}>
                <Login/>
                </myBasket.Provider>
              }
              ></Route>
            </Routes>
          </BrowserRouter>
        </div>

        {/* --------------------------------- */}
        {/* One component, pass in data */}
        {/* contact.js */}
        <br/>
        
        <div style={{display:"flex"}}>
          <Contact image="https://yt3.googleusercontent.com/ytc/AGIKgqM5dw5ZVAuz4UkSPxoKSqagE17Q1pj4zkGPS9L3=s900-c-k-c0x00ffffff-no-rj" name="James Hoffman" message="Coffee!"/>
          <Contact image="https://yt3.googleusercontent.com/tGVMddNMdUHLv2zoH7OBL4e4yIle3e6dJV8qmfBinzckCcgzMPoh3NnxuEwAcWasarTx5x4o=s900-c-k-c0x00ffffff-no-rj"name="The Cherno" message="C++ Bootcamp!"/>
          <Contact image="https://yt3.googleusercontent.com/ytc/AGIKgqM5dw5ZVAuz4UkSPxoKSqagE17Q1pj4zkGPS9L3=s900-c-k-c0x00ffffff-no-rj" name="James Hoffman" message="Coffee!"/>
          <Contact image="https://yt3.googleusercontent.com/tGVMddNMdUHLv2zoH7OBL4e4yIle3e6dJV8qmfBinzckCcgzMPoh3NnxuEwAcWasarTx5x4o=s900-c-k-c0x00ffffff-no-rj"name="The Cherno" message="C++ Bootcamp!"/>
          <Contact image="https://yt3.googleusercontent.com/ytc/AGIKgqM5dw5ZVAuz4UkSPxoKSqagE17Q1pj4zkGPS9L3=s900-c-k-c0x00ffffff-no-rj" name="James Hoffman" message="Coffee!"/>
        </div>

        {/* --------------------------------- */}
        {/* Retrieving from API */}
        <br/>
        
        <div style={{display:"flex"}}>
          {/* <Ecommerce/> */}
        </div>
     </div>
  )
}

export default App