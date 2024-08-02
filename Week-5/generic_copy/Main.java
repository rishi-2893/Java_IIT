public class Main{
    public static void main(String[] args){

        // Employee list
        Employee[] emp_list = new Employee[3];
        Manager[] man_list = {new Manager(2, "BMW"), new Manager(2, "Maruti"), new Manager(2, "Tata")};

        // Copy Manager objects to the empty Employee list
        copy(man_list, emp_list);

        // Now manager objects are inside the Employee list
        for (Employee e : emp_list) System.out.print( e + " ");
    }

    public static <S extends T, T> void copy(S[] src, T[] tgt){
        for (int i=0; i < src.length; i++){
            tgt[i] = src[i];
        }
    }
}