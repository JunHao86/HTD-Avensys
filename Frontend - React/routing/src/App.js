import { BrowserRouter, Routes, Route, Link } from 'react-router-dom'
import { Mobile } from './Components/mobile';
import { Laptop } from './Components/laptop';
import { Book } from './Components/book';
import './App.css';

function App() {

  return (
    <div className="App" >
        <h1> Welcome to React</h1>
        {/* --------------------------------- */}
        {/* Routing */}
        <br/>

        <div>
        <BrowserRouter>
          <ul class="list-group list-group-horizontal list-group-item-primary">
            <li class="list-group-item">
              <Link to="/mobile">Mobile</Link>
            </li>
            <li class="list-group-item">
              <Link to="/laptop">Laptop</Link>
            </li>
            <li class="list-group-item">
              <Link to="/book">Book</Link>
            </li>
          </ul>

            <Routes>
              <Route path="/mobile" element={<Mobile/>}/>
              <Route path="/laptop" element={<Laptop/>}/>
              <Route path="/book" element={<Book/>}/>
            </Routes>

          </BrowserRouter>
        </div>
     </div>
  )
}

export default App;
