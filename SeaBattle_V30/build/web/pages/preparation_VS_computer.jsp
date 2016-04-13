<%-- 
    Document   : preparationGame
    Created on : 03.04.2016, 12:26:28
    Author     : Roman
--%>
<%@ taglib prefix="ex" uri="/WEB-INF/tlds/Print_Library.tld" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> SEA BATTLE V3.0 </title>
        <link href="${pageContext.request.contextPath}/css/SeaBattle_V30_preparationGame.css" type="text/css" rel="stylesheet">
       
        <script src="${pageContext.request.contextPath}/js/jquery.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/preparation_VS_computer.js" type="text/javascript"></script>
        <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
        
        
    </head>
    <body>
        <div id="wrapper">		

            <div id="header">
                <p id="headerName" > SEA BATTLE </p>
            </div>

            <div id="header2">
                <p> ARRANGE SHIPS </p>
            </div>	

            <div id="Buttons">
                <div id="a1"> 
                    <a href="${pageContext.request.contextPath}/ControllerServlet?action=INDEX" id="a1">
                        <button name="GamerVSComputer" value="GamerVSComputer" id="btn1"> 
                            BACK 
                        </button>
                    </a>	
                </div>

                <div id="a2"> 
                    <a href="${pageContext.request.contextPath}/ControllerServlet?action=ARRANGE_SHIPS_RANDOMLY" id="a2">             
                        <button id="btn2" > 
                            ARRANGE SHIPS RANDOMLY 
                        </button>            
                </div>
                        
                <div id="a3"> 
                    <a href="${pageContext.request.contextPath}/ControllerServlet?action=GAME" >
                        <button name="Game" value="Game" id="btn3"> 
                            GO ON! 
                        </button>
                    </a>
                </div>
            </div>	

            <div id="mainContent">
                <div id="Ships">
                </div>

                <div id="Battlefield">                    
                        <ex:printBattlefieldGamer battlefieldGamer = "${battlefieldGamer}"/>                                                    
                </div>
            </div>
    </body>
</html>
