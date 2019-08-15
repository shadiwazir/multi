package cfx.student;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StudentAdapter extends XmlAdapter<StudentImpl, Student> {
    @Override
    public Student unmarshal(StudentImpl v) throws Exception {
        return v;
    }
    @Override
    public StudentImpl marshal(Student v) throws Exception {
        return v instanceof StudentImpl?(StudentImpl) v: new StudentImpl(v.getName());
    }

}
