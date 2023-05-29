import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaskQnsComponent } from './task-qns.component';

describe('TaskQnsComponent', () => {
  let component: TaskQnsComponent;
  let fixture: ComponentFixture<TaskQnsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TaskQnsComponent]
    });
    fixture = TestBed.createComponent(TaskQnsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
