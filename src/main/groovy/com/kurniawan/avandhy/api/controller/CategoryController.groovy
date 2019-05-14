package com.kurniawan.avandhy.api.controller
import com.kurniawan.avandhy.api.entity.Category
import com.kurniawan.avandhy.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/categories')
class CategoryController {
    @Autowired
    private final CategoryService categoryService

    @GetMapping('')
    List<Category> findAll() {
        categoryService.findAll()
    }

    @PostMapping('/categories')
    Category newCategory(@RequestBody Category newCategory) {
        return categoryService.save(newCategory);
    }

    @PutMapping("/categories/{id}")
    Category replaceCategory(@RequestBody Category newCategory, @PathVariable Integer id) {
        return CategoryService.findById(id)
            CategoryService.setName(newCategory.getName());
            return CategoryService.save(category);
    }

    @DeleteMapping("/categories/{id}")
    void deleteCategory(@PathVariable Integer id) {
        categoryService.deleteById(id);
    }
}