import { Component } from '@angular/core';
import { Album } from '../album';
import { AlbumService } from '../album.service';

@Component({
  selector: 'app-album-list',
  templateUrl: './album-list.component.html',
  styleUrls: ['./album-list.component.css'],
})
export class AlbumListComponent {
  albums: Album[] = [];

  constructor(private albumService: AlbumService) {}

  ngOnInit() {
    this.getAlbums();
  }

  private getAlbums() {
    this.albumService.getAlbumsList().subscribe((data) => {
      this.albums = data;
    });
  }
}
