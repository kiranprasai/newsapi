import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val client = OkHttpClient()
        val request = Request.Builder()
            .url("https://apinp.com/news/api.php")
            .build()

        Thread {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) throw Exception("Request failed")
                val jsonData = JSONArray(response.body?.string())
                Log.d("API_RESPONSE", jsonData.toString())
            }
        }.start()
    }
}