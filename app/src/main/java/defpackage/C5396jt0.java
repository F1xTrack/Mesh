package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.CamcorderProfile;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.vk.push.core.filedatastore.JsonDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jt0 */
/* loaded from: classes.dex */
public final class C5396jt0 implements InterfaceC0940Lv, InterfaceC3595eW, InterfaceC1651Uy, InterfaceC2577cm, InterfaceC1646Uw0, InterfaceC1290Qh1, GZ0, Provider, InterfaceC0375Eo0, InterfaceC8082xy0, WD0, MR0, InterfaceC3372dL, JsonDeserializer, InterfaceC6053nJ1 {
    public static final C5396jt0 b = new C5396jt0(1);
    public static final C5396jt0 c = new C5396jt0(2);
    public static final C5396jt0 d = new C5396jt0(3);
    public static final C5396jt0 e = new C5396jt0(4);
    public static final C5396jt0 f = new C5396jt0(5);
    public static final /* synthetic */ C5396jt0 g = new C5396jt0(6);
    public static C5396jt0 h;
    public final /* synthetic */ int a;

    public /* synthetic */ C5396jt0(int i) {
        this.a = i;
    }

    public static BZ0 q(OJ1 oj1) {
        return new BZ0(System.currentTimeMillis() + LocalNotification.Repeat.Time.ONE_HOUR, new C3547eG(8, 6), new C5911ma(true, false, false), 10.0d, 1.2d, 60);
    }

    public static int r(PV1 pv1) {
        return pv1.a();
    }

    public static PV1 t(AbstractC6843rS1 abstractC6843rS1) {
        return abstractC6843rS1.zzb;
    }

    public static void u(Object obj) {
        PV1 pv1 = ((AbstractC6843rS1) obj).zzb;
        if (pv1.e) {
            pv1.e = false;
        }
    }

    @Override // defpackage.InterfaceC2577cm
    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new LinkedHashSet();
    }

    @Override // defpackage.MR0
    public JR0 d(a aVar, InterfaceC0279Di0 interfaceC0279Di0, OR0 or0, Context context) {
        return new JR0(aVar, interfaceC0279Di0, or0, context);
    }

    @Override // defpackage.InterfaceC0375Eo0
    public long e() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.InterfaceC1290Qh1
    public int f(Object obj) {
        switch (this.a) {
            case 11:
                return AbstractC6699qi.d(((VE) ((InterfaceC7876wt) obj)).d);
            default:
                return ((C7487uq0) obj).p();
        }
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.f(jSONObject, "<this>");
        String string = jSONObject.getString("master_host_default_key");
        O90.e(string, "getString(\"master_host_default_key\")");
        return new C6349os1(string);
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        Object objH = c1241Pr0.h(new C6997sG0(InterfaceC7644vf.class, Executor.class));
        O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.e((Executor) objH);
    }

    @Override // javax.inject.Provider
    public Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        AbstractC2501cM1.d(remoteConfigManager);
        return remoteConfigManager;
    }

    @Override // defpackage.InterfaceC0375Eo0
    public long h() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.WD0
    public void i(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // defpackage.InterfaceC2577cm
    public boolean j(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // defpackage.GZ0
    public BZ0 k(OJ1 oj1, JSONObject jSONObject) {
        return q(oj1);
    }

    @Override // defpackage.InterfaceC3595eW
    public AbstractC0663Ig0 l(AF0 af0, String str, X01 x01, X01 x012) {
        O90.f(af0, "proto");
        O90.f(str, "flexibleId");
        O90.f(x01, "lowerBound");
        O90.f(x012, "upperBound");
        return !str.equals("kotlin.jvm.PlatformType") ? C5496kP.c(EnumC5305jP.m, str, x01.toString(), x012.toString()) : af0.l(AbstractC0654Id0.g) ? new C6434pJ0(x01, x012) : NV1.t(x01, x012);
    }

    public C7691vu1 n(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        long j = jSONObject.getLong("VERSION");
        String string = jSONObject.getString("HASH");
        O90.e(string, "configFingerprintValue");
        C7315tw1 c7315tw1 = new C7315tw1(j, string);
        String strOptString = jSONObject.optString("SHORT_SEGMENTS");
        O90.e(strOptString, "jsonObject.optString(SHORT_SEGMENTS_KEY)");
        String strE0 = C0240Cv0.e0(strOptString);
        long j2 = jSONObject.getLong("UPDATE_TIMESTAMP");
        JSONObject jSONObject2 = jSONObject.getJSONObject("CONFIG");
        O90.e(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
        return new C7691vu1(j2, AbstractC7592vN1.a(jSONObject2), c7315tw1, strE0);
    }

    @Override // defpackage.InterfaceC0375Eo0
    public boolean next() {
        return false;
    }

    public String o(C7691vu1 c7691vu1) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C7315tw1 c7315tw1 = c7691vu1.c;
        jSONObject.put("VERSION", c7315tw1.a);
        jSONObject.put("HASH", c7315tw1.b);
        jSONObject.put("UPDATE_TIMESTAMP", c7691vu1.a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : c7691vu1.b.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("CONFIG", jSONObject2);
        String str = c7691vu1.d;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("short_segments", str);
        String string = jSONObject3.toString();
        O90.e(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
        jSONObject.put("SHORT_SEGMENTS", string);
        String string2 = jSONObject.toString();
        O90.e(string2, "jsonObject.toString()");
        return string2;
    }

    public AbstractC7452ue1 p(InterfaceC1200Pd1 interfaceC1200Pd1, List list) {
        O90.f(interfaceC1200Pd1, "typeConstructor");
        O90.f(list, "arguments");
        List parameters = interfaceC1200Pd1.getParameters();
        O90.e(parameters, "getParameters(...)");
        InterfaceC5925me1 interfaceC5925me1 = (InterfaceC5925me1) AbstractC8069xu.K(parameters);
        if (interfaceC5925me1 == null || !interfaceC5925me1.v0()) {
            return new C4288i80((InterfaceC5925me1[]) parameters.toArray(new InterfaceC5925me1[0]), (AbstractC6689qe1[]) list.toArray(new AbstractC6689qe1[0]), false);
        }
        List parameters2 = interfaceC1200Pd1.getParameters();
        O90.e(parameters2, "getParameters(...)");
        List list2 = parameters2;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5925me1) it.next()).v());
        }
        return new C1356Rd1(AbstractC7096sn0.n(AbstractC8069xu.i0(arrayList, list)), false);
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) throws IOException {
        if (task.k()) {
            return (Bundle) task.i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.h()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.h());
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                PW1.b.get();
                Long l = (Long) UW1.a.a();
                l.getClass();
                return l;
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.g0.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l2 = (Long) UW1.n0.a();
                l2.getClass();
                return l2;
            default:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.m.a()).longValue());
        }
    }

    public /* synthetic */ C5396jt0(int i, Object obj) {
        this.a = i;
    }

    public C5396jt0(Set set) {
        this.a = 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
    }

    @Override // defpackage.InterfaceC3372dL
    public void m() {
    }

    @Override // defpackage.InterfaceC3372dL
    public void s(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap) {
    }

    @Override // defpackage.InterfaceC8082xy0
    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
