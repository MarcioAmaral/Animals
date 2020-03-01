package dominando.android.animals.di

import dagger.Component
import dominando.android.animals.model.AnimalApiService

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: AnimalApiService)
}