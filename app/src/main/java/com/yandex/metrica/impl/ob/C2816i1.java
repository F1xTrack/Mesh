package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.yandex.metrica.impl.ob.A0;
import defpackage.C1208Pg0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2816i1 {
    private final JSONObject a = new JSONObject();
    private final Context b;
    private final A0 c;

    public C2816i1(Context context, A0 a0) {
        this.b = context;
        this.c = a0;
    }

    public static <T> T a(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t);
        }
        return (T) jSONObject.get(str);
    }

    private void d() throws JSONException {
        if (U2.a(24)) {
            JSONObject jSONObject = (JSONObject) a(this.a, "dfid", new JSONObject());
            jSONObject.putOpt("wids", (Integer) U2.a(new V2(1), this.b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
            jSONObject.putOpt("widl", (Integer) U2.a(new V2(2), this.b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
        }
    }

    public C2816i1 b() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) a(this.a, "dfid", new JSONObject());
        if (U2.a(21)) {
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

    public C2816i1 c() {
        try {
            JSONObject jSONObject = (JSONObject) a(this.a, "dfid", new JSONObject());
            A0.a aVarA = this.c.a();
            jSONObject.put("tds", aVarA.a);
            jSONObject.put("fds", aVarA.b);
            ((JSONObject) a(this.a, "dfid", new JSONObject())).put("boot_time", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            d();
            ((JSONObject) a(this.a, "dfid", new JSONObject())).put("lc", C3240ym.b((List<?>) C2990p1.a(this.b).a()));
        } catch (Throwable unused) {
        }
        try {
            C1208Pg0 c1208Pg0 = KotlinVersion.Companion;
            Object obj = KotlinVersion.class.getDeclaredField("CURRENT").get(null);
            int iIntValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", null).invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", null).invoke(obj, null)).intValue();
            ((JSONObject) a(this.a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", iIntValue).put("minor", iIntValue2).put("patch", ((Integer) obj.getClass().getDeclaredMethod("getPatch", null).invoke(obj, null)).intValue()));
        } catch (Throwable unused2) {
        }
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    public String a() {
        return this.a.toString();
    }
}
