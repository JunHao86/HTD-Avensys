import { TestBed } from '@angular/core/testing';
import { CanActivateChildFn } from '@angular/router';

import { guard3Guard } from './guard3.guard';

describe('guard3Guard', () => {
  const executeGuard: CanActivateChildFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => guard3Guard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
