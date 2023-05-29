import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button'
import {MatButtonToggleModule} from '@angular/material/button-toggle'; 

import { Comp1Component } from '../comp1/comp1.component';
import { Comp2Component } from '../comp2/comp2.component';
import { Comp3Component } from '../comp3/comp3.component';
import { TaskQnsComponent } from '../task-qns/task-qns.component'
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { ProductComponent } from './product/product.component';

@NgModule({
  // Components loaded in project
  declarations: [
    AppComponent,
    Comp1Component,
    Comp2Component,
    Comp3Component,
    TaskQnsComponent,
    ProductComponent
  ],
  // Modules for application
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatButtonToggleModule
  ],
  // Services are added here
  providers: [
  //   {provide:LocationStrategy,
  // useClass:HashLocationStrategy},
],
  // What is the first component to load
  bootstrap: [AppComponent]
})
// Export and expose the component for use outside the module
export class AppModule { }
