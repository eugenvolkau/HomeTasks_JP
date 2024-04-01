package com.telran.prof.hometask.hashSet13032024.autoShop;

import java.util.Objects;

public class CarsSold {

    private Enum mark;
    private Enum color;
    final private String vinCode;
    private String registrNumber;

    public CarsSold(CarMark mark, Enum color, String vinCode, String registrNumber) {
        this.mark = mark;
        this.color = color;
        this.vinCode = vinCode;
        this.registrNumber = registrNumber;
    }

    public Enum getMark() {
        return mark;
    }

    public void setMark(Enum mark) {
        this.mark = mark;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    public String getVinCode() {
        return vinCode;
    }

    public String getRegistrNumber() {
        return registrNumber;
    }

    public void setRegistrNumber(String registrNumber) {
        this.registrNumber = registrNumber;
    }

    @Override
    public int hashCode() {
        System.out.println("Call hashcode for object " + this.vinCode);
        return Objects.hash(vinCode);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Call equals for object " + this.vinCode + " compare to  " + o.toString());
        if (this == o) return true;
        if (o == null || !(o instanceof CarsSold)) return false;
        CarsSold car = (CarsSold) o;
        return vinCode.equals(car.vinCode);
    }


    @Override
    public String toString() {
        return "CarsSold{" +
                "Mark='" + mark + '\'' +
                ", color=" + color +
                ", vinCode='" + vinCode + '\'' +
                ", registrNumber='" + registrNumber + '\'' +
                '}';
    }
}


// Автоприложение :
//Из автоцентра выезжают автомобили (Класс Car, поля марка(может быть одна на
// несколько автомобилей),цвет, вин код(уникальный номер), рег номер(уникальный
// номер)). Все автомобили проданные автосалоном попадают в список проданных
// машин.
//Часть автомобилей продается в лизинг и попадает в специальную структуру
// (HashSet) которая хранит только лизинговые автомобили.
//В течении времени, часть автомобилей из списка проданных, перепродается,
// меняются регистрационные номера, перекрашиваются.
//Определить какие автомобили после всех изменений все еще находятся в лизинге.
//Определять можно только используя метод contains для поиска по HashSet.