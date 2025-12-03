package com.ecommerce.Digital_commerce.Service;

import com.ecommerce.Digital_commerce.Model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategory();

    void  postCategory (Category category);

    String  deleteCategory (Long categoryId);
}
