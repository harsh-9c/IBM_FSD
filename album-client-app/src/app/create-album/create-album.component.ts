import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Album } from '../album';
import { AlbumService } from '../album.service';
import { Album2 } from '../album2';

@Component({
  selector: 'app-create-album',
  templateUrl: './create-album.component.html',
  styleUrls: ['./create-album.component.css'],
})
export class CreateAlbumComponent {
  album: Album2 = new Album2();

  constructor(private albumService: AlbumService, private router: Router) {}

  saveAlbum() {
    this.albumService.createAlbum(this.album).subscribe(
      (data) => {
        console.log(data);
        this.goToAlbumList();
      },
      (error) => console.log(error)
    );
  }

  goToAlbumList() {
    this.router.navigate(['/albums']);
  }

  onSubmit() {
    console.log(this.album);
    this.saveAlbum();
  }
}
