import  get  from "axios"
import { useEffect,useState } from "react"
import { add } from "./redux2"
import { useDispatch } from "react-redux"

export function FakeStoreAPI(){

    const dp = useDispatch()

    
    const [data,setData] = useState([])

    useEffect(function(){
        get("https://fakestoreapi.com/products")
        .then(function(result){
            setData(result.data)
        })
        .catch(function(error)
        { 
            console.log(error)
        })
    },[])

    dp(add(data))


    return(
        <div>
            {/* <h2>From Component5</h2>
            {
                //i points to each object
                data.map(function(i)
                {
                    // proof of concept
                    console.log(i)

                    // return(
                    //     <div>
                    //         <h5>{i.title}</h5>
                    
                    //         <img src={i.image} width={20} height={20}/>
                    //     </div>
                    // )
                })
            } */}
        </div>
    )
}