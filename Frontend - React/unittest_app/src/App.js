import './App.css';
import {useState, useEffect} from "react";


function App() {
  
  const [count, setCount] = useState(0)
  const [data, setData] = useState([])

  useEffect(function(){
    fetch("https://fakestoreapi.com/products")
    .then(function(result){
      return result.json()
    })
    .then(function(output){
      setData(output)
    })
    .catch(function(error){
      console.log(error)
    })
  })

  function increaseIt(){
    setCount(count+1)
  }


  return (
    <div>
      <div>
        <h1 data-testid="countvalue">{count}</h1>
        <h2> Testing React Code </h2>
        <button onClick={increaseIt}>Increase</button>
        <br/>
      </div>
      <div>
        {
          data.map(function(i){
            return <li>{i.title}</li>
          })
        }
      </div>
    </div>
  );
}

export default App;