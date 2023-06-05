import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PaymentComponent } from './payment.component';
import { Comp3Component } from '../../comp3/comp3.component';

// Steps for lazy loading
//1. Create separate modules
//2. Configure loadChildren() in app-routing.module.ts
//3. Command -> ng g module payment --route payment --module app.module
//4. 
const routes: Routes = [
  { 
    path: '', 
    component: PaymentComponent 
  },
  {
    path:'comp3',
    component:Comp3Component
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PaymentRoutingModule { }
