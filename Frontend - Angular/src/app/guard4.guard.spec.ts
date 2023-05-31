import { TestBed } from '@angular/core/testing';
import { CanMatchFn } from '@angular/router';

import { guard4Guard } from './guard4.guard';

describe('guard4Guard', () => {
  const executeGuard: CanMatchFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => guard4Guard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
