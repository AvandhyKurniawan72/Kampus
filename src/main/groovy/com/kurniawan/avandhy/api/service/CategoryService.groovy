package com.kurniawan.avandhy.api.service
import com.kurniawan.avandhy.api.entity.Category
interface CategoryService {
    List<Category> findAll()
    Category findById(int id)
}