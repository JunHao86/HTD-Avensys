import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-comp1',
  templateUrl: './comp1.component.html',
  styleUrls: ['./comp1.component.css']
})
export class Comp1Component {

  audi = ''
  benz = ''
  ducatti = ''

  constructor(private active:ActivatedRoute){
    this.active.queryParams.subscribe(params=>{
      console.log(params)
      this.audi = params['audi']
      this.benz = params['benz']
      this.ducatti = params['ducatti']
    })
  }

  superpower = "Flash"
  desiredColor = "red"
  desiredBg = "black"

  
  dsentence = "Used with css"
  multipleClass = "d3 d4"

  // 
  hello(){
    console.log("Hello world!")
  }

  a(x:any,y:any,z:any){
    console.log(x,y,z)
  }

  // 260523
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

}
