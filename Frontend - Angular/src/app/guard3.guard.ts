import { CanActivateChildFn } from '@angular/router';

//Guard3 - CanActivateChild
//Return true - allows access
//Return false - denies access

//Used to demonstrate access to children
//component:specified elsewhere
//canActivate:[guard3Guard]
//children:[{...}]

//Before: comp2 accessible, ../comp2/comp1~3 accessible
//After:  comp2 accessible, ../comp2/comp1~3 inaccessible

//Edit conditions here
export const guard3Guard: CanActivateChildFn = (childRoute, state) => {
  console.log("No access granted by guard3Guard")
  return false;
};
