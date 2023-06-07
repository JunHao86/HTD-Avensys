import  get  from "axios"
import { useEffect,useState } from "react"

export function Ecommerce(){

    const [productData,setProductData] = useState([])

    //Write logic to connect to FakeStoreAPI

    //UseEffect works in the background to attempt
    //to make API Calls (e.g. to FakeStoreAPI, and if possible
    //retrieve data from FakeStoreAPI)
    useEffect(function(){
        get("https://fakestoreapi.com/products")
        .then(function(result){
            // console.log(result.data)
            setProductData(result.data)
        })
        .catch(function(error)
        {
            console.log(error)
        })
    })

    return(
        <div>
            <h2>Ecommerce</h2>
            {
                //i points to each object
                productData.map(function(i)
                {
                    //proof of concept
                    // console.log(i)

                    return(
                        <div>
                            <h5>{i.title}</h5>
                    
                            <img src={i.image} width={20} height={20}/>
                        </div>
                    )
                })
            }
        </div>
    )

}

//React Appn > Fakestore API > Fake Details
//Ecommerce Website > Image of products,price,name,description