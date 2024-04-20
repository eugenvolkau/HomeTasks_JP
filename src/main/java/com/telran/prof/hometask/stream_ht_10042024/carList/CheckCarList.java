package com.telran.prof.hometask.stream_ht_10042024.carList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckCarList {

    public static void main(String[] args) {

        List<Auto> autos = Arrays.asList(
                new Auto("AA234B99", CarColar.RED, Mark.TRABANT, 1303220, 2325),
                new Auto("NSD45AP33", CarColar.BLACK, Mark.OPEL, 0, 42000),
                new Auto("EU777UA6", CarColar.VIOLET, Mark.SKODA, 102000, 4000),
                new Auto("SHG54AL1", CarColar.WHITE, Mark.PACKARD, 890000, 49300),
                new Auto("KGB1S17", CarColar.BLUE, Mark.FIAT, 56, 25000),
                new Auto("OUN31NY4", CarColar.YELLOW, Mark.FORD, 0, 7500),
                new Auto("GJ777", CarColar.GREEN, Mark.WARTBURG, 66600, 4800),
                new Auto("HUK15FF12", CarColar.BLACK, Mark.LANDROVER, 0, 34001),
                new Auto("AB234B39", CarColar.RED, Mark.FIAT, 1303220, 3325),
                new Auto("CDU45AM3", CarColar.BLACK, Mark.OPEL, 250000, 12000));

        List<Auto> autoList =
                autos.stream().filter(auto -> CarColar.BLACK.equals(auto.getCarColor()) && auto.getMileage() == 0)
                        .collect(Collectors.toList());
        System.out.println(autoList);
        List<Auto> uniqueList =
                autos.stream().filter(auto -> auto.getPrice() > 30000)
                        .collect(Collectors.toList());
        System.out.print(uniqueList);
    }
}
//Задание 4.
//        Дан список автомобилей, 10 штук, класс Auto имеет поля - номер авто,
//        цвет, марка, пробег и цена (цена в диапазоне от 10 до 50 тысяч)
//        Вывести список всех автомобилей ,которые имеют черный цвет и нулевой
//        пробег. Вывести количество уникальных марок в ценовом диапазоне
//        от 30 до 50 тысяч.
//        Задачу решить с использованием Stream API.