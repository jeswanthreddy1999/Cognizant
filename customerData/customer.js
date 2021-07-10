$(".add-row").click(function(){
    var value=$("#name").val();
    $('table tbody').append('<tr><td><input type="checkbox" name="record"></td> <td>'+value+'</td></tr>');
});
$(".delete-row").click(function(){
    var addStart=$("table tbody tr td input[type='checkbox']");
    addStart.filter(":checked").parent().parent().remove();
});