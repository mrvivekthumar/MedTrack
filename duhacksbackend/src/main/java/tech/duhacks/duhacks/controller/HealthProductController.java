package tech.duhacks.duhacks.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.duhacks.duhacks.model.HealthProduct;
import tech.duhacks.duhacks.service.HealthProductService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/healthproduct")
public class HealthProductController {

    private final HealthProductService healthProductService;

    @PostMapping("/insert")
    public HealthProduct insert(@RequestBody HealthProduct healthProduct) {
        return healthProductService.addProduct(healthProduct);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return healthProductService.deleteProduct(id);
    }
    @PostMapping("/{id}/reorder/{quantity}")
    public HealthProduct reorder(@PathVariable Long id,  @PathVariable Integer quantity) {
        return healthProductService.reorderProduct(id, quantity);
    }

}
