package com.interview.problem;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {

     public List<List> allSubSets(List list) {
          List<List> out = new ArrayList<>();
          for (int i = 1; i <= list.size(); i++) {
               List<List> outAux = this.subSets(list, i);
               out.addAll(outAux);
          }
          return out;
     }

     private List<List> subSets(List list, int size) {
          List<List> out = new ArrayList<>();
          for (int i = 0; i < list.size() - size + 1; i++) {
               List subset = new ArrayList();
               for (int j = i; j < i + size - 1; j++) {
                    subset.add(list.get(j));
               }
               if (!(size == 1 && i > 0)) {
                    for (int j = i + size - 1; j < list.size(); j++) {
                         List newsubset = new ArrayList(subset);
                         newsubset.add(list.get(j));
                         out.add(newsubset);
                    }
               }
          }
          return out;
     }

     public static void main(String[] args) {
          ArraySubset aux = new ArraySubset();
          List<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
         
          List out = aux.allSubSets(list);
          System.out.println(out);
     }
}
