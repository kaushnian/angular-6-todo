import { Component, OnInit } from '@angular/core';

import { Item } from '../item/item';
import { Items } from './mock-items';

@Component({
  selector: 'todo-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  items: Item[] = Items;

  constructor() { }

  ngOnInit() {

  }

}
