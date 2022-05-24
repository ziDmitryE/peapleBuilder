public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(30)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(6)
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            Person man = new PersonBuilder()
                    .setName("Tom")
                    .setSurname("Fox")
                    .setAddress("USA")
                    .build();
            System.out.println(man);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person woman = new PersonBuilder()
                    .setName("Kate")
                    .setSurname("Todd")
                    .setAddress("USA")
                    .setAge(-100)
                    .build();
            System.out.println(woman);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
