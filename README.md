# Nepali News API

A free and easy-to-use API for fetching the latest Nepali news from multiple sources. This API returns news data such as titles, descriptions, publication date, and thumbnails, updated every minute.

## API Endpoint

`GET https://apinp.com/news/api.php`

### Response Format
The API returns an array of news items with the following fields:

- **title**: The title of the news article.
- **link**: The URL of the article.
- **description**: A short description of the article.
- **pubDate**: The publication date of the article.
- **thumbnail**: The URL of the article's thumbnail image (if available).

### Example Response
```json
[
    {
        "title": "पोखरामा कोटिहोमका नाममा काटिएका काठदाउरा महानगरले जफत गर्‍यो",
        "link": "https://www.onlinekhabar.com/2025/02/1618057/metropolitan-city-seizes-firewood-stored-in-the-name-of-kotihome-in-pokhara",
        "description": "२३ माघ, काठमाडौं ।...",
        "pubDate": "Wed, 05 Feb 2025 04:34:40 +0000",
        "thumbnail": "https://www.onlinekhabar.com/wp-content/uploads/2025/02/koti-hom-2.jpg"
    }
]
