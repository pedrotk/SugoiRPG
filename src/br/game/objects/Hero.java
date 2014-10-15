package br.game.objects;

import br.game.common.*;
import br.game.heroes.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Hero {
    
    public Status status;
    public Classe classe;
    
    public Hero(int id, int type){
        
        switch(type){
            case 0:
                classe = new Defender();
            break;
            case 1:
                classe = new Paladin();
            break;
            case 2:
                classe = new Rougue();
            break;
        }
    }
}
