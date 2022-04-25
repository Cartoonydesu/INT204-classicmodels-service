package sit.int204.classicmodelsservice.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelsservice.dtos.ProductPageDTO;
import sit.int204.classicmodelsservice.dtos.SimpleProductDTO;
import sit.int204.classicmodelsservice.services.ProductService;

@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("")
    public ProductPageDTO getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "productName") String sortBy) {
        return service.getAllProduct(page, pageSize, sortBy);
    }

    @GetMapping("/{productCode}")
    public SimpleProductDTO getAllProducts(@PathVariable String productCode) {
        return service.getProduct(productCode);
    }
}