import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Comp1Component } from '../comp1/comp1.component';
import { Comp2Component } from '../comp2/comp2.component';
import { Comp3Component } from '../comp3/comp3.component';
import { TaskQnsComponent } from '../task-qns/task-qns.component';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [

{
  path:"home",
  redirectTo:"main"
},
{
  path:"product/:pricing/discount/:discount_amount",
  component:ProductComponent
},
{
  path:"main",
  component:AppComponent
},
{
  path:"main",
  children:[
    {
      path:"comp1",
      component:Comp1Component
    },
    {
      path:"comp2",
      component:Comp2Component
    },
    {
      path:"comp3",
      component:Comp3Component
    },
    {
      path:"task-qns",
      component:TaskQnsComponent
    }
  ]
}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
