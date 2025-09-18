package defpackage;

import android.media.CamcorderProfile;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.logger.LoggerProvider;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
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
public final class C1538Tm0 implements InterfaceC0940Lv, InterfaceC1836Xh1, LoggerProvider, InterfaceC8207yc1, InterfaceC4388ig, InterfaceC2577cm, InterfaceC1490Sw0, InterfaceC0095Az, OR0, Provider, InterfaceC8104y40, OmicronEnvironment, WD0, InterfaceC6541pt, JsonDeserializer, InterfaceC6053nJ1 {
    public static volatile C1020Mv1 h;
    public final /* synthetic */ int a;
    public static final C1538Tm0 b = new C1538Tm0(1);
    public static final C1538Tm0 c = new C1538Tm0(2);
    public static final C1538Tm0 d = new C1538Tm0(3);
    public static final C1538Tm0 e = new C1538Tm0(4);
    public static final C1538Tm0 f = new C1538Tm0(5);
    public static final C1538Tm0 g = new C1538Tm0(6);
    public static final /* synthetic */ C1538Tm0 i = new C1538Tm0(7);

    public /* synthetic */ C1538Tm0(int i2) {
        this.a = i2;
    }

    public static Logger m() {
        C3738fG c3738fG;
        C1020Mv1 c1020Mv1 = h;
        return (c1020Mv1 == null || (c3738fG = c1020Mv1.d) == null) ? new DefaultLogger("VkpnsClientSdk") : c3738fG;
    }

