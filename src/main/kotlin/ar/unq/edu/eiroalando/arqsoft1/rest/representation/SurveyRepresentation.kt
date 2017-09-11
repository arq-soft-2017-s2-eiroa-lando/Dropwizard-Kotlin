package ar.unq.edu.eiroalando.arqsoft1.rest.representation

import ar.unq.edu.eiroalando.arqsoft1.domain.Question
import com.fasterxml.jackson.annotation.JsonProperty


data class SurveyRepresentation(
        @JsonProperty("questions") val questions: List<Question>,
        @JsonProperty("description") val description:String)