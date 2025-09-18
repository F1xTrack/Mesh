package p000;

import com.facebook.react.bridge.Inspector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class N80 implements Inspector.RemoteConnection {

    /* renamed from: a */
    public final /* synthetic */ String f7525a;

    /* renamed from: b */
    public final /* synthetic */ P80 f7526b;

    public N80(P80 p80, String str) {
        this.f7526b = p80;
        this.f7525a = str;
    }

    @Override // com.facebook.react.bridge.Inspector.RemoteConnection
    public final void onDisconnect() throws JSONException {
        String str = this.f7525a;
        P80 p80 = this.f7526b;
        try {
            p80.f8869b.remove(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageId", str);
            p80.m6249c("disconnect", jSONObject);
        } catch (JSONException unused) {
            AbstractC3929dS.m17686s("InspectorPackagerConnection");
        }
    }

    @Override // com.facebook.react.bridge.Inspector.RemoteConnection
    public final void onMessage(String str) throws JSONException {
        try {
            P80 p80 = this.f7526b;
            String str2 = this.f7525a;
            p80.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageId", str2);
            jSONObject.put("wrappedEvent", str);
            p80.m6249c("wrappedEvent", jSONObject);
        } catch (JSONException unused) {
            AbstractC3929dS.m17686s("InspectorPackagerConnection");
        }
    }
}
