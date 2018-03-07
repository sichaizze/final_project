$(function () {
    chargerGrille();
});
//
// function rafraichirDansUneSeconde() {
//     setTimeout(rafraichirHeureCourante, 1000);
// }

function chargerGrille(height, width) {
    $.ajax({
        url: 'api/grids/' + width + '/' + height +'/',
        dataType: 'json',
        success: function (data, textStatus, jqXHR) {
            //data c'est votre json
            var html = '<table class="tableau">';
            for (var i = 0; i < data.grid.height; i++) {
                html += '<tr class="ligne">';
                for (var j = 0; j < data.grid.width; j++) {
                    html += '<td id="cell_'+ i + '_' + j +'" class="colonne" style="width:30px;height:30px;border:solid;" onclick="javascript: modifylive('+i+','+j+');"></td>';
                }
                html += '</tr>';
            }
            html += '</table>';
            html += '<input type="text" id="id" name="width" value="'+ data.grid.id +'" style="display:none;">';
            html += '<input type="button" value="Valider la grille" onclick="javascript: validerGrille();">';
            $("#bientotMaGrille").html(html);
            $.each(data.grid.cells, function (index, cell) {
                if (cell.alive) {
                    $("#cell_" + cell.x + "_" + cell.y).addClass("alive")
                }
            });
        }
    });
}

function genererGrille() {
    var height = parseInt($("#height").val());
    var width = parseInt($("#width").val());
    console.log(height + ' : ' +width);
    chargerGrille(height, width);
}

function modifylive(x,y) {
    var cell = $("#cell_" + x + "_" + y);
    var id = parseInt($("#id").val());
    if (cell.hasClass("alive")){
        cell.removeClass("alive");
    }else{
        cell.addClass("alive");
    }
    $.ajax({
        url: 'api/grids/modify/' + id + '/' + x + '/' + y + '/'
    });

}

function validerGrille() {
    $.ajax({
        url: 'api/grids/save/' + id
    });
}
