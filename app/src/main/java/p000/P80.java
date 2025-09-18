package p000;

import com.facebook.react.bridge.Inspector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class P80 implements X40 {

    /* renamed from: a */
    public final O80 f8868a;

    /* renamed from: b */
    public final HashMap f8869b = new HashMap();

    /* renamed from: c */
    public final String f8870c;

    public P80(String str, String str2) {
        this.f8868a = new O80(this, str);
        this.f8870c = str2;
    }

    /* renamed from: a */
    public final void m6247a() {
        HashMap map = this.f8869b;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Inspector.LocalConnection) ((Map.Entry) it.next()).getValue()).disconnect();
        }
        map.clear();
    }

    /* renamed from: b */
    public final void m6248b(JSONObject jSONObject) {
        String string;
        HashMap map;
        string = jSONObject.getString("event");
        string.getClass();
        map = this.f8869b;
        switch (string) {
            case "disconnect":
                Inspector.LocalConnection localConnection = (Inspector.LocalConnection) map.remove(jSONObject.getJSONObject("payload").getString("pageId"));
                if (localConnection == null) {
                    return;
                }
                localConnection.disconnect();
                return;
            case "connect":
                String string2 = jSONObject.getJSONObject("payload").getString("pageId");
                if (((Inspector.LocalConnection) map.remove(string2)) != null) {
                    throw new IllegalStateException(AbstractC7222ym.m26245v("Already connected: ", string2));
                }
                try {
                    map.put(string2, Inspector.connect(Integer.parseInt(string2), new N80(this, string2)));
                    return;
                } catch (Exception unused) {
                    AbstractC3929dS.m17686s("InspectorPackagerConnection");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("pageId", string2);
                    m6249c("disconnect", jSONObject2);
                    return;
                }
            case "wrappedEvent":
                JSONObject jSONObject3 = jSONObject.getJSONObject("payload");
                String string3 = jSONObject3.getString("pageId");
                String string4 = jSONObject3.getString("wrappedEvent");
                Inspector.LocalConnection localConnection2 = (Inspector.LocalConnection) map.get(string3);
                if (localConnection2 == null) {
                    AbstractC3929dS.m17683p("InspectorPackagerConnection");
                    return;
                } else {
                    localConnection2.sendMessage(string4);
                    return;
                }
            case "getPages":
                List<Inspector.Page> pages = Inspector.getPages();
                JSONArray jSONArray = new JSONArray();
                for (Inspector.Page page : pages) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(NotificationConstants.f19487ID, String.valueOf(page.getId()));
                    jSONObject4.put("title", page.getTitle());
                    jSONObject4.put("app", this.f8870c);
                    jSONObject4.put("vm", page.getVM());
                    jSONArray.put(jSONObject4);
                }
                m6249c("getPages", jSONArray);
                return;
            default:
                throw new IllegalArgumentException("Unknown event: ".concat(string));
        }
    }

    /* renamed from: c */
    public final void m6249c(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("payload", obj);
        O80 o80 = this.f8868a;
        o80.getClass();
        new AsyncTaskC9997kL0(2, jSONObject).execute(o80.f8254c);
    }

    @Override // p000.X40
    public final void connect() {
        this.f8868a.m5960j();
    }
}
