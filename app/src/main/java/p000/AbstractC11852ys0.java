package p000;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ys0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11852ys0 {

    /* renamed from: a */
    public static final ConcurrentHashMap f46524a = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.concurrent.ConcurrentHashMap] */
    /* renamed from: a */
    public static final C10271mU0 m26268a(Class cls) {
        C8582Yk0 c8582Yk0;
        InterfaceC6593p3 interfaceC6593p3M8085I;
        InterfaceC11257uB0 interfaceC11257uB0M8085I;
        int i = 26;
        int i2 = 0;
        ?? r3 = 0;
        ?? r32 = 0;
        O90.m5968f(cls, "<this>");
        ClassLoader classLoaderM8436d = VO0.m8436d(cls);
        C7339Am1 c7339Am1 = new C7339Am1(classLoaderM8436d);
        ?? r6 = f46524a;
        WeakReference weakReference = (WeakReference) r6.get(c7339Am1);
        if (weakReference != null) {
            C10271mU0 c10271mU0 = (C10271mU0) weakReference.get();
            if (c10271mU0 != null) {
                return c10271mU0;
            }
            r6.remove(c7339Am1, weakReference);
        }
        C8342Tu0 c8342Tu0 = new C8342Tu0(i, classLoaderM8436d);
        ClassLoader classLoader = C8313Tf1.class.getClassLoader();
        O90.m5967e(classLoader, "getClassLoader(...)");
        C8342Tu0 c8342Tu02 = new C8342Tu0(i, classLoader);
        C7978Mu0 c7978Mu0 = new C7978Mu0(27, classLoaderM8436d);
        String str = "runtime module for " + classLoaderM8436d;
        S20 s20 = S20.f10542e;
        C10689pl0 c10689pl0 = C10689pl0.f40371h;
        O90.m5968f(str, "moduleName");
        C8582Yk0 c8582Yk02 = new C8582Yk0("DeserializationComponentsForJava.ModuleData");
        EnumC8202Rc0[] enumC8202Rc0Arr = EnumC8202Rc0.f10337a;
        C8358Uc0 c8358Uc0 = new C8358Uc0(c8582Yk02);
        C7454Cs0 c7454Cs0 = new C7454Cs0(C8340Tt0.m7800g("<" + str + '>'), c8582Yk02, c8358Uc0, 56);
        V01 v01 = c8582Yk02.f14498a;
        v01.lock();
        try {
            if (c8358Uc0.f46927a != null) {
                c8582Yk0 = c8582Yk02;
                try {
                    throw new AssertionError("Built-ins module is already set: " + c8358Uc0.f46927a + " (attempting to reset to " + c7454Cs0 + ")");
                } catch (Throwable th) {
                    th = th;
                    try {
                        c8582Yk0.f14499b.getClass();
                        throw th;
                    } catch (Throwable th2) {
                        v01.unlock();
                        throw th2;
                    }
                }
            }
            c8358Uc0.f46927a = c7454Cs0;
            v01.unlock();
            c8358Uc0.f11929f = new C8306Tc0(c7454Cs0, i2);
            C0712LI c0712li = new C0712LI();
            C10339n11 c10339n11 = new C10339n11((int) (r32 == true ? 1 : 0), (boolean) (r3 == true ? 1 : 0));
            T71 t71 = new T71(c8582Yk02, c7454Cs0);
            C7512Dv0 c7512Dv0 = C7512Dv0.f2302e;
            C7408Bv0 c7408Bv0 = C7408Bv0.f1082g;
            C7356Av0 c7356Av0 = C7356Av0.f465e;
            C0779MN c0779mn = C0779MN.f7117a;
            OL0 ol0 = new OL0(c8582Yk02);
            C7564Ev0 c7564Ev0 = C7564Ev0.f2965h;
            C4049fN c4049fN = C4049fN.f27160e;
            RP0 rp0 = new RP0(c7454Cs0, t71);
            C7339Am1 c7339Am12 = c7339Am1;
            C7316Ab0 c7316Ab0 = C7316Ab0.f269c;
            C0195D5 c0195d5 = new C0195D5(c7316Ab0);
            ?? r34 = r6;
            C7460Cv0 c7460Cv0 = C7460Cv0.f1755e;
            S20 s202 = new S20(21, new C1210TE(16));
            C8326Tm0 c8326Tm0 = C8326Tm0.f11507d;
            InterfaceC11477vv0.f44603b.getClass();
            C11604wv0 c11604wv0 = C11349uv0.f44021b;
            C7640Gh0 c7640Gh0 = new C7640Gh0(new C9773ib0(c8582Yk02, c7978Mu0, c8342Tu0, c0712li, c7408Bv0, s20, c7356Av0, ol0, c10689pl0, c10339n11, c7512Dv0, c7564Ev0, c4049fN, c7454Cs0, rp0, c0195d5, s202, c8326Tm0, c7460Cv0, c11604wv0, c7316Ab0, new OJ1(12)));
            C10417nd0 c10417nd0 = C10417nd0.f38414g;
            O90.m5968f(c10417nd0, "jvmMetadataVersion");
            C0827N8 c0827n8 = new C0827N8(c8342Tu0, 14, c0712li);
            U41 u41 = new U41();
            u41.f11644a = c8342Tu0;
            u41.f11645b = c8582Yk02.m9350b(new C7236z(0, u41));
            u41.f11646c = c7454Cs0;
            u41.f11647d = t71;
            u41.f11648e = new C9108dO1(c7454Cs0, t71);
            u41.f11649f = C10417nd0.f38414g;
            u41.f11649f = c10417nd0;
            List listM26274e = AbstractC7230yu.m26274e(C3918dH.f25929a);
            AbstractC11955zg0 abstractC11955zg0 = c7454Cs0.f1735e;
            C8358Uc0 c8358Uc02 = abstractC11955zg0 instanceof C8358Uc0 ? (C8358Uc0) abstractC11955zg0 : null;
            C9937jt0 c9937jt0 = C9937jt0.f35439d;
            if (c8358Uc02 == null || (interfaceC6593p3M8085I = c8358Uc02.m8085I()) == null) {
                interfaceC6593p3M8085I = C1210TE.f11208c;
            }
            InterfaceC6593p3 interfaceC6593p3 = interfaceC6593p3M8085I;
            if (c8358Uc02 == null || (interfaceC11257uB0M8085I = c8358Uc02.m8085I()) == null) {
                interfaceC11257uB0M8085I = OJ1.f8358d;
            }
            InterfaceC11257uB0 interfaceC11257uB0 = interfaceC11257uB0M8085I;
            C0217DR c0217dr = C7788Jd0.f5651a;
            OL0 ol02 = new OL0(c8582Yk02);
            OL0 ol03 = OL0.f8369d;
            C7129xI c7129xI = new C7129xI(c8582Yk02, c7454Cs0, c0827n8, u41, c7640Gh0, s20, c9937jt0, c0779mn, t71, interfaceC6593p3, interfaceC11257uB0, c0217dr, c11604wv0, ol02, listM26274e, ol03);
            c0712li.f6602a = c7129xI;
            c10339n11.f38046b = new C7621Fx1(c7640Gh0);
            C8618Zc0 c8618Zc0M8085I = c8358Uc0.m8085I();
            C8618Zc0 c8618Zc0M8085I2 = c8358Uc0.m8085I();
            OL0 ol04 = new OL0(c8582Yk02);
            O90.m5968f(c8618Zc0M8085I, "additionalClassPartsProvider");
            O90.m5968f(c8618Zc0M8085I2, "platformDependentDeclarationFilter");
            C8876bd0 c8876bd0 = new C8876bd0(c8582Yk02, c8342Tu02, c7454Cs0);
            G10 g10 = new G10(13, c8876bd0);
            C1115Rj c1115Rj = C1115Rj.f10401m;
            c8876bd0.f17099c = new C7129xI(c8582Yk02, c7454Cs0, g10, new ES1(c7454Cs0, t71, c1115Rj), c8876bd0, AbstractC7230yu.m26275f(new C1053Qj(c8582Yk02, c7454Cs0), new C8150Qc0(c8582Yk02, c7454Cs0)), t71, c8618Zc0M8085I, c8618Zc0M8085I2, c1115Rj.f40190a, c11604wv0, ol04, ol03, 262144);
            c7454Cs0.f1738h = new C7621Fx1(AbstractC0576J8.m4173D(new C7454Cs0[]{c7454Cs0}));
            c7454Cs0.f1739i = new C1442Wv(AbstractC7230yu.m26275f(c7640Gh0, c8876bd0), "CompositeProvider@RuntimeModuleData for " + c7454Cs0);
            C10271mU0 c10271mU02 = new C10271mU0(c7129xI, new C10189lr0(c0712li, c8342Tu0));
            while (true) {
                C7339Am1 c7339Am13 = c7339Am12;
                ?? r33 = r34;
                WeakReference weakReference2 = (WeakReference) r33.putIfAbsent(c7339Am13, new WeakReference(c10271mU02));
                if (weakReference2 == null) {
                    return c10271mU02;
                }
                C10271mU0 c10271mU03 = (C10271mU0) weakReference2.get();
                if (c10271mU03 != null) {
                    return c10271mU03;
                }
                r33.remove(c7339Am13, weakReference2);
                c7339Am12 = c7339Am13;
                r34 = r33;
            }
        } catch (Throwable th3) {
            th = th3;
            c8582Yk0 = c8582Yk02;
        }
    }
}
