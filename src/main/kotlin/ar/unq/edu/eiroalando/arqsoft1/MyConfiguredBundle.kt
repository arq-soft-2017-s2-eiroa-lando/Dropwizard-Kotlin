package ar.unq.edu.eiroalando.arqsoft1

import io.dropwizard.ConfiguredBundle
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment


class MyConfiguredBundle : ConfiguredBundle<MyConfiguredBundleConfig> {

    override fun run(applicationConfig: MyConfiguredBundleConfig, environment: Environment) {
        applicationConfig.bundleSpecificConfig
    }

    override fun initialize(bootstrap: Bootstrap<*>) {

    }
}
