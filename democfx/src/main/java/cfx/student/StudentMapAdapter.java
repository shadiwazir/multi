package cfx.student;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMapAdapter extends XmlAdapter <StudentMap, Map<Integer, Student>>  {
    @Override
    public Map<Integer, Student> unmarshal(StudentMap v) throws Exception {
        Map<Integer, Student> boundMap = new LinkedHashMap<Integer, Student>();
        for (StudentMap.StudentEntry studentEntry : v.getEntries()) {
            boundMap.put(studentEntry.getId(), studentEntry.getStudent());
        }
        return boundMap;
    }

    @Override
    public StudentMap marshal(Map<Integer, Student> v) throws Exception {
        StudentMap valueMap = new StudentMap();

        for (Map.Entry<Integer, Student> boundEntry : v.entrySet()) {
            StudentMap.StudentEntry valueEntry  = new StudentMap.StudentEntry();
            valueEntry.setStudent(boundEntry.getValue());
            valueEntry.setId(boundEntry.getKey());
            valueMap.getEntries().add(valueEntry);
        }
        return valueMap;
    }
}
