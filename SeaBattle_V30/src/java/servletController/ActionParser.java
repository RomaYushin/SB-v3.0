/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletController;

import java.util.ArrayList;
import sbv30.GamerInputAndOutput;
import sbv30.CompInputAndOutput;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sbv30.CompInputAndOutput2;
import sbv30.EmptyBattlefield;
import sbv30.PreparationComputer;
import sbv30.PreparationGamer;

/**
 *
 * @author Roman
 */
public class ActionParser {  
        
    static Map <String, Integer> battlefieldGamer;
    static Map <String, Integer> battlefieldComp;
    static Map <String, Integer> usedBattlefieldGamer;
    static Map <String, Integer> usedBattlefieldComp;
    static ArrayList<String> compInputWound;
    
    public static String doParsingByParameter (HttpServletRequest request, HttpServletResponse response) {
        
        String action = request.getParameter("action"); 
        
        if (action == null) {
            return PagesPath.ERROR;
        }
        
        switch (action) {
            case "INDEX":                
                return PagesPath.INDEX;
            case "PREPARATION_VS_COMPUTER":     
                battlefieldGamer = PreparationGamer.getBattlefieldGamer();
                battlefieldGamer = EmptyBattlefield.createOfBattlefield(battlefieldGamer);
                request.setAttribute("battlefieldGamer", battlefieldGamer);
                //request.setAttribute("pc", 1);
                return PagesPath.PREPARATION_VS_COMPUTER;
            case "PREPARATION_VS_SECOND_GAMER":                
                return PagesPath.PREPARATION_VS_SECOND_GAMER;
            case "ARRANGE_SHIPS_RANDOMLY": 
                // подготовка игрока
                battlefieldGamer = PreparationGamer.preparationBattlefieldGamer(battlefieldGamer);
                GamerInputAndOutput.setGamerHit(true);
                request.setAttribute("battlefieldGamer", battlefieldGamer);  
                //System.out.println("battlefieldGamer" + battlefieldGamer);
                
                usedBattlefieldGamer = PreparationGamer.getUsedBattlefieldGamer();
                usedBattlefieldGamer = EmptyBattlefield.createOfBattlefield(usedBattlefieldGamer);    
                request.setAttribute("usedBattlefieldGamer", usedBattlefieldGamer);      
                //System.out.println("usedBattlefieldGamer" + usedBattlefieldGamer);  
                
                // подготовка компьютера
                battlefieldComp = PreparationComputer.getBattlefieldComp();
                battlefieldComp = EmptyBattlefield.createOfBattlefield(battlefieldComp);     
                battlefieldComp = PreparationComputer.preparationBattlefieldComp(battlefieldComp);
                request.setAttribute("battlefieldComp", battlefieldComp);
                //System.out.println("battlefieldComp" + battlefieldComp);  
                
                usedBattlefieldComp = PreparationComputer.getUsedBattlefieldComp();
                usedBattlefieldComp = EmptyBattlefield.createOfBattlefield(usedBattlefieldComp);
                request.setAttribute("usedBattlefieldComp", usedBattlefieldComp);
                //System.out.println("usedBattlefieldComp" + usedBattlefieldComp);  
                
                return PagesPath.ARRANGE_SHIPS_RANDOMLY;                
            case "GAME":
                
                request.setAttribute("battlefieldGamer", battlefieldGamer);
                request.setAttribute("usedBattlefieldGamer", usedBattlefieldGamer);
                request.setAttribute("battlefieldComp", battlefieldComp);
                request.setAttribute("usedBattlefieldComp", usedBattlefieldComp);
                
                return PagesPath.GAME;
            case "GAMER_MOVE":
                String id = request.getParameter("id");
                System.out.println("Роман сделал свой ход (id):  " + id);                
                        
                usedBattlefieldComp = GamerInputAndOutput.gamerMove(id, battlefieldComp, usedBattlefieldComp);
                request.setAttribute("usedBattlefieldComp", usedBattlefieldComp);
                return PagesPath.COMPUTER_BATTLEFIELD;
            case "COMP_MOVE":
                System.out.println("Компьютер собиратеся сделать свой ход. (actionParser)");
                
                compInputWound = CompInputAndOutput2.getCompInputWound();
                System.out.println("compInputWound: " + compInputWound);
                
                usedBattlefieldGamer = CompInputAndOutput.compMove(battlefieldGamer, usedBattlefieldGamer, compInputWound);
                
                
                request.setAttribute("usedBattlefieldGamer", usedBattlefieldGamer);
                return PagesPath.GAMER_BATTLEFIELD;
        }        
        return PagesPath.ERROR;
    }
    
    
    public static String createXMLResponse (Map <String, Integer> battleField, HttpServletRequest request) {
        
        String s;
        StringBuffer sb = new StringBuffer();        
        Iterator<String> it = battleField.keySet().iterator();
        Integer value = 0;
        
        while (it.hasNext()) {
            String key = it.next();            
            
            if ( key.length() < 4) {
                value = battleField.get(key);
                //System.out.println(value + "   value");
                
                sb.append("<pair_key_value>");
                sb.append("<key>" + key + "</key>");
                sb.append("<value>" + value + "</value>");
                sb.append("</pair_key_value>");
            }
        }        
        sb.append("<battleFieldInXML>" + sb.toString() + "</battleFieldInXML>");
        s = sb.toString();
        
        request.setAttribute("r", s);
        return s;
    }
    
}
