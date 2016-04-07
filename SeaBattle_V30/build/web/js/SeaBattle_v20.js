$( function() {
    $('#ComputerBattlefield td').click (function () {
		var data = this.id;                
                var url = 'Servlet1?id='+data;                
                //alert(data);
                $.ajax({                        
                        url: url, //'http://localhost:8080/SeaBattle_V20/', //"main2.jsp", ,  //"ht//localhost:8080/SeaBattle_V20/" src/java/servlets/Servlet1
                        //data: a,
                        success: function (responseText) {                            
                            $("#"+data).addClass(responseText);
                            //alert(responseText);
                        }                            
                });
	});
});

