package cfx.salutation;

import cfx.student.Student;

import javax.jws.WebService;
import java.util.LinkedHashMap;
import java.util.Map;

@WebService(endpointInterface = "cfx.salutation.Salut")
public class SalutImpl implements Salut{

    private Map<Integer, Student> students
            = new LinkedHashMap<Integer, Student>();

    @Override
    public String hello(String name) {
        return "Salut " + name;
    }

    @Override
    public String helloStudent(Student student) {
        students.put(students.size() + 1, student);

        return "Salut " + student.getName() + "!";
    }

    @Override
    public Map<Integer, Student> getStudents() {
        return students;
    }
}
