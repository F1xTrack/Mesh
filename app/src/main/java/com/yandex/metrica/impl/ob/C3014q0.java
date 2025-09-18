package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.metrica.impl.ob.A;
import com.yandex.metrica.impl.ob.Vi;
import com.yandex.metrica.impl.ob.Wc;
import com.yandex.metrica.impl.ob.jo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3014q0 {
    private final Context a;
    private final M b;
    private final E c;
    private final C2703dd d;
    private final C2668c3 e;
    private ContentValues f;
    private C2856jh g;

    public C3014q0(Context context) {
        this(context, P0.i().d(), P0.i().c(), C2703dd.a(context), C2643b3.a(context));
    }

    public C3014q0 a(ContentValues contentValues) {
        this.f = contentValues;
        return this;
    }

    public C3014q0 a(C2856jh c2856jh) {
        this.g = c2856jh;
        return this;
    }

    public void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f.put("report_request_parameters", jSONObject.toString());
    }

    public C3014q0(Context context, M m, E e, C2703dd c2703dd, C2643b3 c2643b3) {
        this.a = context;
        this.b = m;
        this.c = e;
        this.d = c2703dd;
        this.e = c2643b3.a();
    }

    private void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPutOpt = jSONObject.putOpt("dId", this.g.g()).putOpt("uId", this.g.x()).putOpt("appVer", this.g.f()).putOpt("appBuild", this.g.b());
        this.g.getClass();
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("analyticsSdkVersionName", "5.0.0");
        this.g.getClass();
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("kitBuildNumber", "45001354").putOpt("kitBuildType", this.g.k()).putOpt("osVer", this.g.p()).putOpt("osApiLev", Integer.valueOf(this.g.o())).putOpt("lang", this.g.l()).putOpt("root", this.g.i()).putOpt("app_debuggable", this.g.A()).putOpt(CommonUrlParts.APP_FRAMEWORK, this.g.c()).putOpt("attribution_id", Integer.valueOf(this.g.D()));
        this.g.getClass();
        jSONObjectPutOpt3.putOpt("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
    }

    public void a(C2862jn c2862jn, A.a aVar, fo<Vi.b, Object> foVar) {
        Location locationI;
        C2718e3 c2718e3B;
        C2864k0 c2864k0 = c2862jn.a;
        this.f.put("name", c2864k0.a);
        this.f.put("value", c2864k0.b);
        this.f.put("type", Integer.valueOf(c2864k0.e));
        this.f.put("custom_type", Integer.valueOf(c2864k0.f));
        this.f.put("error_environment", c2864k0.h());
        this.f.put("user_info", c2864k0.o());
        this.f.put("truncated", Integer.valueOf(c2864k0.h));
        this.f.put("connection_type", Integer.valueOf(C2642b2.b(this.a)));
        this.f.put("profile_id", c2864k0.l());
        this.f.put("encrypting_mode", Integer.valueOf(c2862jn.b.a()));
        this.f.put("first_occurrence_status", Integer.valueOf(c2864k0.i().a));
        I0 i0M = c2864k0.m();
        if (i0M != null) {
            this.f.put("source", Integer.valueOf(i0M.a));
        }
        Boolean boolC = c2864k0.c();
        if (boolC != null) {
            this.f.put("attribution_id_changed", boolC);
        }
        this.f.put("open_id", c2864k0.j());
        this.f.put("app_environment", aVar.a);
        this.f.put("app_environment_revision", Long.valueOf(aVar.b));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.g.R());
            if (this.g.R()) {
                locationI = this.g.I();
                if (locationI == null) {
                    locationI = this.d.a();
                    c2718e3B = null;
                } else {
                    c2718e3B = C2718e3.a(locationI);
                }
            } else {
                locationI = null;
                c2718e3B = null;
            }
            if (c2718e3B == null && locationI != null) {
                c2718e3B = C2718e3.b(locationI);
            }
            if (c2718e3B != null) {
                a(jSONObject, c2718e3B);
            }
            this.f.put("location_info", jSONObject.toString());
        } catch (Throwable unused) {
        }
        EnumMap enumMap = new EnumMap(Vi.b.class);
        C3238yk c3238ykW = P0.i().w();
        LinkedList linkedList = new LinkedList();
        c3238ykW.a(new C2989p0(this, linkedList));
        Vi.b bVar = Vi.b.WIFI;
        enumMap.put((EnumMap) bVar, (Vi.b) this.e.a());
        Vi.b bVar2 = Vi.b.CELL;
        enumMap.put((EnumMap) bVar2, (Vi.b) (linkedList.isEmpty() ? null : (Collection) linkedList.getFirst()));
        jo<Map<Vi.b, Object>> joVar = foVar.get(enumMap);
        this.f.put("has_omitted_data", Integer.valueOf(joVar.a == jo.a.NOT_CHANGED ? 1 : 0));
        jo.a aVar2 = joVar.a;
        Object obj = joVar.b;
        Collection collection = obj == null ? null : (Collection) ((Map) obj).get(bVar2);
        c3238ykW.a(new C2964o0(this));
        jo.a aVar3 = jo.a.NEW;
        if ((aVar2 == aVar3 || aVar2 == jo.a.REFRESH) && collection != null) {
            this.f.put("cell_info", C3240ym.a((Collection<Vj>) collection).toString());
        }
        jo.a aVar4 = joVar.a;
        Object obj2 = joVar.b;
        Collection collection2 = obj2 != null ? (Collection) ((Map) obj2).get(bVar) : null;
        if ((aVar4 == jo.a.REFRESH || aVar4 == aVar3) && collection2 != null) {
            this.f.put("wifi_network_info", Z2.a(collection2).toString());
        }
        this.f.put("battery_charge_type", Integer.valueOf(this.b.b().a()));
        this.f.put("collection_mode", Wc.a.a(this.c.c()).a());
    }

    private void a(JSONObject jSONObject, C2718e3 c2718e3) throws JSONException {
        jSONObject.put("lat", c2718e3.getLatitude());
        jSONObject.put("lon", c2718e3.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(c2718e3.getTime()));
        jSONObject.putOpt("precision", c2718e3.hasAccuracy() ? Float.valueOf(c2718e3.getAccuracy()) : null);
        jSONObject.putOpt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, c2718e3.hasBearing() ? Float.valueOf(c2718e3.getBearing()) : null);
        jSONObject.putOpt("speed", c2718e3.hasSpeed() ? Float.valueOf(c2718e3.getSpeed()) : null);
        jSONObject.putOpt("altitude", c2718e3.hasAltitude() ? Double.valueOf(c2718e3.getAltitude()) : null);
        jSONObject.putOpt("provider", O2.a(c2718e3.getProvider(), null));
        jSONObject.putOpt("original_provider", c2718e3.a());
    }
}
