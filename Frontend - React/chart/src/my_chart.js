import { Bar,Line,Scatter,Bubble,Doughnut } from "react-chartjs-2"
import { worldCovidData } from "./covid_data"
import { useState } from "react"
import { Chart } from 'chart.js/auto'

export function MyChart(){

    const [chartData,setChartData] = useState({
        
        //x-axis data
        labels:worldCovidData.map(function(i){
            //Labels [2020,2021,2023]
            return i.year
            
        }),
        //y-axis data
        datasets:[{
            label:"Covid Cases",
            data: worldCovidData.map(function(i){
                //Labels [1.4,1.1,0.7]
                return i.cases
            }),
            backgroundColor:["green","blue","orange"]
        }]
    })

    return(
        <div style={{width:800, height:600}}>
            <Bar data={chartData}/>
            <Line data={chartData}/>
            <Scatter data={chartData}/>
            <Bubble data={chartData}/>
            <Doughnut data={chartData}/>
        </div>
    )
}