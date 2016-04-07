/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//-----------------------------------------

$(document).ready( function() {

                    //alert("ПРИВЕТ");
            
            });

//----------------------------------------



     /*
     * объект XMLHttpRequest
     */
/*
    var xhr;
    function doAJAX() {
        //alert("ПРИВЕТ");
        var URL = "ControllerServlet?action=ARRANGE_SHIPS_RANDOMLY";
        xhr = initRequest();
        xhr.open("GET", URL, true); 
        //alert("ПРИВЕТ");
        xhr.onreadystatechange = callback; 
        xhr.send(null);
    }


    // Код для совметимости браузеров и инициализация объекта XMLHttpRequest
    function initRequest() {
        if (window.XMLHttpRequest) {
            if (navigator.userAgent.indexOf('MSIE') != -1) {
                isIE = true;
            }
            return new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            isIE = true;
            return new ActiveXObject("Microsoft.XMLHTTP");
        }
    }

    //Функция, выполняющаяся, когда пришел ответ от сервера.
    function callback() {
        // clearTable();
        // действия перед очередным запросом
        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                alert(xhr.responseXML);
                temp(xhr.responseXML);
                
                //parseMessages(xhr.responseXML);                                         // если все успешно, то выполняется функция parseMessages(req.responseXML), и ей передается 
                                                                                        // ответ в формате XML
            }
        }
    }

    // функция, которая расшифровует ответ от сервера. Преобразует XML формат в теги...
    function parseMessages(responseXML) {

        // no matches returned
        if (responseXML == null) {
            return false;
        } else {
            var battleFieldInXML = responseXML.getElementsByTagName("battleFieldInXML")[0];

            for ( i = 0; i < battleFieldInXML.childNodes.length; i++) {
                var pair_key_value = battleFieldInXML.childNodes[i];
                var key = pair_key_value.getElementByTagName("key")[0];
                var value = pair_key_value.getElementByTagName("value")[0];
                cangeCSSStyle(key.childNodes[0].nodeValue, value.childNodes[0].nodeValue)
            }
        }
    }

    function changeCSSStyle(key, value) {
        
        if (value > 100) {
            $("#"+key).addClass(yesShip);
        }

    }
    
    function temp (responseXML) {
        alert(responseXML);
        document.getElementById('Battlefield').html(responseXML);
    }
    
    
    */