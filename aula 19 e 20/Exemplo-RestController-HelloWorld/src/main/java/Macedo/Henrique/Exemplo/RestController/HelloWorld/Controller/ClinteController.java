package Macedo.Henrique.Exemplo.RestController.HelloWorld.Controller;

import Macedo.Henrique.Exemplo.RestController.HelloWorld.Model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Henrique Macedo
 * @since 15/04/2020 7:25PM
 * @version 1.0
 */
@RestController
public class ClinteController {

    /**
     *
     * @return one client specific
     */
    @GetMapping("/client")
    public Client client(){
        Client client = new Client();
        client.setNome("ze");
        client.setIdade(30);
        return client;
    }

    /**
     *
     * @return All Clients
     */
    @GetMapping("/listaclient")
    public ArrayList<Client> getClient(){
        Client client = new Client();
        client.setNome("zefiro");
        client.setIdade(30);
        Client client2 = new Client();
        client2.setNome("zezin");
        client2.setIdade(50);
        Client client3 = new Client();
        client3.setNome("zeca");
        client3.setIdade(92);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client2);
        clients.add(client3);
        return clients;
    }
}