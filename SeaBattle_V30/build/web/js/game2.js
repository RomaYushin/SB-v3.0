
$("body").ready(function () {
    $("#showGamerWin").one().hide();
    $("#showComputerWin").one().hide();
    $("#showAlreadyShoot").one().hide();
    gamerMove();
});

function gamerMove() {
    //alert("Ход игрока: ");
    $('#GamerMove img').fadeIn(1000);
    $('#ComputerMove img').fadeOut(1000);
    //$("#showAlreadyShoot").fadeOut(500);
    $('#ComputerBattlefield td').click(function () {
        var data = "id=" + this.id + "&action=GAMER_MOVE";
        var url = "ControllerServlet?" + data;
        $.ajax({
            type: "GET",
            url: url,
            data: data,
            success: function (responseText) {
                $("#ComputerBattlefield").html(responseText);
                var nextMove = $("#nextMoveCG").attr("name");
                var gw = $("#gamerWin").attr("id");
                var as = $("#alreadyShoot").attr("id");          
                
                if (gw === "gamerWin") {
                    gamerWin();
                }
                
                if (as === "alreadyShoot") {
                    $("#showAlreadyShoot").fadeIn(500).delay(1500).fadeOut();
                }

                if (nextMove === "gamer") {
                    gamerMove();
                } else {
                    computerMove();
                }
            }
        });
    });
}

function computerMove() {
    //alert("ход компьютера:");
    $('#GamerMove img').fadeOut(1000);
    $('#ComputerMove img').fadeIn(1000);
    var obj = $('#ComputerBattlefield');
    Object.freeze(obj);
    $.ajax({
        type: "GET",
        url: "ControllerServlet?action=COMP_MOVE",
        success: function (responseText) {
            $("#GamerBattlefield").html(responseText);
            var nextMove = $("#nextMoveBG").attr("name");
            var cw = $("#compWin").attr("id");
            if (cw === "compWin") {
                //alert (cw);
                compWin();
            }
            if (nextMove === "gamer") {
                gamerMove();
            } else {
                computerMove();
            }
        }
    });
}

function gamerWin() {
    // вывести победителя
    
    $('#GamerMove img').fadeOut(1000);
    $('#ComputerMove img').fadeOut(1000);
    $("#showGamerWin").fadeIn(1000);
    $("#GamerBattlefield").freeze();   
}

function compWin() {
    // вывести победителя
    $('#GamerMove img').fadeOut(1000);
    $('#ComputerMove img').fadeOut(1000);
    $("#showComputerWin").fadeIn(1000);
    $("#GamerBattlefield").freeze();    
}

function alreadyShoot () {
    
}