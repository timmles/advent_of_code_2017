package day5

class D5Part1 {

    fun execute(ints: Array<Int>): Int {
        var count = 0;
        var pointer = 0;

        while (pointer < ints.size) {
//            println(ints.joinToString(","))
//            println(pointer)
//            println(ints[pointer])

            val instruction = ints[pointer]
            ints[pointer]++

            pointer = instruction + pointer;
            count++;
        }

        return count;
    }
}

class D5Part2 {

    fun execute(ints: Array<Int>): Int {
        var count = 0;
        var pointer = 0;

        while (pointer < ints.size) {
//            println(ints.joinToString(","))
//            println(pointer)
//            println(ints[pointer])

            val instruction = ints[pointer]

            if (instruction >= 3) {
                ints[pointer]--
            } else {
                ints[pointer]++
            }

            pointer = instruction + pointer;
            count++;
        }

        return count;
    }
}