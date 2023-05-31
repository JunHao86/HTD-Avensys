import { TestBed } from '@angular/core/testing';
import { CanActivateFn } from '@angular/router';

import { guard2Guard } from './guard2.guard';

describe('guard2Guard', () => {
  const executeGuard: CanActivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => guard2Guard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
