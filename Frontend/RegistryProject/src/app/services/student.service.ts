import { Injectable } from '@angular/core';
import { HttpService } from '../http/http.service';
import { Observable } from 'rxjs';

@Injectable()
export class StudentService {

    private url: string;

    constructor(private http: HttpService) {
        this.url = 'http://localhost:8084';
    }


    public readStudents(): Observable<any> {
        return this.http.get(`${this.url}/students`);
    }

    public createStudent(registrationNumber, firstName, lastName, gender, age, email, telNr, studyCourse, subgroup, semester) {
        const student = {
            registrationNumber: registrationNumber,
            firstName: firstName,
            lastName: lastName,
            gender: gender,
            age: age,
            email: email,
            telNr: telNr,
            studyCourse: studyCourse,
            subgroup: subgroup,
            semester: semester
        };
        return this.http.post(`${this.url}/students`, student)
    }


    public getSemesterStatistics() {
        return this.http.get(`${this.url}/students/semester`);
    }

    public getGenderStatistics() {
        return this.http.get(`${this.url}/students/gender`);
    }

    public addStudentToExam(registrationNumber, examId) {
        return this.http.get(`${this.url}/students/${registrationNumber}/${examId}`)

    }

    public getStudentsFromExam(examId) {
        return this.http.get(`${this.url}/students/exams/${examId}`)
    }

    public deleteStudent(registrationNumber) {
        return this.http.delete(`${this.url}/students/${registrationNumber}`)
    }
}
