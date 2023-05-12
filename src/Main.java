public class Main {
    public static void main(String[] args) {
     Counter counterOne = new Counter();

     Animal myAnimal = new Animal("Jake", true);
     Animal animalTwo = new Animal("Maxwell", true, 15);

     Book myBooks = new Book ("The Catcher In the Rye", 145, 2023);
     Book myNewBook = new Book ("The Fearless Baker", 200, 2018, true);

     TvShow myTvShow = new TvShow("Ben 10", 300, "cartoons");
     TvShow myNewTvShow = new TvShow("The Simpsons", 1000, "cartoons", false);

        System.out.println( myAnimal );
        System.out.println( animalTwo );
        System.out.println( myBooks );
        System.out.println( myNewBook );
        System.out.println( myTvShow );
        System.out.println( myNewTvShow );

     counterOne.increase();
        System.out.println(counterOne.value());
     counterOne.increase();
        System.out.println(counterOne.value());
     counterOne.increase();
        System.out.println(counterOne.value());
     counterOne.decrease();
        System.out.println(counterOne.value());
     counterOne.increase(100);
        System.out.println(counterOne.value());
     counterOne.decrease(100);
        System.out.println(counterOne.value());
     counterOne.increase();
        }
    }
