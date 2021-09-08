import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddLecrureFormComponent } from './add-lecrure-form.component';

describe('AddLecrureFormComponent', () => {
  let component: AddLecrureFormComponent;
  let fixture: ComponentFixture<AddLecrureFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddLecrureFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddLecrureFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
