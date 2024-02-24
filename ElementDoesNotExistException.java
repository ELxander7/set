package ru.itis.ing304.setdz3;

public class ElementDoesNotExistException extends Exception{
    public ElementDoesNotExistException(){
        super("The element does not exist");
    }
}
