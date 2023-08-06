import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Album } from './album';
import { Album2 } from './album2';

@Injectable({
  providedIn: 'root',
})
export class AlbumService {
  private baseURL = 'http://localhost:9999/ALBUM-SERVICE/albums';

  constructor(private httpClient: HttpClient) {}

  getAlbumsList(): Observable<Album[]> {
    return this.httpClient.get<Album[]>(`${this.baseURL}`);
  }

  createAlbum(album: Album2): Observable<Object> {
    console.log(album);

    return this.httpClient.post(`${this.baseURL}`, album);
  }
}
