import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Comp1Component } from '../comp1/comp1.component';
import { Comp2Component } from '../comp2/comp2.component';
import { Comp3Component } from '../comp3/comp3.component';
import { TaskQnsComponent } from '../task-qns/task-qns.component'
import { ProductComponent } from './product/product.component';
import { Pg404Component } from '../pg404/pg404.component';
import { Reactive1Component } from './reactive1/reactive1.component';
import { Reactive2Component } from './reactive2/reactive2.component'; 
//@Angular
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
//@Angular/material
import {MatButtonModule} from '@angular/material/button'
import {MatButtonToggleModule} from '@angular/material/button-toggle';


@NgModule({
  // Components loaded in project
  declarations: [
    AppComponent,
    Comp1Component,
    Comp2Component,
    Comp3Component,
    TaskQnsComponent,
    ProductComponent,
    Pg404Component,
    Reactive1Component,
    Reactive2Component
  ],
  // Modules for application
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatButtonToggleModule,
    ReactiveFormsModule
  ],
  // Services are added here (290523)
  providers: [
  //   {provide:LocationStrategy,
  // useClass:HashLocationStrategy},
],
  // What is the first component to load
  bootstrap: [AppComponent]
})
// Export and expose the component for use outside the module
export class AppModule { }
