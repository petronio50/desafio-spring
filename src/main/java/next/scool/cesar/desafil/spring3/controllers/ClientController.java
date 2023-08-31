package next.scool.cesar.desafil.spring3.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import next.scool.cesar.desafil.spring3.entities.Client;
import next.scool.cesar.desafil.spring3.repositores.ClientRepositores;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClientController {
@Autowired
    private ClientRepositores clientRepositores;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody @Validated Client client) throws Exception {
        return clientRepositores.save(client);    
    
}
}
