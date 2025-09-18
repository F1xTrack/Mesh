package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ResponseParserImpl implements ResponseParser {
    public final AnalyticsHandler a;

    public ResponseParserImpl(AnalyticsHandler analyticsHandler) {
        this.a = analyticsHandler;
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.ResponseParser
    public Data parse(String str) throws JSONException, ParseException {
        try {
            this.a.onConfigReceivedFromNetwork(str);
            JSONObject jSONObject = new JSONObject(str);
            Data.Builder builderCondition = Data.newBuilder().version(Integer.valueOf(jSONObject.getInt("config_v"))).condition(jSONObject.getString("cond_s"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("config");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObjectOptJSONObject.get(next);
                    if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                        builderCondition.pair(next, obj.toString());
                    } else {
                        builderCondition.pair(next, obj);
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("segments");
            if (jSONObjectOptJSONObject2 != null) {
                HashMap map = new HashMap(jSONObjectOptJSONObject2.length());
                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    map.put(next2, jSONObjectOptJSONObject2.getString(next2));
                }
                builderCondition.segments(map);
            }
            return builderCondition.build();
        } catch (JSONException e) {
            throw new ParseException(e);
        }
    }
}
