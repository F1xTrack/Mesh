package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.CamcorderProfile;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.p019vk.push.core.filedatastore.JsonDeserializer;
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
public final class C9937jt0 implements InterfaceC0750Lv, InterfaceC3995eW, InterfaceC1319Uy, InterfaceC1868cm, InterfaceC8398Uw0, InterfaceC8161Qh1, GZ0, Provider, InterfaceC7550Eo0, InterfaceC11737xy0, WD0, MR0, InterfaceC3922dL, JsonDeserializer, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static final C9937jt0 f35437b = new C9937jt0(1);

    /* renamed from: c */
    public static final C9937jt0 f35438c = new C9937jt0(2);

    /* renamed from: d */
    public static final C9937jt0 f35439d = new C9937jt0(3);

    /* renamed from: e */
    public static final C9937jt0 f35440e = new C9937jt0(4);

    /* renamed from: f */
    public static final C9937jt0 f35441f = new C9937jt0(5);

    /* renamed from: g */
    public static final /* synthetic */ C9937jt0 f35442g = new C9937jt0(6);

    /* renamed from: h */
    public static C9937jt0 f35443h;

    /* renamed from: a */
    public final /* synthetic */ int f35444a;

    public /* synthetic */ C9937jt0(int i) {
        this.f35444a = i;
    }

    /* renamed from: q */
    public static BZ0 m22114q(OJ1 oj1) {
        return new BZ0(System.currentTimeMillis() + LocalNotification.Repeat.Time.ONE_HOUR, new C3979eG(8, 6), new C6435ma(true, false, false), 10.0d, 1.2d, 60);
    }

    /* renamed from: r */
    public static int m22115r(PV1 pv1) {
        return pv1.m6378a();
    }

    /* renamed from: t */
    public static PV1 m22116t(AbstractC10908rS1 abstractC10908rS1) {
        return abstractC10908rS1.zzb;
    }

    /* renamed from: u */
    public static void m22117u(Object obj) {
        PV1 pv1 = ((AbstractC10908rS1) obj).zzb;
        if (pv1.f9101e) {
            pv1.f9101e = false;
        }
    }

    @Override // p000.InterfaceC1868cm
    /* renamed from: a */
    public CamcorderProfile mo7742a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new LinkedHashSet();
    }

    @Override // p000.MR0
    /* renamed from: d */
    public JR0 mo5369d(ComponentCallbacks2C1874a componentCallbacks2C1874a, InterfaceC7486Di0 interfaceC7486Di0, OR0 or0, Context context) {
        return new JR0(componentCallbacks2C1874a, interfaceC7486Di0, or0, context);
    }

    @Override // p000.InterfaceC7550Eo0
    /* renamed from: e */
    public long mo2423e() {
        throw new NoSuchElementException();
    }

    @Override // p000.InterfaceC8161Qh1
    /* renamed from: f */
    public int mo6747f(Object obj) {
        switch (this.f35444a) {
            case 11:
                return AbstractC6697qi.m24051d(((C1336VE) ((InterfaceC7103wt) obj)).f12446d);
            default:
                return ((C11339uq0) obj).m25253p();
        }
    }

    @Override // com.p019vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.m5968f(jSONObject, "<this>");
        String string = jSONObject.getString("master_host_default_key");
        O90.m5967e(string, "getString(\"master_host_default_key\")");
        return new C10576os1(string);
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        Object objMo4071h = c8128Pr0.mo4071h(new C11011sG0(InterfaceC7026vf.class, Executor.class));
        O90.m5967e(objMo4071h, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.m5507e((Executor) objMo4071h);
    }

    @Override // javax.inject.Provider
    public Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        AbstractC8971cM1.m10691d(remoteConfigManager);
        return remoteConfigManager;
    }

    @Override // p000.InterfaceC7550Eo0
    /* renamed from: h */
    public long mo2424h() {
        throw new NoSuchElementException();
    }

    @Override // p000.WD0
    /* renamed from: i */
    public void mo6699i(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // p000.InterfaceC1868cm
    /* renamed from: j */
    public boolean mo7746j(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // p000.GZ0
    /* renamed from: k */
    public BZ0 mo3083k(OJ1 oj1, JSONObject jSONObject) {
        return m22114q(oj1);
    }

    @Override // p000.InterfaceC3995eW
    /* renamed from: l */
    public AbstractC7742Ig0 mo6024l(AF0 af0, String str, X01 x01, X01 x012) {
        O90.m5968f(af0, "proto");
        O90.m5968f(str, "flexibleId");
        O90.m5968f(x01, "lowerBound");
        O90.m5968f(x012, "upperBound");
        return !str.equals("kotlin.jvm.PlatformType") ? C6298kP.m22197c(EnumC6235jP.f35128m, str, x01.toString(), x012.toString()) : af0.m25538l(AbstractC7736Id0.f5055g) ? new C10633pJ0(x01, x012) : NV1.m5738t(x01, x012);
    }

    /* renamed from: n */
    public C11476vu1 m22118n(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        long j = jSONObject.getLong("VERSION");
        String string = jSONObject.getString("HASH");
        O90.m5967e(string, "configFingerprintValue");
        C11224tw1 c11224tw1 = new C11224tw1(j, string);
        String strOptString = jSONObject.optString("SHORT_SEGMENTS");
        O90.m5967e(strOptString, "jsonObject.optString(SHORT_SEGMENTS_KEY)");
        String strM1458e0 = C7460Cv0.m1458e0(strOptString);
        long j2 = jSONObject.getLong("UPDATE_TIMESTAMP");
        JSONObject jSONObject2 = jSONObject.getJSONObject("CONFIG");
        O90.m5967e(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
        return new C11476vu1(j2, AbstractC11410vN1.m25406a(jSONObject2), c11224tw1, strM1458e0);
    }

    @Override // p000.InterfaceC7550Eo0
    public boolean next() {
        return false;
    }

    /* renamed from: o */
    public String m22119o(C11476vu1 c11476vu1) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C11224tw1 c11224tw1 = c11476vu1.f44599c;
        jSONObject.put("VERSION", c11224tw1.f43427a);
        jSONObject.put("HASH", c11224tw1.f43428b);
        jSONObject.put("UPDATE_TIMESTAMP", c11476vu1.f44597a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : c11476vu1.f44598b.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("CONFIG", jSONObject2);
        String str = c11476vu1.f44600d;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("short_segments", str);
        String string = jSONObject3.toString();
        O90.m5967e(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
        jSONObject.put("SHORT_SEGMENTS", string);
        String string2 = jSONObject.toString();
        O90.m5967e(string2, "jsonObject.toString()");
        return string2;
    }

    /* renamed from: p */
    public AbstractC11316ue1 m22120p(InterfaceC8101Pd1 interfaceC8101Pd1, List list) {
        O90.m5968f(interfaceC8101Pd1, "typeConstructor");
        O90.m5968f(list, "arguments");
        List parameters = interfaceC8101Pd1.getParameters();
        O90.m5967e(parameters, "getParameters(...)");
        InterfaceC10292me1 interfaceC10292me1 = (InterfaceC10292me1) AbstractC7167xu.m25965K(parameters);
        if (interfaceC10292me1 == null || !interfaceC10292me1.mo22919v0()) {
            return new C9715i80((InterfaceC10292me1[]) parameters.toArray(new InterfaceC10292me1[0]), (AbstractC10804qe1[]) list.toArray(new AbstractC10804qe1[0]), false);
        }
        List parameters2 = interfaceC8101Pd1.getParameters();
        O90.m5967e(parameters2, "getParameters(...)");
        List list2 = parameters2;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10292me1) it.next()).mo1439v());
        }
        return new C8205Rd1(AbstractC11077sn0.m24786n(AbstractC7167xu.m25989i0(arrayList, list)), false);
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) throws IOException {
        if (task.mo11144k()) {
            return (Bundle) task.mo11142i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.mo11141h()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo11141h());
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f35444a) {
            case 26:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11859a.m8754a();
                l.getClass();
                return l;
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11872g0.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11886n0.m8754a();
                l2.getClass();
                return l2;
            default:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11883m.m8754a()).longValue());
        }
    }

    public /* synthetic */ C9937jt0(int i, Object obj) {
        this.f35444a = i;
    }

    public C9937jt0(Set set) {
        this.f35444a = 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }

    @Override // p000.InterfaceC3922dL
    /* renamed from: m */
    public void mo5561m() {
    }

    @Override // p000.InterfaceC3922dL
    /* renamed from: s */
    public void mo5565s(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap) {
    }

    @Override // p000.InterfaceC11737xy0
    /* renamed from: b */
    public void mo4933b(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
