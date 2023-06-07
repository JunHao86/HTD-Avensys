//060623 - Redux Store

// Customer BUY_LAPTOP, SELL_LAPTOP -> ShopKeeper -> Laptopery (40 Laptops)

const {createStore} = require("redux")

//State
const initialData = {amt_laptop : 40}

//Action
function buyLaptop()
{
    return{
        type: "BUY_LAPTOP"
    }
}

//Action
function sellOldLaptop()
{
    return{
        type: "SELL_LAPTOP"
    }
}

//Reducer
    //Takes initialData and keep inside Laptopery
const theReducer = (state=initialData, action)=>{

    if (action.type == "BUY_LAPTOP"){
        return{
            amt_laptop: state.amt_laptop + 1,
        }
    }
    if (action.type == "SELL_LAPTOP"){
        return{
            amt_laptop: state.amt_laptop - 1,
        }
    }
    else{
        return state
    }
}

//Redux Store
    //Store the reducer
const laptopery = createStore(theReducer)

//Subscribe
laptopery.subscribe(function()
{
    console.log(laptopery.getState())
})

//Called by customer
laptopery.dispatch(buyLaptop())
laptopery.dispatch(buyLaptop())
laptopery.dispatch(sellOldLaptop())
laptopery.dispatch(sellOldLaptop())
laptopery.dispatch(sellOldLaptop())




