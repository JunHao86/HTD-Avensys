// import React from "react";
import { setIsLoggedIn } from "react";
import { useNavigate } from "react-router-dom";
import { signInWithPopup } from "firebase/auth"; 
import { auth,provider} from "./firebase.js"

import { useContext } from "react";
import { myBasket } from "../App.js";

export function Login(){
      
    const navigate = useNavigate()

    //Existing error: useContext() is undefined
    const { set } = useContext(myBasket)
    


    function pleaseSignIn(){
        //Write Logic to display window/pop-up for Logging in

        //Login/authenticate, links to list of Google accounts (or others)
        signInWithPopup(auth, provider)
        .then(function(){
            set(true)
            navigate("/mobile")
            // const name = auth.currentUser.displayName
            // const email = auth.currentUser.email
            // const img = auth.currentUser.photoURL
        })
        .catch(function(error){
            alert("Login was not successful",error)
        })
    }
    
    return(
        <div>
            <button onClick={pleaseSignIn}> Sign-in with Google </button>
        </div>
    )
}
