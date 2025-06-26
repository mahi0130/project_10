import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StaffmemberlistComponent } from './staffmemberlist.component';

describe('StaffmemberlistComponent', () => {
  let component: StaffmemberlistComponent;
  let fixture: ComponentFixture<StaffmemberlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StaffmemberlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StaffmemberlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