    public static final void n(double[] dArr) {
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = 0.0d;
        }
    }

    public static C1020Mv1 o() {
        C1020Mv1 c1020Mv1 = h;
        if (c1020Mv1 != null) {
            return c1020Mv1;
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    public static C3929gG s(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C3929gG(httpURLConnection);
    }

    @Override // defpackage.OR0
    public Set F0() {
        return Collections.emptySet();
    }

    @Override // defpackage.InterfaceC2577cm
    public CamcorderProfile a(int i2, int i3) {
        return CamcorderProfile.get(i2, i3);
    }

    @Override // defpackage.InterfaceC8207yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC4388ig
    public boolean b(float f2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new LinkedHashSet();
    }

    @Override // defpackage.InterfaceC6541pt
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.InterfaceC4388ig
    public C6312og0 e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.InterfaceC4388ig
    public boolean f(float f2) {
        return false;
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.f(jSONObject, "<this>");
        String string = jSONObject.getString("master_host_package_name_key");
        O90.e(string, "getString(\"master_host_package_name_key\")");
        String string2 = jSONObject.getString("master_host_public_key");
        O90.e(string2, "getString(\"master_host_public_key\")");
        return new C5204is1(string, string2);
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        Object objH = c1241Pr0.h(new C6997sG0(InterfaceC7644vf.class, Executor.class));
        O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.e((Executor) objH);
    }

    @Override // javax.inject.Provider
    public Object get() {
        C0943Lw c0943LwE = C0943Lw.e();
        AbstractC2501cM1.d(c0943LwE);
        return c0943LwE;
    }

    @Override // defpackage.InterfaceC8104y40
    public void h(String str) {
        O90.f(str, "message");
        C6601qB0 c6601qB0 = C6601qB0.a;
        C6601qB0.j(C6601qB0.a, str, 0, 6);
    }

    @Override // defpackage.InterfaceC4388ig
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.InterfaceC2577cm
    public boolean j(int i2, int i3) {
        return CamcorderProfile.hasProfile(i2, i3);
    }

    @Override // defpackage.InterfaceC4388ig
    public float k() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC4388ig
    public float l() {
        return 0.0f;
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "RELEASE";
    }

    public void p(I5 i5, I5 i52) {
        HashSet hashSet = new HashSet();
        Iterator it = i5.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC7916x5) it.next()).f());
        }
        Iterator it2 = i52.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC7916x5) it2.next()).f());
        }
    }

    @Override // com.vk.push.common.logger.LoggerProvider
    public Logger provideLogger() {
        return m();
    }

    public X01 q(T71 t71, C0733Jd1 c0733Jd1, boolean z, int i2, boolean z2) {
        C0733Jd1 c0733Jd1J0;
        EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
        InterfaceC0499Gd1 interfaceC0499Gd1 = (InterfaceC0499Gd1) t71.b;
        AbstractC6689qe1 abstractC6689qe1R = r(new C6962s41(((VI) interfaceC0499Gd1).A1(), enumC4015gi1), t71, null, i2);
        AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1R.b();
        O90.e(abstractC0663Ig0B, "getType(...)");
        X01 x01A = AbstractC8198yZ1.a(abstractC0663Ig0B);
        if (S8.b(x01A)) {
            return x01A;
        }
        abstractC6689qe1R.a();
        p(x01A.getAnnotations(), M5.a(c0733Jd1));
        if (!S8.b(x01A)) {
            if (S8.b(x01A)) {
                c0733Jd1J0 = x01A.B();
            } else {
                C0733Jd1 c0733Jd1B = x01A.B();
                O90.f(c0733Jd1B, "other");
                if (c0733Jd1.isEmpty() && c0733Jd1B.isEmpty()) {
                    c0733Jd1J0 = c0733Jd1;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) C0733Jd1.b.b).values();
                    O90.e(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        L5 l5 = (L5) c0733Jd1.a.get(iIntValue);
                        L5 l52 = (L5) c0733Jd1B.a.get(iIntValue);
                        if (l5 != null) {
                            if (l52 != null) {
                                l5 = new L5(AbstractC7210tN1.b(l5.a, l52.a));
                            }
                            l52 = l5;
                        } else if (l52 == null) {
                            l52 = null;
                        } else if (l5 != null) {
                            l52 = new L5(AbstractC7210tN1.b(l52.a, l5.a));
                        }
                        AbstractC3970gT1.a(arrayList, l52);
                    }
                    c0733Jd1J0 = CC0.J0(arrayList);
                }
            }
            x01A = AbstractC8198yZ1.d(x01A, null, c0733Jd1J0, 1);
        }
        X01 x01I = AbstractC0112Be1.i(x01A, z);
        if (!z2) {
            return x01I;
        }
        C4072h1 c4072h1 = ((VI) interfaceC0499Gd1).i;
        O90.e(c4072h1, "getTypeConstructor(...)");
        return KS1.d(x01I, NV1.B(C5387jq0.b, c0733Jd1, c4072h1, (List) t71.c, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6689qe1 r(AbstractC6689qe1 abstractC6689qe1, T71 t71, InterfaceC5925me1 interfaceC5925me1, int i2) {
        EnumC4015gi1 enumC4015gi1O;
        EnumC4015gi1 enumC4015gi1;
        EnumC4015gi1 enumC4015gi12;
        AbstractC6689qe1 c6962s41;
        CD cd = (InterfaceC0499Gd1) t71.b;
        if (i2 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((DD) cd).getName());
        }
        if (abstractC6689qe1.c()) {
            O90.c(interfaceC5925me1);
            return AbstractC0112Be1.j(interfaceC5925me1);
        }
        AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.b();
        O90.e(abstractC0663Ig0B, "getType(...)");
        InterfaceC1200Pd1 interfaceC1200Pd1E = abstractC0663Ig0B.E();
        O90.f(interfaceC1200Pd1E, "constructor");
        InterfaceC1087Ns interfaceC1087NsA = interfaceC1200Pd1E.a();
        AbstractC6689qe1 abstractC6689qe12 = interfaceC1087NsA instanceof InterfaceC5925me1 ? (AbstractC6689qe1) ((Map) t71.d).get(interfaceC1087NsA) : null;
        if (abstractC6689qe12 == null) {
            X01 x01A = AbstractC8198yZ1.a(abstractC6689qe1.b().L());
            if (S8.b(x01A) || !AbstractC0112Be1.c(x01A, C0190Ce1.f, null)) {
                return abstractC6689qe1;
            }
            InterfaceC1200Pd1 interfaceC1200Pd1E2 = x01A.E();
            InterfaceC1087Ns interfaceC1087NsA2 = interfaceC1200Pd1E2.a();
            interfaceC1200Pd1E2.getParameters().size();
            x01A.u().size();
            if (interfaceC1087NsA2 instanceof InterfaceC5925me1) {
                c6962s41 = abstractC6689qe1;
            } else {
                int i3 = 0;
                if (interfaceC1087NsA2 instanceof InterfaceC0499Gd1) {
                    InterfaceC0499Gd1 interfaceC0499Gd1 = (InterfaceC0499Gd1) interfaceC1087NsA2;
                    if (t71.J(interfaceC0499Gd1)) {
                        EnumC4015gi1 enumC4015gi13 = EnumC4015gi1.c;
                        EnumC5305jP enumC5305jP = EnumC5305jP.f;
                        String str = ((DD) interfaceC0499Gd1).getName().a;
                        O90.e(str, "toString(...)");
                        return new C6962s41(C5496kP.c(enumC5305jP, str), enumC4015gi13);
                    }
                    List listU = x01A.u();
                    ArrayList arrayList = new ArrayList(AbstractC8449zu.k(listU));
                    for (Object obj : listU) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC8259yu.j();
                            throw null;
                        }
                        arrayList.add(r((AbstractC6689qe1) obj, t71, (InterfaceC5925me1) interfaceC1200Pd1E2.getParameters().get(i3), i2 + 1));
                        i3 = i4;
                    }
                    c6962s41 = new C6962s41(KS1.d(q(AbstractC3606eZ1.b(t71, interfaceC0499Gd1, arrayList), x01A.B(), x01A.G(), i2 + 1, false), t(x01A, t71, i2)), abstractC6689qe1.a());
                } else {
                    X01 x01T = t(x01A, t71, i2);
                    C7833we1.d(x01T);
                    for (Object obj2 : x01T.u()) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC8259yu.j();
                            throw null;
                        }
                        AbstractC6689qe1 abstractC6689qe13 = (AbstractC6689qe1) obj2;
                        if (!abstractC6689qe13.c()) {
                            AbstractC0663Ig0 abstractC0663Ig0B2 = abstractC6689qe13.b();
                            O90.e(abstractC0663Ig0B2, "getType(...)");
                            if (!AbstractC0112Be1.c(abstractC0663Ig0B2, XS0.I, null)) {
                            }
                        }
                        i3 = i5;
                    }
                    c6962s41 = new C6962s41(x01T, abstractC6689qe1.a());
                }
            }
            return c6962s41;
        }
        if (abstractC6689qe12.c()) {
            O90.c(interfaceC5925me1);
            return AbstractC0112Be1.j(interfaceC5925me1);
        }
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC6689qe12.b().L();
        EnumC4015gi1 enumC4015gi1A = abstractC6689qe12.a();
        O90.e(enumC4015gi1A, "getProjectionKind(...)");
        EnumC4015gi1 enumC4015gi1A2 = abstractC6689qe1.a();
        O90.e(enumC4015gi1A2, "getProjectionKind(...)");
        if (enumC4015gi1A2 != enumC4015gi1A && enumC4015gi1A2 != (enumC4015gi12 = EnumC4015gi1.c)) {
            if (enumC4015gi1A == enumC4015gi12) {
                enumC4015gi1A = enumC4015gi1A2;
            } else {
                O90.f(cd, "typeAlias");
            }
        }
        if (interfaceC5925me1 == null || (enumC4015gi1O = interfaceC5925me1.O()) == null) {
            enumC4015gi1O = EnumC4015gi1.c;
        }
        if (enumC4015gi1O != enumC4015gi1A && enumC4015gi1O != (enumC4015gi1 = EnumC4015gi1.c)) {
            if (enumC4015gi1A == enumC4015gi1) {
                enumC4015gi1A = enumC4015gi1;
            } else {
                O90.f(cd, "typeAlias");
            }
        }
        p(abstractC0663Ig0B.getAnnotations(), abstractC1521Tg1L.getAnnotations());
        X01 x01I = AbstractC0112Be1.i(AbstractC8198yZ1.a(abstractC1521Tg1L), abstractC0663Ig0B.G());
        C0733Jd1 c0733Jd1B = abstractC0663Ig0B.B();
        if (!S8.b(x01I)) {
            if (S8.b(x01I)) {
                c0733Jd1B = x01I.B();
            } else {
                C0733Jd1 c0733Jd1B2 = x01I.B();
                c0733Jd1B.getClass();
                O90.f(c0733Jd1B2, "other");
                if (!c0733Jd1B.isEmpty() || !c0733Jd1B2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) C0733Jd1.b.b).values();
                    O90.e(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        L5 l5 = (L5) c0733Jd1B.a.get(iIntValue);
                        L5 l52 = (L5) c0733Jd1B2.a.get(iIntValue);
                        if (l5 != null) {
                            if (l52 != null) {
                                l5 = new L5(AbstractC7210tN1.b(l5.a, l52.a));
                            }
                            l52 = l5;
                        } else if (l52 == null) {
                            l52 = null;
                        } else if (l5 != null) {
                            l52 = new L5(AbstractC7210tN1.b(l52.a, l5.a));
                        }
                        AbstractC3970gT1.a(arrayList2, l52);
                    }
                    c0733Jd1B = CC0.J0(arrayList2);
                }
            }
            x01I = AbstractC8198yZ1.d(x01I, null, c0733Jd1B, 1);
        }
        return new C6962s41(x01I, enumC4015gi1A);
    }

    public X01 t(X01 x01, T71 t71, int i2) {
        InterfaceC1200Pd1 interfaceC1200Pd1E = x01.E();
        List listU = x01.u();
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(listU));
        int i3 = 0;
        for (Object obj : listU) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            AbstractC6689qe1 abstractC6689qe1 = (AbstractC6689qe1) obj;
            AbstractC6689qe1 abstractC6689qe1R = r(abstractC6689qe1, t71, (InterfaceC5925me1) interfaceC1200Pd1E.getParameters().get(i3), i2 + 1);
            if (!abstractC6689qe1R.c()) {
                abstractC6689qe1R = new C6962s41(AbstractC0112Be1.h(abstractC6689qe1R.b(), abstractC6689qe1.b().G()), abstractC6689qe1R.a());
            }
            arrayList.add(abstractC6689qe1R);
            i3 = i4;
        }
        return AbstractC8198yZ1.d(x01, arrayList, null, 2);
    }

    @Override // defpackage.InterfaceC1836Xh1
    public Object z(AbstractC8396zc0 abstractC8396zc0, float f2) {
        boolean z = abstractC8396zc0.U() == 1;
        if (z) {
            abstractC8396zc0.m();
        }
        float fD = (float) abstractC8396zc0.D();
        float fD2 = (float) abstractC8396zc0.D();
        while (abstractC8396zc0.x()) {
            abstractC8396zc0.d0();
        }
        if (z) {
            abstractC8396zc0.o();
        }
        return new C7233tV0((fD / 100.0f) * f2, (fD2 / 100.0f) * f2);
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.d.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.c0.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.Z.a();
                l.getClass();
                return l;
            default:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.r.a()).longValue());
        }
    }

    public C1538Tm0(C1155Oo1 c1155Oo1) {
        this.a = 14;
    }

    @Override // defpackage.WD0
    public void i(int i2, Serializable serializable) {
    }
}
