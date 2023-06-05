import { CanMatchFn } from '@angular/router';

//Guard4 - CanMatch
//Return true - allows access
//Return false - denies access

//Used to determine if modules are Lazy Loaded
//path: 'payment',
//canMatch:[guard4Guard],
//loadChildren: () => import('./payment/payment.module').then(m => m.PaymentModule)

//Before: payment, payment/comp3 accessible
//After:  payment, payment/comp3 inaccessible (if set to false)

//Edit conditions here
export const guard4Guard: CanMatchFn = (route, segments) => {
  console.log("guard4Guard is running")
  return true ;
};
