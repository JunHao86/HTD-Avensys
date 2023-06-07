import { useSelector } from "react-redux";

export function Component6()
{
    const output = useSelector(function(data)
    {
        return data.store.store[0]
    })

    return(
        <div class="bg-primary-subtle">
            <h3> From Component6</h3>
            {
                output.map(function(i)
                {
                    return <h4>{i.title}</h4>
                })
            }
        </div>
    )
}