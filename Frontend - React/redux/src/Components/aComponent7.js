import { useSelector } from "react-redux";

//Duplicate of Component6, to prove multiple components can 
//take data from single Provider tag in index.js

export function Component7()
{
    const output = useSelector(function(data)
    {
        return data.store.store[0]
    })

    return(
        <div>
            <h3> From Component7</h3>
            {
                output.map(function(i)
                {
                    return <h4>{i.title}</h4>
                })
            }
        </div>
    )
}