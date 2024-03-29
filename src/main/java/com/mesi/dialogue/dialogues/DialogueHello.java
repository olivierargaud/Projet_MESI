package com.mesi.dialogue.dialogues;

import com.mesi.MainZeldo;
import com.mesi.dialogue.Dialogue;
import com.mesi.dialogue.Question;
import com.mesi.equipement.Legs;
import com.mesi.equipement.Torso;
import com.mesi.panels.Game;

import java.util.HashMap;

public class DialogueHello extends Dialogue {


    public DialogueHello() {

        initDialogue();

    }


    private void initDialogue(){

        Question question0 = new Question(0,1);
        question0.setMessage("Enfin reveille, tu en tenais une severe hier soir. Depeche toi d'aller t'habiller. Tes affaires sont dans la tente");
        HashMap<String,String> responsesList = new HashMap<>();
        responsesList.put("END","fin");
        question0.setResponseList(responsesList);
        getQuestionsList().add(question0);

        Question question1 = new Question(1,1);
        question1.setMessage("Vas vite t'habiller");
        responsesList = new HashMap<>();
        responsesList.put("END","fin");
        question1.setResponseList(responsesList);
        getQuestionsList().add(question1);

        Question question2 = new Question(2,1);
        question2.setMessage("Maintenant que tu es a peu pres presentable, file au village le roi t'a fait mander ");
        responsesList = new HashMap<>();
        responsesList.put("END","fin");
        question2.setResponseList(responsesList);
        getQuestionsList().add(question2);

        Question question3 = new Question(3,1);
        question3.setMessage("Avant de partir n'oublie pas de recuperer et de t'equiper de ta dague, les buissons ont pas mal pousses sur le chemin");
        responsesList = new HashMap<>();
        responsesList.put("END","fin");
        question3.setResponseList(responsesList);
        getQuestionsList().add(question3);

        Question question4 = new Question(4,1);
        question4.setMessage("Depeche toi on ne fait pas attendre le roi!");
        responsesList = new HashMap<>();
        responsesList.put("END","fin");
        question4.setResponseList(responsesList);
        getQuestionsList().add(question4);

        Question question5 = new Question(5,1);
        question5.setMessage("Au fait pendant que tu dormais un message est arrive. Le roi requiert tes services. tu ne vas quand meme pas aller en ville comme ca! Habille toi. ");
        responsesList = new HashMap<>();
        responsesList.put("END","fin");
        question5.setResponseList(responsesList);
        getQuestionsList().add(question5);

        Question question6 = new Question(6,1);
        question6.setMessage("Beau temps aujourd'hui");
        responsesList = new HashMap<>();
        responsesList.put("END","fin");
        question6.setResponseList(responsesList);
        getQuestionsList().add(question6);

    }

    @Override
    public Boolean checkNext(Integer questionId, String response ){
        Boolean hasNext = true;

        if(questionId == 0 && response.equals("END"))
        {
            setCurrentQuestion(1);
            hasNext = false;
            MainZeldo.mapList.get("MAP_1").getTileList().get("17,14").setTraversable(true);
            MainZeldo.mapList.get("MAP_1").getTileList().get("18,14").setTraversable(true);
        }

        else if(questionId == 1 && response.equals("END"))
        {
            hasNext = false;
        }

        else if(questionId == 2 && response.equals("END"))
        {
            setCurrentQuestion(3);
        }

        else if(questionId == 3 && response.equals("END"))
        {
            setCurrentQuestion(4);
            hasNext = false;
        }

        else if(questionId == 4 && response.equals("END"))
        {
            hasNext = false;
        }

        else if(questionId == 5 && response.equals("END"))
        {
            hasNext = false;
        }

        return hasNext;
    }

    @Override
    public void checkChange(){
        if(getCurrentQuestion() == 1 && Game.getCharacter().getLegs() != Legs.NONE && Game.getCharacter().getTorso() != Torso.NONE){
            setCurrentQuestion(2);
        }

    }

}
