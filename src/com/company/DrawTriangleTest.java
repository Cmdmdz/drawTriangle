package com.company;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DrawTriangleTest {

    private DrawTriangle target = new DrawTriangle();
    @Test
    public void whenInputSize_shouldPrintTriangle(){


        assertEquals(expect(),target.triangle(5));
    }

    private String expect(){
        var draw = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                draw.append(" ".repeat(8 - i - 1));
                draw.append("* ".repeat(i + 1));
                draw.append(System.lineSeparator());
            }

        }
        draw.append(target.baseTriangle(8));

        return draw.toString();
    }



}