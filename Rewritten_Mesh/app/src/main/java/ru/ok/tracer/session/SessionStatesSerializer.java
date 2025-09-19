package ru.ok.tracer.session;

import defpackage.O90;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.ok.tracer.session.SessionState;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\r"}, d2 = {"Lru/ok/tracer/session/SessionStatesSerializer;", "", "()V", "fromJson", "", "Lru/ok/tracer/session/SessionState;", "string", "", "toJson", "states", "", "toJsonArray", "Lorg/json/JSONArray;", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionStatesSerializer {
    public static final SessionStatesSerializer INSTANCE = new SessionStatesSerializer();

    private SessionStatesSerializer() {
    }

    public final List<SessionState> fromJson(String string) throws JSONException {
        O90.f(string, "string");
        JSONArray jSONArray = new JSONArray(string);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string2 = jSONObject.getString("versionName");
            long j = jSONObject.getLong("versionCode");
            String strOptString = jSONObject.optString("sessionUuid");
            if (strOptString == null) {
                strOptString = SessionUuidUtils.createSessionUuid();
            }
            String strOptString2 = jSONObject.optString("processName");
            SessionState.Status statusValueOf = SessionState.Status.valueOf(jSONObject.getString("status"));
            boolean zOptBoolean = jSONObject.optBoolean("isInBackground");
            O90.e(string2, "getString(\"versionName\")");
            arrayList.add(new SessionState(j, string2, strOptString, strOptString2, statusValueOf, zOptBoolean));
        }
        return arrayList;
    }

    public final String toJson(Iterable<SessionState> states) {
        O90.f(states, "states");
        String string = toJsonArray(states).toString();
        O90.e(string, "toJsonArray(states).toString()");
        return string;
    }

    public final JSONArray toJsonArray(Iterable<SessionState> states) throws JSONException {
        O90.f(states, "states");
        JSONArray jSONArray = new JSONArray();
        for (SessionState sessionState : states) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", sessionState.getVersionName());
            jSONObject.put("versionCode", sessionState.getVersionCode());
            jSONObject.put("sessionUuid", sessionState.getSessionUuid());
            jSONObject.put("processName", sessionState.getProcessName());
            jSONObject.put("status", sessionState.getStatus().toString());
            jSONObject.put("isInBackground", sessionState.isInBackground());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
