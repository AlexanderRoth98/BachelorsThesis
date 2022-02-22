
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';


import { HttpHeaders, HttpRequest } from '@angular/common/http';
import { RequestOptions } from './request-options';
import { isNullOrUndefined } from 'util';


@Injectable()
export class HttpInterceptor {


    constructor() {
    }

    interceptRequestOptions(options?): RequestOptions {
        if (options === null || options === undefined) {
            options = new RequestOptions();
        }
        if (options.headers === null || options.headers === undefined) {
           
            options.headers = new HttpHeaders();
        }
        let user: any = localStorage.getItem('user');
        // if (user && user.length > 0) {
        //     user = <any> JSON.parse(user)['user'].value;
        //     if (!isNullOrUndefined(user)) {
        //         const token = user.access_token;
        //         options.headers = options.headers.append('Authorization', `Bearer ${token}`);
        //     }
        // }

        options.headers = options.headers.append('applicationType', 'admin_app');

        return options;
    }

    interceptRequestUrl(url: string | HttpRequest<any>): any {
        return url;
    }

    interceptResponse($observable: Observable<any>) {
        return $observable;
    }

    interceptRequestBody(body: any) {
        return body;
    }
}

