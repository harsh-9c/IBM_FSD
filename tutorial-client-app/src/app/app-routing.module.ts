import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateTutorialComponent } from './create-tutorial/create-tutorial.component';
import { TutorialListComponent } from './tutorial-list/tutorial-list.component';

const routes: Routes = [
  { path: 'tutorials', component: TutorialListComponent },
  { path: 'create-tutorial', component: CreateTutorialComponent },
  { path: '', redirectTo: 'tutorials', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
