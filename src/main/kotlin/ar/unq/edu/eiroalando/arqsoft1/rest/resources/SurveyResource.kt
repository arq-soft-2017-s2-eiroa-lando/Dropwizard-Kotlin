package ar.unq.edu.eiroalando.arqsoft1.rest.resources

import ar.unq.edu.eiroalando.arqsoft1.domain.Question
import ar.unq.edu.eiroalando.arqsoft1.domain.QuestionType
import ar.unq.edu.eiroalando.arqsoft1.rest.representation.SurveyRepresentation
import ar.unq.edu.eiroalando.arqsoft1.services.SurveyService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/survey")
@Produces(MediaType.APPLICATION_JSON)
class SurveyResource(val surveyService: SurveyService) {

    @GET
    @Path("/example")
    fun exampleSurvey(): SurveyRepresentation {
        var q1 = Question("¿En cuantas materias deseas anotarte?",QuestionType.RADIO)
        var q2 = Question("¿Tienes alguna sugerencia?",QuestionType.TEXT)
        var description = "La siguiente encuesta tiene como objetivo analizar la intencion de inscripcion del alumnado"
        return SurveyRepresentation(listOf(q1,q2),description)
    }

    @GET
    @Path("/hello")
    fun helloWorld(): String {
        return "hello world"
    }

}