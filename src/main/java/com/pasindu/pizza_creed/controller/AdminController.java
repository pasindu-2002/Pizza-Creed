package com.pasindu.pizza_creed.controller;

import jdk.jfr.MemoryAddress;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import com.pasindu.pizza_creed.model.Pizza;
import com.pasindu.pizza_creed.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin/pizza")
public class AdminController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/")
    public String showProductPage(Model model) {
        List<Pizza> listProduct = pizzaService.listAll();
        model.addAttribute("pizzas", listProduct);
        System.out.println("Get / ");
        return "dashboard";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("pizza", new Pizza());
        return "add-pizza";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePizza(@ModelAttribute Pizza pizza, RedirectAttributes redirectAttributes,Model model) {
        try {
            pizzaService.addPizza(pizza);
            model.addAttribute("successMessage", "Pizza added successfully!");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to add pizza. Please try again.");
        }
        return "add-pizza";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditPage(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit-pizza");
        Pizza std = pizzaService.get(id);
        mav.addObject("pizza", std);
        return mav;
    }

    @RequestMapping(value = "/saves", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Pizza std) {
        pizzaService.addPizza(std);
        return "redirect:/admin/pizza/";
    }
    @GetMapping("delete/{id}")
    public String deletePizza(@PathVariable Long id){
        pizzaService.deletePizza(id);
        return "redirect:/admin/pizza/";
    }

}
