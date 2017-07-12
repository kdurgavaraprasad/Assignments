
    var xhr = new XMLHttpRequest();
    xhr.open('GET', "data.json", true);
    xhr.responseType = 'text';
    xhr.send();
    xhr.onload = function () {
        if (xhr.status === 200) {
            var myStuff = JSON.parse(xhr.responseText);
            console.log(myStuff);
            var tag = document.getElementById('results');
            for (i = 0; i < myStuff.Movies.length; i++)
                {
                var title = '<p class="Title">Title:' + myStuff.Movies[i].Title + '</p>';
                var year = '<p class="year">Year: ' + myStuff.Movies[i].Year + '</p>';
                var writter = '<p class="writter">Writter: ' + myStuff.Movies[i].Writer + '</p>';
                var genre = '<p class="genre">Genre: ' + myStuff.Movies[i].Genre + '</p>';
                var runtime = '<p class="runtime">Runtime: ' + myStuff.Movies[i].Runtime + '</p>';
                var urlPoster = '<img class="poster" src="' + myStuff.Movies[i].Poster + '">';

                var Actors = '<p class="Actors">Actors: ' + myStuff.Movies[i].Actors + '</p>';
                var Awards = '<p class="Awards">Awards: ' + myStuff.Movies[i].Awards + '</p>';
                var imdbRating = '<p class="imdbRating">imdbRating: ' + myStuff.Movies[i].imdbRating + '</p>';
                var Language = '<p class="Language">Language: ' + myStuff.Movies[i].Language + '</p>';
                var imdbVotes = '<p class="imdbVotes">imdbVotes: ' + myStuff.Movies[i].imdbVotes + '</p>';
                tag.innerHTML += ('<div class="Movie" ><div class="header" onclick="funcExpand(this)" >' + '<div class="Column"><img class="poster" src="' + 
                        myStuff.Movies[i].Poster + '" height="52" width="52" align="top"></div><div class="Column"><b>Title :</b>' + 
                        myStuff.Movies[i].Title + '</div><div class="Column"><b>Year :</b>' + myStuff.Movies[i].Year + '<b></div><div class="Column">Writter :</b>' + 
                        myStuff.Movies[i].Writer + '</div><div class="Column"><b>Genre :</b>' + myStuff.Movies[i].Genre + '</div></div><div class="panel" id="panel"><div class="Column">' + 
                        title + year + writter + genre + runtime + urlPoster + '</div> <div class="Column"> '
                        + Actors + Awards + Language + imdbRating + imdbVotes +'</div></div></div>');
             }

        } 
    }
     
    
    function funcExpand(obj) {
             
                obj.classList.toggle("active");
                var panel = obj.nextElementSibling;
                if (panel.style.maxHeight) {
                    panel.style.maxHeight = null;
                } else {
                    panel.style.maxHeight = panel.scrollHeight + "px";
                }
            }
        
  
    function funcSearch(obj, type) {
        var input, filter, resultdiv, movielistdiv, moviediv, i;
        input = document.getElementById(type);
        filter = input.value.toUpperCase();
        resultdiv = document.getElementById("results");
        movielistdiv = resultdiv.getElementsByClassName("Movie");
        for (i = 0; i < movielistdiv.length; i++) {
            moviediv = movielistdiv[i].getElementsByTagName("div")[7].getElementsByTagName("p")[obj];
            if (moviediv.innerHTML.toUpperCase().indexOf(filter) > -1) {
                movielistdiv[i].style.display = "";
            } else {
                movielistdiv[i].style.display = "none";

            }
        }
    }
