package day4

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import java.io.File

internal class D4PartTest {
    @Test
    fun GIVEN_passphase_WHEN_validated_THEN_correct() {
        val a = D4Part1.validate("aa bb cc dd ee")
        val b = D4Part1.validate("aa bb cc dd aa")
        val c = D4Part1.validate("aa bb cc dd aaa")

        Assertions.assertTrue(a)
        Assertions.assertFalse(b)
        Assertions.assertTrue(c)
    }

    @Test
    fun GIVEN_actual_WHEN_validated_THEN_correct() {
//        val url: String = ClassLoader.getSystemClassLoader().getResource("puzzle_data.txt").file

        val input = File("/home/timmles/projects/advent_of_code_2017/src/day4/puzzle_data.txt").readLines()
        var count = 0;

        for (line in input) {
            if (D4Part1.validate(line)) count++
        }

        Assertions.assertEquals(0, count)
    }

}