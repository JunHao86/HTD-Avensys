import { CanDeactivateFn } from '@angular/router';
import { Comp1Component } from '../comp1/comp1.component';

//Guard5 -CanDeactivate
//Return true - allows user to leave page
//Return false - denies user from leaving page

//Used to check if user can exit from current path
//
//import {Comp1Component}...
//CanDeActivateFn<Comp1Component> = ...
//canDeactivate:[guard5Guard],
//component:Comp1Component,

//Before: Can leave page upon clicking a link
//After:  Can't leave page upon clicking a link (if set to false)

//Edit conditions here
export const guard5Guard: CanDeactivateFn<Comp1Component> = (component:Comp1Component, currentRoute, currentState, nextState) => {
  
  if (component.superpower == 'Flash')
    return window.confirm('leaving?')
  else
    return false    
};
