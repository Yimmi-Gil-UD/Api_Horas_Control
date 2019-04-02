package com.ensat.services;

import com.ensat.entities.Tblproyecto;
//import com.ensat.entities.Product;
import com.ensat.entities.Tblusuario;

public interface ProjectService {

    //Iterable<Product> listAllProducts();
	Iterable<Tblproyecto> listAllProjects();
	

    /*Producto getProductById(Integer id);

    Producto saveProduct(Producto product);

    void deleteProduct(Integer id);

	Producto ProductosaveProduct(Producto product);*/
}
