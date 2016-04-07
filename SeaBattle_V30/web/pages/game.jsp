<%-- 
    Document   : game
    Created on : 03.04.2016, 12:35:28
    Author     : Roman
--%>

<%@ taglib prefix="ex" uri="/WEB-INF/tlds/Print_Library.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>

<%@page import="SeaBattle_V20.PreparationGame"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.lang.String"%>
<%@page import="java.lang.Integer"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> SEA BATTLE V3.0 </title>
        <link href="${pageContext.request.contextPath}/css/SeaBattle_V30_game.css" type="text/css" rel="stylesheet">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/game.js"></script>
        

    </head>
    <body>
        <div id="wrapper">
            <div id="header"> SEA BATTLE </div>			
            <div id="Inf">
                <div id="GamerInf"> GamerInf

                </div>				
                <div id="ComputerInf"> ComputerInf </div>	
                <div id="PictureInf"> 
                    <!-- PictureInf -->
                    <ex:printWinner usedBattlefieldComp = "${usedBattlefieldComp}"/>
                </div>	
            </div>

            <div id="Battlefield">
                <div id="GamerBattlefield">	
                    <ex:printBattlefieldGamer battlefieldGamer = "${battlefieldGamer}"/>
                </div>	

                <div id="ComputerBattlefield">             
                    <ex:printUsedBattlefieldComputer usedBattlefieldComp = "${usedBattlefieldComp}"/>                    
                </div>			
                <div id="GamerMove"> GamerMove    

                </div>				
                <div id="ComputerMove"> ComputerMove </div>										
            </div>

            <div id="footer" >
                <div id="GamerFooter"> MY FLEET! </div>				
                <div id="ComputerFooter"> COMPUTER FLEET! </div>
            </div>
        </div>
    </body>
</html>
