package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertMoneyTest {

    @Test
    void convertMoneyCurrency() {
        ConvertMoney convertMoney = new ConvertMoney();
        convertMoney.convertMoneyCurrency(100000.0,"won");
        assertEquals("Number of converted : " + 3372000.0, convertMoney.convertMoneyCurrency(100000.0,"won"));
    }
}