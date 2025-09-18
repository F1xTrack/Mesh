package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.p022ob.C2466A;
import com.yandex.metrica.impl.p022ob.C3009Vi;
import com.yandex.metrica.impl.p022ob.C3028Wc;
import com.yandex.metrica.impl.p022ob.C3374jo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q0 */
/* loaded from: classes2.dex */
public final class C3532q0 {

    /* renamed from: a */
    private final Context f24521a;

    /* renamed from: b */
    private final C2766M f24522b;

    /* renamed from: c */
    private final C2566E f24523c;

    /* renamed from: d */
    private final C3207dd f24524d;

    /* renamed from: e */
    private final C3171c3 f24525e;

    /* renamed from: f */
    private ContentValues f24526f;

    /* renamed from: g */
    private C3367jh f24527g;

    public C3532q0(Context context) {
        this(context, C2842P0.m14728i().m14734d(), C2842P0.m14728i().m14733c(), C3207dd.m15750a(context), C3145b3.m15668a(context));
    }

    /* renamed from: a */
    public C3532q0 m16594a(ContentValues contentValues) {
        this.f24526f = contentValues;
        return this;
    }

    /* renamed from: a */
    public C3532q0 m16595a(C3367jh c3367jh) {
        this.f24527g = c3367jh;
        return this;
    }

