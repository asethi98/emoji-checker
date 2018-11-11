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

public class PreviousEmojiRequest extends AppCompatActivity {
    
    String jsonLink = "http://www.emoji-survey.me/responses/";
    String data = "";
    RequestQueue requestQueue;
    
    @Override
    public String PreviousEmojiRequest() {
        requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest objReq = new JsonObjectRequest(Request.Method.GET, jsonLink,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try 
                        {
                            JSONObject obj = response.getJSONObject("id");
                            String id = obj.getString("id");

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
        return id;
    }
}