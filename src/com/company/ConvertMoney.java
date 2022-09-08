package com.company;


import java.util.Locale;
import java.util.Objects;

import static com.company.MoneyConstant.*;


public class ConvertMoney {

    public String convertMoneyCurrency(Double thb, String type){

        var converted = 0.0;

        if (Boolean.TRUE.equals(mapTypeCurrencyUSD(type))){
             converted = convert(thb, MONEY_USD);

        }else if (Boolean.TRUE.equals(mapTypeCurrencyYEN(type))){
            converted = convert(thb, MONEY_YEN);

        }else if (Boolean.TRUE.equals(mapTypeCurrencyWON(type))){
            converted = convert(thb, MONEY_WON);

        }else {

            return "not mapping type currency";
        }
        return "Number of converted : " + converted;
    }

    private Double convert(Double thb, Double convert){
        return thb  * convert;
    }

    private Boolean mapTypeCurrencyUSD(String type){
        return Objects.equals(type.toUpperCase(Locale.ROOT),CurrencyType.USD.toString());
    }

    private Boolean mapTypeCurrencyYEN(String type){
        return Objects.equals(type.toUpperCase(Locale.ROOT),CurrencyType.YEN.toString());
    }

    private Boolean mapTypeCurrencyWON(String type){
        return Objects.equals(type.toUpperCase(Locale.ROOT),CurrencyType.WON.toString());
    }

}
