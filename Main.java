package ru.itis.ing304.setdz3;

public class Main {
    public static void main(String[] args) throws ElementDoesNotExistException, EmptyElementException{
        try{
            Set<Integer> set = new Set<>();
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(4);
            set.delete(3);
            System.out.println("Set elements: " + set.toString());
            System.out.println("Set size: " + set.getSize());

            List304ImplAsArray<Integer> list = set.asList(set);
            System.out.println("List elements: " + list.toString());

        } catch (EmptyElementException | ElementDoesNotExistException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}