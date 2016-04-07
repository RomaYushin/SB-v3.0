/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {
    $('#ComputerBattlefield td').click(function () {
        var data = "id=" + this.id + "&action=GAMER_MOVE";
        var url = "ControllerServlet?" + data;
        //alert("" + data);

        $.ajax({            
            type: "GET",
            url: url,
            data: data,
            success: function () {
                //$(window).load();
                location.reload(true);
                //$("#ComputerBattlefield")

                //$("#ComputerBattlefield").html(responseText);
                //lert("ОТВЕТ: " + responseAjax);
            }
        });
    });
});

