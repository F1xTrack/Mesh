package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.yandex.metrica.impl.p022ob.C2467A0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C8106Pg0;

/* renamed from: com.yandex.metrica.impl.ob.i1 */
/* loaded from: classes2.dex */
public final class C3325i1 {

    /* renamed from: a */
    private final JSONObject f23619a = new JSONObject();

    /* renamed from: b */
    private final Context f23620b;

    /* renamed from: c */
    private final C2467A0 f23621c;

    public C3325i1(Context context, C2467A0 c2467a0) {
        this.f23620b = context;
        this.f23621c = c2467a0;
    }

    /* renamed from: a */
    public static <T> T m16075a(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t);
        }
        return (T) jSONObject.get(str);
    }

    /* renamed from: d */
    private void m16076d() throws JSONException {
        if (C2968U2.m15243a(24)) {
            JSONObject jSONObject = (JSONObject) m16075a(this.f23619a, "dfid", new JSONObject());
            jSONObject.putOpt("wids", (Integer) C2968U2.m15228a(new C2993V2(1), this.f23620b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
            jSONObject.putOpt("widl", (Integer) C2968U2.m15228a(new C2993V2(2), this.f23620b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
        }
    }

    /* renamed from: b */
    public C3325i1 m16078b() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) m16075a(this.f23619a, "dfid", new JSONObject());
        if (C2968U2.m15243a(21)) {
            jSONArray = new JSONArray(Build.SUPPORTED_ABIS);
        } else {
            ArrayList arrayList = new ArrayList();
            String str = Build.CPU_ABI;
            if (!"unknown".equals(str)) {
                arrayList.add(str);
            }
            String str2 = Build.CPU_ABI2;
            if (!"unknown".equals(str2)) {
                arrayList.add(str2);
            }
            jSONArray = new JSONArray((Collection) arrayList);
        }
        jSONObject.put("cpu_abis", jSONArray);
        return this;
    }

    /* renamed from: c */
    public C3325i1 m16079c() {
        try {
            JSONObject jSONObject = (JSONObject) m16075a(this.f23619a, "dfid", new JSONObject());
            C2467A0.a aVarM13838a = this.f23621c.m13838a();
            jSONObject.put("tds", aVarM13838a.f20829a);
            jSONObject.put("fds", aVarM13838a.f20830b);
            ((JSONObject) m16075a(this.f23619a, "dfid", new JSONObject())).put("boot_time", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            m16076d();
            ((JSONObject) m16075a(this.f23619a, "dfid", new JSONObject())).put("lc", C3762ym.m17290b((List<?>) C3507p1.m16548a(this.f23620b).m16550a()));
        } catch (Throwable unused) {
        }
        try {
            C8106Pg0 c8106Pg0 = KotlinVersion.Companion;
            Object obj = KotlinVersion.class.getDeclaredField("CURRENT").get(null);
            int iIntValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", null).invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", null).invoke(obj, null)).intValue();
            ((JSONObject) m16075a(this.f23619a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", iIntValue).put("minor", iIntValue2).put("patch", ((Integer) obj.getClass().getDeclaredMethod("getPatch", null).invoke(obj, null)).intValue()));
        } catch (Throwable unused2) {
        }
        return this;
    }

    public String toString() {
        return this.f23619a.toString();
    }

    /* renamed from: a */
    public String m16077a() {
        return this.f23619a.toString();
    }
}
