import { Component, OnInit } from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map, shareReplay, filter } from 'rxjs/operators';
import { Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-main-nav',
  templateUrl: './main-nav.component.html',
  styleUrls: ['./main-nav.component.css']
})
export class MainNavComponent implements OnInit {

  user = JSON.parse(localStorage.getItem('loggedUser'));
  role = localStorage.getItem('role');
  studentsClicked = false;
  professorsClicked = false;
  
  


  isHandset$: Observable<boolean> = this.breakpointObserver.observe(Breakpoints.Handset)
    .pipe(
      map(result => result.matches),
      shareReplay()
    );

  constructor(private breakpointObserver: BreakpointObserver, private router: Router) { }

  public activeRoute;

  ngOnInit() {

    this.router.events
      .pipe(
        filter(event => event instanceof NavigationEnd)
      )
      .subscribe(() => {
        this.activeRoute = this.router.routerState.snapshot.url

      });
  }

  routeChange(route: string) {
    this.activeRoute = route;
    this.router.navigate([route]);
  }

  onStudentsClicked() {
    this.studentsClicked = !this.studentsClicked;

  }

  onProfessorsClicked() {
    this.professorsClicked = !this.professorsClicked;
  }

  

 
}
