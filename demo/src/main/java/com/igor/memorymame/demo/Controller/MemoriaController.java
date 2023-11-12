package com.igor.memorymame.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemoriaController {

  @GetMapping("/index.html")
  public String index() {
    return "index";
  
  }
  @GetMapping("/game.html")
  public String game() {
    return "game";
  }
}