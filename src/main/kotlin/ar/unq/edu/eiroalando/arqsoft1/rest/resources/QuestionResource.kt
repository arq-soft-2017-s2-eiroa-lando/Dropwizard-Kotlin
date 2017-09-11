package ar.unq.edu.eiroalando.arqsoft1.rest.resources

import ar.unq.edu.eiroalando.arqsoft1.domain.QuestionType
import ar.unq.edu.eiroalando.arqsoft1.rest.representation.QuestionRepresentation
import ar.unq.edu.eiroalando.arqsoft1.services.SurveyService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/question")
@Produces(MediaType.APPLICATION_JSON)
class QuestionResource() {

    @GET
    @Path("/example")
    fun exampleSurvey(): QuestionRepresentation {
        return QuestionRepresentation("this is an example question",QuestionType.RADIO)
    }

}