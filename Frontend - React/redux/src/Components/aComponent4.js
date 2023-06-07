import { useSelector } from "react-redux";

//Duplicate of Component3, to prove multiple components can 
//take data from single Provider tag in index.js

export function Component4()
{
    const output = useSelector(function(data)
    {
        return data.task.tasks     
    })

    return(
        <div>
            <h3> From Component4 </h3>
            {
                output.map(function(i)
                {
                    return <h4>{i}</h4>
                })
            }
        </div>
    )
}