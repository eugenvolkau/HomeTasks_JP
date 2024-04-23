package com.telran.prof.hometask.stream_ht_10042024.oldestClient;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientSearch {

    public static void main(String[] args) {
        Client peter = new Client("0000001", "Peter", 22);
        peter.addPhone(11223344, NofeletTyp.MOBILE);
        peter.addPhone(22334455, NofeletTyp.LANDLINEPHONE);
        peter.addPhone(99887766, NofeletTyp.MOBILE);

        Client harry = new Client("0000099", "Harry", 44);
        harry.addPhone(33445566, NofeletTyp.LANDLINEPHONE);
        harry.addPhone(44556677, NofeletTyp.MOBILE);

        Client karl = new Client("0000099", "Harry", 88);
        karl.addPhone(55667788, NofeletTyp.MOBILE);
        karl.addPhone(66778899, NofeletTyp.LANDLINEPHONE);
        karl.addPhone(77889911, NofeletTyp.LANDLINEPHONE);

        Client jack = new Client("0000099", "Harry", 33);
        jack.addPhone(88990011, NofeletTyp.MOBILE);
        jack.addPhone(99001122, NofeletTyp.MOBILE);

//        Optional<Map.Entry<Integer, NofeletTyp>> phone =
//                Stream.of(peter, harry, jack, karl)
//                .sorted((s1,s2) -> s2.getAge()- s1.getAge())
//                .map(abonent -> abonent.getPhone())
//                .flatMap(phones -> phones.entrySet().stream())
//                .filter(x -> NofeletTyp.LANDLINEPHONE.equals(x.getValue()))
//               .findFirst();

        List<Client> oldAbonent = Arrays.asList(peter, harry, jack, karl);
        Stream<Object> oldMan= oldAbonent.stream()
                .filter(x->NofeletTyp.LANDLINEPHONE.equals(x.getPhones().values()))
//               .map(Client::getAge)
                .map(abonent-> abonent.getAge());
                //.max((x1,x2) -> gcompareTo());
        System.out.println(oldMan);

    }
}
