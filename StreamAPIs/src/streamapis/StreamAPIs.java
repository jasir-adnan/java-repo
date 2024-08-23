/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamapis;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Student
 */
public class StreamAPIs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list= List.of(1,8,3,6,15,11,7,4,-9,3);
        List<String> liststring=
        
        Stream<Integer> data=list.stream();
        Stream<Integer> filteredData=data.filter(n-> n%2==1).map(n-> n*2);
        List<Integer> secondlist=filteredData.collect(Collectors.toList());
        System.out.println(secondlist);
        
        Stream<Integer> distinct=list.stream().sorted().distinct().skip(3);
        System.out.println(distinct.collect(Collectors.toList()));
        
        int result=list.stream().reduce(0,(c,e)->c+e);
        System.out.println(result);
        
        Optional<Integer> A=list.stream().skip(4).findAny();
        System.out.println(A);
        // flaatmapping
        
        
        
        
               // forEach(n->System.out.println(n));
        
    }
    
}
