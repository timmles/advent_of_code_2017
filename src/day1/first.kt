package day1

class First {

    fun execute(input: String): Int {
        var sum: Int = 0;

        for (charIndex in input.indices) {
            val sut: Int = Character.getNumericValue(input[charIndex]);
            val next: Int;

            if ((charIndex + 1) != input.length) {
                next = Character.getNumericValue(input[charIndex + 1]);
            } else {
                next = Character.getNumericValue(input[0]);
            }

            if (sut == next) sum += sut;
        }

        return sum;
    }
}

class Second {

    fun execute(input: String): Int {
        var sum: Int = 0;

        val halfwayJump = input.length / 2

        for (charIndex in input.indices) {
            val sut: Int = Character.getNumericValue(input[charIndex]);
            val next: Int;

            val index = (charIndex + halfwayJump) % input.length;
            next = Character.getNumericValue(input[index]);

            if (sut == next) sum += sut;
        }

        return sum;
    }
}