    /* renamed from: a */
    public void m16596a() {
        JSONObject jSONObject = new JSONObject();
        try {
            m16592a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f24526f.put("report_request_parameters", jSONObject.toString());
    }

    public C3532q0(Context context, C2766M c2766m, C2566E c2566e, C3207dd c3207dd, C3145b3 c3145b3) {
        this.f24521a = context;
        this.f24522b = c2766m;
        this.f24523c = c2566e;
        this.f24524d = c3207dd;
        this.f24525e = c3145b3.m15672a();
    }

    /* renamed from: a */
    private void m16592a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPutOpt = jSONObject.putOpt("dId", this.f24527g.m15783g()).putOpt("uId", this.f24527g.m15800x()).putOpt("appVer", this.f24527g.m15782f()).putOpt("appBuild", this.f24527g.m15774b());
        this.f24527g.getClass();
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("analyticsSdkVersionName", "5.0.0");
        this.f24527g.getClass();
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("kitBuildNumber", "45001354").putOpt("kitBuildType", this.f24527g.m15787k()).putOpt("osVer", this.f24527g.m15792p()).putOpt("osApiLev", Integer.valueOf(this.f24527g.m15791o())).putOpt("lang", this.f24527g.m15788l()).putOpt("root", this.f24527g.m15785i()).putOpt("app_debuggable", this.f24527g.m16000A()).putOpt(CommonUrlParts.APP_FRAMEWORK, this.f24527g.m15776c()).putOpt("attribution_id", Integer.valueOf(this.f24527g.m16130D()));
        this.f24527g.getClass();
        jSONObjectPutOpt3.putOpt("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
    }

    /* renamed from: a */
    public void m16597a(C3373jn c3373jn, C2466A.a aVar, InterfaceC3270fo<C3009Vi.b, Object> interfaceC3270fo) {
        Location locationM16135I;
        C3223e3 c3223e3M15815b;
        C3376k0 c3376k0 = c3373jn.f23818a;
        this.f24526f.put("name", c3376k0.f23827a);
        this.f24526f.put("value", c3376k0.f23828b);
        this.f24526f.put("type", Integer.valueOf(c3376k0.f23831e));
        this.f24526f.put("custom_type", Integer.valueOf(c3376k0.f23832f));
        this.f24526f.put("error_environment", c3376k0.m16238h());
        this.f24526f.put("user_info", c3376k0.m16245o());
        this.f24526f.put("truncated", Integer.valueOf(c3376k0.f23834h));
        this.f24526f.put("connection_type", Integer.valueOf(C3144b2.m15666b(this.f24521a)));
        this.f24526f.put("profile_id", c3376k0.m16242l());
        this.f24526f.put("encrypting_mode", Integer.valueOf(c3373jn.f23819b.m16436a()));
        this.f24526f.put("first_occurrence_status", Integer.valueOf(c3376k0.m16239i().f21760a));
        EnumC2667I0 enumC2667I0M16243m = c3376k0.m16243m();
        if (enumC2667I0M16243m != null) {
            this.f24526f.put("source", Integer.valueOf(enumC2667I0M16243m.f21387a));
        }
        Boolean boolM16233c = c3376k0.m16233c();
        if (boolM16233c != null) {
            this.f24526f.put("attribution_id_changed", boolM16233c);
        }
        this.f24526f.put("open_id", c3376k0.m16240j());
        this.f24526f.put("app_environment", aVar.f20825a);
        this.f24526f.put("app_environment_revision", Long.valueOf(aVar.f20826b));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.f24527g.m16144R());
            if (this.f24527g.m16144R()) {
                locationM16135I = this.f24527g.m16135I();
                if (locationM16135I == null) {
                    locationM16135I = this.f24524d.m15754a();
                    c3223e3M15815b = null;
                } else {
                    c3223e3M15815b = C3223e3.m15814a(locationM16135I);
                }
            } else {
                locationM16135I = null;
                c3223e3M15815b = null;
            }
            if (c3223e3M15815b == null && locationM16135I != null) {
                c3223e3M15815b = C3223e3.m15815b(locationM16135I);
            }
            if (c3223e3M15815b != null) {
                m16593a(jSONObject, c3223e3M15815b);
            }
            this.f24526f.put("location_info", jSONObject.toString());
        } catch (Throwable unused) {
        }
        EnumMap enumMap = new EnumMap(C3009Vi.b.class);
        C3760yk c3760ykM14752w = C2842P0.m14728i().m14752w();
        LinkedList linkedList = new LinkedList();
        c3760ykM14752w.mo15084a(new C3506p0(this, linkedList));
        C3009Vi.b bVar = C3009Vi.b.WIFI;
        enumMap.put((EnumMap) bVar, (C3009Vi.b) this.f24525e.mo14757a());
        C3009Vi.b bVar2 = C3009Vi.b.CELL;
        enumMap.put((EnumMap) bVar2, (C3009Vi.b) (linkedList.isEmpty() ? null : (Collection) linkedList.getFirst()));
        C3374jo<Map<C3009Vi.b, Object>> c3374jo = interfaceC3270fo.get(enumMap);
        this.f24526f.put("has_omitted_data", Integer.valueOf(c3374jo.f23820a == C3374jo.a.NOT_CHANGED ? 1 : 0));
        C3374jo.a aVar2 = c3374jo.f23820a;
        Object obj = c3374jo.f23821b;
        Collection collection = obj == null ? null : (Collection) ((Map) obj).get(bVar2);
        c3760ykM14752w.mo15082a(new C3480o0(this));
        C3374jo.a aVar3 = C3374jo.a.NEW;
        if ((aVar2 == aVar3 || aVar2 == C3374jo.a.REFRESH) && collection != null) {
            this.f24526f.put("cell_info", C3762ym.m17275a((Collection<C3010Vj>) collection).toString());
        }
        C3374jo.a aVar4 = c3374jo.f23820a;
        Object obj2 = c3374jo.f23821b;
        Collection collection2 = obj2 != null ? (Collection) ((Map) obj2).get(bVar) : null;
        if ((aVar4 == C3374jo.a.REFRESH || aVar4 == aVar3) && collection2 != null) {
            this.f24526f.put("wifi_network_info", C3093Z2.m15525a(collection2).toString());
        }
        this.f24526f.put("battery_charge_type", Integer.valueOf(this.f24522b.m14566b().m14568a()));
        this.f24526f.put("collection_mode", C3028Wc.a.m15386a(this.f24523c.m14023c()).m15388a());
    }

    /* renamed from: a */
    private void m16593a(JSONObject jSONObject, C3223e3 c3223e3) throws JSONException {
        jSONObject.put("lat", c3223e3.getLatitude());
        jSONObject.put("lon", c3223e3.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(c3223e3.getTime()));
        jSONObject.putOpt("precision", c3223e3.hasAccuracy() ? Float.valueOf(c3223e3.getAccuracy()) : null);
        jSONObject.putOpt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, c3223e3.hasBearing() ? Float.valueOf(c3223e3.getBearing()) : null);
        jSONObject.putOpt("speed", c3223e3.hasSpeed() ? Float.valueOf(c3223e3.getSpeed()) : null);
        jSONObject.putOpt("altitude", c3223e3.hasAltitude() ? Double.valueOf(c3223e3.getAltitude()) : null);
        jSONObject.putOpt("provider", C2819O2.m14686a(c3223e3.getProvider(), null));
        jSONObject.putOpt("original_provider", c3223e3.m15816a());
    }
}
