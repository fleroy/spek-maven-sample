package sample

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Test
import org.junit.platform.runner.JUnitPlatform
import java.time.Clock
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class TestSpec : Spek({

    @Test
    fun to() {
        assert(true)
    }
}