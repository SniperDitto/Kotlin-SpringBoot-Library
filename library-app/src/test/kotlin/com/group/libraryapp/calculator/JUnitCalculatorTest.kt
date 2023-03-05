package com.group.libraryapp.calculator

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JUnitCalculatorTest {

    @Test
    fun addTest(){
        //given
        val calculator = Calculator(0)

        //when
        calculator.add(5)

        //then : 단언문 assertThat~
        assertThat(calculator.number).isEqualTo(5)
    }

    @Test
    fun minusTest(){
        //given
        val calculator = Calculator(5)

        //when
        calculator.minus(1)

        //then : 단언문 assertThat~
        assertThat(calculator.number).isEqualTo(4)
    }

    @Test
    fun multiplyTest(){
        //given
        val calculator = Calculator(1)

        //when
        calculator.multiply(5)

        //then : 단언문 assertThat~
        assertThat(calculator.number).isEqualTo(5)
    }

    @Test
    fun divideTest(){
        //given
        val calculator = Calculator(10)

        //when
        calculator.divide(2)

        //then : 단언문 assertThat~
        assertThat(calculator.number).isEqualTo(5)
    }

    @Test
    fun divideExceptionTest(){
        //given
        val calculator = Calculator(10)

        //when
        assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.apply {
            assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")
        }

    }
}