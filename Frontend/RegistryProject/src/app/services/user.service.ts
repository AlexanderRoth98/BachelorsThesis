import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpService } from '../http/http.service';


@Injectable({
    providedIn: 'root'
})
export class UserService {

    private url: string;

    constructor(private http: HttpService) {
        this.url = 'http://localhost:8084';
    }

    public createUser(email, password, role ){
        const user = {
           
            email: email,
            password: password,
            role: role,
        };
        return this.http.post(`${this.url}/users`, user)
    }

   
}