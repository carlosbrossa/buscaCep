package br.com.netshoes.cep.rest;

import br.com.netshoes.cep.model.Endereco;
import br.com.netshoes.cep.service.EnderecoService;
import br.com.netshoes.cep.service.impl.EnderecoCorreiosServiceImpl;
import br.com.netshoes.model.ResponseHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by cbrossa on 12/04/15.
 */
@Path("/endereco")
public class EnderecoRestService {

    @Autowired
    EnderecoCorreiosServiceImpl enderecoService;

    @GET
    @Path("/{cep}")
    public Response findEndereco(@PathParam("cep") String cep){

        ResponseHttp responseHttp = enderecoService.find(cep);
        return Response.status(responseHttp.getHttpStatusCode()).entity(responseHttp.getContentResponse()).build();

    }


}
