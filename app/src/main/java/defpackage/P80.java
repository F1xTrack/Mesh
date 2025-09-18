package defpackage;

import com.facebook.react.bridge.Inspector;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class P80 implements X40 {
    public final O80 a;
    public final HashMap b = new HashMap();
    public final String c;

    public P80(String str, String str2) {
        this.a = new O80(this, str);
        this.c = str2;
    }

    public final void a() {
        HashMap map = this.b;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Inspector.LocalConnection) ((Map.Entry) it.next()).getValue()).disconnect();
        }
        map.clear();
    }

    public final void b(JSONObject jSONObject) {
        String string;
        HashMap map;
        string = jSONObject.getString("event");
        string.getClass();
        map = this.b;
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
                    throw new IllegalStateException(AbstractC8235ym.v("Already connected: ", string2));
                }
                try {
                    map.put(string2, Inspector.connect(Integer.parseInt(string2), new N80(this, string2)));
                    return;
                } catch (Exception unused) {
                    AbstractC3393dS.s("InspectorPackagerConnection");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("pageId", string2);
                    c("disconnect", jSONObject2);
                    return;
                }
            case "wrappedEvent":
                JSONObject jSONObject3 = jSONObject.getJSONObject("payload");
                String string3 = jSONObject3.getString("pageId");
                String string4 = jSONObject3.getString("wrappedEvent");
                Inspector.LocalConnection localConnection2 = (Inspector.LocalConnection) map.get(string3);
                if (localConnection2 == null) {
                    AbstractC3393dS.p("InspectorPackagerConnection");
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
                    jSONObject4.put(NotificationConstants.ID, String.valueOf(page.getId()));
                    jSONObject4.put("title", page.getTitle());
                    jSONObject4.put("app", this.c);
                    jSONObject4.put("vm", page.getVM());
                    jSONArray.put(jSONObject4);
                }
                c("getPages", jSONArray);
                return;
            default:
                throw new IllegalArgumentException("Unknown event: ".concat(string));
        }
    }

    public final void c(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("payload", obj);
        O80 o80 = this.a;
        o80.getClass();
        new AsyncTaskC5485kL0(2, jSONObject).execute(o80.c);
    }

    @Override // defpackage.X40
    public final void connect() {
        this.a.j();
    }
}
