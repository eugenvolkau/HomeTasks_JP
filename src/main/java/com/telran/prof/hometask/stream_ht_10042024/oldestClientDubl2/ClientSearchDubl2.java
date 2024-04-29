package com.telran.prof.hometask.stream_ht_10042024.oldestClientDubl2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.telran.prof.hometask.stream_ht_10042024.oldestClientDubl2.NofeletTypeDubl2.*;
import static java.util.stream.Collectors.*;

public class ClientSearchDubl2 {

    public static void main(String[] args) {

        clientDubl2 karl = new clientDubl2(0001, "Karl", 22);
        karl.addPhone(new NofeletDubl2(11223344, LANDLINEPHONE));
        karl.addPhone(new NofeletDubl2(11223344, MOBILE));

        clientDubl2 polly = new clientDubl2(0002, "Polly", 60);
        polly.addPhone(new NofeletDubl2(222233333, MOBILE));
        polly.addPhone(new NofeletDubl2(02020303, MOBILE));

        clientDubl2 frank = new clientDubl2(0003, "Frank", 25);
        frank.addPhone(new NofeletDubl2(11112222,
                LANDLINEPHONE));
        frank.addPhone(new NofeletDubl2(33322211, MOBILE));

        clientDubl2 john = new clientDubl2(0004, "John", 30);
        john.addPhone(new NofeletDubl2(99988899, MOBILE));
        john.addPhone(new NofeletDubl2(000000, NOPHONE));


        List<clientDubl2> abonents = Arrays.asList(karl, polly, frank, john);


        System.out.println("Old   " + abonents);
        List<Optional<clientDubl2>> client =
                Collections.singletonList(Stream.of(karl, polly, frank, john)
                       .sorted((s1,s2) -> s2.getAge()- s1.getAge())
                        .findFirst());

        System.out.println("the END   " + client);

//                List<clientDubl2> oldAbonent = Arrays.asList(karl, polly, frank,
//                        john);
//        Optional<Integer> oldMan= oldAbonent.stream()
//                .filter(x-> LANDLINEPHONE.equals(x.getPhones()))
//               .map(clientDubl2::getAge)
//                .findFirst();
//        System.out.println(" oldAbonent " + oldAbonent);
    }
}
