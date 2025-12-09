package com.ecommerce.Digital_commerce.Service;

import com.ecommerce.Digital_commerce.Model.Category;
import com.ecommerce.Digital_commerce.Repository.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplementation implements CategoryService {
    @Autowired
    CatagoryRepository catagoryRepository ;

    //private List<Category> categoriesLi = new ArrayList<>();

    private Long nextID = 1L;

    @Override
    public List<Category> getAllCategory() {
        //return categoriesLi;
        return catagoryRepository.findAll();
    }


    @Override
    public void postCategory(Category category) {
        //category.setCategoryID(nextID++);
        //categoriesLi.add(category);  // here no argument constructure is called her jackson a java library to manage JSON it will create new Category();
        //categoriesLi.add(new Category(11 ,"fs")); //instilissed by parematarised constructure

        catagoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        //List<Category> categoriesLi = catagoryRepository.findAll();// this is for datarepo  implementation
//       Optional<Category> categoryopt =categoriesLi.stream().filter(c -> c.getCategoryID().equals(categoryId)).findFirst(); //this will throw null pointer exception if no id is founf
//
//       if(categoryopt.isPresent()){
//           categoriesLi.remove(categoryopt.get());
//           return " removed ";
//       }else{
//           return "not found";
//       }
        //so here we are throwing exception to HTTps request before that we are only sending string not found not https status;
//        Category categoryopt = categoriesLi.stream().
//                filter(c -> c.getCategoryID().equals(categoryId)).
//                findFirst().
//                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID not found")); //this is done because restapi throw not found with 200K which means we are only returning the string not the hhtp status.
//
//        //categoriesLi.remove(categoryopt);
//        catagoryRepository.delete(categoryopt);
//        return "Category removed succefully";



        //using repo things here

        Category category = catagoryRepository.findById(categoryId).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"ID not found"));

        catagoryRepository.delete(category);
        return "id not found by statement";
    }

    @Override
    public String updateCategory(Category category, Long categoryId) {
//        List<Category> categoriesLi = catagoryRepository.findAll(); //this is for datarepo  implementation
//
//        Category existingCategory = categoriesLi.stream().
//                filter(c -> c.getCategoryID().equals(categoryId)).findFirst().
//                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID IS NOT VALID ,SO IT CAN'T BE UPDATED"));
//
//        //categoryupdate.setCategoryName(category.getCategoryName());
//
//        existingCategory.setCategoryName(category.getCategoryName());
//        catagoryRepository.save(existingCategory);
//        return "category updated";

        //using repo things here

        Category newcategory = catagoryRepository.findById(categoryId).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"ID not found"));
        newcategory.setCategoryName(category.getCategoryName());
        catagoryRepository.save(category);
        return "id updated";
    }
}


