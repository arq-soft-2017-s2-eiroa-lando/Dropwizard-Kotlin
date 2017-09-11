package ar.unq.edu.eiroalando.arqsoft1.domain


class Survey {
    var questions: List<Question>
    var description: String


    constructor(description: String, questions: List<Question>) {
        this.description = description
        this.questions = questions
    }

}