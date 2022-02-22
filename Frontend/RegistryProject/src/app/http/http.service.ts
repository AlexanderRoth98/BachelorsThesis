import { Observable } from 'rxjs';
import { HttpInterceptor } from './http-interceptor';


import { Injectable } from '@angular/core';
import { HttpBackend, HttpClient, HttpHandler } from '@angular/common/http';
import { RequestOptions } from './request-options';

@Injectable()
export class HttpService extends HttpClient {

    constructor(private backend: HttpBackend,
                options: RequestOptions,
                private httpInterceptor: HttpInterceptor,
                private httpHandler?: HttpHandler) {
        super(httpHandler);
    }


    get(url: string, options?: any): Observable<any> {
        return this.httpInterceptor.interceptResponse(
            super.get(this.httpInterceptor.interceptRequestUrl(url),
                this.httpInterceptor.interceptRequestOptions(options)));
    }

    post(url: string, body: any, options?: any): Observable<any> {
        return this.httpInterceptor.interceptResponse(
            super.post(this.httpInterceptor.interceptRequestUrl(url),
                this.httpInterceptor.interceptRequestBody(body), this.httpInterceptor.interceptRequestOptions(options)));
    }

    put(url: string, body: any, options?: any): Observable<any> {
        return this.httpInterceptor.interceptResponse(
            super.put(this.httpInterceptor.interceptRequestUrl(url),
                this.httpInterceptor.interceptRequestBody(body), this.httpInterceptor.interceptRequestOptions(options)));
    }

    delete(url: string, options?: any): Observable<any> {
        return this.httpInterceptor.interceptResponse(
            super.delete(this.httpInterceptor.interceptRequestUrl(url),
                this.httpInterceptor.interceptRequestOptions(options)));
    }

}

