
package ar.com.mauroheinrich.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hello World "+ nombre;
    }
    
    @GetMapping ("/bye/{nombre}/{edad}/{profesion}")
    public String sayBye(@PathVariable String nombre,
                         @PathVariable int edad,
                         @PathVariable String profesion){
        return "Bye World " + " Nombre: " + nombre + " Edad: "+ edad + " Profesión: "+ profesion;
    }
}
