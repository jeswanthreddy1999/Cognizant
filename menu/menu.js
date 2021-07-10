$("#each_ex").click(function(){
    $(".men_ex #list li a").css({"background-color":"red",});
    
    $(".men_ex #list li a").each(function(){
        $("#msg_ex").append($(this).text()+"<br>");
    });
});