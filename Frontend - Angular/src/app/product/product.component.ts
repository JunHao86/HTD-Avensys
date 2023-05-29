import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  productValue = 0
  discount = 0

    constructor(private activate:ActivatedRoute){
      this.activate.params.subscribe(((params)=>{
        let valone = params
        this.productValue = valone['pricing']
        this.discount = valone['discount_amount']
      }))
    }
}
