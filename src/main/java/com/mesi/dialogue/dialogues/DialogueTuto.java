package com.mesi.dialogue.dialogues;

import com.mesi.dialogue.Dialogue;
import com.mesi.dialogue.Question;

import java.util.HashMap;

public class DialogueTuto extends Dialogue {


    public DialogueTuto() {

        initDialogue();


    }


    private void initDialogue(){

        Question question0 = new Question(0,1);
        question0.setMessage("Bonjour aventurier bienvenue dans Zeldo \n appuis sur ENTRER pour passer a la suite");
        HashMap<String,String> responsesList = new HashMap<>();
        responsesList.put("A","SUITE");
        question0.setResponseList(responsesList);
        getQuestionsList().add(question0);


        Question question1 = new Question(1,1);
        question1.setMessage("Pour te deplacer utilise les fleches directionnelles");
        responsesList = new HashMap<>();
        responsesList.put("A","SUITE");
        question1.setResponseList(responsesList);
        getQuestionsList().add(question1);


//        Question question2 = new Question(2,1);
//        question2.setMessage("Pour ouvrir ton inventaire utilise I puis ESC pour en sortir");
//        responsesList = new HashMap<>();
//        responsesList.put("A","reponse A");
//        question2.setResponseList(responsesList);
//        getQuestionsList().add(question2);


        Question question3 = new Question(2,1);
        question3.setMessage("Pour interagir avec ton environnement appuie sur A");
        responsesList = new HashMap<>();
        responsesList.put("END","FIN");
        question3.setResponseList(responsesList);
        getQuestionsList().add(question3);


//        Question question4 = new Question(4,1);
//        question4.setMessage("suite reponse A : perdu");
//        responsesList = new HashMap<>();
//        responsesList.put("END","fin");
//        question4.setResponseList(responsesList);
//        getQuestionsList().add(question4);
//
//
//        Question question5 = new Question(5,1);
//        question5.setMessage("suite reponse A ou B : gagné");
//        responsesList = new HashMap<>();
//        responsesList.put("END","fin");
//        question5.setResponseList(responsesList);
//        getQuestionsList().add(question5);
//
//
//        Question question6 = new Question(6,1);
//        question6.setMessage("suite reponse B : perdu");
//        responsesList = new HashMap<>();
//        responsesList.put("END","fin");
//        question6.setResponseList(responsesList);
//        getQuestionsList().add(question6);
//

    }

    @Override
    public Boolean checkNext(Integer questionId, String response ){
        Boolean hasNext = true;

        if(questionId == 0 )
        {
            setCurrentQuestion(1);
        }

        else if(questionId == 1)
        {
            setCurrentQuestion(2);
        }

        else if(questionId == 2 )
        {
            setCurrentQuestion(3);
            hasNext = false;
        }

//        else if(questionId == 1 && response.equals("A"))
//        {
//            setCurrentQuestion(4);
//        }
//
//        else if(questionId == 1 && response.equals("B"))
//        {
//            setCurrentQuestion(5);
//        }
//
//        else if(questionId == 2 && response.equals("A"))
//        {
//            setCurrentQuestion(5);
//        }
//
//        else if(questionId == 2 && response.equals("B"))
//        {
//            setCurrentQuestion(6);
//        }
//
//        else if(questionId == 3 && response.equals("END"))
//        {
//            setCurrentQuestion(0);
//            hasNext = false;
//        }
//
//        else if(questionId == 4 && response.equals("END"))
//        {
//            setCurrentQuestion(0);
//            hasNext = false;
//        }
//
//        else if(questionId == 5 && response.equals("END"))
//        {
//            setCurrentQuestion(0);
//            hasNext = false;
//        }
//
//        else if(questionId == 6 && response.equals("END"))
//        {
//            setCurrentQuestion(0);
//            hasNext = false;
//        }

        return hasNext;
    }


}
