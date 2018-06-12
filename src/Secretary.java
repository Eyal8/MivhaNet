import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by eyal8_000 on 14/04/2018.
 */
public class Secretary extends User {

  public void AddLecturersToCourse(ArrayList<String> lecturersIDS, SemesterType season, String courseID, String year){}
  public boolean AddTutorsToCourse(ArrayList<String> tutorsIDS,SemesterType season, String year, String courseID){ return true;}
  public boolean CreateExamsToCourse(String courseID , HashMap<Moed,Date> exams, SemesterType season, String year){ return true;}

}
