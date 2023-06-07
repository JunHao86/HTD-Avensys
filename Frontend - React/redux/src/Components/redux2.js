

//FakeStore API - Product Details
//Keep in Redux Store
//Send data to multiple components

//Store in Redux
const {createStore,combineReducers} = require("redux")

//State (Initial tasks)
const initialData={
    store:[]
}

//Action 
export function add(data){
    return{
        type: "ADD_FAKESTORE",
        payload: data 
        //Payload: data from aComponent5
    }
}

//Reducer
//Takes initialData and keep inside Bakery
const fakestoreReducer = (state,action)=>{
    state = initialData
    
    if (action.type == "ADD_FAKESTORE"){
        //Add task associated with payload key to redux store
        return{
            store:[action.payload]
        }
    }
    else{
        return state
    }  
}

//Combined Reducers
//Add other reducers here (if applicable)
const root_reducer = combineReducers({
    store: fakestoreReducer
})

//Redux Store, and store Reducer
export const fakestoreStore = createStore(root_reducer)

//Subscribe
fakestoreStore.subscribe(function()
{
    console.log(fakestoreStore.getState())
})

// If a function is returning an action, it should be given to dispatch()
// Condition: ONLY REDUX

// If a function is returning an action, it should be given to useDispatch()
// Condition: REDUX + REACT(or other component)