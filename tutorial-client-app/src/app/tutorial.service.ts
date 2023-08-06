import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tutorial } from './tutorial';

@Injectable({
  providedIn: 'root',
})
export class TutorialService {
  private baseURL = 'http://localhost:9999/tutorials';

  constructor(private httpClient: HttpClient) {}

  getTutorialsList(): Observable<Tutorial[]> {
    return this.httpClient.get<Tutorial[]>(`${this.baseURL}`);
  }

  createTutorial(tutorial: Tutorial): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, tutorial);
  }
}
