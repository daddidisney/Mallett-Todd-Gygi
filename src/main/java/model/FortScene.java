/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Kyrie Gygi
 */
public class FortScene extends Scenes implements Serializable{
    private String selection;

    public FortScene(){
        this.setSceneType(SceneType.desert);
        this.setDescription("This is the fort scene");
        this.setName("Fort Scene");
    }
    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
    
    public void enterGeneralStore(){
    
    }
}
