package com.huawei.hms.framework.network.grs.p008g.p010j;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p007f.C2099b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.g.j.c */
/* loaded from: classes.dex */
public class C2114c {

    /* renamed from: a */
    private final GrsBaseInfo f19106a;

    /* renamed from: b */
    private final Context f19107b;

    /* renamed from: c */
    private final Set<String> f19108c = new HashSet();

    public C2114c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f19106a = grsBaseInfo;
        this.f19107b = context;
    }

    /* renamed from: e */
    private String m11845e() throws JSONException {
        Set<String> setM11772b = C2099b.m11767a(this.f19107b.getPackageName()).m11772b();
        if (setM11772b.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = setM11772b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.m11686i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: f */
    private String m11846f() throws JSONException {
        Logger.m11687v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f19108c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.m11688v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public Context m11847a() {
        return this.f19107b;
    }

    /* renamed from: b */
    public GrsBaseInfo m11849b() {
        return this.f19106a;
    }

    /* renamed from: c */
    public String m11850c() {
        return this.f19108c.size() == 0 ? m11845e() : m11846f();
    }

    /* renamed from: d */
    public Set<String> m11851d() {
        return this.f19108c;
    }

    /* renamed from: a */
    public void m11848a(String str) {
        this.f19108c.add(str);
    }
}
