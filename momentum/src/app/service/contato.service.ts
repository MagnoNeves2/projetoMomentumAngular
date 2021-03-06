import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Contato } from '../model/Contato';

@Injectable({
  providedIn: 'root'
})
export class ContatoService {

  constructor(private http:HttpClient) { }

  postContato(contato : Contato) {
    return this.http.post('http://localhost:8080/contato/enviar', contato)
  } 

}
