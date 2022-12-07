package Laba7;

public class Plain2 {

    public static void main(String[] args) {

        Plain2.Wing wing1 = new Plain2.Wing(50);

        wing1.printWeight();

    }




    static class Wing {

        Integer weight;

        public Wing(Integer weight){

            this.weight = weight;

        }

        void printWeight () {

            System.out.println(weight);

        }

    }

}

