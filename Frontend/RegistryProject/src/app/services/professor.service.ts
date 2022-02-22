import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpService } from '../http/http.service';
import { last } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ProfessorService {

  private url: string;



  constructor(private http: HttpService) {
    this.url = 'http://localhost:8084';
  }

  readProfessors(): Observable<any> {
    return this.http.get(`${this.url}/professors`);
  }

  public createProfessor(professorId, firstName, lastName, gender, age, email, telNr, title) {
    const professor = {
      professorId: professorId,
      firstName: firstName,
      lastName: lastName,
      gender: gender,
      age: age,
      email: email,
      telNr: telNr,
      title: title
    };
    return this.http.post(`${this.url}/professors`, professor)
  }

  public getAgeStatistics() {
    return this.http.get(`${this.url}/professors/age`);
  }

  public getGenderStatistics() {
    return this.http.get(`${this.url}/professors/gender`);
  }

  public deleteProfessor(professorId){
    return this.http.delete(`${this.url}/professors/${professorId}`);
  }

}
