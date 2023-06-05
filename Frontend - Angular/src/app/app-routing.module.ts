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
import { guard3Guard } from './guard3.guard';
import { guard5Guard } from './guard5.guard';
import { Reactive1Component } from './reactive1/reactive1.component';
import { Reactive2Component } from './reactive2/reactive2.component';

const routes: Routes = [

//Redirect Routes
//Redirect address for routes with given address
{
  path:"home",
  redirectTo:"main"
},
//Parameterized routes
{
  path:"product/:pricing/discount/:discount_amount",
  component:ProductComponent
},
//Main path
{
  path:"main",
  component:AppComponent
},
//Children Routes
//Set main route for component, and child component for main
//e.g. http://localhost:4200/.../main/...
{
  path:"main",
  canActivate:[guard1Guard,guard2Guard],
  children:[
    //Bulk of my work goes here
    {
      path:"task-qns",
      component:TaskQnsComponent,
    },
    //Parameterized Route used with task-qns
    {
      path:"task-qns/:boolean",
      component:TaskQnsComponent
    },
    //Used for testing ...
    {
      path:"comp1",
      canDeactivate:[guard5Guard],
      component:Comp1Component,
    },
    //To access comp2, otherwise guard3Guard blocks
    {
      path:"comp2",
      component:Comp2Component,
    },
    //Edit conditions in .guard.ts file
    {
      path:"comp2",
      canActivate:[guard3Guard],
      children:[
        {path:"comp1",component:Comp1Component,},
        {path:"comp2",component:Comp2Component,},
        {path:"comp3",component:Comp3Component,},
      ]
    },
  ]
},
//Lazy Loading
//uses loadChildren() function with inbuilt dynamic import syntax
{ 
  //Contains a childpath to comp3 as well
  //Check 'payment-routing.module.ts' for more
  path: 'payment', 
  canMatch:[guard4Guard],
  loadChildren: () => import('./payment/payment.module').then(m => m.PaymentModule)
},
{
  path:"reactive1",
  component:Reactive1Component
},
{
  path:"reactive2",
  component:Reactive2Component
},
//Wildcard Routes
//Intercepting invalid URL / path address of application path
//and showing Error/Page 404
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
