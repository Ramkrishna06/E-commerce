package com.ecommerce.Digital_commerce.Controller;


import com.ecommerce.Digital_commerce.Model.Category;
import com.ecommerce.Digital_commerce.Service.CategoryService;
import com.ecommerce.Digital_commerce.Service.CategoryServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

     private  CategoryService categoryService;

    //@RequestMapping("all the commen api part her ")
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    //@GetMapping("api/public/categories")
    @RequestMapping(value = "api/public/categories" , method = RequestMethod.GET)
     public ResponseEntity<List<Category>> getCategories(){
        List<Category> allCategory = categoryService.getAllCategory();
         return new ResponseEntity<>(allCategory,HttpStatus.OK);
     }



     @PostMapping("api/public/categories")
     public ResponseEntity<String> postCategories(@RequestBody Category category){
        categoryService.postCategory(category);
        return new ResponseEntity<>("added",HttpStatus.OK);

     }

    @DeleteMapping("api/admin/categories/{categoryID}")
    public ResponseEntity<String> postCategories(@PathVariable  Long categoryID){

        //by now we are noot hadling exception here  we are noramlly returning string not https status to api ok
        //return categoryService.deleteCategory(categoryID);

        // but now we want to handle the exception if HTTps request is 404 not found to do that
        try{
            String status = categoryService.deleteCategory(categoryID);
            return new ResponseEntity<>(status, HttpStatus.OK);
        }catch ( ResponseStatusException e){
            return new ResponseEntity<>( e.getReason(),e.getStatusCode()); //ResponseEntity allows you to wrap respone and get better control
        }
    }

    @PutMapping("api/admin/categories/{categoryID}")
    public ResponseEntity<String> updataCategories(@RequestBody Category category, @PathVariable Long categoryID){
      //return categoryService.updateCategory(category , categoryID);

        try {
            String staus = categoryService.updateCategory(category , categoryID);
            return new ResponseEntity<>(staus,HttpStatus.OK);
        }catch(ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(),e.getStatusCode());
        }
    }
}
