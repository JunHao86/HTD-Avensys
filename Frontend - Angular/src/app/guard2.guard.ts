import { CanActivateFn } from '@angular/router';

export const guard2Guard: CanActivateFn = (route, state) => {
  return false;
};
