package tech.duhacks.duhacks.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.duhacks.duhacks.dto.HealthProductDto;
import tech.duhacks.duhacks.service.HealthProductService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/healthproduct")
public class HealthProductController {

    private final HealthProductService healthProductService;

    @PostMapping("/insert")
    public ResponseEntity<HealthProductDto> insert(@RequestBody HealthProductDto healthProductDto) {
        return ResponseEntity.ok(healthProductService.add(healthProductDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(healthProductService.deleteProduct(id));
    }
//    @PostMapping("/{id}/reorder/{quantity}")
//    public HealthProduct reorder(@PathVariable Long id, @PathVariable Integer quantity) {
//        return healthProductService.reorderProduct(id, quantity);
//    }

}