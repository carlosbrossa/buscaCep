package br.com.netshoes.cep.builder;

import br.com.netshoes.builder.ResponseBuilder;
import br.com.netshoes.cep.model.Endereco;
import br.com.netshoes.model.ResponseHttp;
import com.sun.jersey.api.client.ClientResponse;
import org.springframework.stereotype.Service;

/**
 * Created by cbrossa on 12/04/15.
 */
@Service
public class EnderecoCorreioBuilder implements ResponseBuilder<ResponseHttp, ClientResponse> {

    public ResponseHttp build(ClientResponse clientResponse) {

        ResponseHttp responseHttp = new ResponseHttp();
        responseHttp.setHttpStatusCode(clientResponse.getStatus());
        if(clientResponse.getStatus() != 200) {
            return responseHttp;
        }

        final Endereco endereco = clientResponse.getEntity(Endereco.class);
        responseHttp.setContentResponse(endereco);
        return responseHttp;
    }
}
