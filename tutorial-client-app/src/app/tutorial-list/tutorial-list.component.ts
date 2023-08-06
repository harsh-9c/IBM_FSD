import { Component } from '@angular/core';
import { Tutorial } from '../tutorial';
import { TutorialService } from '../tutorial.service';

@Component({
  selector: 'app-tutorial-list',
  templateUrl: './tutorial-list.component.html',
  styleUrls: ['./tutorial-list.component.css'],
})
export class TutorialListComponent {
  tutorials: Tutorial[] = [];

  constructor(private tutorialService: TutorialService) {}

  ngOnInit(): void {
    this.getTutorials();
  }

  private getTutorials() {
    this.tutorialService.getTutorialsList().subscribe((data) => {
      this.tutorials = data;
    });
  }
}
