/**
 * Created by eyal8_000 on 14/04/2018.
 */
public class Choice {
  private String content;
  private boolean isTrue;
  private Question q;

  public Choice(String content, boolean isTrue){
    this.content=content;
    this.isTrue=isTrue;
  }
  public void addChoice(Question q){
    this.q=q;
  }
  public void editChoice(String newContent, boolean isTrue){}
}
