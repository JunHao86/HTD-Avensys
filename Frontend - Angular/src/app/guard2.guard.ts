import { CanActivateFn } from '@angular/router';

//Guard2 - CanActivate
//Return true - allows access
//Return false - denies access

//Used to demonstrate access using two guards simulatenously
//Before: canActivate:[guard1Guard],
//After:  canActivate:[guard1Guard,guard2Guard]
//Does not load if guard1 = true; guard2 = false

//Edit conditions here
export const guard2Guard: CanActivateFn = (route, state) => {
  return true;
};
