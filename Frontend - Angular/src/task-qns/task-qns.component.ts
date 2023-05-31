import { Component } from '@angular/core';
import { NgForm } from '@angular/forms'
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-task-qns',
  templateUrl: './task-qns.component.html',
  styleUrls: ['./task-qns.component.css']
})
export class TaskQnsComponent {

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

  constructor(private activate:ActivatedRoute){
    this.activate.params.subscribe(((params)=>{
      let valone = params
      this.value = valone['boolean']
    }))
  }

//==========================
//ngModel,ngForm from @angular/forms
//==========================
firstname=""
confirmbox=false

submitting(formValue:NgForm){
  console.log(formValue.value)
}
}