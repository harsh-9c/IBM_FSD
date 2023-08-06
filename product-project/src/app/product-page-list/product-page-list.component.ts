import { Component } from '@angular/core';
import { Product } from './product';

@Component({
  selector: 'app-product-page-list',
  templateUrl: './product-page-list.component.html',
  styleUrls: ['./product-page-list.component.css'],
})
export class ProductPageListComponent {
  productList: Product[] = [
    new Product(1, 'Laptop', 59000, true),
    new Product(2, 'Mobile', 20000, true),
    new Product(3, 'Table', 9000, false),
    new Product(4, 'Chair', 5900, false),
    new Product(5, 'Car', 9059000, true),
  ];
}
