package com.group.libraryapp.calculator


fun main(){
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {
    fun addTest(){
        //given
        val calculator = Calculator(0)

        //when
        calculator.add(5)

        //then
        //data class 이용한 경우
        //val expectedCalculator = Calculator(5)
        //if(calculator!=expectedCalculator) throw IllegalStateException("계산된 값이 다릅니다.")

        //변수를 public으로 선언 후 직접 비교한 경우 + backing property
        if(calculator.number!=5) throw IllegalStateException("계산된 값이 다릅니다.")
    }

    fun minusTest(){
        //given
        val calculator = Calculator(10)

        //when
        calculator.minus(4)

        //then
        if(calculator.number!=6) throw IllegalStateException("계산된 값이 다릅니다.")
    }

    fun multiplyTest(){
        //given
        val calculator = Calculator(10)

        //when
        calculator.multiply(2)

        //then
        if(calculator.number!=20) throw IllegalStateException("계산된 값이 다릅니다.")
    }

    fun divideTest(){
        //given
        val calculator = Calculator(20)

        //when
        calculator.divide(5)

        //then
        if(calculator.number!=4) throw IllegalStateException("계산된 값이 다릅니다.")
    }

    fun divideExceptionTest(){
        //given
        val calculator = Calculator(20)

        //when
        try {
            calculator.divide(0)
        } catch (e:IllegalArgumentException){
            if(e.message!="0으로 나눌 수 없습니다.") throw IllegalStateException("에러 메시지가 다릅니다.")
            print("exception test success")
            return
        } catch (e:Exception){
            throw IllegalStateException("unknown exception")
        }
        throw IllegalStateException("no exception has occurred")
    }
}