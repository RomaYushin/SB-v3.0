/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletController;

import SeaBattle_V20.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roman
 */
public class ActionParser {  
    
    static Map <String, Integer> battlefieldGamer;// = PreparationGame.getBattlefieldGamer();
    static Map <String, Integer> battlefieldComp;// = PreparationGame.getBattlefieldComp();
    static Map <String, Integer> usedBattlefieldGamer;// = PreparationGame.getUsedBattlefieldGamer();
    static Map <String, Integer> usedBattlefieldComp;// = PreparationGame.getUsedBattlefieldComp();
    
    public static String doParsingByParameter (HttpServletRequest request, HttpServletResponse response) {
        
        String action = request.getParameter("action"); 
        
        if (action == null) {
            return PagesPath.ERROR;
        }
        
        switch (action) {
            case "INDEX":                
                return PagesPath.INDEX;
            case "PREPARATION_VS_COMPUTER":     
                battlefieldGamer = PreparationGame.getBattlefieldGamer();
                request.setAttribute("battlefieldGamer", battlefieldGamer);
                //request.setAttribute("pc", 1);
                return PagesPath.PREPARATION_VS_COMPUTER;
            case "PREPARATION_VS_SECOND_GAMER":                
                return PagesPath.PREPARATION_VS_SECOND_GAMER;
            case "ARRANGE_SHIPS_RANDOMLY": 
                // подготовка игрока
                battlefieldGamer = PreparationGame.preparationGamer();
                System.out.println("battlefieldGamer" + battlefieldGamer);
                usedBattlefieldGamer = PreparationGame.getUsedBattlefieldGamer();
                request.setAttribute("battlefieldGamer", battlefieldGamer);
                //request.setAttribute("pc", 2);
                
                // подготовка компьютера
                battlefieldComp = PreparationGame.preparationComp();
                System.out.println("battlefieldComp" + battlefieldComp);
                usedBattlefieldComp = PreparationGame.getUsedBattlefieldComp();
                
                return PagesPath.ARRANGE_SHIPS_RANDOMLY;                
            case "GAME":                
                request.setAttribute("battlefieldGamer", battlefieldGamer);
                request.setAttribute("usedBattlefieldComp", usedBattlefieldComp);
                return PagesPath.GAME;
            case "GAMER_MOVE":
                String id = request.getParameter("id");
                System.out.println("id:  " + id);                
                        
                usedBattlefieldComp = GamerInputAndOutput.gamerMove(id, battlefieldComp, usedBattlefieldComp);
                request.setAttribute("usedBattlefieldComp", usedBattlefieldComp);
                return PagesPath.COMPUTER_BATTLEFIELD;
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
