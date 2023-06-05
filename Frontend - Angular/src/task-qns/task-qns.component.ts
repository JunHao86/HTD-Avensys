import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, NgForm, Validators } from '@angular/forms'
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-task-qns',
  templateUrl: './task-qns.component.html',
  styleUrls: ['./task-qns.component.css']
})
export class TaskQnsComponent implements OnInit {

//==========================
//Creating a table
//==========================
contacts=[
  {
    'fn':'Emma',
    'ln':'Lim',
    'ID':11
  },
  {
    'fn':'Daring',
    'ln':'Tact',
    'ID':22
  },
  {
    'fn':'Manhattan',
    'ln':'Cafe',
    'ID':33
  },
  {
    'fn':'Gold',
    'ln':'Ship',
    'ID':44
  },
  {
    'fn':'Jungle',
    'ln':'Pocket',
    'ID':55
  },
  {
    'fn':'Contrail',
    'ln':'',
    'ID':66
  },
  {
    'fn':'Stay',
    'ln':'Gold',
    'ID':77
  },
  {
    'fn':'Gold',
    'ln':'City',
    'ID':88
  },
  {
    'fn':'Keith',
    'ln':'Lim',
    'ID':99
  }
]
//==========================
//ngSwitch, ngStyle, ngClass
//==========================

//default values
superpower = "Flash"
desiredColor = "red"
desiredBg = "black"

dsentence = "Used with css"
multipleClass = "d3 d4"

//==========================
//Data Binding
//==========================

//attribute binding
ab_head_value = 2

//event binding
hello(){
  console.log("Hello world!")
}

//event binding
a(x:any,y:any,z:any){
  console.log(x,y,z)
}

//==========================
//Angular Pipes
//==========================
upper_case = "originally noncaps"
lower_case = "ORIGINALLY ALLCAPS"
currentDate = Date.now()

obj={
  "fn":'Emma',
  "ln":'Lim',
  "ID":11
}

num_value = 100
num_value2 = 0.99

//==========================
//Parameterized Routes
//==========================

value = false

//Temporarily disabled due to conflict with reactive form

  constructor(private activate:ActivatedRoute){
    this.activate.params.subscribe(((params)=>{
      let valone = params
      this.value = valone['boolean']
    }))
  }

//==========================
//ngModel,ngForm from @angular/forms
//==========================

//values
firstname="Default name"
confirmbox=false
optionselection=2
description='basic'

//submit button
submitting(formValue:NgForm){
  console.log(formValue.value)
}

//reset button
reset(formValue:NgForm){
  console.log("resetting")
  formValue.reset()
}

//set button
set(formValue:NgForm){
  console.log("setting")
  let details={
    firstname:"Default name",
    confirmbox:false,
    optionselection:2,
    description:'basic',
  }
  formValue.setValue(details)
}

//==========================
//Reactive forms from @angular/forms
//ngOnInit,FormBuilder
//==========================

//Assertion assignment (!:) 
//Declare reactForm as FormGroup/Reactive Form
//Alternative, switch the flag for strict in tsconfig.json
reactForm:FormGroup



//Method one: ngOnInit
ngOnInit(): void {
  this.reactForm = new FormGroup({
  'fn':new FormControl('',Validators.required),
  'fnSecond':new FormControl('',[Validators.required,Validators.minLength(5),Validators.maxLength(13)]),
  'description':new FormControl('',Validators.minLength(5))
  })

  this.AnotherReactForm = new FormGroup({
    'anotherFn':new FormControl('',Validators.required),
    'anotherFnSecond':new FormControl('',[Validators.required,Validators.maxLength(5)]),
    'anotherDescription':new FormControl('',Validators.required),
  })

  //Default values for reactForm
  let obj111={
  'fn':'Name1',
  'fnSecond':'Name2',
  'description':'Writing obj',
  }

  this.reactForm.setValue(obj111)
  this.reactForm.patchValue(obj111)

  //Default values for AnotherReactForm
  let obj222={
    'anotherFn':'Name3',
    'anotherFnSecond':'Name4',
    'anotherDescription':'Check console log for form states',
    }

    this.AnotherReactForm.setValue(obj222)
    this.AnotherReactForm.patchValue(obj222)
}

  
//Method two : FormBuilder
//Not recommended due to conflict with above private constructor
// constructor(private fb:FormBuilder){}

// ngOnInit(): void {
//   this.reactForm = this.fb.group({
//     'fn':new FormControl(),
//     'fnSecond':new FormControl(),
//     'description':new FormControl()
//   })

//   //Setting values in one go using set value
//   let obj111={
//   'fn':'Name1',
//   'fnSecond':'Name2',
//   'description':'Writing obj',
//   }

//   this.reactForm.setValue(obj111)
//   // this.reactForm.patchValue(obj111)
// }


addval(){
  console.log(this.reactForm.value)
}
getval(){
  // console.log(this.reactForm.get('fnSecond').value)
}

//==========================
//Validations on Reactive Forms
//Form States
//==========================
AnotherReactForm:FormGroup
//Refer to ngOnIt for AnotherReactForm
anotherAddVal(){
  // //Valid or invalid
  // console.log("Valid or invalid")
  // console.log(this.AnotherReactForm.valid)
  // console.log(this.AnotherReactForm.invalid)
  // //Touched or untouched
  // //if form is interacted with at any point
  // console.log("Touched or untouched")
  // console.log(this.AnotherReactForm.touched)
  // console.log(this.AnotherReactForm.untouched)
  // //Dirty or pristine
  // //If default values of form have been changed 
  // console.log("Dirty or pristine")
  // console.log(this.AnotherReactForm.dirty)
  // console.log(this.AnotherReactForm.pristine)
}

//Reset button
anotherReset(formValue:FormGroup){
  // console.log("resetting")
  // formValue.reset()
}

// Adding Form Elements (ngInit)
addUser(){
  // let userArr = this.AnotherReactForm.get('anotherUsers') as FormArray
  // let newUser ={
  //   'name':'',
  //   'marks':'',
  //   'branch':''
  // }
  // userArr.push(newUser)
}
}


