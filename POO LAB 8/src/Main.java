import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Do not modify */
        Student s1 = new Student("Maria", "Popescu", 3, 8.5);
        Student s2 = new Student("Ion", "Grigorescu", 2, 8);
        Student s3 = new Student("Ana", "Enescu", 7, 7);
        Student s4 = new Student("Mihai", "Eminovici", 1, 4.45);
        Student s5 = new Student("Andrei", "Radu", 12, 2);

        List<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));
        List<Student> copyStudents = new ArrayList<>(students);

        List<Integer> numbers = List.of(10, 20, 5, 243, 5556, 312, 566, 245, 122, 5556, 5, 10, 20, 122);
        ArrayList<String> subjects = new ArrayList<>(List.of("PP", "PA", "PCOM", "IOCLA", "AA",
                "SO", "CPL", "EP", "RL", "LFA"));
        Random random = new Random(12);
        /* End of unmodifiable zone */

        /* ------------------------- Task 2 ------------------------- */
        /* --------- Sort using Comparable<Student> interface ------- */
        Collections.sort(students);
        System.out.println(students);

        /* ------------------------- Task 3 ------------------------- */
        /* -------------- Sort using a lambda expression ------------ */
        copyStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(copyStudents);

        /* ------------------------- Task 4 ------------------------- */
        /* ----------- Implement your priority queue here ----------- */
        PriorityQueue<Student> priorityQueue
                = new PriorityQueue<Student>(5, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Long.compare(o1.getId(),o2.getId());
            }
        });
        priorityQueue.addAll(students);

        System.out.println(priorityQueue);

        /* ------------------------- Task 6 ------------------------- */
        Map<Student, LinkedList<String>> studentMap = new HashMap<>();
        students.forEach(s -> studentMap.putIfAbsent(s, new LinkedList<>()));
        studentMap.forEach((key,value) -> {
            for (int j = 0; j < 4; j++){
                value.push(subjects.get(random.nextInt(subjects.size())));
            }
        });
        System.out.println(studentMap);

        /* ------------------------- Task 7 ------------------------- */
        /* -------------  No need to add or modify here --------------*/
        LinkedEvenSet linked = new LinkedEvenSet();
        linked.addAll(numbers);
        HashSet<Integer> hatz = new HashSet<>();
        EvenSet set = new EvenSet();
        set.addAll(numbers);

        TreeEvenSet tree = new TreeEvenSet();
        tree.addAll(numbers);

        System.out.println(linked);
        System.out.println(set);
        System.out.println(tree);
    }
}


class EvenSet extends HashSet<Integer>{
    /* TODO - Task 7 */
    @Override
    public boolean addAll(Collection<? extends Integer> numbers){
        numbers.forEach( s -> {
            if(s%2 == 0)
                this.add(s);
        });
        return true;
    }
}


class LinkedEvenSet extends LinkedHashSet<Integer> {
    /* TODO - Task 7 */
    @Override
    public boolean addAll(Collection<? extends Integer> numbers){
        numbers.forEach( s -> {
            if(s%2 == 0)
                this.add(s);
        });
        return true;
    }
}

class Student implements Comparable<Student> {
    /* ------------------------- Task 1 ------------------------- */
    /* Add student properties */
    /* Generate getters and setters */
    String name;
    String surname;
    long id;
    double averageGrade;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student(){

    }

    public Student(Student other) {
        this.name = other.name;
        this.surname = other.surname;
        this.id = other.id;
        this.averageGrade = other.averageGrade;
    }

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    /* Override `compareTo` and `toString` methods */
    //@Override
    public int compareTo(Student compared){
        if(this.averageGrade > compared.getAverageGrade())
            return 1;
        if(this.averageGrade < compared.getAverageGrade())
            return -1;
        if(this.surname.compareTo(compared.getSurname()) != 0)
            return this.surname.compareTo((compared.getSurname()));
        return this.name.compareTo((compared.getName()));
    }
    /* ------------------------- Task 5 ------------------------- */
    /* Override `equals` and `hashCode` methods */

    //@Override
    public boolean equals(Student student) {
        return Double.compare(student.getAverageGrade(), averageGrade) == 0 && name.equals(student.getName()) && surname.equals(student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }
}


class TreeEvenSet extends TreeSet<Integer> {
    /* TODO - Task 7 */
    public boolean addAll(Collection<? extends Integer> numbers){
        numbers.forEach( s -> {
            if(s%2 == 0)
                this.add(s);
        });
        return true;
    }
}

