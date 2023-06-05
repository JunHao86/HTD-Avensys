import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Reactive2Component } from './reactive2.component';

describe('Reactive2Component', () => {
  let component: Reactive2Component;
  let fixture: ComponentFixture<Reactive2Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Reactive2Component]
    });
    fixture = TestBed.createComponent(Reactive2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
