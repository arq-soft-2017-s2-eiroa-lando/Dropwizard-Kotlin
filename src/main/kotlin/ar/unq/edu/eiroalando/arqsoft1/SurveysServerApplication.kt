package ar.unq.edu.eiroalando.arqsoft1

import ar.unq.edu.eiroalando.arqsoft1.persistence.SurveyDao
import ar.unq.edu.eiroalando.arqsoft1.rest.resources.QuestionResource
import ar.unq.edu.eiroalando.arqsoft1.rest.resources.SurveyResource
import ar.unq.edu.eiroalando.arqsoft1.services.SurveyService
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.dropwizard.Application
import io.dropwizard.assets.AssetsBundle
import io.dropwizard.jersey.setup.JerseyEnvironment
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment


class SurveysServerApplication : Application<SurveysServerApplicationConfiguration>() {

    var surveyDao:SurveyDao = SurveyDao()
    var surveyService:SurveyService = SurveyService(surveyDao)
     var surveyResource:SurveyResource = SurveyResource(surveyService)


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SurveysServerApplication().run(*args)
        }
    }

    override fun initialize(bootstrap: Bootstrap<SurveysServerApplicationConfiguration>) {
        super.initialize(bootstrap)
        bootstrap.objectMapper.registerKotlinModule()
        bootstrap.addBundle(AssetsBundle("/html", "/app", "index.html", "static"))
    }

    override fun run(configuration: SurveysServerApplicationConfiguration, environment: Environment) {
        configureEndpoints(environment.jersey())
    }


    fun configureEndpoints(jersey: JerseyEnvironment) {
        jersey.register(surveyResource)
        jersey.register(QuestionResource())
    }

    fun prepareBeans(){
        surveyDao = SurveyDao()
        surveyService = SurveyService(surveyDao)
        surveyResource = SurveyResource(surveyService)
    }
}