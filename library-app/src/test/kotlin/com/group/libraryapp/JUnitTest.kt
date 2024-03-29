package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JUnitTest {

    companion object{
        @JvmStatic
        @BeforeAll
        fun beforeAll(){
            println("전체 테스트 시작 전")
        }

        @JvmStatic
        @AfterAll
        fun afterAll(){
            println("전체 테스트 종료 후")
        }
    }

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