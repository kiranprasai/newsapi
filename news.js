fetch("https://apinp.com/news/api.php")
    .then(response => response.json())
    .then(data => console.log(data));
