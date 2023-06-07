import "./Demo.css"

//050623

export function Contact(data) {
  return (
    <div>
        <div class="card" style={{width:"18rem"}}>
        <img width="100px" height="300px" src={data.image} class="card-img-top" alt="..."/>
        <div class="card-body">
            <h5 class="card-title">{data.name}</h5>
            <p class="card-text">{data.message}</p>
            <a href="#" class="btn btn-primary">Start up a conversation</a>
        </div> 
        </div>
    </div>
  )
}
