import './App.css';
import { WeatherCard } from './Components/card';
import  get  from "axios"
import react from "react"

const key = "http://api.weatherapi.com/v1/current.json?key=6419a10226514070a79115226230606&q=singapore&aqi=no"

function App() {
 
  const [text,setText] = react.useState("")
  const [icon,setIcon] = react.useState("")
  const [temp,setTemp] = react.useState("")
  const [location,setLocation] = react.useState("")

  react.useEffect(function(){
    get(key)
    .then(function(result){
      console.log(result.data)
        setLocation(result.data.location.country)
        setIcon(result.data.current.condition.icon)
        setText(result.data.current.condition.text)
        setTemp(result.data.current.temp_c)
    })
    .catch(function(error){
        console.log(error)
    })
  },[])

  return (
  <div className="App" >
        <h1> Welcome to React</h1>
        {console.log(icon)}
        {console.log(text)}
        <div style={{display:"flex"}}>
          <WeatherCard image={icon} temp_c={temp} weather={text} location={location}/>
          <WeatherCard image="//cdn.weatherapi.com/weather/64x64/day/116.png" temp_c="placeholder2" weather="placeholder3" location="1"/>
          <WeatherCard image="//cdn.weatherapi.com/weather/64x64/day/116.png" temp_c="placeholder3" weather="placeholder4" location="1"/>
          <WeatherCard image="//cdn.weatherapi.com/weather/64x64/day/116.png" temp_c="placeholder4" weather="placeholder5" location="1"/>
        </div>
  </div>
  )
}

export default App;
