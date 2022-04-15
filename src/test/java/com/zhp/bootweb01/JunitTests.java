package com.zhp.bootweb01;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("小蟑蟑")
@SpringBootTest
public class JunitTests {
    @DisplayName("小蟑")
    @Test
    public void test01(){
        System.out.println(1);
    }
    @BeforeEach
    public void testBefore(){
        System.out.println("小蟑来了");
    }
    @AfterEach
    public void testAfter(){
        System.out.println("小蟑走了");
    }
    @RepeatedTest(3)
    @Test
    public void testRepeat(){
        System.out.println(3);
    }
    @Test
    void testAssert(){
        Assertions.assertEquals(1,2);
    }
    @Test
    void testEx(){
        Assertions.assertThrows(ArithmeticException.class,()->{int i=10/0;});
    }
}
