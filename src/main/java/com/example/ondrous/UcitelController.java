package com.example.ondrous;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class UcitelController {
    @FXML
    private ListView<Ucitel> ucitelListView;

    @FXML
    private TextField upravTextField;

    @FXML
    private Label jmenoLabel,PredmetLabel,Hodnocenilabel,vyjimka;

    @FXML
    public void initialize(){

        ucitelListView.getItems().add(new Ucitel("michal","matika",3));
        ucitelListView.getItems().add(new Ucitel("ondra","cestina",10));
        ucitelListView.getItems().add(new Ucitel("stepan","dejak",4));
        ucitelListView.getItems().add(new Ucitel("kuba","literatura",5));
        ucitelListView.getItems().add(new Ucitel("matej","telak",9));
        ucitelListView.getItems().add(new Ucitel("jirka","informatika",1));
    }

    @FXML
    public void vyberUcitele() throws IllegalAccessException {
        Ucitel vybrany = ucitelListView.getSelectionModel().getSelectedItem();
        try {
            if(vybrany!=null){
                jmenoLabel.setText(vybrany.getJmeno());
                PredmetLabel.setText(vybrany.getPredmet());
                Hodnocenilabel.setText(Integer.toString(vybrany.getHodnoceni()));
            }
        } catch (Exception e) {
            throw new IllegalAccessException();
        }

    }
    @FXML
    public void upravUcitele(){

        Ucitel vybrany = ucitelListView.getSelectionModel().getSelectedItem();
        try {
            if(vybrany!=null){
                int cislo = Integer.parseInt(upravTextField.getText());
                if(cislo>=1 && cislo<=10){
                    vybrany.setHodnoceni(cislo);
                    upravTextField.clear();
                    ucitelListView.refresh();
                }
                else vyjimka.setText("zadej cislo od 1-10");

            }
            else vyjimka.setText("zadej CISLO od 1-10");
        }catch (Exception e){
            throw new IllegalArgumentException("zadej CISLO od 1-10");
        }

    }

}
