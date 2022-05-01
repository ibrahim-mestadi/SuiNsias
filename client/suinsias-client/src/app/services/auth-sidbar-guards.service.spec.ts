import { TestBed } from '@angular/core/testing';

import { AuthSidbarGuardsService } from './auth-sidbar-guards.service';

describe('AuthSidbarGuardsService', () => {
  let service: AuthSidbarGuardsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthSidbarGuardsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
