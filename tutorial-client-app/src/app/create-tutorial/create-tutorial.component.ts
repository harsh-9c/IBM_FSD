import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Tutorial } from '../tutorial';
import { TutorialService } from '../tutorial.service';

@Component({
  selector: 'app-create-tutorial',
  templateUrl: './create-tutorial.component.html',
  styleUrls: ['./create-tutorial.component.css'],
})
export class CreateTutorialComponent {
  tutorial: Tutorial = new Tutorial();

  constructor(
    private tutorialService: TutorialService,
    private router: Router
  ) {}

  saveTutorial() {
    this.tutorialService.createTutorial(this.tutorial).subscribe(
      (data) => {
        this.goToTutorialList();
      },
      (error) => console.log(error)
    );
  }

  goToTutorialList() {
    this.router.navigate(['/tutorials']);
  }

  onSubmit() {
    this.saveTutorial();
  }
}
