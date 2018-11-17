import sun.plugin2.message.ShowDocumentMessage;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        String answer="";
        String r1="wrong";
        String r2="wrong";
        String r3="wrong";
        String r4="wrong";
        int count=0;
        int score=0;
        while(count !=4){
            count ++;
            if(count==1){
                answer = JOptionPane.showInputDialog("Q1. 5+5\nA.10\nB.20\nC.15\nD.7");
                if(answer.equalsIgnoreCase("a")){
                    r1="correct";
                    score++;
                }
            }
            if(count==2){
                answer = JOptionPane.showInputDialog("Q2. 5+10\nA.10\nB.20\nC.15\nD.7");
                if(answer.equalsIgnoreCase("c")){
                    r1="correct";
                    score++;
                }
            }
            if(count==3){
                answer = JOptionPane.showInputDialog("Q3. 5+2\nA.10\nB.20\nC.15\nD.7");
                if(answer.equalsIgnoreCase("d")){
                    r1="correct";
                    score++;
                }
            }
            if(count==4){
                answer = JOptionPane.showInputDialog("Q4. 5+15\nA.10\nB.20\nC.15\nD.7");
                if(answer.equalsIgnoreCase("b")){
                    r1="correct";
                    score++;
                }
            }
        }
        System.out.println("1:" +r1+"\n2:"+r2+"\n3:"+r3+"\n4:"+r4+"\n\nTotal Score:"+score*25+"%");
        
    }
}
