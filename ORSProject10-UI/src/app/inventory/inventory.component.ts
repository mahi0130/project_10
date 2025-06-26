import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent extends BaseCtl{

 constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
     super(locator.endpoints.INVENTORY, locator, route);
   }
   validate() {
     return this.validateForm(this.form.data);
   }
   validateForm(form) {
     let flag = true;
     let validator = this.serviceLocator.dataValidator;
     flag = flag && validator.isNotNullObject(form.supplierName);
     flag = flag && validator.isNotNullObject(form.lastUpdatedDate);
     flag = flag && validator.isNotNullObject(form.quantity);
     flag = flag && validator.isNotNullObject(form.product);
     return flag;
   }
 
   populateForm(form, data) {
     form.id = data.id;
     form.supplierName = data.supplierName;
     form.lastUpdatedDate = data.lastUpdatedDate;
     form.quantity = data.quantity;
     form.product = data.product;
     form.status = data.status;
   }
    parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }
  test() {

  }

}

 
 