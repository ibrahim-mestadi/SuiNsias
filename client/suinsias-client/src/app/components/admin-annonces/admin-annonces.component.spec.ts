import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAnnoncesComponent } from './admin-annonces.component';

describe('AdminAnnoncesComponent', () => {
  let component: AdminAnnoncesComponent;
  let fixture: ComponentFixture<AdminAnnoncesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminAnnoncesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminAnnoncesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
