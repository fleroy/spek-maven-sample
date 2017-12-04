package sample

import io.kotlintest.specs.BehaviorSpec
import kotlin.test.assertTrue

class Sample2: BehaviorSpec() {
    init {
        data class Bean(val a: String);
        listOf(Bean("a"), Bean("b")).forEach { bean ->
            Given("une simulation au statut ${bean.a}") {
                When("calcul une offre initiale ${bean.a}") {
                    // System.out.println("bean: ${bean}");
                    Then("le resultat ${bean.a}") {
                        assertTrue(true)
                    }
                    Then("les offres ${bean.a}") {
                        assertTrue(true)
                    }
                }
            }
        }
    }
}