import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatListModule } from '@angular/material';

import { ItemListComponent } from './item-list.component';

@NgModule({
  imports: [
    CommonModule,
    MatListModule,
  ],
  declarations: [ItemListComponent],
  exports: [ItemListComponent],
})
export class ItemListModule { }
