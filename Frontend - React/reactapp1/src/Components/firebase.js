// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import {getAuth, GoogleAuthProvider} from "firebase/auth"

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

//Goal: Connect to Firebase Application --> Connect to Google Authentication --> Google Authentication
//------------------------------------------------------------------------------
//Connecting React Application to Firebase Application (Step One)

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyCXweuLaNQzkED25ZHMUuxP3KjzqfbXI1E",
  authDomain: "first-application-b5dd1.firebaseapp.com",
  projectId: "first-application-b5dd1",
  storageBucket: "first-application-b5dd1.appspot.com",
  messagingSenderId: "612016036868",
  appId: "1:612016036868:web:e7a1f5f0e4e8699c4f6951"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);

//------------------------------------------------------------------------------
//Connect to Google Authentication (Step Two)

//getAuth() --> function, helps React application to connect to Firebase Authentication
//GoogleAuthProvider --> class, helps React application to connect to Google Auth in Firebase

//Connect to Firebase Authentication using the key 
export const auth = getAuth(app)

//Initialize class using new, assign to var
export const provider = new GoogleAuthProvider()

