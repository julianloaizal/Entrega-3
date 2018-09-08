package co.udea.heroes.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.heroes.model.Hero;

@RestController
@RequestMapping("/tourofheroes")

public class HeroesController {

@RequestMapping("/listar")

public List<Hero> getHeroes(){
List<Hero> heroes = new ArrayList<Hero>();
heroes.add(new Hero(1, "La mosca"));
heroes.add(new Hero(2, "La mole"));
heroes.add(new Hero(3, "La cosa"));
heroes.add(new Hero(4, "La hormiga"));

return heroes;
}
}
