import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EventService {

  private apiUrl = 'http://localhost:8080/events';

  constructor(private http: HttpClient) {}

  getEvents() {
    return this.http.get<any[]>(this.apiUrl);
  }

  addEvent(event:any) {
    return this.http.post(this.apiUrl,event);
  }

  deleteEvent(id:number){
    return this.http.delete(`${this.apiUrl}/${id}`);
  }
}