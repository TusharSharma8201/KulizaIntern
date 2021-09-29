package com.example.addtwo.Addcontroller;

import com.example.addtwo.domain.addition;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class addController {
    @GetMapping("/index")
    public String ViewForm(Model model){
        model.addAttribute("Addition",new addition());
        return "index";

    }
    @PostMapping("/addtion")
    public String addForm(@ModelAttribute addition addition,BindingResult result,Model model)
    {
        model.addAttribute("addtion",addition);
        return "calculate";
    }
    
}
