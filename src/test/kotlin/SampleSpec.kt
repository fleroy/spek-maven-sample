package sample

import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import kotlin.test.assertTrue

@RunWith(JUnitPlatform::class)
class SampleSpec : Support({
    data class Bean(var a: String)

    group("une simulation au statut") {
        val b = Bean("")

        b.let { }
        listOf(Bean("a"), Bean("b")).forEach { bean ->
            `when`("compute an offer ${bean.a}") {
                // System.out.println("bean: ${bean}");
                then("result is ${bean.a}") {
                    assertTrue(true)
                }
                then("offer is ${bean.a}") {
                    assertTrue(true)
                }
            }
            `when`("calcul une offre initiale A ${bean.a}") {
                then("azaz ${bean.a}") {
                    assertTrue(true)
                }
            }
        }
        `when`("ZZZZZ") {
            then("ZZZ") {
                System.out.println("qdq")
            }
        }

    }
})
