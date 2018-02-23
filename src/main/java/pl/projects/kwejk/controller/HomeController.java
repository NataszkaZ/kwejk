package pl.projects.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.projects.kwejk.model.Gif;
import pl.projects.kwejk.repository.GifRepository;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("gifs", GifRepository.getAllGifs());
        return "home";
    }
}
