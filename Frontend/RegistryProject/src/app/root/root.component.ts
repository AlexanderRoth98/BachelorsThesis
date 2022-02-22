import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { isNullOrUndefined } from 'util';

@Component({
  selector: 'root',
  templateUrl: './root.component.html',
  styleUrls: ['./root.component.css']
})
export class RootComponent implements OnInit {

  

  constructor(private router: Router) { }
  
  ngOnInit(): void {
    if(isNullOrUndefined(localStorage.getItem('loggedUser'))){
      this.router.navigate(['/login']);
    }
  }
  isLoginPage(){
    return this.router.routerState.snapshot.url.startsWith('/login');
  }
}
