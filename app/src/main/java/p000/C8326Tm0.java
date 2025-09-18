package p000;

import android.media.CamcorderProfile;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.logger.LoggerProvider;
import com.p019vk.push.core.filedatastore.JsonDeserializer;
import com.p019vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Tm0 */
/* loaded from: classes2.dex */
public final class C8326Tm0 implements InterfaceC0750Lv, InterfaceC8525Xh1, LoggerProvider, InterfaceC11821yc1, InterfaceC4257ig, InterfaceC1868cm, InterfaceC8294Sw0, InterfaceC0062Az, OR0, Provider, InterfaceC11752y40, OmicronEnvironment, WD0, InterfaceC6645pt, JsonDeserializer, InterfaceC10378nJ1 {

    /* renamed from: h */
    public static volatile C7981Mv1 f11511h;

    /* renamed from: a */
    public final /* synthetic */ int f11513a;

    /* renamed from: b */
    public static final C8326Tm0 f11505b = new C8326Tm0(1);

    /* renamed from: c */
    public static final C8326Tm0 f11506c = new C8326Tm0(2);

    /* renamed from: d */
    public static final C8326Tm0 f11507d = new C8326Tm0(3);

    /* renamed from: e */
    public static final C8326Tm0 f11508e = new C8326Tm0(4);

    /* renamed from: f */
    public static final C8326Tm0 f11509f = new C8326Tm0(5);

    /* renamed from: g */
    public static final C8326Tm0 f11510g = new C8326Tm0(6);

    /* renamed from: i */
    public static final /* synthetic */ C8326Tm0 f11512i = new C8326Tm0(7);

    public /* synthetic */ C8326Tm0(int i) {
        this.f11513a = i;
    }

    /* renamed from: m */
    public static Logger m7738m() {
        C4042fG c4042fG;
        C7981Mv1 c7981Mv1 = f11511h;
        return (c7981Mv1 == null || (c4042fG = c7981Mv1.f7398d) == null) ? new DefaultLogger("VkpnsClientSdk") : c4042fG;
    }

