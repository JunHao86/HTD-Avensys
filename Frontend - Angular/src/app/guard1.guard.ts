import { CanActivateFn } from '@angular/router';

//Guard1 - CanActivate
//Return true - allows access
//Return false - denies access

//Edit conditions here
export const guard1Guard: CanActivateFn = (route, state) => {
  return true;
};
