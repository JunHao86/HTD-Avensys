import firebase from "firebase/compat/app"
import "firebase/compat/firestore" //importing firestore module differently


const firebaseConfig = {

  apiKey: "AIzaSyARYlLiCfTcwNukiIWI8SUvVTDMy1Z03fA",

  authDomain: "data-app-3e22a.firebaseapp.com",

  projectId: "data-app-3e22a",

  storageBucket: "data-app-3e22a.appspot.com",

  messagingSenderId: "811271981044",

  appId: "1:811271981044:web:671c878f874c27b0a05ba1"

};

const app = firebase.initializeApp(firebaseConfig);

export const db = firebase.firestore()