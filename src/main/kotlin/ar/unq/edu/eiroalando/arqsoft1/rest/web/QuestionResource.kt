package ar.unq.edu.eiroalando.arqsoft1.rest.web

import ar.unq.edu.eiroalando.arqsoft1.domain.QuestionType
import ar.unq.edu.eiroalando.arqsoft1.rest.representation.QuestionRepresentation
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
class QuestionResource2{

    @GET
    fun exampleSurvey(): QuestionRepresentation {
        return QuestionRepresentation("this is an example question", QuestionType.RADIO)
    }

}