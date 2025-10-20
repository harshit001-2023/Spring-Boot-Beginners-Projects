import { Component } from '@angular/core';
import { PollComponent } from './poll/poll';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [PollComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class AppComponent {
  title = 'poll-app';
}