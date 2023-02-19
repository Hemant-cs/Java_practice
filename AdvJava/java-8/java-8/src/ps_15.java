import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class ps_15 {
    public static void main(String[] args) {

        //ps question1

        ArrayList StudentList = new ArrayList<>();
        StudentList.add("Hemant 1");
        StudentList.add("Shanu 2");
        StudentList.add("Prabhunath 3");
        StudentList.add("Shivam 4");
        StudentList.add("Rahul 5");
        StudentList.add("Nikhil 6");
        StudentList.add("Shubham 7");
        StudentList.add("Aakash 8");
        StudentList.add("Ram 9");
        StudentList.add("Kailash 10");
        System.out.println(StudentList);
        for (Object  o : StudentList) {
            System.out.println(o);
        }

//        ps Question2
        LocalDateTime d = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        String MyDate = d.format(df);
        System.out.println(MyDate);

        //ps Question 5
        HashSet<Integer> st = new HashSet<>();
        st.add(67);
        st.add(2);
        st.add(6);
        st.add(6);
        System.out.println(st);


        Date dr = new Date();
        System.out.println(dr);
        System.out.println(dr.getHours() +":"+dr.getMinutes()+":"+dr.getSeconds());


//        ps- question 3
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));


    }
    }

