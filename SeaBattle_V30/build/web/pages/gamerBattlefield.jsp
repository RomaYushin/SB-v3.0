
<%@page import="java.util.Map"%>
<%@page import="SeaBattle_V20.PreparationGame"%>
<table>
                <tr>
                    <th>  </th>
                    <th> A </th>
                    <th> B </th>
                    <th> C </th>
                    <th> D </th>
                    <th> E </th>
                    <th> F </th>
                    <th> G </th>
                    <th> H </th>
                    <th> I </th>
                    <th> J </th>
                </tr>
                <% String valueOfCaseGamer; %>
                <% try { %>
                    <% Map<String, Integer> battlefieldGamer = PreparationGame.getBattlefieldGamer(); %>
                    <% battlefieldGamer.get("A1"); %>
                    <% for (int i = 1; i <= 10; i++) {%>
                        <tr><td class = "left-column"> <%= i%> </td>
                            <% for (int j = 65; j <= 74; j++) { %>                                                   
                                <% valueOfCaseGamer = Character.toString((char) j) + i;%>                                         
                                <% if (battlefieldGamer.get(valueOfCaseGamer)>100){%>
                                    <td class="yesShip" id = " <%= "G" + valueOfCaseGamer %>" ></td>                                            
                                <% } else {%>
                                    <td id = "<%= "G" + valueOfCaseGamer %>" > </td>
                                <%}%>                                            
                            <%}%>  
                    <%}%>
                <%} catch (NullPointerException e) {%>
                    <% System.out.println(e); %>
                    <% for (int i = 1; i <= 10; i++) {%>
                        <tr><td class = "left-column"> <%= i%> </td>
                            <% for (int j = 65; j <= 74; j++) { %>                                                   
                                <% valueOfCaseGamer = Character.toString((char) j) + i;%>                                          
                                    <td id = "<%= "G" + valueOfCaseGamer %>" > </td>                                                                           
                            <%}%>
                    <%}%>                     
                <%}%>
</table>
