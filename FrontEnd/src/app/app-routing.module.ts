import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './Devices/add/add.component';
import { DeleteComponent } from './Devices/delete/delete.component';
import { EditComponent } from './Devices/edit/edit.component';
import { ListarComponent } from './Devices/listar/listar.component';

const routes: Routes = [
  { path: 'listar', component:ListarComponent},
  { path: 'add', component:AddComponent},
  { path: 'edit', component:EditComponent},
  { path: 'delete', component:DeleteComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
