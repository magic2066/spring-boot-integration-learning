package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssertionsTest {

    @Test
    public void testSimple() {
        // 最简单的断言，断言计算值与预期值是否相等
        int num = 3 + 5;
        Assertions.assertEquals(num, 8);

        double result = 10.0 / 3;
        // 断言计算值是否在浮点数的指定范围内上下浮动
        Assertions.assertEquals(result, 3, 0.5);
        // 传入message可以自定义错误提示信息
        Assertions.assertEquals(result, 3, 0.5, "计算数值偏差较大！");

        // 断言两个对象是否同一个
        Object o1 = new Object();
        Object o2 = o1;
        Object o3 = new Object();
        Assertions.assertSame(o1, o2);
        //Assertions.assertSame(o1, o3, "对象不相等");

        // 断言两个数组的元素是否相等
        String[] arr1 = {"aa", "bb"};
        String[] arr2 = {"aa", "bb"};
        String[] arr3 = {"bb", "aa"};
        Assertions.assertArrayEquals(arr1, arr2, "数组元素有偏差");
        //Assertions.assertArrayEquals(arr1, arr3, "数组元素有偏差");

        System.out.println("test success");


    }

}
