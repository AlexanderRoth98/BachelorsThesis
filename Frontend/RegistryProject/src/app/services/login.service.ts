import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpService } from '../http/http.service';


@Injectable({
    providedIn: 'root'
})
export class LoginService {

    private url: string;

    constructor(private http: HttpService) {
        this.url = 'http://localhost:8084';
    }

    grantAccess(email: string, password: string): Observable<any> {

        return this.http.get(`${this.url}/users/${email}/${password}`);
    }

    matchToStudent(email: string): Observable<any> {
        return this.http.get(`${this.url}/users/student/${email}`);
    }
    matchToProfessor(email: string): Observable<any> {
        return this.http.get(`${this.url}/users/professor/${email}`);
    }
}