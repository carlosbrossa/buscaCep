package br.com.netshoes.cep.service.impl;

import br.com.netshoes.cep.builder.EnderecoCorreioBuilder;
import br.com.netshoes.cep.service.EnderecoService;
import br.com.netshoes.model.ResponseHttp;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cbrossa on 12/04/15.
 */
@Service
public class EnderecoCorreiosServiceImpl implements EnderecoService<ResponseHttp, String>{

    private final String pathCorreio = "http://api.postmon.com.br/v1/cep/";

    @Autowired
    EnderecoCorreioBuilder builder;

    /**
     * Find endereco correios by cep
     * @param cep postal code
     * @return Endereco
     */
    public ResponseHttp find(String cep) {

        Client client = Client.create();

        WebResource webResource = client
                .resource("http://api.postmon.com.br/v1/cep/" + cep);

        ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);

        return builder.build(response);

    }
}
