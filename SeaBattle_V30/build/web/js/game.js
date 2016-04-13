


// получить значение из cookie, кто следующий стреляет
var nextMove = getCookie("nextMove");
alert("nextMove: " + nextMove);



if (nextMove == "gamer") {
    gamerMove();
} else if (nextMove == "comp") {
    computerMove();
} else {
    alert("Ошибка выбора следующего хода");
}



$(function () {

    function gamerMove() {
        alert("Ход игрока: ");
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
                    deleteCookie("nextMove");
                    if (nextMove == "gamer") {
                        // записать, кто следующий ходит игрок в cookie key - nextMove       
                        document.cookie = "nextMove=gamer;";
                    } else {
                        document.cookie = "nextMove=comp;";
                    }
                }

            });
        });
    }
    function computerMove() {
        alert("ход компьютера:");
        var obj = $('#ComputerBattlefield');
        Object.freeze(obj);
        $.ajax({
            type: "GET",
            url: "ControllerServlet?action=COMP_MOVE",
            success: function (responseText) {
                $("#GamerBattlefield").html(responseText);
                var nextMove = $("#nextMoveBG").attr("name");
                deleteCookie("nextMove");
                if (nextMove == "gamer") {
                    // записать, следующий ходит игрок в cookie key - nextMove  
                    document.cookie = "nextMove=gamer;";
                } else {
                    document.cookie = "nextMove=comp;";
                }
            }
        });
    }
});



function getCookie(name) {
    var matches = document.cookie.match(new RegExp(
            "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
            ));
    return matches ? decodeURIComponent(matches[1]) : undefined;
}

// устанавливает cookie с именем name и значением value
// options - объект с свойствами cookie (expires, path, domain, secure)
function setCookie(name, value, options) {
    options = options || {};

    var expires = options.expires;

    if (typeof expires == "number" && expires) {
        var d = new Date();
        d.setTime(d.getTime() + expires * 1000);
        expires = options.expires = d;
    }
    if (expires && expires.toUTCString) {
        options.expires = expires.toUTCString();
    }

    value = encodeURIComponent(value);

    var updatedCookie = name + "=" + value;

    for (var propName in options) {
        updatedCookie += "; " + propName;
        var propValue = options[propName];
        if (propValue !== true) {
            updatedCookie += "=" + propValue;
        }
    }

    document.cookie = updatedCookie;
}

// удаляет cookie с именем name
function deleteCookie(name) {
    setCookie(name, "", {
        expires: -1
    })
}


