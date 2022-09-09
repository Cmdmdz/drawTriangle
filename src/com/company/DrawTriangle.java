package com.company;


public class DrawTriangle {


    public String triangle(double size) {
        StringBuilder draw = new StringBuilder();
        var n = 2*(size-1)-1;

        for (var i = 0.; i < n; i++) {

            draw(draw,i, n - i);

        }
        draw.append(baseTriangle(n));
        return draw.toString();
    }

    private void draw(StringBuilder draw, Double i, Double x) {

        if (i % 2 == 0) {
            for (var j = x; j > 1; j--) {
                draw.append(" ");
            }
            for (var j = 0; j <= i; j++) {
                draw.append("* ");
            }
            draw.append(System.lineSeparator());

        }
    }

    public  String baseTriangle(Double size) {
        StringBuilder draw = new StringBuilder();
        for (var i = 0.; i < size; i++) {
            if (i == 3) {
                break;
            }
            draw(draw,i, size - i);

        }
        return draw.toString();

    }


}
