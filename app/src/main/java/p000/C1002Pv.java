package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.components.ComponentRegistrar;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinVersion;

/* renamed from: Pv */
/* loaded from: classes.dex */
public final class C1002Pv implements InterfaceC0562Iv, InterfaceC9200e61, InterfaceC10864r61 {

    /* renamed from: h */
    public static final C0876Nv f9347h = new C0876Nv(0);

    /* renamed from: i */
    public static final byte[] f9348i = {0, 7, 8, 15};

    /* renamed from: j */
    public static final byte[] f9349j = {0, 119, -120, -1};

    /* renamed from: k */
    public static final byte[] f9350k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public Object f9351a;

    /* renamed from: b */
    public Object f9352b;

    /* renamed from: c */
    public Object f9353c;

    /* renamed from: d */
    public Object f9354d;

    /* renamed from: e */
    public Object f9355e;

    /* renamed from: f */
    public Object f9356f;

    /* renamed from: g */
    public Object f9357g;

    public /* synthetic */ C1002Pv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f9351a = obj;
        this.f9352b = obj2;
        this.f9353c = obj3;
        this.f9354d = obj4;
        this.f9355e = obj5;
        this.f9356f = obj6;
        this.f9357g = obj7;
    }

    /* renamed from: i */
    public static C1549Yc m6470i(C1549Yc c1549Yc, C4238iN c4238iN, C10030kb1 c10030kb1, Map map) {
        Map mapUnmodifiableMap;
        C1486Xc c1486XcM9323a = c1549Yc.m9323a();
        String strMo142f = ((InterfaceC0030AT) c4238iN.f29114c).mo142f();
        if (strMo142f != null) {
            c1486XcM9323a.f13872e = new C6375ld(strMo142f);
        }
        boolean zIsEmpty = map.isEmpty();
        C1338VG c1338vg = (C1338VG) c10030kb1.f36564d;
        if (zIsEmpty) {
            mapUnmodifiableMap = ((C11447vg0) ((AtomicMarkableReference) c1338vg.f12475c).getReference()).m25474a();
        } else {
            HashMap map2 = new HashMap(((C11447vg0) ((AtomicMarkableReference) c1338vg.f12475c).getReference()).m25474a());
            for (Map.Entry entry : map.entrySet()) {
                String strM25473b = C11447vg0.m25473b(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strM25473b)) {
                    map2.put(strM25473b, C11447vg0.m25473b(1024, (String) entry.getValue()));
                }
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(map2);
        }
        List listM6477r = m6477r(mapUnmodifiableMap);
        List listM6477r2 = m6477r(((C11447vg0) ((AtomicMarkableReference) ((C1338VG) c10030kb1.f36565e).f12475c).getReference()).m25474a());
        if (!listM6477r.isEmpty() || !listM6477r2.isEmpty()) {
            C1612Zc c1612Zc = c1549Yc.f14387c;
            c1486XcM9323a.f13870c = new C1612Zc(c1612Zc.f15012a, listM6477r, listM6477r2, c1612Zc.f15015d, c1612Zc.f15016e, c1612Zc.f15017f, c1612Zc.f15018g);
        }
        return c1486XcM9323a.m9098a();
    }

    /* renamed from: j */
    public static AbstractC0955PA m6471j(C1549Yc c1549Yc, C10030kb1 c10030kb1) {
        List listM22429a = ((C10141lT0) c10030kb1.f36566f).m22429a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM22429a.size(); i++) {
            AbstractC10013kT0 abstractC10013kT0 = (AbstractC10013kT0) listM22429a.get(i);
            abstractC10013kT0.getClass();
            C6438md c6438md = new C6438md();
            C6962ue c6962ue = (C6962ue) abstractC10013kT0;
            String str = c6962ue.f43784e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = c6962ue.f43781b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c6438md.f37793a = new C6564od(str2, str);
            String str3 = c6962ue.f43782c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c6438md.f37794b = str3;
            String str4 = c6962ue.f43783d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c6438md.f37795c = str4;
            c6438md.f37796d = c6962ue.f43785f;
            c6438md.f37797e = (byte) (c6438md.f37797e | 1);
            arrayList.add(c6438md.m22906a());
        }
        if (arrayList.isEmpty()) {
            return c1549Yc;
        }
        C1486Xc c1486XcM9323a = c1549Yc.m9323a();
        c1486XcM9323a.f13873f = new C6629pd(arrayList);
        return c1486XcM9323a.m9098a();
    }

    /* renamed from: k */
    public static byte[] m6472k(int i, int i2, C0683Kq c0683Kq) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c0683Kq.m4752l(i2);
        }
        return bArr;
    }

    /* renamed from: l */
    public static C1002Pv m6473l(Context context, Y50 y50, C0471HT c0471ht, C0197D7 c0197d7, C4238iN c4238iN, C10030kb1 c10030kb1, ES1 es1, C1361Vd c1361Vd, C4238iN c4238iN2, C6220jA c6220jA, C10910rT1 c10910rT1) {
        C1269UA c1269ua = new C1269UA(context, y50, c0197d7, es1, c1361Vd);
        C1458XA c1458xa = new C1458XA(c0471ht, c1361Vd, c6220jA);
        C1395WA c1395wa = C6223jD.f34974b;
        C8877bd1.m10476b(context);
        return new C1002Pv(c1269ua, c1458xa, new C6223jD(new C10265mR0(C8877bd1.m10475a().m10477c(new C0928Ok(C6223jD.f34975c, C6223jD.f34976d)).m8089a("FIREBASE_CRASHLYTICS_REPORT", new C7135xO("json"), C6223jD.f34977e), c1361Vd.m8521g(), c4238iN2)), c4238iN, c10030kb1, y50, c10910rT1);
    }

    /* renamed from: o */
    public static int[] m6474o() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m6476q(KotlinVersion.MAX_COMPONENT_VALUE, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m6476q(KotlinVersion.MAX_COMPONENT_VALUE, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: p */
    public static int[] m6475p() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m6476q(63, i3, i4, i2);
            } else {
                int i5 = i & ModuleDescriptor.MODULE_VERSION;
                if (i5 == 0) {
                    iArr[i] = m6476q(KotlinVersion.MAX_COMPONENT_VALUE, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 8) {
                    iArr[i] = m6476q(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 128) {
                    iArr[i] = m6476q(KotlinVersion.MAX_COMPONENT_VALUE, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i5 == 136) {
                    iArr[i] = m6476q(KotlinVersion.MAX_COMPONENT_VALUE, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: q */
    public static int m6476q(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: r */
    public static List m6477r(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C0920Oc(str, str2));
        }
        Collections.sort(arrayList, new C0295Eg(18));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0224 A[LOOP:3: B:231:0x0172->B:260:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x021f A[SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m6478t(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1002Pv.m6478t(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: u */
    public static C6818sM m6479u(C0683Kq c0683Kq, int i) {
        int iM4752l;
        int i2;
        int iM4752l2;
        int iM4752l3;
        int iM4752l4;
        int i3 = 8;
        int iM4752l5 = c0683Kq.m4752l(8);
        c0683Kq.m4763w(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrM6474o = m6474o();
        int[] iArrM6475p = m6475p();
        while (i5 > 0) {
            int iM4752l6 = c0683Kq.m4752l(i3);
            int iM4752l7 = c0683Kq.m4752l(i3);
            int[] iArr2 = (iM4752l7 & 128) != 0 ? iArr : (iM4752l7 & 64) != 0 ? iArrM6474o : iArrM6475p;
            if ((iM4752l7 & 1) != 0) {
                iM4752l3 = c0683Kq.m4752l(i3);
                iM4752l4 = c0683Kq.m4752l(i3);
                iM4752l = c0683Kq.m4752l(i3);
                iM4752l2 = c0683Kq.m4752l(i3);
                i2 = i5 - 6;
            } else {
                int iM4752l8 = c0683Kq.m4752l(6) << i4;
                int iM4752l9 = c0683Kq.m4752l(4) << 4;
                iM4752l = c0683Kq.m4752l(4) << 4;
                i2 = i5 - 4;
                iM4752l2 = c0683Kq.m4752l(i4) << 6;
                iM4752l3 = iM4752l8;
                iM4752l4 = iM4752l9;
            }
            if (iM4752l3 == 0) {
                iM4752l4 = i6;
                iM4752l = iM4752l4;
                iM4752l2 = 255;
            }
            double d = iM4752l3;
            double d2 = iM4752l4 - 128;
            double d3 = iM4752l - 128;
            iArr2[iM4752l6] = m6476q((byte) (255 - (iM4752l2 & KotlinVersion.MAX_COMPONENT_VALUE)), AbstractC7485Dh1.m1825j((int) ((1.402d * d2) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE), AbstractC7485Dh1.m1825j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), AbstractC7485Dh1.m1825j((int) ((d3 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i5 = i2;
            i6 = 0;
            iM4752l5 = iM4752l5;
            iArrM6475p = iArrM6475p;
            i3 = 8;
            i4 = 2;
        }
        return new C6818sM(iM4752l5, iArr, iArrM6474o, iArrM6475p);
    }

    /* renamed from: v */
    public static C6944uM m6480v(C0683Kq c0683Kq) {
        byte[] bArr;
        int iM4752l = c0683Kq.m4752l(16);
        c0683Kq.m4763w(4);
        int iM4752l2 = c0683Kq.m4752l(2);
        boolean zM4751k = c0683Kq.m4751k();
        c0683Kq.m4763w(1);
        byte[] bArr2 = AbstractC7485Dh1.f2171f;
        if (iM4752l2 != 1) {
            if (iM4752l2 == 0) {
                int iM4752l3 = c0683Kq.m4752l(16);
                int iM4752l4 = c0683Kq.m4752l(16);
                if (iM4752l3 > 0) {
                    bArr2 = new byte[iM4752l3];
                    c0683Kq.m4755o(iM4752l3, bArr2);
                }
                if (iM4752l4 > 0) {
                    bArr = new byte[iM4752l4];
                    c0683Kq.m4755o(iM4752l4, bArr);
                }
            }
            return new C6944uM(iM4752l, zM4751k, bArr2, bArr);
        }
        c0683Kq.m4763w(c0683Kq.m4752l(8) * 16);
        bArr = bArr2;
        return new C6944uM(iM4752l, zM4751k, bArr2, bArr);
    }

    /* renamed from: A */
    public C9450g32 m6481A(ExecutorC1584ZA executorC1584ZA, String str) {
        S81 s81;
        ArrayList arrayListM8942b = ((C1458XA) this.f9352b).m8942b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM8942b.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C1395WA c1395wa = C1458XA.f13586g;
                String strM8940e = C1458XA.m8940e(file);
                c1395wa.getClass();
                arrayList.add(new C0669Kc(C1395WA.m8699i(strM8940e), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0669Kc c0669Kc = (C0669Kc) it2.next();
            if (str == null || str.equals(c0669Kc.f6224b)) {
                C6223jD c6223jD = (C6223jD) this.f9353c;
                C0606Jc c0606Jc = c0669Kc.f6223a;
                if (c0606Jc.f5630f == null || c0606Jc.f5631g == null) {
                    C1226TU c1226tuM9218b = ((Y50) this.f9356f).m9218b(true);
                    C0543Ic c0543IcM4358a = c0669Kc.f6223a.m4358a();
                    c0543IcM4358a.f5033e = c1226tuM9218b.f11394a;
                    C0543Ic c0543IcM4358a2 = c0543IcM4358a.m3953a().m4358a();
                    c0543IcM4358a2.f5034f = c1226tuM9218b.f11395b;
                    c0669Kc = new C0669Kc(c0543IcM4358a2.m3953a(), c0669Kc.f6224b, c0669Kc.f6225c);
                }
                boolean z = str != null;
                C10265mR0 c10265mR0 = c6223jD.f34978a;
                synchronized (c10265mR0.f37703f) {
                    try {
                        s81 = new S81();
                        if (z) {
                            ((AtomicInteger) c10265mR0.f37706i.f29113b).getAndIncrement();
                            if (c10265mR0.f37703f.size() < c10265mR0.f37702e) {
                                c10265mR0.f37703f.size();
                                c10265mR0.f37704g.execute(new RunnableC1192Sx(c10265mR0, c0669Kc, s81, 13, false));
                                s81.m7186d(c0669Kc);
                            } else {
                                c10265mR0.m22826a();
                                ((AtomicInteger) c10265mR0.f37706i.f29114c).getAndIncrement();
                                s81.m7186d(c0669Kc);
                            }
                        } else {
                            c10265mR0.m22827b(c0669Kc, s81);
                        }
                    } finally {
                    }
                }
                arrayList2.add(s81.f10598a.mo11139f(executorC1584ZA, new C8450Vw0(15, this)));
            }
        }
        return AbstractC9376fU1.m18246g(arrayList2);
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public int mo4559G() {
        return 2;
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: a */
    public Object mo4066a(Class cls) {
        return mo4071h(C11011sG0.m24687a(cls));
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: b */
    public Set mo4067b(C11011sG0 c11011sG0) {
        InterfaceC9347fG0 interfaceC9347fG0;
        synchronized (this) {
            interfaceC9347fG0 = (C8628Zh0) ((HashMap) this.f9353c).get(c11011sG0);
            if (interfaceC9347fG0 == null) {
                interfaceC9347fG0 = f9347h;
            }
        }
        return (Set) interfaceC9347fG0.get();
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: c */
    public InterfaceC9347fG0 mo4068c(Class cls) {
        return mo4070f(C11011sG0.m24687a(cls));
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: d */
    public void mo4560d() {
        C7196yM c7196yM = (C7196yM) this.f9356f;
        ((SparseArray) c7196yM.f46223c).clear();
        ((SparseArray) c7196yM.f46224d).clear();
        ((SparseArray) c7196yM.f46225e).clear();
        ((SparseArray) c7196yM.f46226f).clear();
        ((SparseArray) c7196yM.f46227g).clear();
        c7196yM.f46228h = null;
        c7196yM.f46229i = null;
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: e */
    public C7466Cy0 mo4069e(C11011sG0 c11011sG0) {
        InterfaceC9347fG0 interfaceC9347fG0Mo4070f = mo4070f(c11011sG0);
        return interfaceC9347fG0Mo4070f == null ? new C7466Cy0(C7466Cy0.f1784c, C7466Cy0.f1785d) : interfaceC9347fG0Mo4070f instanceof C7466Cy0 ? (C7466Cy0) interfaceC9347fG0Mo4070f : new C7466Cy0(null, interfaceC9347fG0Mo4070f);
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: f */
    public synchronized InterfaceC9347fG0 mo4070f(C11011sG0 c11011sG0) {
        RL1.m7000a(c11011sG0, "Null interface requested.");
        return (InterfaceC9347fG0) ((HashMap) this.f9352b).get(c11011sG0);
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: g */
    public /* synthetic */ U51 mo4561g(byte[] bArr, int i, int i2) {
        return AbstractC11153tN0.m24896h(this, bArr, i2);
    }

    @Override // p000.InterfaceC10864r61, javax.inject.Provider
    public Object get() {
        C7276zd c7276zd = (C7276zd) this.f9355e;
        int i = c7276zd.f46902d;
        Range range = Z61.f14736p;
        Range range2 = (Range) this.f9357g;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(i))).intValue() : i;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(i);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj);
        AbstractC7806Jm0.m4412f("VidEncVdPrflRslvr");
        AbstractC7806Jm0.m4412f("VidEncVdPrflRslvr");
        Range range3 = ((C1551Ye) this.f9353c).f14411c;
        AbstractC7806Jm0.m4412f("VidEncVdPrflRslvr");
        int i2 = ((C0149CM) this.f9356f).f1337b;
        Size size = (Size) this.f9354d;
        int iM8127c = AbstractC8371Ui1.m8127c(c7276zd.f46901c, i2, c7276zd.f46906h, iIntValue, c7276zd.f46902d, size.getWidth(), c7276zd.f46903e, size.getHeight(), c7276zd.f46904f, range3);
        String str = (String) this.f9351a;
        int i3 = c7276zd.f46905g;
        C1425We c1425WeM8125a = AbstractC8371Ui1.m8125a(i3, str);
        C1361Vd c1361VdM8525d = C1362Ve.m8525d();
        c1361VdM8525d.f12660a = str;
        EnumC11690xa1 enumC11690xa1 = (EnumC11690xa1) this.f9352b;
        if (enumC11690xa1 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c1361VdM8525d.f12662c = enumC11690xa1;
        c1361VdM8525d.f12663d = size;
        c1361VdM8525d.f12668i = Integer.valueOf(iM8127c);
        c1361VdM8525d.f12666g = Integer.valueOf(iIntValue);
        c1361VdM8525d.f12661b = Integer.valueOf(i3);
        c1361VdM8525d.f12665f = c1425WeM8125a;
        return c1361VdM8525d.m8516a();
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: h */
    public Object mo4071h(C11011sG0 c11011sG0) {
        InterfaceC9347fG0 interfaceC9347fG0Mo4070f = mo4070f(c11011sG0);
        if (interfaceC9347fG0Mo4070f == null) {
            return null;
        }
        return interfaceC9347fG0Mo4070f.get();
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: m */
    public void mo4562m(byte[] bArr, int i, int i2, C9072d61 c9072d61, InterfaceC6587oy interfaceC6587oy) {
        C7196yM c7196yM;
        C7122xB c7122xB;
        int i3;
        char c;
        int i4;
        C6881tM c6881tM;
        ArrayList arrayList;
        int i5;
        C7196yM c7196yM2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C7070wM c7070wM;
        C7070wM c7070wM2;
        int i11;
        int iM4752l;
        int i12;
        int i13;
        int i14 = 8;
        C0683Kq c0683Kq = new C0683Kq(bArr, i + i2);
        c0683Kq.m4760t(i);
        while (true) {
            int iM4743c = c0683Kq.m4743c();
            c7196yM = (C7196yM) this.f9356f;
            if (iM4743c >= 48 && c0683Kq.m4752l(i14) == 15) {
                int iM4752l2 = c0683Kq.m4752l(i14);
                int i15 = 16;
                int iM4752l3 = c0683Kq.m4752l(16);
                int iM4752l4 = c0683Kq.m4752l(16);
                int iM4749i = c0683Kq.m4749i() + iM4752l4;
                if (iM4752l4 * 8 > c0683Kq.m4743c()) {
                    AbstractC10872rA1.m24175h("Data field length exceeds limit");
                    c0683Kq.m4763w(c0683Kq.m4743c());
                } else {
                    switch (iM4752l2) {
                        case 16:
                            if (iM4752l3 == c7196yM.f46221a) {
                                C9817ix0 c9817ix0 = (C9817ix0) c7196yM.f46229i;
                                c0683Kq.m4752l(i14);
                                int iM4752l5 = c0683Kq.m4752l(4);
                                int iM4752l6 = c0683Kq.m4752l(2);
                                c0683Kq.m4763w(2);
                                int i16 = iM4752l4 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i16 > 0) {
                                    int iM4752l7 = c0683Kq.m4752l(i14);
                                    c0683Kq.m4763w(i14);
                                    i16 -= 6;
                                    sparseArray.put(iM4752l7, new C7007vM(c0683Kq.m4752l(16), c0683Kq.m4752l(16)));
                                    i14 = 8;
                                }
                                C9817ix0 c9817ix02 = new C9817ix0(iM4752l5, iM4752l6, sparseArray);
                                if (iM4752l6 == 0) {
                                    if (c9817ix0 != null && c9817ix0.f34814a != iM4752l5) {
                                        c7196yM.f46229i = c9817ix02;
                                        break;
                                    }
                                } else {
                                    c7196yM.f46229i = c9817ix02;
                                    ((SparseArray) c7196yM.f46223c).clear();
                                    ((SparseArray) c7196yM.f46224d).clear();
                                    ((SparseArray) c7196yM.f46225e).clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C9817ix0 c9817ix03 = (C9817ix0) c7196yM.f46229i;
                            if (iM4752l3 == c7196yM.f46221a && c9817ix03 != null) {
                                int iM4752l8 = c0683Kq.m4752l(i14);
                                c0683Kq.m4763w(4);
                                boolean zM4751k = c0683Kq.m4751k();
                                c0683Kq.m4763w(3);
                                int iM4752l9 = c0683Kq.m4752l(16);
                                int iM4752l10 = c0683Kq.m4752l(16);
                                c0683Kq.m4752l(3);
                                int iM4752l11 = c0683Kq.m4752l(3);
                                c0683Kq.m4763w(2);
                                int iM4752l12 = c0683Kq.m4752l(i14);
                                int iM4752l13 = c0683Kq.m4752l(i14);
                                int iM4752l14 = c0683Kq.m4752l(4);
                                int iM4752l15 = c0683Kq.m4752l(2);
                                c0683Kq.m4763w(2);
                                int i17 = iM4752l4 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i17 > 0) {
                                    int iM4752l16 = c0683Kq.m4752l(i15);
                                    int iM4752l17 = c0683Kq.m4752l(2);
                                    c0683Kq.m4752l(2);
                                    int iM4752l18 = c0683Kq.m4752l(12);
                                    c0683Kq.m4763w(4);
                                    int iM4752l19 = c0683Kq.m4752l(12);
                                    int i18 = i17 - 6;
                                    if (iM4752l17 == 1 || iM4752l17 == 2) {
                                        c0683Kq.m4752l(i14);
                                        c0683Kq.m4752l(i14);
                                        i17 -= 8;
                                    } else {
                                        i17 = i18;
                                    }
                                    sparseArray2.put(iM4752l16, new C7133xM(iM4752l18, iM4752l19));
                                    i15 = 16;
                                }
                                C7070wM c7070wM3 = new C7070wM(iM4752l8, zM4751k, iM4752l9, iM4752l10, iM4752l11, iM4752l12, iM4752l13, iM4752l14, iM4752l15, sparseArray2);
                                SparseArray sparseArray3 = (SparseArray) c7196yM.f46223c;
                                if (c9817ix03.f34815b == 0 && (c7070wM2 = (C7070wM) sparseArray3.get(iM4752l8)) != null) {
                                    int i19 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c7070wM2.f44840j;
                                        if (i19 < sparseArray4.size()) {
                                            c7070wM3.f44840j.put(sparseArray4.keyAt(i19), (C7133xM) sparseArray4.valueAt(i19));
                                            i19++;
                                        }
                                    }
                                }
                                sparseArray3.put(c7070wM3.f44831a, c7070wM3);
                                break;
                            }
                            break;
                        case 18:
                            if (iM4752l3 != c7196yM.f46221a) {
                                if (iM4752l3 == c7196yM.f46222b) {
                                    C6818sM c6818sMM6479u = m6479u(c0683Kq, iM4752l4);
                                    ((SparseArray) c7196yM.f46226f).put(c6818sMM6479u.f42374a, c6818sMM6479u);
                                    break;
                                }
                            } else {
                                C6818sM c6818sMM6479u2 = m6479u(c0683Kq, iM4752l4);
                                ((SparseArray) c7196yM.f46224d).put(c6818sMM6479u2.f42374a, c6818sMM6479u2);
                                break;
                            }
                            break;
                        case 19:
                            if (iM4752l3 != c7196yM.f46221a) {
                                if (iM4752l3 == c7196yM.f46222b) {
                                    C6944uM c6944uMM6480v = m6480v(c0683Kq);
                                    ((SparseArray) c7196yM.f46227g).put(c6944uMM6480v.f43679a, c6944uMM6480v);
                                    break;
                                }
                            } else {
                                C6944uM c6944uMM6480v2 = m6480v(c0683Kq);
                                ((SparseArray) c7196yM.f46225e).put(c6944uMM6480v2.f43679a, c6944uMM6480v2);
                                break;
                            }
                            break;
                        case 20:
                            if (iM4752l3 == c7196yM.f46221a) {
                                c0683Kq.m4763w(4);
                                boolean zM4751k2 = c0683Kq.m4751k();
                                c0683Kq.m4763w(3);
                                int iM4752l20 = c0683Kq.m4752l(16);
                                int iM4752l21 = c0683Kq.m4752l(16);
                                if (zM4751k2) {
                                    int iM4752l22 = c0683Kq.m4752l(16);
                                    int iM4752l23 = c0683Kq.m4752l(16);
                                    int iM4752l24 = c0683Kq.m4752l(16);
                                    i11 = iM4752l23;
                                    iM4752l = c0683Kq.m4752l(16);
                                    i13 = iM4752l24;
                                    i12 = iM4752l22;
                                } else {
                                    i11 = iM4752l20;
                                    iM4752l = iM4752l21;
                                    i12 = 0;
                                    i13 = 0;
                                }
                                c7196yM.f46228h = new C6881tM(iM4752l20, iM4752l21, i12, i11, i13, iM4752l);
                                break;
                            }
                            break;
                    }
                    c0683Kq.m4764x(iM4749i - c0683Kq.m4749i());
                }
                i14 = 8;
            }
        }
        C9817ix0 c9817ix04 = (C9817ix0) c7196yM.f46229i;
        if (c9817ix04 == null) {
            N70 n70 = P70.f8867b;
            c7122xB = new C7122xB(C9367fQ0.f27184e, -9223372036854775807L, -9223372036854775807L);
        } else {
            C6881tM c6881tM2 = (C6881tM) c7196yM.f46228h;
            if (c6881tM2 == null) {
                c6881tM2 = (C6881tM) this.f9354d;
            }
            Bitmap bitmap = (Bitmap) this.f9357g;
            Canvas canvas = (Canvas) this.f9353c;
            if (bitmap == null || c6881tM2.f43030a + 1 != bitmap.getWidth() || c6881tM2.f43031b + 1 != ((Bitmap) this.f9357g).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c6881tM2.f43030a + 1, c6881tM2.f43031b + 1, Bitmap.Config.ARGB_8888);
                this.f9357g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i20 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c9817ix04.f34816c;
                if (i20 < sparseArray5.size()) {
                    canvas.save();
                    C7007vM c7007vM = (C7007vM) sparseArray5.valueAt(i20);
                    C7070wM c7070wM4 = (C7070wM) ((SparseArray) c7196yM.f46223c).get(sparseArray5.keyAt(i20));
                    int i21 = c7007vM.f44344a + c6881tM2.f43032c;
                    int i22 = c7007vM.f44345b + c6881tM2.f43034e;
                    int iMin = Math.min(c7070wM4.f44833c + i21, c6881tM2.f43033d);
                    int i23 = c7070wM4.f44834d;
                    int i24 = i22 + i23;
                    canvas.clipRect(i21, i22, iMin, Math.min(i24, c6881tM2.f43035f));
                    SparseArray sparseArray6 = (SparseArray) c7196yM.f46224d;
                    int i25 = c7070wM4.f44836f;
                    C6818sM c6818sM = (C6818sM) sparseArray6.get(i25);
                    if (c6818sM == null && (c6818sM = (C6818sM) ((SparseArray) c7196yM.f46226f).get(i25)) == null) {
                        c6818sM = (C6818sM) this.f9355e;
                    }
                    int i26 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c7070wM4.f44840j;
                        if (i26 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i26);
                            C7133xM c7133xM = (C7133xM) sparseArray7.valueAt(i26);
                            C9817ix0 c9817ix05 = c9817ix04;
                            C6944uM c6944uM = (C6944uM) ((SparseArray) c7196yM.f46225e).get(iKeyAt);
                            if (c6944uM == null) {
                                c6944uM = (C6944uM) ((SparseArray) c7196yM.f46227g).get(iKeyAt);
                            }
                            if (c6944uM != null) {
                                Paint paint = c6944uM.f43680b ? null : (Paint) this.f9351a;
                                c7196yM2 = c7196yM;
                                int i27 = c7133xM.f45556a + i21;
                                int i28 = c7133xM.f45557b + i22;
                                i5 = i20;
                                int i29 = c7070wM4.f44835e;
                                int i30 = i26;
                                int[] iArr = i29 == 3 ? c6818sM.f42377d : i29 == 2 ? c6818sM.f42376c : c6818sM.f42375b;
                                i6 = i30;
                                arrayList = arrayList2;
                                c6881tM = c6881tM2;
                                i8 = i23;
                                i7 = i24;
                                i10 = i21;
                                i9 = i22;
                                c7070wM = c7070wM4;
                                Paint paint2 = paint;
                                m6478t(c6944uM.f43681c, iArr, i29, i27, i28, paint2, canvas);
                                m6478t(c6944uM.f43682d, iArr, i29, i27, i28 + 1, paint2, canvas);
                            } else {
                                c6881tM = c6881tM2;
                                arrayList = arrayList2;
                                i5 = i20;
                                c7196yM2 = c7196yM;
                                i6 = i26;
                                i7 = i24;
                                i8 = i23;
                                i9 = i22;
                                i10 = i21;
                                c7070wM = c7070wM4;
                            }
                            i26 = i6 + 1;
                            c9817ix04 = c9817ix05;
                            c7070wM4 = c7070wM;
                            i21 = i10;
                            c7196yM = c7196yM2;
                            i20 = i5;
                            arrayList2 = arrayList;
                            c6881tM2 = c6881tM;
                            i23 = i8;
                            i24 = i7;
                            i22 = i9;
                        } else {
                            C9817ix0 c9817ix06 = c9817ix04;
                            C6881tM c6881tM3 = c6881tM2;
                            ArrayList arrayList3 = arrayList2;
                            int i31 = i20;
                            C7196yM c7196yM3 = c7196yM;
                            int i32 = i24;
                            int i33 = i23;
                            int i34 = i22;
                            int i35 = i21;
                            C7070wM c7070wM5 = c7070wM4;
                            boolean z = c7070wM5.f44832b;
                            int i36 = c7070wM5.f44833c;
                            if (z) {
                                int i37 = c7070wM5.f44835e;
                                if (i37 == 3) {
                                    i4 = c6818sM.f42377d[c7070wM5.f44837g];
                                    c = 2;
                                } else {
                                    c = 2;
                                    i4 = i37 == 2 ? c6818sM.f42376c[c7070wM5.f44838h] : c6818sM.f42375b[c7070wM5.f44839i];
                                }
                                Paint paint3 = (Paint) this.f9352b;
                                paint3.setColor(i4);
                                i3 = i34;
                                canvas.drawRect(i35, i3, i35 + i36, i32, paint3);
                            } else {
                                i3 = i34;
                                c = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.f9357g, i35, i3, i36, i33);
                            float f = c6881tM3.f43030a;
                            float f2 = c6881tM3.f43031b;
                            arrayList3.add(new C6933uB(null, null, null, bitmapCreateBitmap2, i3 / f2, 0, 0, i35 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i36 / f, i33 / f2, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            c7196yM = c7196yM3;
                            i20 = i31 + 1;
                            c9817ix04 = c9817ix06;
                            arrayList2 = arrayList3;
                            c6881tM2 = c6881tM3;
                        }
                    }
                } else {
                    c7122xB = new C7122xB(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC6587oy.mo4000b(c7122xB);
    }

    /* renamed from: n */
    public void m6482n(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C6853sv c6853sv = (C6853sv) entry.getKey();
            InterfaceC9347fG0 interfaceC9347fG0 = (InterfaceC9347fG0) entry.getValue();
            int i = c6853sv.f42722d;
            if (i == 1 || (i == 2 && z)) {
                interfaceC9347fG0.get();
            }
        }
        C6821sP c6821sP = (C6821sP) this.f9355e;
        synchronized (c6821sP) {
            arrayDeque = c6821sP.f42419b;
            if (arrayDeque != null) {
                c6821sP.f42419b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                c6821sP.mo5003a((C6487nP) it.next());
            }
        }
    }

    /* renamed from: s */
    public void m6483s(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f9356f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.f9351a);
        }
        m6482n(map, z);
    }

    /* renamed from: w */
    public void m6484w(Throwable th, Thread thread, String str, final C0781MP c0781mp, boolean z) {
        ES1 es1;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        ES1 es12;
        final boolean zEquals = str.equals(CrashHianalyticsData.EVENT_ID_CRASH);
        C1269UA c1269ua = (C1269UA) this.f9351a;
        Context context = c1269ua.f11666a;
        int i = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        C10919rY0 c10919rY0 = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            es1 = c1269ua.f11669d;
            if (zIsEmpty) {
                break;
            }
            Throwable th2 = (Throwable) stack.pop();
            c10919rY0 = new C10919rY0(th2.getLocalizedMessage(), th2.getClass().getName(), es1.mo1462E(th2.getStackTrace()), c10919rY0, 16);
        }
        C1486Xc c1486Xc = new C1486Xc();
        c1486Xc.f13869b = str;
        c1486Xc.f13868a = c0781mp.f7145b;
        c1486Xc.f13874g = (byte) (c1486Xc.f13874g | 1);
        AbstractC0515IA abstractC0515IAM25318z = C11370v32.f44127f.m25318z(context);
        int i2 = ((C4254id) abstractC0515IAM25318z).f29374c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListM25316y = C11370v32.m25316y(context);
        byte b = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c10919rY0.f41730d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b2 = (byte) 1;
        List listM7922d = C1269UA.m7922d(stackTraceElementArr, 4);
        if (listM7922d == null) {
            throw new NullPointerException("Null frames");
        }
        if (b2 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b2 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
        }
        arrayList.add(new C4002ed(4, name, listM7922d));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    es12 = es1;
                } else {
                    StackTraceElement[] stackTraceElementArrMo1462E = es1.mo1462E(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List listM7922d2 = C1269UA.m7922d(stackTraceElementArrMo1462E, 0);
                    if (listM7922d2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b2 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        if (b2 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb2, "Missing required properties:"));
                    }
                    es12 = es1;
                    arrayList.add(new C4002ed(0, name2, listM7922d2));
                }
                it2 = it;
                es1 = es12;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C1859cd c1859cdM7921c = C1269UA.m7921c(c10919rY0, 0);
        C3940dd c3940ddM7923e = C1269UA.m7923e();
        List listM7924a = c1269ua.m7924a();
        if (listM7924a == null) {
            throw new NullPointerException("Null binaries");
        }
        C1676ad c1676ad = new C1676ad(listUnmodifiableList, c1859cdM7921c, null, c3940ddM7923e, listM7924a);
        if (b != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(AbstractC1374Vq.m8592k(sb3, "Missing required properties:"));
        }
        c1486Xc.f13870c = new C1612Zc(c1676ad, null, null, boolValueOf, abstractC0515IAM25318z, arrayListM25316y, i);
        c1486Xc.f13871d = c1269ua.m7925b(i);
        C1549Yc c1549YcM9098a = c1486Xc.m9098a();
        C4238iN c4238iN = (C4238iN) this.f9354d;
        C10030kb1 c10030kb1 = (C10030kb1) this.f9355e;
        final AbstractC0955PA abstractC0955PAM6471j = m6471j(m6470i(c1549YcM9098a, c4238iN, c10030kb1, c0781mp.f7146c), c10030kb1);
        if (z) {
            ((C1458XA) this.f9352b).m8944d(abstractC0955PAM6471j, c0781mp.f7144a, zEquals);
        } else {
            ((ExecutorC1584ZA) ((C10910rT1) this.f9357g).f41679c).m9502a(new Runnable() { // from class: iZ0
                @Override // java.lang.Runnable
                public final void run() {
                    C1002Pv c1002Pv = this.f29319a;
                    c1002Pv.getClass();
                    ((C1458XA) c1002Pv.f9352b).m8944d(abstractC0955PAM6471j, c0781mp.f7144a, zEquals);
                }
            });
        }
    }

    /* renamed from: x */
    public void m6485x() {
        for (C6853sv c6853sv : ((HashMap) this.f9351a).keySet()) {
            for (C1087RH c1087rh : c6853sv.f42721c) {
                boolean z = c1087rh.f10105b == 2;
                C11011sG0 c11011sG0 = c1087rh.f10104a;
                if (z) {
                    HashMap map = (HashMap) this.f9353c;
                    if (!map.containsKey(c11011sG0)) {
                        Set setEmptySet = Collections.emptySet();
                        C8628Zh0 c8628Zh0 = new C8628Zh0();
                        c8628Zh0.f15095b = null;
                        c8628Zh0.f15094a = Collections.newSetFromMap(new ConcurrentHashMap());
                        c8628Zh0.f15094a.addAll(setEmptySet);
                        map.put(c11011sG0, c8628Zh0);
                    }
                }
                HashMap map2 = (HashMap) this.f9352b;
                if (map2.containsKey(c11011sG0)) {
                    continue;
                } else {
                    int i = c1087rh.f10105b;
                    if (i == 1) {
                        throw new C1213TH("Unsatisfied dependency for component " + c6853sv + ": " + c11011sG0);
                    }
                    if (i != 2) {
                        map2.put(c11011sG0, new C7466Cy0(C7466Cy0.f1784c, C7466Cy0.f1785d));
                    }
                }
            }
        }
    }

    /* renamed from: y */
    public ArrayList m6486y(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6853sv c6853sv = (C6853sv) it.next();
            if (c6853sv.f42723e == 0) {
                InterfaceC9347fG0 interfaceC9347fG0 = (InterfaceC9347fG0) ((HashMap) this.f9351a).get(c6853sv);
                for (C11011sG0 c11011sG0 : c6853sv.f42720b) {
                    HashMap map = (HashMap) this.f9352b;
                    if (map.containsKey(c11011sG0)) {
                        arrayList2.add(new RunnableC6720r4((C7466Cy0) ((InterfaceC9347fG0) map.get(c11011sG0)), 25, interfaceC9347fG0));
                    } else {
                        map.put(c11011sG0, interfaceC9347fG0);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: z */
    public ArrayList m6487z() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f9351a).entrySet()) {
            C6853sv c6853sv = (C6853sv) entry.getKey();
            if (c6853sv.f42723e != 0) {
                InterfaceC9347fG0 interfaceC9347fG0 = (InterfaceC9347fG0) entry.getValue();
                for (C11011sG0 c11011sG0 : c6853sv.f42720b) {
                    if (!map.containsKey(c11011sG0)) {
                        map.put(c11011sG0, new HashSet());
                    }
                    ((Set) map.get(c11011sG0)).add(interfaceC9347fG0);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = (HashMap) this.f9353c;
            if (map2.containsKey(key)) {
                C8628Zh0 c8628Zh0 = (C8628Zh0) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC6720r4(c8628Zh0, 26, (InterfaceC9347fG0) it.next()));
                }
            } else {
                C11011sG0 c11011sG02 = (C11011sG0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C8628Zh0 c8628Zh02 = new C8628Zh0();
                c8628Zh02.f15095b = null;
                c8628Zh02.f15094a = Collections.newSetFromMap(new ConcurrentHashMap());
                c8628Zh02.f15094a.addAll(set);
                map2.put(c11011sG02, c8628Zh02);
            }
        }
        return arrayList;
    }

    public C1002Pv(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC0813Mv interfaceC0813Mv) {
        this.f9351a = new HashMap();
        this.f9352b = new HashMap();
        this.f9353c = new HashMap();
        this.f9354d = new HashSet();
        this.f9356f = new AtomicReference();
        C6821sP c6821sP = new C6821sP(executor);
        this.f9355e = c6821sP;
        this.f9357g = interfaceC0813Mv;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C6853sv.m24811c(c6821sP, C6821sP.class, M51.class, InterfaceC9859jG0.class));
        arrayList3.add(C6853sv.m24811c(this, C1002Pv.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C6853sv c6853sv = (C6853sv) it.next();
            if (c6853sv != null) {
                arrayList3.add(c6853sv);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC9347fG0) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((InterfaceC0813Mv) this.f9357g).mo5477d(componentRegistrar));
                        it3.remove();
                    }
                } catch (C8742aa0 unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C6853sv) it4.next()).f42720b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.f9354d).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.f9354d).add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (((HashMap) this.f9351a).isEmpty()) {
                OY1.m6084b(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.f9351a).keySet());
                arrayList6.addAll(arrayList3);
                OY1.m6084b(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C6853sv c6853sv2 = (C6853sv) it5.next();
                ((HashMap) this.f9351a).put(c6853sv2, new C10809qh0(new C0939Ov(this, 0, c6853sv2)));
            }
            arrayList5.addAll(m6486y(arrayList3));
            arrayList5.addAll(m6487z());
            m6485x();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f9356f).get();
        if (bool != null) {
            m6482n((HashMap) this.f9351a, bool.booleanValue());
        }
    }
}
