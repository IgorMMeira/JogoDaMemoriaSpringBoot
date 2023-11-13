package com.igor.memorymame.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //usada para marcar uma classe como um controlador no contexto do Spring
public class MemoriaController {

  @GetMapping("/index.html")  //este método mapeia solicitações HTTP GET para a URL "/game.html". Ele retorna a string "game", indicando que está mapeando a solicitação para a página "game.html".
  public String index() {
    return "index";
  
  }
  @GetMapping("/game.html")
  public String game() {
    return "game";
  }
}