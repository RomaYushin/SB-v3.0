/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printTags;

import java.io.IOException;
import java.util.Map;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Roman
 */
public class PrintBattlefieldGamer extends SimpleTagSupport {
    
    private Map<String, Integer> battlefieldGamer;

    public Map<String, Integer> getBattlefieldGamer() {
        return battlefieldGamer;
    }

    public void setBattlefieldGamer(Map<String, Integer> battlefieldGamer) {
        this.battlefieldGamer = battlefieldGamer;
    }

    @Override
    public void doTag() throws JspException, IOException {
        String valueOfCaseGamer = null;
        //usedBattlefieldComp = PreparationGame.getUsedBattlefieldComp();
        //System.out.println("battlefieldGamer:   " + battlefieldGamer);
        JspWriter jspOut = getJspContext().getOut();
        
        jspOut.println("<table id = \"GamerBattlefieldTable\">");
        jspOut.println("<tr>");
        jspOut.println("<th></th>");
        jspOut.println("<th>A</th>");
        jspOut.println("<th>B</th>");
        jspOut.println("<th>C</th>");
        jspOut.println("<th>D</th>");
        jspOut.println("<th>E</th>");
        jspOut.println("<th>F</th>");
        jspOut.println("<th>G</th>");
        jspOut.println("<th>H</th>");
        jspOut.println("<th>I</th>");
        jspOut.println("<th>J</th>");
        jspOut.println("</tr>");
        if ( battlefieldGamer != null) {            
            for (int i = 1; i <= 10; i++) {
                jspOut.println("<tr><td class = \"left-column\">" + i + "</td>");                
                for (int j = 65; j <= 74; j++){
                    valueOfCaseGamer = Character.toString((char) j) + i;                    
                    if (battlefieldGamer.get(valueOfCaseGamer) > 100) {
                        jspOut.println("<td class = \"yesShip\" id =" + valueOfCaseGamer + "></td>");
                    } else {
                        jspOut.println("<td id =" + valueOfCaseGamer + "></td>");
                    }
                }
                jspOut.println("</tr>");
            }
        } else {
            jspOut.println("Error print");
        }
        jspOut.println("</tr>");
        jspOut.println("</table>");
        
    }   
    
}
