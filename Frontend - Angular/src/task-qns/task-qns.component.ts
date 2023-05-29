import { Component } from '@angular/core';

@Component({
  selector: 'app-task-qns',
  templateUrl: './task-qns.component.html',
  styleUrls: ['./task-qns.component.css']
})
export class TaskQnsComponent {

// 240523, d1
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

// 240523, d2
superpower = "Flash"
desiredColor = "red"
desiredBg = "black"

dsentence = "Used with css"
multipleClass = "d3 d4"
}
