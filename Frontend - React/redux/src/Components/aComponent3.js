import { useSelector } from "react-redux";

//useSelector to access/read data from taskStore

export function Component3()
{
    const output = useSelector(function(data)
    {
        return data.task.tasks        
    })

    return(
        <div>
            <h3> From Component3 </h3>
            {
                output.map(function(i)
                {
                    return <h4>{i}</h4>
                })
            }
        </div>
    )
}