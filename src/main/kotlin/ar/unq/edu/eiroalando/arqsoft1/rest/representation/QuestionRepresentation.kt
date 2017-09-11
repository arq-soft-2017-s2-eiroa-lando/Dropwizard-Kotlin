package ar.unq.edu.eiroalando.arqsoft1.rest.representation

import ar.unq.edu.eiroalando.arqsoft1.domain.Question
import ar.unq.edu.eiroalando.arqsoft1.domain.QuestionType
import com.fasterxml.jackson.annotation.JsonProperty

data class QuestionRepresentation(
        @JsonProperty("text") val text: String,
        @JsonProperty("type") val type:QuestionType)