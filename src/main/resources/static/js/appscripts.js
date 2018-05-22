function setcolor() {
    var tbl = document.getElementById("allAudioTable"), i;
    tbl.style.color = "#000000";
    tbl.rows[0].style.backgroundColor = "#E1E1E1";
    
    for (i = 1; i < tbl.rows.length; i++) {
        if (i % 2 == 0)
            tbl.rows[i].style.backgroundColor = "#E1E1E1";
        else
            tbl.rows[i].style.backgroundColor = "#cccccc";
        }
}

