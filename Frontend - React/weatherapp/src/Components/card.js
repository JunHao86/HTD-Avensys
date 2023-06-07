// https://www.weatherapi.com/docs/

// Imagine you're building a weather app that fetches weather data from an API.
// The app displays the current temperature, weather description,
// and an image corresponding to the weather condition. 

// const key = "http://api.weatherapi.com/v1/current.json?key=6419a10226514070a79115226230606&q=singapore&aqi=no"
// https://legacy.reactjs.org/docs/hooks-effect.html
// 1. Current Temp - [current.temp_c] 
// 2. Weather Description - data.weather - [current.condition.text]
// 3. Image Correspondence - data.image - [current.condition.icon]
// 4. Selected Country - data.location - [location.country]

//Your task is to implement a feature that updates the weather information every 5 minutes
//to provide the most up-to-date data to the users.

// Using the useState() and useEffect() hooks,
// how would you approach this scenario? 

// Describe the steps you would take and explain the reasoning behind your choices.

// Consider the state variables needed to store the weather data,
// the effect dependencies, 
// and how to handle the API requests efficiently to avoid excessive fetching or unnecessary re-renders.

const key = "http://api.weatherapi.com/v1/current.json?key=6419a10226514070a79115226230606&q=singapore&aqi=no"

export function WeatherCard(data){
    
    return (
       
        <div>
            <div class="card" style={{width:"18rem"}}>
                <h2>{data.location}</h2>
                <img src={data.image} class="card-img-top" alt="No image found"/>
                <div class="card-body">
                    <h5 class="card-title">{data.temp_c}</h5>
                    <p class="card-text">{data.weather}</p>
                </div> 
            </div>
        </div>
      )
}