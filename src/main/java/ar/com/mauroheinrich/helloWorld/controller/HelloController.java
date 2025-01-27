
package ar.com.mauroheinrich.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello(@RequestParam String nombre){
        return "Hello World "+ nombre;
    }
    
    @GetMapping ("/bye")
    public String sayBye(@RequestParam  String nombre,
                         @RequestParam  int edad,
                         @RequestParam  String profesion){
        return "Bye World " + " Nombre: " + nombre + " Edad: "+ edad + " Profesión: "+ profesion;
    }
}
