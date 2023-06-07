//060623 - Redux Store

// Customer BUY_ICECREAM, BUY_CAKE -> ShopKeeper -> Creamery (20 ICECREAM, 30 CAKE)

const {createStore, combineReducers} = require("redux")

//State
// const initialData = { amt_IceCream: 20, amt_Cakes: 30}
const iceCreamData = { amt_IceCream: 20 }
const cakeData = { amt_Cakes: 30 }

//Action
function buyIceCream()
{
    return{
        type: "BUY_ICECREAM"
    }
}

function buyCake()
{
    return{
        type: "BUY_CAKE"
    }
}



//Reducer
    //Takes initialData and keep inside Bakery

//Method One, one reducer to handle both IceCream/Cakes
// const theReducer = (state=initialData, action)=>{

//     if (action.type == "BUY_ICECREAM"){
//         return{
//             amt_IceCream: state.amt_IceCream - 1,
//             amt_Cakes: state.amt_Cakes
//         }
//     }
//     if (action.type == "BUY_CAKE"){
//         return{
//             amt_IceCream: state.amt_IceCream,
//             amt_Cakes: state.amt_Cakes - 1
//         }
//     }
//     else{
//         return state
//     }
// }
//Method Two, combined Reducers
//Define individual IceCream reducer / Cake reducer
const reducer_IceCream = (state = iceCreamData,action)=>{
    if (action.type == "BUY_ICECREAM"){
        return{
            amt_IceCream: state.amt_IceCream - 1
        }
    }
    else{
        return state
    }
}
const reducer_Cake = (state = cakeData,action)=>{
    if (action.type == "BUY_CAKE"){
        return{
            amt_Cakes: state.amt_Cakes - 1
        }
    }
    else{
        return state
    }
}
//Combine them after defining
const root_reducer = combineReducers({
    icecream: reducer_IceCream,
    cake: reducer_Cake
})

//Redux Store
    //Store the reducer
const creamery = createStore(root_reducer)

//Subscribe
creamery.subscribe(function()
{
    console.log(creamery.getState())
})

//Called by customer
creamery.dispatch(buyIceCream())
creamery.dispatch(buyIceCream())
creamery.dispatch(buyCake())
creamery.dispatch(buyIceCream())
creamery.dispatch(buyCake())
creamery.dispatch(buyIceCream())
creamery.dispatch(buyCake())
