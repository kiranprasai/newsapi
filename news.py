import requests

url = "https://apinp.com/news/api.php"
response = requests.get(url)
data = response.json()
print(data)