package io.troig.inventoryservice.api.rest;

import io.troig.inventory.api.InventoriesApi;
import io.troig.inventory.dto.Inventory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController implements InventoriesApi {

   @Override
   public ResponseEntity<Inventory> inventoriesIdGet(Long id) {
      return new ResponseEntity<>(new Inventory(1, 1, 1), HttpStatus.OK);
   }
}
