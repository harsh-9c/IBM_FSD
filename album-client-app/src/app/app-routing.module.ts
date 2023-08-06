import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlbumListComponent } from './album-list/album-list.component';
import { CreateAlbumComponent } from './create-album/create-album.component';

const routes: Routes = [
  { path: 'albums', component: AlbumListComponent },
  { path: '', redirectTo: 'albums', pathMatch: 'full' },
  { path: 'create-album', component: CreateAlbumComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
