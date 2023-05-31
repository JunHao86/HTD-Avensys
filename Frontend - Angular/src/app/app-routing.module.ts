import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Comp1Component } from '../comp1/comp1.component';
import { Comp2Component } from '../comp2/comp2.component';
import { Comp3Component } from '../comp3/comp3.component';
import { TaskQnsComponent } from '../task-qns/task-qns.component';
import { Pg404Component } from '../pg404/pg404.component';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { guard1Guard } from './guard1.guard';
import { guard2Guard } from './guard2.guard';
import { guard4Guard } from './guard4.guard';

const routes: Routes = [

//Redirect Routes
//Redirect address for routes with given address
{
  path:"home",
  redirectTo:"main"
},
{
  //Parameterized routes
  //Used for testing ...
  path:"product/:pricing/discount/:discount_amount",
  component:ProductComponent
},
{
  path:"main",
  component:AppComponent
},
//Children Routes
//Set main route for component, and child component for main
//e.g. http://localhost:4200/.../main/...
{
  path:"main",
  children:[
    {
      //Used for testing ...
      path:"comp1",
      component:Comp1Component
    },
    {
      //used for testing Route Guard
      path:"comp2",
      component:Comp2Component,
      // canActivate:[guard1Guard,guard2Guard] //guard1 = true, guard2= false, wont load
      canMatch:[guard4Guard] //canMatch guard, 
    },
    {
      //Used for testing ...
      path:"comp3",
      component:Comp3Component
    },
    {
      //Where the bulk of my code actually gets sorted
      path:"task-qns",
      component:TaskQnsComponent
    },
    {
      //Parameterized Route used with task-qns
      path:"task-qns/:boolean",
      component:TaskQnsComponent
    },
  ]
},
//Contains a childpath to comp3 as well
//Used for testing
//Check 'payment-routing.module.ts' for more
{ 
  
  path: 'payment', 
  loadChildren: () => import('./payment/payment.module').then(m => m.PaymentModule)
  
},
//For incorrect links
{
  path:"**",
  component:Pg404Component
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
