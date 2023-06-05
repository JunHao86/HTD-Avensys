import { TestBed } from '@angular/core/testing';
import { CanDeactivateFn } from '@angular/router';

import { guard5Guard } from './guard5.guard';

describe('guard5Guard', () => {
  const executeGuard: CanDeactivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => guard5Guard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
