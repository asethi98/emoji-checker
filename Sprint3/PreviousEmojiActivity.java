//might need to add android package thing here
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class PreviousEmojiActivity extends AppCompatActivity {
    
    String jsonLink = "http://www.emoji-survey.me/responses/";
    String data = "";
    RequestQueue requestQueue;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest objReq = new JsonObjectRequest(Request.Method.GET, jsonLink,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try 
                        {
                            JSONObject obj = response.getJSONObject("results");
                            String emoji = obj.getString("emoji");
                            String ts = obj.getString("ts");
                            String user = obj.getString("user");

                            if(PreviousEmojiRequest() == user)
                            {
                                data += "Selected Emoji: " + emoji +
                                "Time: " + ts +
                                "User: " + user;
                            }
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                    }
                }
        );
        requestQueue.add(objReq);
    }
}