    /* renamed from: n */
    public static final void m7739n(double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr[i] = 0.0d;
        }
    }

    /* renamed from: o */
    public static C7981Mv1 m7740o() {
        C7981Mv1 c7981Mv1 = f11511h;
        if (c7981Mv1 != null) {
            return c7981Mv1;
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    /* renamed from: s */
    public static C4105gG m7741s(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C4105gG(httpURLConnection);
    }

    @Override // p000.OR0
    /* renamed from: F0 */
    public Set mo53F0() {
        return Collections.emptySet();
    }

    @Override // p000.InterfaceC1868cm
    /* renamed from: a */
    public CamcorderProfile mo7742a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // p000.InterfaceC11821yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: b */
    public boolean mo7743b(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new LinkedHashSet();
    }

    @Override // p000.InterfaceC6645pt
    /* renamed from: d */
    public long mo2451d() {
        return System.currentTimeMillis();
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: e */
    public C10551og0 mo7744e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: f */
    public boolean mo7745f(float f) {
        return false;
    }

    @Override // com.p019vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.m5968f(jSONObject, "<this>");
        String string = jSONObject.getString("master_host_package_name_key");
        O90.m5967e(string, "getString(\"master_host_package_name_key\")");
        String string2 = jSONObject.getString("master_host_public_key");
        O90.m5967e(string2, "getString(\"master_host_public_key\")");
        return new C9808is1(string, string2);
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
        C0751Lw c0751LwM5135e = C0751Lw.m5135e();
        AbstractC8971cM1.m10691d(c0751LwM5135e);
        return c0751LwM5135e;
    }

    @Override // p000.InterfaceC11752y40
    /* renamed from: h */
    public void mo2074h(String str) {
        O90.m5968f(str, "message");
        C10745qB0 c10745qB0 = C10745qB0.f40658a;
        C10745qB0.m23947j(C10745qB0.f40658a, str, 0, 6);
    }

    @Override // p000.InterfaceC4257ig
    public boolean isEmpty() {
        return true;
    }

    @Override // p000.InterfaceC1868cm
    /* renamed from: j */
    public boolean mo7746j(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: k */
    public float mo7747k() {
        return 1.0f;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: l */
    public float mo7748l() {
        return 0.0f;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "RELEASE";
    }

    /* renamed from: p */
    public void m7749p(InterfaceC0510I5 interfaceC0510I5, InterfaceC0510I5 interfaceC0510I52) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC0510I5.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC7116x5) it.next()).mo4960f());
        }
        Iterator it2 = interfaceC0510I52.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC7116x5) it2.next()).mo4960f());
        }
    }

    @Override // com.p019vk.push.common.logger.LoggerProvider
    public Logger provideLogger() {
        return m7738m();
    }

    /* renamed from: q */
    public X01 m7750q(T71 t71, C7789Jd1 c7789Jd1, boolean z, int i, boolean z2) {
        C7789Jd1 c7789Jd1M1005J0;
        EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
        InterfaceC7633Gd1 interfaceC7633Gd1 = (InterfaceC7633Gd1) t71.f11174b;
        AbstractC10804qe1 abstractC10804qe1M7751r = m7751r(new C10988s41(((C1340VI) interfaceC7633Gd1).m8390A1(), enumC9532gi1), t71, null, i);
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1M7751r.mo24038b();
        O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
        X01 x01M26170a = AbstractC11815yZ1.m26170a(abstractC7742Ig0Mo24038b);
        if (AbstractC1141S8.m7182b(x01M26170a)) {
            return x01M26170a;
        }
        abstractC10804qe1M7751r.mo24037a();
        m7749p(x01M26170a.getAnnotations(), AbstractC0761M5.m5256a(c7789Jd1));
        if (!AbstractC1141S8.m7182b(x01M26170a)) {
            if (AbstractC1141S8.m7182b(x01M26170a)) {
                c7789Jd1M1005J0 = x01M26170a.mo3796B();
            } else {
                C7789Jd1 c7789Jd1Mo3796B = x01M26170a.mo3796B();
                O90.m5968f(c7789Jd1Mo3796B, "other");
                if (c7789Jd1.isEmpty() && c7789Jd1Mo3796B.isEmpty()) {
                    c7789Jd1M1005J0 = c7789Jd1;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) C7789Jd1.f5652b.f1250b).values();
                    O90.m5967e(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C0699L5 c0699l5 = (C0699L5) c7789Jd1.f7533a.get(iIntValue);
                        C0699L5 c0699l52 = (C0699L5) c7789Jd1Mo3796B.f7533a.get(iIntValue);
                        if (c0699l5 != null) {
                            if (c0699l52 != null) {
                                c0699l5 = new C0699L5(AbstractC11154tN1.m24916b(c0699l5.f6483a, c0699l52.f6483a));
                            }
                            c0699l52 = c0699l5;
                        } else if (c0699l52 == null) {
                            c0699l52 = null;
                        } else if (c0699l5 != null) {
                            c0699l52 = new C0699L5(AbstractC11154tN1.m24916b(c0699l52.f6483a, c0699l5.f6483a));
                        }
                        AbstractC9502gT1.m18571a(arrayList, c0699l52);
                    }
                    c7789Jd1M1005J0 = CC0.m1005J0(arrayList);
                }
            }
            x01M26170a = AbstractC11815yZ1.m26173d(x01M26170a, null, c7789Jd1M1005J0, 1);
        }
        X01 x01M791i = AbstractC7375Be1.m791i(x01M26170a, z);
        if (!z2) {
            return x01M791i;
        }
        C4153h1 c4153h1 = ((C1340VI) interfaceC7633Gd1).f12497i;
        O90.m5967e(c4153h1, "getTypeConstructor(...)");
        return KS1.m4648d(x01M791i, NV1.m5727B(C9931jq0.f35419b, c7789Jd1, c4153h1, (List) t71.f11175c, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public AbstractC10804qe1 m7751r(AbstractC10804qe1 abstractC10804qe1, T71 t71, InterfaceC10292me1 interfaceC10292me1, int i) {
        EnumC9532gi1 enumC9532gi1Mo22918O;
        EnumC9532gi1 enumC9532gi1;
        EnumC9532gi1 enumC9532gi12;
        AbstractC10804qe1 c10988s41;
        InterfaceC0140CD interfaceC0140CD = (InterfaceC7633Gd1) t71.f11174b;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((AbstractC0203DD) interfaceC0140CD).getName());
        }
        if (abstractC10804qe1.mo24039c()) {
            O90.m5965c(interfaceC10292me1);
            return AbstractC7375Be1.m792j(interfaceC10292me1);
        }
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b();
        O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = abstractC7742Ig0Mo24038b.mo3797E();
        O90.m5968f(interfaceC8101Pd1Mo3797E, "constructor");
        InterfaceC0873Ns interfaceC0873NsMo1962a = interfaceC8101Pd1Mo3797E.mo1962a();
        AbstractC10804qe1 abstractC10804qe12 = interfaceC0873NsMo1962a instanceof InterfaceC10292me1 ? (AbstractC10804qe1) ((Map) t71.f11176d).get(interfaceC0873NsMo1962a) : null;
        if (abstractC10804qe12 == null) {
            X01 x01M26170a = AbstractC11815yZ1.m26170a(abstractC10804qe1.mo24038b().mo3963L());
            if (AbstractC1141S8.m7182b(x01M26170a) || !AbstractC7375Be1.m785c(x01M26170a, C7427Ce1.f1546f, null)) {
                return abstractC10804qe1;
            }
            InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E2 = x01M26170a.mo3797E();
            InterfaceC0873Ns interfaceC0873NsMo1962a2 = interfaceC8101Pd1Mo3797E2.mo1962a();
            interfaceC8101Pd1Mo3797E2.getParameters().size();
            x01M26170a.mo3800u().size();
            if (interfaceC0873NsMo1962a2 instanceof InterfaceC10292me1) {
                c10988s41 = abstractC10804qe1;
            } else {
                int i2 = 0;
                if (interfaceC0873NsMo1962a2 instanceof InterfaceC7633Gd1) {
                    InterfaceC7633Gd1 interfaceC7633Gd1 = (InterfaceC7633Gd1) interfaceC0873NsMo1962a2;
                    if (t71.m7561J(interfaceC7633Gd1)) {
                        EnumC9532gi1 enumC9532gi13 = EnumC9532gi1.f27947c;
                        EnumC6235jP enumC6235jP = EnumC6235jP.f35121f;
                        String str = ((AbstractC0203DD) interfaceC7633Gd1).getName().f11577a;
                        O90.m5967e(str, "toString(...)");
                        return new C10988s41(C6298kP.m22197c(enumC6235jP, str), enumC9532gi13);
                    }
                    List listMo3800u = x01M26170a.mo3800u();
                    ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listMo3800u));
                    for (Object obj : listMo3800u) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC7230yu.m26279j();
                            throw null;
                        }
                        arrayList.add(m7751r((AbstractC10804qe1) obj, t71, (InterfaceC10292me1) interfaceC8101Pd1Mo3797E2.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    c10988s41 = new C10988s41(KS1.m4648d(m7750q(AbstractC9258eZ1.m18009b(t71, interfaceC7633Gd1, arrayList), x01M26170a.mo3796B(), x01M26170a.mo3798G(), i + 1, false), m7752t(x01M26170a, t71, i)), abstractC10804qe1.mo24037a());
                } else {
                    X01 x01M7752t = m7752t(x01M26170a, t71, i);
                    C11571we1.m25662d(x01M7752t);
                    for (Object obj2 : x01M7752t.mo3800u()) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC7230yu.m26279j();
                            throw null;
                        }
                        AbstractC10804qe1 abstractC10804qe13 = (AbstractC10804qe1) obj2;
                        if (!abstractC10804qe13.mo24039c()) {
                            AbstractC7742Ig0 abstractC7742Ig0Mo24038b2 = abstractC10804qe13.mo24038b();
                            O90.m5967e(abstractC7742Ig0Mo24038b2, "getType(...)");
                            if (!AbstractC7375Be1.m785c(abstractC7742Ig0Mo24038b2, XS0.f13769I, null)) {
                            }
                        }
                        i2 = i4;
                    }
                    c10988s41 = new C10988s41(x01M7752t, abstractC10804qe1.mo24037a());
                }
            }
            return c10988s41;
        }
        if (abstractC10804qe12.mo24039c()) {
            O90.m5965c(interfaceC10292me1);
            return AbstractC7375Be1.m792j(interfaceC10292me1);
        }
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC10804qe12.mo24038b().mo3963L();
        EnumC9532gi1 enumC9532gi1Mo24037a = abstractC10804qe12.mo24037a();
        O90.m5967e(enumC9532gi1Mo24037a, "getProjectionKind(...)");
        EnumC9532gi1 enumC9532gi1Mo24037a2 = abstractC10804qe1.mo24037a();
        O90.m5967e(enumC9532gi1Mo24037a2, "getProjectionKind(...)");
        if (enumC9532gi1Mo24037a2 != enumC9532gi1Mo24037a && enumC9532gi1Mo24037a2 != (enumC9532gi12 = EnumC9532gi1.f27947c)) {
            if (enumC9532gi1Mo24037a == enumC9532gi12) {
                enumC9532gi1Mo24037a = enumC9532gi1Mo24037a2;
            } else {
                O90.m5968f(interfaceC0140CD, "typeAlias");
            }
        }
        if (interfaceC10292me1 == null || (enumC9532gi1Mo22918O = interfaceC10292me1.mo22918O()) == null) {
            enumC9532gi1Mo22918O = EnumC9532gi1.f27947c;
        }
        if (enumC9532gi1Mo22918O != enumC9532gi1Mo24037a && enumC9532gi1Mo22918O != (enumC9532gi1 = EnumC9532gi1.f27947c)) {
            if (enumC9532gi1Mo24037a == enumC9532gi1) {
                enumC9532gi1Mo24037a = enumC9532gi1;
            } else {
                O90.m5968f(interfaceC0140CD, "typeAlias");
            }
        }
        m7749p(abstractC7742Ig0Mo24038b.getAnnotations(), abstractC8315Tg1Mo3963L.getAnnotations());
        X01 x01M791i = AbstractC7375Be1.m791i(AbstractC11815yZ1.m26170a(abstractC8315Tg1Mo3963L), abstractC7742Ig0Mo24038b.mo3798G());
        C7789Jd1 c7789Jd1Mo3796B = abstractC7742Ig0Mo24038b.mo3796B();
        if (!AbstractC1141S8.m7182b(x01M791i)) {
            if (AbstractC1141S8.m7182b(x01M791i)) {
                c7789Jd1Mo3796B = x01M791i.mo3796B();
            } else {
                C7789Jd1 c7789Jd1Mo3796B2 = x01M791i.mo3796B();
                c7789Jd1Mo3796B.getClass();
                O90.m5968f(c7789Jd1Mo3796B2, "other");
                if (!c7789Jd1Mo3796B.isEmpty() || !c7789Jd1Mo3796B2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) C7789Jd1.f5652b.f1250b).values();
                    O90.m5967e(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C0699L5 c0699l5 = (C0699L5) c7789Jd1Mo3796B.f7533a.get(iIntValue);
                        C0699L5 c0699l52 = (C0699L5) c7789Jd1Mo3796B2.f7533a.get(iIntValue);
                        if (c0699l5 != null) {
                            if (c0699l52 != null) {
                                c0699l5 = new C0699L5(AbstractC11154tN1.m24916b(c0699l5.f6483a, c0699l52.f6483a));
                            }
                            c0699l52 = c0699l5;
                        } else if (c0699l52 == null) {
                            c0699l52 = null;
                        } else if (c0699l5 != null) {
                            c0699l52 = new C0699L5(AbstractC11154tN1.m24916b(c0699l52.f6483a, c0699l5.f6483a));
                        }
                        AbstractC9502gT1.m18571a(arrayList2, c0699l52);
                    }
                    c7789Jd1Mo3796B = CC0.m1005J0(arrayList2);
                }
            }
            x01M791i = AbstractC11815yZ1.m26173d(x01M791i, null, c7789Jd1Mo3796B, 1);
        }
        return new C10988s41(x01M791i, enumC9532gi1Mo24037a);
    }

    /* renamed from: t */
    public X01 m7752t(X01 x01, T71 t71, int i) {
        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = x01.mo3797E();
        List listMo3800u = x01.mo3800u();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listMo3800u));
        int i2 = 0;
        for (Object obj : listMo3800u) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            AbstractC10804qe1 abstractC10804qe1 = (AbstractC10804qe1) obj;
            AbstractC10804qe1 abstractC10804qe1M7751r = m7751r(abstractC10804qe1, t71, (InterfaceC10292me1) interfaceC8101Pd1Mo3797E.getParameters().get(i2), i + 1);
            if (!abstractC10804qe1M7751r.mo24039c()) {
                abstractC10804qe1M7751r = new C10988s41(AbstractC7375Be1.m790h(abstractC10804qe1M7751r.mo24038b(), abstractC10804qe1.mo24038b().mo3798G()), abstractC10804qe1M7751r.mo24037a());
            }
            arrayList.add(abstractC10804qe1M7751r);
            i2 = i3;
        }
        return AbstractC11815yZ1.m26173d(x01, arrayList, null, 2);
    }

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        boolean z = abstractC11947zc0.mo3517U() == 1;
        if (z) {
            abstractC11947zc0.mo3523m();
        }
        float fMo3514D = (float) abstractC11947zc0.mo3514D();
        float fMo3514D2 = (float) abstractC11947zc0.mo3514D();
        while (abstractC11947zc0.mo3535x()) {
            abstractC11947zc0.mo3520d0();
        }
        if (z) {
            abstractC11947zc0.mo3527o();
        }
        return new C11169tV0((fMo3514D / 100.0f) * f, (fMo3514D2 / 100.0f) * f);
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f11513a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4343d.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11864c0.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11858Z.m8754a();
                l.getClass();
                return l;
            default:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11891r.m8754a()).longValue());
        }
    }

    public C8326Tm0(C8071Oo1 c8071Oo1) {
        this.f11513a = 14;
    }

    @Override // p000.WD0
    /* renamed from: i */
    public void mo6699i(int i, Serializable serializable) {
    }
}
