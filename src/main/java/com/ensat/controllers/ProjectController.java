package com.ensat.controllers;


import com.ensat.services.ProjectService;
//import com.ensat.entities.Product;
import com.ensat.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ensat.application.*;
import com.ensat.DTO.*;

/**
 * Product controller.
 */
@RestController
@RequestMapping("v1.0/api")
public class ProjectController {

    private ProjectService projectService;
    private IApplicationServices _applicationServices;
    
    
    @Autowired
    public void setUserService(IApplicationServices _applicationServices) {
        this._applicationServices = _applicationServices;
    }
    
    @GetMapping("/getProject")
    public List<ProjectDTO> getProject(){
    	return _applicationServices.getProject();
    }
    
    
    
    /* metodo original
    //accedera todos los productos
    @GetMapping("/getProducts")
    public List<UserDTO> getProducts(){
    	return _applicationServices.getProducts();
    }
//   
 */
    /* 
    //consultar por id
    @GetMapping("/getProductById/{id}")
    public Producto getProductById(@PathVariable final int id){
        return userService.getProductById(id);
    }
    
    //insertar
    @PostMapping("/CreateProduct")
    public Producto saveProduct(@RequestBody Producto product) {
        userService.saveProduct(product);
        return product;
    }
    
    //eliminar
    @DeleteMapping("/DeleteDato/{id}")	
    public void EliminarDato(@PathVariable final int id) {
            userService.deleteProduct(id);      
           
    }
        
    //actualizar
    @PutMapping("/UpdateProduct")
    public void UpdateProduct(@RequestBody Producto product)
	{
		Producto preProduct = userService.getProductById(product.getId());
		//preProduct.setVersion(preProduct.getVersion());
		preProduct.setName(product.getName());
		//preProduct.setPrice(preProduct.getPrice());
		//preProduct.setProductId(preProduct.getProductId());
	  	userService.saveProduct(preProduct);
	}*/

}
