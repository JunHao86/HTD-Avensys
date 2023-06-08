import {useFormik} from "formik";


function Regist() {
    
    
    const formik = useFormik({
        initialValues: {
            username: "",//username: "Raju"
            password: "",//password: "Password"
            email: "" //email: "raju123@gmail.com"
        },

        //Why is it using validate: again?
        validate:function(data){

            //Initial Data
            // data ===> {username: "", password: "", email: ""}

            // Final Data
            // data ===> {username: 'Raju', password: 'Welcome', email: 'admin@acaders.com'}

        //Blank slate to start collecting failed validations
        let errors = {}

        if(!data.username)
        {
            //If condition is true, username not entered
            errors.username = "Username is required, it cannot be empty"
        }
        if(!data.password)
        {
            //If condition is true, password not entered
            errors.password = "Password is required, it cannot be empty"
        }
        if(!data.email)
        {
            //If condition is true, email not entered
            errors.email = "Email is required, it cannot be empty"
        }
        if(data.password)
        {
            //If condition is false, but password outside of 6-20 range
            if(data.password.length < 6 || data.password.length > 20)
            {
                errors.password1 = "Password should be between 6~20"
            }
        }
        return errors
        //Error gets more values as it fails validations
            //errors =
            //  {
            //      username: Username is required, it cannot be empty
            //      password: Password is required, it cannot be empty
            //      password1: Password should be between 6~20
            //      email: Email is required, it cannot be empty
            //  }
        }
    })

    

    return(
        <div>
            <form>
                {formik.errors.username ? <div>{formik.errors.username} </div> : null}
                Enter Username: <input type="text" name="username" 
                value={formik.values.username} onChange={formik.handleChange}/> <br/><br/>

                {formik.errors.password ? <div>{formik.errors.password} </div> : null}  
                {formik.errors.password1 ? <div>{formik.errors.password1} </div> : null}
                Enter Password: <input type="password" name="password" 
                value={formik.values.password} onChange={formik.handleChange} /> <br/><br/>

                {formik.errors.email ? <div>{formik.errors.email} </div> : null}
                Enter Email: <input type="email" name="email" 
                value={formik.values.email} onChange={formik.handleChange} /> <br/><br/>
                
                <button>Submit</button>
            </form>
        </div>
    )
}

export default Regist
