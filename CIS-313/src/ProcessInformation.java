import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProcessInformation <AnyType>{
    private List<AnyType> studentList;
    private List<AnyType> facultyList;

    public ProcessInformation(){
        studentList = new ArrayList<>();
        facultyList = new LinkedList<>();
    }

    public void printList(){
        for (AnyType aStudentList : studentList) System.out.println(aStudentList);
    }
    public static void main(String[] args) {
        ProcessInformation<String> pi = new ProcessInformation<>();
        pi.studentList.add("Bedford");
    }


}
