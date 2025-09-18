package defpackage;

import com.facebook.react.bridge.Inspector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class N80 implements Inspector.RemoteConnection {
    public final /* synthetic */ String a;
    public final /* synthetic */ P80 b;

    public N80(P80 p80, String str) {
        this.b = p80;
        this.a = str;
    }

    @Override // com.facebook.react.bridge.Inspector.RemoteConnection
    public final void onDisconnect() throws JSONException {
        String str = this.a;
        P80 p80 = this.b;
        try {
            p80.b.remove(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageId", str);
            p80.c("disconnect", jSONObject);
        } catch (JSONException unused) {
            AbstractC3393dS.s("InspectorPackagerConnection");
        }
    }

    @Override // com.facebook.react.bridge.Inspector.RemoteConnection
    public final void onMessage(String str) throws JSONException {
        try {
            P80 p80 = this.b;
            String str2 = this.a;
            p80.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageId", str2);
            jSONObject.put("wrappedEvent", str);
            p80.c("wrappedEvent", jSONObject);
        } catch (JSONException unused) {
            AbstractC3393dS.s("InspectorPackagerConnection");
        }
    }
}
