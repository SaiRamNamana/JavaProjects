import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] sel = new String[5];

     public QuestionService(){
         questions[0] = new Question(1, "What","A", "B", "C", "D", "B");
         questions[1] = new Question(2, "What","A", "B", "C", "D", "A");
         questions[2] = new Question(3, "What","A", "B", "C", "D", "C");
         questions[3] = new Question(4, "What","A", "B", "C", "D", "D");
         questions[4] = new Question(5, "What","A", "B", "C", "D", "B");
     }  
     public void playQuiz(){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for(Question q : questions){
            System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            sel[i++] = sc.next();  
        }
        sc.close();
        System.out.println();
        for(String s: sel) System.out.println(s);
     }
     public void getScore(){
        int score = 0;

        for(int i=0;i<questions.length;i++){
            Question qe = questions[i];
            String ActAns = qe.getAnswer();
            String UsrAns = sel[i];
            if(ActAns.equals(UsrAns)) score++;
        }
        System.out.println("Your score : "+score);
     }
}
