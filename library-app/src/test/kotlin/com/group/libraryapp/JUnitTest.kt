package com.group.libraryapp

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JUnitTest {

    @BeforeEach
    fun beforeEach(){
        println("각 테스트 시작 전")
    }

    @AfterEach
    fun afterEach(){
        println("각 테스트 시작 후")
    }

    @Test
    fun test1(){
        println("test1")
    }

    @Test
    fun test2(){
        println("test2")
    }

}