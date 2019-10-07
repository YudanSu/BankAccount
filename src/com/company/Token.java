package com.company;

import java.util.Objects;

public class Token {
    private int type;
    private String value;
    private static final int IDTOKEN=1;
    private static final int INTTOKEN=2;

    public Token(int type, String value){
        this.type = type;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(int type) {
        this.type = type;
    }
    public String getValue(String value){
        return value;
    }

    public int getType() {
        if (this.type != INTTOKEN && this.type != IDTOKEN)
            return -1;
        else
            return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return type == token.type &&
                Objects.equals(value, token.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }


    public String toString(){
        return ("this type: " + this.type + " " + "this value: " + this.value);
    }

    public static void main(String args[]) {
        Token token1= new Token(IDTOKEN, "x");
        Token token2 = new Token(INTTOKEN, "x");
//        token1.type=IDTOKEN;
//        token1.value="x";
//        Token token2= new Token();
//        token2.type=IDTOKEN;
//        token2.value="x";
        Token token3=token2;
        if (token1.equals(token2))
            System.out.println(" Yes 1,2");
        if (token1.equals(token3))
            System.out.println(" Yes 1,3");
        if (token2 == token3)
            System.out.println(" Yes 2,3");
        System.out.println(token1.toString());
        System.out.println(token2.toString());
        System.out.println(token3);



    }
}

