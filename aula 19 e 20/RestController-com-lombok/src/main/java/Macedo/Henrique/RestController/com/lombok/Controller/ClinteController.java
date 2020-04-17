package Macedo.Henrique.RestController.com.lombok.Controller;

import Macedo.Henrique.RestController.com.lombok.Model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Henrique Macedo
 * @since 15/04/2020 7:50PM
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
        client.setEmail("ze@ze.com");
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
        client.setEmail("zefiro@zefiro.com");
        Client client2 = new Client();
        client2.setNome("zezin");
        client2.setIdade(50);
        client2.setEmail("zezin@zezin.com");
        Client client3 = new Client();
        client3.setNome("zeca");
        client3.setIdade(92);
        client3.setEmail("zeca@zeca.com");
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client2);
        clients.add(client3);
        return clients;
    }
}