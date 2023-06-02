package com.example.studentmanagementsystem.controller;

import com.example.studentmanagementsystem.entity.Resources;
import com.example.studentmanagementsystem.service.ResourcesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResourcesController {
    private ResourcesService resourcesService;

    public ResourcesController(ResourcesService resourcesService) {

        this.resourcesService = resourcesService;
    }

    //handler method to handle list of students
    @GetMapping("/resources")
    public String listStudents(Model model) {
        model.addAttribute("resources", resourcesService.getAllResources());
        return "resources";
    }

    //adding new student
    @GetMapping("/resources/new")
    public String createStudentForm(Model model) {
        Resources resources = new Resources();
        model.addAttribute("resources", resources);
        return "create_resources";
    }

    @PostMapping("/resources")
    public String saveResources(@ModelAttribute("resources") Resources resources) {
        resourcesService.saveResources(resources);
        return "redirect:/resources";
    }

    //update
    @GetMapping("/resources/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("resources", resourcesService.getResourcesById(id));
        return "edit_resources";
    }

    @PostMapping("/resources/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("resources") Resources resources, Model model) {
        //get student from database by id
        Resources existingResources = resourcesService.getResourcesById(id);
        existingResources.setId(id);
        existingResources.setName(resources.getName());
        existingResources.setAmount(resources.getAmount());


        //save updated student object
        resourcesService.updateResources(existingResources);
        return "redirect:/resources";
    }

    //deleting
    @GetMapping("resources/{id}")
    public String deleteResources(@PathVariable Long id) {
        resourcesService.deleteResourcesById(id);
        return "redirect:/resources";
    }
}
