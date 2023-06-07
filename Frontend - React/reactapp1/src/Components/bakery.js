//060623 - Redux Store

const {createStore} = require("redux")

//State
const initialData = { amt_Chocolate: 20 }

//Action
function buy()
{
    return{
        actionName: "BUY_CHOCOLATE"
    }
}
//Reducer
    //Takes initialData and keep inside Bakery
const chocolateShopKeeper = (state, action)=>{
    state = initialData

    if (action.actionName == "BUY_CHOCOLATE"){
        return{
            amt_Chocolate: state.amt_Chocolate - 1
        }
    }
    else{
        return state
    }
}

//Redux Store
    //Store the reducer
const bakery = createStore(chocolateShopKeeper)

//Subscribe
bakery.subscribe(function()
{
    console.log(bakery.getState())
})

//Called by bakery customer
bakery.dispatch(buy())

