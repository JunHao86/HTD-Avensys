import { Component, OnInit} from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, NgForm, Validators } from '@angular/forms'

@Component({
  selector: 'app-reactive2',
  templateUrl: './reactive2.component.html',
  styleUrls: ['./reactive2.component.css']
})
export class Reactive2Component implements OnInit{

  reactForm:FormGroup
  constructor(private fb:FormBuilder){}

  ngOnInit(): void {
  
    this.reactForm = this.fb.group({
      'fn':new FormControl('',Validators.required),
      'fnSecond':new FormControl('',[Validators.required,Validators.minLength(5),Validators.maxLength(13)]),
      'description':new FormControl('',Validators.minLength(20)),
      // 'users':new FormArray([
      //   new FormControl('first'),
      //   new FormControl('second'),
      //   new FormControl('third')
      // ])
      'users':new FormArray([
        this.fb.group({
          'name':new FormControl(''),
          'marks':new FormControl(''),
          'area':new FormControl('')
        })
      ])
    })

    //Setting or patching values in one go using set value
    let obj111={
    'fn':'Name1',
    'fnSecond':'Name2',
    'description':'Writing obj',
    }

    // this.reactForm.setValue(obj111)
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

  // Adding Form Elements
  AddUser(){
    let userArr = this.reactForm.get('users') as FormArray

    let newUser = this.fb.group({
      'name':'',
      'marks':'',
      'area':''
    })
    userArr.push(newUser)
  }

  //Remove Form Elements\
  RemoveUser(i){
    let userArr = this.reactForm.get('users') as FormArray

    userArr.removeAt(i)
  }

  //Getter that returns FormArray
  get users():FormArray{
    //Self calling function
    return this.reactForm.get('users') as FormArray
  }

  //For a given row, assigns the area value to be 'CSE'
  Assign(i){
    let arr = this.reactForm.get('users') as FormArray
    // let values = arr.value
    if (arr.value[i].marks>60){
      arr.value[i].area='CBD'
    }
    else{
      arr.value[i].area='Do not qualify'
    } 
    this.users.setValue(arr.value) 
  }
}
