package Macedo.Henrique.projFinal.controller;

import Macedo.Henrique.projFinal.model.WizardEntity;
import Macedo.Henrique.projFinal.repository.WizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Henrique Macedo Santos
 * @since 25/04/2020 8:39 PM
 * @version 1.0
 */
@RestController
@RequestMapping("/Wizards")
public class WizardController {

    @Autowired
    private WizardRepository wizardRepository;

    @GetMapping
    public ResponseEntity<List<WizardEntity>>findAll(){
        return new ResponseEntity<List<WizardEntity>>(
                (List<WizardEntity>)this.wizardRepository.findAll()
                ,new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{GWR}")
    public ResponseEntity<WizardEntity> findById(@PathVariable("GWR")long GWR){
        if (this.wizardRepository.findById(GWR).isPresent()) {
            return new ResponseEntity<WizardEntity>(
                    this.wizardRepository.findById(GWR).get(),
                    new HttpHeaders(), HttpStatus.OK);
        }
            return new ResponseEntity<WizardEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<WizardEntity> store(@RequestBody WizardEntity wizardEntity){
        return new ResponseEntity<WizardEntity>(
                this.wizardRepository.save(wizardEntity),
                new HttpHeaders(),
                HttpStatus.CREATED);
    }

    @PutMapping(value = "/{GWR}")
    public ResponseEntity<WizardEntity> update(@PathVariable("GWR") long GWR,@RequestBody WizardEntity wizardEntity) throws Exception{
        if (GWR == 0 || this.wizardRepository.existsById(GWR)){
            throw  new Exception("GWR not found");
        }
        return new ResponseEntity<WizardEntity>(
                this.wizardRepository.save(wizardEntity),
                new HttpHeaders(), HttpStatus.OK);

    }

    @DeleteMapping(value = "/{GWR}")
    public ResponseEntity<WizardEntity> delete(@PathVariable("GWR") long GWR){
        this.wizardRepository.deleteById(GWR);
        return  new ResponseEntity<WizardEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}

