package application.controller;

import application.dao.ZarriFood;
import application.models.ZarriFoodModel;
import application.repo.ZarriFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZarriFoodController {
    @Autowired
    private ZarriFoodRepo zarriFoodRepo;

    @PostMapping("/zarrifoodadd")
    public String zarriFoodAdd(@RequestParam String manufacturer, String namefood, int servingsize){
        ZarriFoodModel zarriFoodModel = new ZarriFoodModel(manufacturer, namefood, servingsize);
        zarriFoodRepo.save(zarriFoodModel);
        return "ok";
    }

    @GetMapping("/zarrifoodget")
    public Iterable<ZarriFoodModel> zarriFoodGet(){
        Iterable<ZarriFoodModel> zarriFoods = zarriFoodRepo.findAll();
        return zarriFoods;
    }

    @Transactional
    @GetMapping("/zarrifooddelete")
    public void zarriFoodDelete(@RequestParam Long idZarrifood){
        zarriFoodRepo.deleteById(idZarrifood);
    }
}
