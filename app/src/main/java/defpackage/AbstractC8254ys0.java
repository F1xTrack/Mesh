package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ys0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8254ys0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

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
    public static final C5894mU0 a(Class cls) {
        C1922Yk0 c1922Yk0;
        InterfaceC6384p3 interfaceC6384p3I;
        InterfaceC7364uB0 interfaceC7364uB0I;
        int i = 26;
        int i2 = 0;
        ?? r3 = 0;
        ?? r32 = 0;
        O90.f(cls, "<this>");
        ClassLoader classLoaderD = VO0.d(cls);
        C0058Am1 c0058Am1 = new C0058Am1(classLoaderD);
        ?? r6 = a;
        WeakReference weakReference = (WeakReference) r6.get(c0058Am1);
        if (weakReference != null) {
            C5894mU0 c5894mU0 = (C5894mU0) weakReference.get();
            if (c5894mU0 != null) {
                return c5894mU0;
            }
            r6.remove(c0058Am1, weakReference);
        }
        C1562Tu0 c1562Tu0 = new C1562Tu0(i, classLoaderD);
        ClassLoader classLoader = C1518Tf1.class.getClassLoader();
        O90.e(classLoader, "getClassLoader(...)");
        C1562Tu0 c1562Tu02 = new C1562Tu0(i, classLoader);
        C1016Mu0 c1016Mu0 = new C1016Mu0(27, classLoaderD);
        String str = "runtime module for " + classLoaderD;
        S20 s20 = S20.e;
        C6518pl0 c6518pl0 = C6518pl0.h;
        O90.f(str, "moduleName");
        C1922Yk0 c1922Yk02 = new C1922Yk0("DeserializationComponentsForJava.ModuleData");
        EnumC1352Rc0[] enumC1352Rc0Arr = EnumC1352Rc0.a;
        C1586Uc0 c1586Uc0 = new C1586Uc0(c1922Yk02);
        C0231Cs0 c0231Cs0 = new C0231Cs0(C1559Tt0.g("<" + str + '>'), c1922Yk02, c1586Uc0, 56);
        V01 v01 = c1922Yk02.a;
        v01.lock();
        try {
            if (c1586Uc0.a != null) {
                c1922Yk0 = c1922Yk02;
                try {
                    throw new AssertionError("Built-ins module is already set: " + c1586Uc0.a + " (attempting to reset to " + c0231Cs0 + ")");
                } catch (Throwable th) {
                    th = th;
                    try {
                        c1922Yk0.b.getClass();
                        throw th;
                    } catch (Throwable th2) {
                        v01.unlock();
                        throw th2;
                    }
                }
            }
            c1586Uc0.a = c0231Cs0;
            v01.unlock();
            c1586Uc0.f = new C1508Tc0(c0231Cs0, i2);
            LI li = new LI();
            C5996n11 c5996n11 = new C5996n11((int) (r32 == true ? 1 : 0), (boolean) (r3 == true ? 1 : 0));
            T71 t71 = new T71(c1922Yk02, c0231Cs0);
            C0318Dv0 c0318Dv0 = C0318Dv0.e;
            C0162Bv0 c0162Bv0 = C0162Bv0.g;
            C0084Av0 c0084Av0 = C0084Av0.e;
            MN mn = MN.a;
            OL0 ol0 = new OL0(c1922Yk02);
            C0396Ev0 c0396Ev0 = C0396Ev0.h;
            C3759fN c3759fN = C3759fN.e;
            RP0 rp0 = new RP0(c0231Cs0, t71);
            C0058Am1 c0058Am12 = c0058Am1;
            C0024Ab0 c0024Ab0 = C0024Ab0.c;
            D5 d5 = new D5(c0024Ab0);
            ?? r34 = r6;
            C0240Cv0 c0240Cv0 = C0240Cv0.e;
            S20 s202 = new S20(21, new TE(16));
            C1538Tm0 c1538Tm0 = C1538Tm0.d;
            InterfaceC7693vv0.b.getClass();
            C7883wv0 c7883wv0 = C7502uv0.b;
            C0510Gh0 c0510Gh0 = new C0510Gh0(new C4375ib0(c1922Yk02, c1016Mu0, c1562Tu0, li, c0162Bv0, s20, c0084Av0, ol0, c6518pl0, c5996n11, c0318Dv0, c0396Ev0, c3759fN, c0231Cs0, rp0, d5, s202, c1538Tm0, c0240Cv0, c7883wv0, c0024Ab0, new OJ1(12)));
            C6112nd0 c6112nd0 = C6112nd0.g;
            O90.f(c6112nd0, "jvmMetadataVersion");
            N8 n8 = new N8(c1562Tu0, 14, li);
            U41 u41 = new U41();
            u41.a = c1562Tu0;
            u41.b = c1922Yk02.b(new C8277z(0, u41));
            u41.c = c0231Cs0;
            u41.d = t71;
            u41.e = new C3383dO1(c0231Cs0, t71);
            u41.f = C6112nd0.g;
            u41.f = c6112nd0;
            List listE = AbstractC8259yu.e(C3360dH.a);
            AbstractC8408zg0 abstractC8408zg0 = c0231Cs0.e;
            C1586Uc0 c1586Uc02 = abstractC8408zg0 instanceof C1586Uc0 ? (C1586Uc0) abstractC8408zg0 : null;
            C5396jt0 c5396jt0 = C5396jt0.d;
            if (c1586Uc02 == null || (interfaceC6384p3I = c1586Uc02.I()) == null) {
                interfaceC6384p3I = TE.c;
            }
            InterfaceC6384p3 interfaceC6384p3 = interfaceC6384p3I;
            if (c1586Uc02 == null || (interfaceC7364uB0I = c1586Uc02.I()) == null) {
                interfaceC7364uB0I = OJ1.d;
            }
            InterfaceC7364uB0 interfaceC7364uB0 = interfaceC7364uB0I;
            DR dr = C0732Jd0.a;
            OL0 ol02 = new OL0(c1922Yk02);
            OL0 ol03 = OL0.d;
            C7955xI c7955xI = new C7955xI(c1922Yk02, c0231Cs0, n8, u41, c0510Gh0, s20, c5396jt0, mn, t71, interfaceC6384p3, interfaceC7364uB0, dr, c7883wv0, ol02, listE, ol03);
            li.a = c7955xI;
            c5996n11.b = new C0481Fx1(c0510Gh0);
            C1976Zc0 c1976Zc0I = c1586Uc0.I();
            C1976Zc0 c1976Zc0I2 = c1586Uc0.I();
            OL0 ol04 = new OL0(c1922Yk02);
            O90.f(c1976Zc0I, "additionalClassPartsProvider");
            O90.f(c1976Zc0I2, "platformDependentDeclarationFilter");
            C2361bd0 c2361bd0 = new C2361bd0(c1922Yk02, c1562Tu02, c0231Cs0);
            G10 g10 = new G10(13, c2361bd0);
            C1372Rj c1372Rj = C1372Rj.m;
            c2361bd0.c = new C7955xI(c1922Yk02, c0231Cs0, g10, new ES1(c0231Cs0, t71, c1372Rj), c2361bd0, AbstractC8259yu.f(new C1294Qj(c1922Yk02, c0231Cs0), new C1274Qc0(c1922Yk02, c0231Cs0)), t71, c1976Zc0I, c1976Zc0I2, c1372Rj.a, c7883wv0, ol04, ol03, 262144);
            c0231Cs0.h = new C0481Fx1(J8.D(new C0231Cs0[]{c0231Cs0}));
            c0231Cs0.i = new C1798Wv(AbstractC8259yu.f(c0510Gh0, c2361bd0), "CompositeProvider@RuntimeModuleData for " + c0231Cs0);
            C5894mU0 c5894mU02 = new C5894mU0(c7955xI, new C5772lr0(li, c1562Tu0));
            while (true) {
                C0058Am1 c0058Am13 = c0058Am12;
                ?? r33 = r34;
                WeakReference weakReference2 = (WeakReference) r33.putIfAbsent(c0058Am13, new WeakReference(c5894mU02));
                if (weakReference2 == null) {
                    return c5894mU02;
                }
                C5894mU0 c5894mU03 = (C5894mU0) weakReference2.get();
                if (c5894mU03 != null) {
                    return c5894mU03;
                }
                r33.remove(c0058Am13, weakReference2);
                c0058Am12 = c0058Am13;
                r34 = r33;
            }
        } catch (Throwable th3) {
            th = th3;
            c1922Yk0 = c1922Yk02;
        }
    }
}
