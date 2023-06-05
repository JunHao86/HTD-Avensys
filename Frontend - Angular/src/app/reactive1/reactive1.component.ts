import { Component, OnInit} from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, NgForm, Validators } from '@angular/forms'

@Component({
  selector: 'app-reactive1',
  templateUrl: './reactive1.component.html',
  styleUrls: ['./reactive1.component.css']
})
export class Reactive1Component implements OnInit{

  reactForm:FormGroup

  ngOnInit(): void {
    this.reactForm = new FormGroup({
    'fn':new FormControl('',Validators.required),
    'fnSecond':new FormControl('',[Validators.required,Validators.minLength(5),Validators.maxLength(13)]),
    'description':new FormControl('',Validators.minLength(5)),
    'users':new FormArray([
      new FormControl('first'),
      new FormControl('second'),
      new FormControl('third')
    ])
    })
   
    //Default values for reactForm
    let obj111={
    'fn':'Name1',
    'fnSecond':'Name2',
    'description':'Writing obj',
    'users':([
      '1',
      '2',
      '3'
    ])
    }
  
    this.reactForm.setValue(obj111)
    this.reactForm.patchValue(obj111)
  }

  AddVal(){
    console.log(this.reactForm.value)
  }

  //Reset button
  Reset(formValue:FormGroup){
    console.log("resetting")
    formValue.reset()
  }

  // Adding Form Elements (ngInit)
  addUser(){

}


}
