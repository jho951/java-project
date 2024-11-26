import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "jh", 30, "M"));
        people.add(new Person(2, "jh", 29, "W"));
        people.add(new Person(3, "david", 33, "M"));

        // getList 호출
        getList(people);
    }

    // 클래스 수준에서 static 메서드로 정의
    public static void getList(List<Person> people) {
        Stream<Person> a = people
                .stream()
                .filter(e -> e.getGender().equals("M")); // 수정된 필터 조건
        a.forEach(System.out::println); // 스트림 출력
    }

    // Person 클래스 정의
    static class Person {
        private int id;
        private String name;
        private int age;
        private String gender;

        public Person(int id, String name, int age, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        // Person 객체의 toString 메서드 재정의
        @Override
        public String toString() {
            return String.format("Person{id=%d, name='%s', age=%d, gender='%s'}",
                    id, name, age, gender);
        }
    }
}
