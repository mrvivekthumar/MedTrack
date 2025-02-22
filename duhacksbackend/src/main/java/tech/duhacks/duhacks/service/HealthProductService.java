package tech.duhacks.duhacks.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.duhacks.duhacks.model.HealthProduct;
import tech.duhacks.duhacks.repository.HealthProductRepo;

import java.util.Optional;

@AllArgsConstructor
@Service
public class HealthProductService {


    HealthProductRepo healthProductRepo;

    public HealthProduct addProduct(HealthProduct product){
        return healthProductRepo.save(product);
    }

    public boolean deleteProduct(Long id){
        healthProductRepo.deleteById(id);
        var existingProduct = healthProductRepo.findById(id).orElse(null);
        if(existingProduct == null){
            return true;
        }
        return false;
    }


    public HealthProduct reorderProduct(Long productId, int additionalQuantity) {
        Optional<HealthProduct> optionalProduct = healthProductRepo.findById(productId);
        if (optionalProduct.isPresent()) {
            HealthProduct product = optionalProduct.get();
            // Increase the product's quantity by the additional quantity provided
            product.setQuantity(product.getQuantity() + additionalQuantity);
            return healthProductRepo.save(product);
        } else {
            throw new RuntimeException("Product not found with ID: " + productId);
        }
    }
}
