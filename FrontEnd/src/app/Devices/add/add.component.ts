import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Device } from 'src/app/Model/Device';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }
 
  device:Device = new Device();

  Guardar(){
    this.service.createDevice(this.device).subscribe(data=>{
      // alert("Dispositivo agregado con éxito");
      this.router.navigate(["listar"]);
    });
  }

}
