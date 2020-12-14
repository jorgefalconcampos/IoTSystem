import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Device } from 'src/app/Model/Device';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  device:Device = new Device();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
    this.Editar();
  }

  Editar(){
    let id=localStorage.getItem("id");
    this.service.getDeviceId(+id).subscribe(data=>{
      this.device=data;
    });
  }

  Actualizar(device:Device){
    this.service.updateDevice(device).subscribe(data=>{
      this.device=data;
      // alert("Dispositivo actualizado con éxito");
      this.router.navigate(["listar"]);
    });
  }



}
