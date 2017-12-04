package sample

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*

abstract class Support(spec: Spec.() -> Unit) : Spek(spec) {

    companion object {
        fun TestContainer.then(description: String, body: TestBody.() -> Unit) {
            test("then $description", body = body)
        }

        fun SpecBody.`when`(description: String, body: ActionBody.() -> Unit) {
            action("when $description", body = body)
        }
    }
}