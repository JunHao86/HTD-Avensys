import { NavLink, Route, Routes, BrowserRouter } from "react-router-dom" 
import { Home } from "./home"
import { About } from "./about"
import { Services } from "./services"


export function Navbar(){
    return(
    <nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <img width={100} height={50}src="https://www.edigitalagency.com.au/wp-content/uploads/Netflix-logo-red-black-png.png"/>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
        
        
        <ul class="navbar-nav">
            <BrowserRouter>
            <li class="nav-item">
                <a class="nav-link" aria-current="page" href="#">
                    <NavLink to="/home">Home</NavLink>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">
                    <NavLink to="/about">About</NavLink>
                </a>
                </li>
            <li class="nav-item">
                <a class="nav-link" href="#">
                <NavLink to="/services">Services</NavLink>
                </a>
            </li>
            <Routes>
                <Route path="/home" element={<Home/>}></Route>
                <Route path="/about" element={<About/>}></Route>
                <Route path="/services" element={<Services/>}></Route>
            </Routes>
            </BrowserRouter>
        </ul>
        

        </div>
    </div>
    </nav>
    )
}

export default Navbar