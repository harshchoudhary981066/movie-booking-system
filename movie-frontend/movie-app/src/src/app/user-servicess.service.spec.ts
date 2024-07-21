import { TestBed } from '@angular/core/testing';

import { UserServicessService } from './user-servicess.service';

describe('UserServicessService', () => {
  let service: UserServicessService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserServicessService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
