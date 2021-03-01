package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class GreetingController {
    @GetMapping("/greeting1")
    public String greeting(ModelMap modelMap) {
        modelMap.addAttribute("greeting","Hello World");
        return "index1";
    }

    @GetMapping("/greeting2")
    public ModelAndView helloWorld2(){
        ModelAndView modelAndView = new ModelAndView("index1");
        modelAndView.addObject("greeting","hi, i'm model and view greeting 2");
        return modelAndView;
    }

    @GetMapping("/greeting3")
    public  ModelAndView helloWithParam(@RequestParam String name,Integer id,Integer age){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name",name);
        modelAndView.addObject("age",age);
        modelAndView.addObject("id",id);
        return modelAndView;
    }

    @GetMapping("greeting4/{id}")
    public ModelAndView helloWithPathVariable(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name","thinh2");
        modelAndView.addObject("age",28);
        modelAndView.addObject("id",id);
        return modelAndView;
    }

}
