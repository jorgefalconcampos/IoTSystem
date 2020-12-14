import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Device } from 'src/app/Model/Device';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {


  devices:Device[];

  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit() {
    this.service.getDevices().
    subscribe(data=>{
      this.devices=data;
    })
  }


  Editar(device:Device):void{
    localStorage.setItem("id", device.id.toString());
    this.router.navigate(["edit"]);
  }

  Delete(device:Device):void{
    this.service.deleteDevice(device)
    .subscribe(data=>{
      this.devices=this.devices.filter(p=>p!==device);
    });
  }



  

}
