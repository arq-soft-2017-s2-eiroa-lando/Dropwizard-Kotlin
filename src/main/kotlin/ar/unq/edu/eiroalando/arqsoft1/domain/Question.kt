package ar.unq.edu.eiroalando.arqsoft1.domain

import com.fasterxml.jackson.annotation.JsonProperty


class Question(@JsonProperty("text") val text: String, @JsonProperty("type") val type: QuestionType) {

    fun isValidText():Boolean{
        return text.length > 30
    }
}

enum class QuestionType {
    RADIO, TEXT
}
