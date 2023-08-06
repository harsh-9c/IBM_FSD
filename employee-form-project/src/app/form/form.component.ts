import { Component } from '@angular/core';
import { Form } from '../test-data/form';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css'],
})
export class FormComponent {
  testData = new Form('', '', '');

  onClickSubmit() {
    alert(JSON.stringify(this.testData));
  }
}
