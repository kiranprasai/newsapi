 <script>
        fetch("https://apinp.com/news/api.php")
            .then(response => {
                if (!response.ok) {
                    throw new Error("Network response was not ok");
                }
                return response.json();
            })
            .then(data => {
                console.log(data);
                document.body.innerHTML = "<pre>" + JSON.stringify(data, null, 2) + "</pre>";
            })
            .catch(error => console.error("Error fetching data:", error));
    </script>
