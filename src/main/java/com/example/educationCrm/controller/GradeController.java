package com.example.educationCrm.controller;

import com.example.educationCrm.model.dto.GradeDTO;
import com.example.educationCrm.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @PostMapping
    public void save(@RequestBody GradeDTO gradeDTO){
        this.gradeService.save(gradeDTO);
    }


    @PutMapping
    public void update(@RequestBody GradeDTO gradeDTO){
        this.gradeService.update(gradeDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.gradeService.delete(id);
    }

    @GetMapping
    public List<GradeDTO> getGrades(){
        return this.gradeService.findAll();
    }
}
