import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Device } from '../Model/Device';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient){}

  Url='http://localhost:8080/api/devices';

  getDevices(){
    return this.http.get<Device[]>(this.Url);
  }

  createDevice(device:Device){
    return this.http.post<Device>(this.Url, device);
  }

  getDeviceId(id:number){
    return this.http.get<Device>(this.Url+"/"+id);
  }

  updateDevice(device:Device){
    return this.http.put<Device>(this.Url+"/"+device.id, device);
  }

  deleteDevice(device:Device){
    return this.http.delete<Device>(this.Url+"/"+device.id);
  }



}
