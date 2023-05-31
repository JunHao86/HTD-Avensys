import { CanActivateChildFn } from '@angular/router';

export const guard3Guard: CanActivateChildFn = (childRoute, state) => {
  return true;
};
