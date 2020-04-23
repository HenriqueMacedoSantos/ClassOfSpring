package Macedo.Henrique.Exeploh2mysql.controller;

import Macedo.Henrique.Exeploh2mysql.model.ClientEntity;
import Macedo.Henrique.Exeploh2mysql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Henrique Macedo Santos
 * @since 23/04/2020 07:48 AM
 * @version 1.0
 */
@RestController
@RequestMapping("/Clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll(){
        return new ResponseEntity<List<ClientEntity>>(
                (List<ClientEntity>) this.clientRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientEntity>findById(@PathVariable("id") long id){
        if(this.clientRepository.findById(id).isPresent()) {
            return new ResponseEntity<ClientEntity>(
                    this.clientRepository.findById(id).get(),
                    new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<ClientEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ClientEntity> store(@RequestBody ClientEntity clientEntity){
        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),
                new HttpHeaders(), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientEntity> update(@PathVariable("id")Long id,
                                               @RequestBody ClientEntity clientEntity) throws Exception{
        if (id == 0 || this.clientRepository.existsById(id)){
            throw new Exception("This Code Not By Found");
        }
        return new ResponseEntity<ClientEntity>(this.clientRepository.save(clientEntity), new HttpHeaders(),HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ClientEntity> delete(@PathVariable("id")long id){
        this.clientRepository.deleteById(id);
        return new ResponseEntity<ClientEntity>(new HttpHeaders(),HttpStatus.OK);
    }
}
//https - POST, GET, DELETE, PUT
// /clients -> Send data for register... POST
// /clients -> Consult                   GET
// /clients/1 -> path                    GET
// /clients/1 -> path                    DELETE

