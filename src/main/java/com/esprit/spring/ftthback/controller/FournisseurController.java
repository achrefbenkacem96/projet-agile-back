package com.esprit.spring.ftthback.controller;

import com.esprit.spring.ftthback.models.Fournisseur;
import com.esprit.spring.ftthback.services.FournisseurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/Fournisseur")
public class FournisseurController {
    @Autowired
    FournisseurServiceImpl fournisseurService;

    @GetMapping("/retrieve-all-fournisseur")
    @ResponseBody
    public List<Fournisseur> getAllRegion() {
        List<Fournisseur> list = fournisseurService.RetreiveAllFournisseur();
        return list;
    }

    @DeleteMapping("/remove-fournisseur/{fournisseur-id}")
    @ResponseBody
    public void removeFournisseur(@PathVariable("fournisseur-id") Long id) {
        fournisseurService.DeleteFournisseur(id);
    }

    @GetMapping("/retrieve-fournisseur/{fournisseur-id}")
    @ResponseBody
    public Fournisseur getFournisseur(@PathVariable("fournisseur-id") Long id) {
        return fournisseurService.findById(id);
    }

    @PostMapping("/Add-fournisseur")
    @ResponseBody
    public Fournisseur addFournisseur(@RequestBody Fournisseur fournisseur) {

        return fournisseurService.AddFournisseur(fournisseur);
    }

    @PutMapping(value = "/modifyfournisseur/{fournisseur-id}")
    public Fournisseur modify(@PathVariable(name = "fournisseur-id") Long id, @RequestBody Fournisseur fournisseur) {

        return fournisseurService.updateFournisseur(fournisseur, id);

    }
}
