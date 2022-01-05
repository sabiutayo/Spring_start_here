package spring.start.here.sq_ch12_ex3.controllers;

import org.springframework.web.bind.annotation.*;
import spring.start.here.sq_ch12_ex3.model.Purchase;
import spring.start.here.sq_ch12_ex3.repositories.PurchaseRepository;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        purchaseRepository.storePurchase(purchase);
    }
    @GetMapping
    public List<Purchase> findPurchases() {
       return purchaseRepository.findAllPurchases();
    }
}
