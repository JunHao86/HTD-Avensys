//Store in Redux
const {createStore,combineReducers} = require("redux")

//State (Initial tasks)
const initialData={
    tasks: ["Cooking","Coding"]
}

//Action 
export function add(data){
    return{
        type: "ADD_TASK",
        payload: data   
        //payload: "Playing" from aComponent2
    }
}

//Reducer
//Takes initialData and keep inside Bakery
const taskReducer = (state, action)=>{
    state = initialData
    if (action.type === "ADD_TASK"){
        //Add task associated with payload key to redux store
        return{
        tasks:[...state.tasks,action.payload]
        }
    }
    else{
        return state
    }
    
}

//Combined Reducers
//Add other reducers here (if applicable)
const root_reducer = combineReducers({
    task: taskReducer
})

//Redux Store, and store Reducer
export const taskStore = createStore(root_reducer)

//Subscribe
taskStore.subscribe(function()
{
    console.log(taskStore.getState())
})

// If a function is returning an action, it should be given to dispatch()
// Condition: ONLY REDUX

// If a function is returning an action, it should be given to useDispatch()
// Condition: REDUX + REACT(or other component)