package defpackage;

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
public final class C1252Pv implements InterfaceC0707Iv, InterfaceC3519e61, InterfaceC6777r61 {
    public static final C1096Nv h = new C1096Nv(0);
    public static final byte[] i = {0, 7, 8, 15};
    public static final byte[] j = {0, 119, -120, -1};
    public static final byte[] k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public /* synthetic */ C1252Pv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }

    public static C1897Yc i(C1897Yc c1897Yc, C4332iN c4332iN, C5534kb1 c5534kb1, Map map) {
        Map mapUnmodifiableMap;
        C1819Xc c1819XcA = c1897Yc.a();
        String strF = ((AT) c4332iN.c).f();
        if (strF != null) {
            c1819XcA.e = new C5729ld(strF);
        }
        boolean zIsEmpty = map.isEmpty();
        VG vg = (VG) c5534kb1.d;
        if (zIsEmpty) {
            mapUnmodifiableMap = ((C7648vg0) ((AtomicMarkableReference) vg.c).getReference()).a();
        } else {
            HashMap map2 = new HashMap(((C7648vg0) ((AtomicMarkableReference) vg.c).getReference()).a());
            for (Map.Entry entry : map.entrySet()) {
                String strB = C7648vg0.b(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strB)) {
                    map2.put(strB, C7648vg0.b(1024, (String) entry.getValue()));
                }
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(map2);
        }
        List listR = r(mapUnmodifiableMap);
        List listR2 = r(((C7648vg0) ((AtomicMarkableReference) ((VG) c5534kb1.e).c).getReference()).a());
        if (!listR.isEmpty() || !listR2.isEmpty()) {
            C1975Zc c1975Zc = c1897Yc.c;
            c1819XcA.c = new C1975Zc(c1975Zc.a, listR, listR2, c1975Zc.d, c1975Zc.e, c1975Zc.f, c1975Zc.g);
        }
        return c1819XcA.a();
    }

    public static PA j(C1897Yc c1897Yc, C5534kb1 c5534kb1) {
        List listA = ((C5700lT0) c5534kb1.f).a();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listA.size(); i2++) {
            AbstractC5509kT0 abstractC5509kT0 = (AbstractC5509kT0) listA.get(i2);
            abstractC5509kT0.getClass();
            C5920md c5920md = new C5920md();
            C7450ue c7450ue = (C7450ue) abstractC5509kT0;
            String str = c7450ue.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = c7450ue.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c5920md.a = new C6302od(str2, str);
            String str3 = c7450ue.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c5920md.b = str3;
            String str4 = c7450ue.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c5920md.c = str4;
            c5920md.d = c7450ue.f;
            c5920md.e = (byte) (c5920md.e | 1);
            arrayList.add(c5920md.a());
        }
        if (arrayList.isEmpty()) {
            return c1897Yc;
        }
        C1819Xc c1819XcA = c1897Yc.a();
        c1819XcA.f = new C6493pd(arrayList);
        return c1819XcA.a();
    }

    public static byte[] k(int i2, int i3, C0848Kq c0848Kq) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) c0848Kq.l(i3);
        }
        return bArr;
    }

    public static C1252Pv l(Context context, Y50 y50, HT ht, D7 d7, C4332iN c4332iN, C5534kb1 c5534kb1, ES1 es1, C1666Vd c1666Vd, C4332iN c4332iN2, C5260jA c5260jA, C6846rT1 c6846rT1) {
        UA ua = new UA(context, y50, d7, es1, c1666Vd);
        XA xa = new XA(ht, c1666Vd, c5260jA);
        WA wa = C5269jD.b;
        C2362bd1.b(context);
        return new C1252Pv(ua, xa, new C5269jD(new C5885mR0(C2362bd1.a().c(new C1141Ok(C5269jD.c, C5269jD.d)).a("FIREBASE_CRASHLYTICS_REPORT", new C7973xO("json"), C5269jD.e), c1666Vd.g(), c4332iN2)), c4332iN, c5534kb1, y50, c6846rT1);
    }

    public static int[] o() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = q(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = q(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] p() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = q(63, i4, i5, i3);
            } else {
                int i6 = i2 & ModuleDescriptor.MODULE_VERSION;
                if (i6 == 0) {
                    iArr[i2] = q(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i2] = q(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i2] = q(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = q(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int q(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static List r(Map map) {
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
            arrayList.add(new C1117Oc(str, str2));
        }
        Collections.sort(arrayList, new C0350Eg(18));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0224 A[LOOP:3: B:231:0x0172->B:260:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x021f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1252Pv.t(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C7014sM u(C0848Kq c0848Kq, int i2) {
        int iL;
        int i3;
        int iL2;
        int iL3;
        int iL4;
        int i4 = 8;
        int iL5 = c0848Kq.l(8);
        c0848Kq.w(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrO = o();
        int[] iArrP = p();
        while (i6 > 0) {
            int iL6 = c0848Kq.l(i4);
            int iL7 = c0848Kq.l(i4);
            int[] iArr2 = (iL7 & 128) != 0 ? iArr : (iL7 & 64) != 0 ? iArrO : iArrP;
            if ((iL7 & 1) != 0) {
                iL3 = c0848Kq.l(i4);
                iL4 = c0848Kq.l(i4);
                iL = c0848Kq.l(i4);
                iL2 = c0848Kq.l(i4);
                i3 = i6 - 6;
            } else {
                int iL8 = c0848Kq.l(6) << i5;
                int iL9 = c0848Kq.l(4) << 4;
                iL = c0848Kq.l(4) << 4;
                i3 = i6 - 4;
                iL2 = c0848Kq.l(i5) << 6;
                iL3 = iL8;
                iL4 = iL9;
            }
            if (iL3 == 0) {
                iL4 = i7;
                iL = iL4;
                iL2 = 255;
            }
            double d = iL3;
            double d2 = iL4 - 128;
            double d3 = iL - 128;
            iArr2[iL6] = q((byte) (255 - (iL2 & KotlinVersion.MAX_COMPONENT_VALUE)), AbstractC0277Dh1.j((int) ((1.402d * d2) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE), AbstractC0277Dh1.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), AbstractC0277Dh1.j((int) ((d3 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i6 = i3;
            i7 = 0;
            iL5 = iL5;
            iArrP = iArrP;
            i4 = 8;
            i5 = 2;
        }
        return new C7014sM(iL5, iArr, iArrO, iArrP);
    }

    public static C7396uM v(C0848Kq c0848Kq) {
        byte[] bArr;
        int iL = c0848Kq.l(16);
        c0848Kq.w(4);
        int iL2 = c0848Kq.l(2);
        boolean zK = c0848Kq.k();
        c0848Kq.w(1);
        byte[] bArr2 = AbstractC0277Dh1.f;
        if (iL2 != 1) {
            if (iL2 == 0) {
                int iL3 = c0848Kq.l(16);
                int iL4 = c0848Kq.l(16);
                if (iL3 > 0) {
                    bArr2 = new byte[iL3];
                    c0848Kq.o(iL3, bArr2);
                }
                if (iL4 > 0) {
                    bArr = new byte[iL4];
                    c0848Kq.o(iL4, bArr);
                }
            }
            return new C7396uM(iL, zK, bArr2, bArr);
        }
        c0848Kq.w(c0848Kq.l(8) * 16);
        bArr = bArr2;
        return new C7396uM(iL, zK, bArr2, bArr);
    }

    public C3892g32 A(ZA za, String str) {
        S81 s81;
        ArrayList arrayListB = ((XA) this.b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                WA wa = XA.g;
                String strE = XA.e(file);
                wa.getClass();
                arrayList.add(new C0806Kc(WA.i(strE), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0806Kc c0806Kc = (C0806Kc) it2.next();
            if (str == null || str.equals(c0806Kc.b)) {
                C5269jD c5269jD = (C5269jD) this.c;
                C0728Jc c0728Jc = c0806Kc.a;
                if (c0728Jc.f == null || c0728Jc.g == null) {
                    TU tuB = ((Y50) this.f).b(true);
                    C0650Ic c0650IcA = c0806Kc.a.a();
                    c0650IcA.e = tuB.a;
                    C0650Ic c0650IcA2 = c0650IcA.a().a();
                    c0650IcA2.f = tuB.b;
                    c0806Kc = new C0806Kc(c0650IcA2.a(), c0806Kc.b, c0806Kc.c);
                }
                boolean z = str != null;
                C5885mR0 c5885mR0 = c5269jD.a;
                synchronized (c5885mR0.f) {
                    try {
                        s81 = new S81();
                        if (z) {
                            ((AtomicInteger) c5885mR0.i.b).getAndIncrement();
                            if (c5885mR0.f.size() < c5885mR0.e) {
                                c5885mR0.f.size();
                                c5885mR0.g.execute(new RunnableC1492Sx(c5885mR0, c0806Kc, s81, 13, false));
                                s81.d(c0806Kc);
                            } else {
                                c5885mR0.a();
                                ((AtomicInteger) c5885mR0.i.c).getAndIncrement();
                                s81.d(c0806Kc);
                            }
                        } else {
                            c5885mR0.b(c0806Kc, s81);
                        }
                    } finally {
                    }
                }
                arrayList2.add(s81.a.f(za, new C1724Vw0(15, this)));
            }
        }
        return AbstractC3782fU1.g(arrayList2);
    }

    @Override // defpackage.InterfaceC3519e61
    public int G() {
        return 2;
    }

    @Override // defpackage.InterfaceC0707Iv
    public Object a(Class cls) {
        return h(C6997sG0.a(cls));
    }

    @Override // defpackage.InterfaceC0707Iv
    public Set b(C6997sG0 c6997sG0) {
        InterfaceC3739fG0 interfaceC3739fG0;
        synchronized (this) {
            interfaceC3739fG0 = (C1991Zh0) ((HashMap) this.c).get(c6997sG0);
            if (interfaceC3739fG0 == null) {
                interfaceC3739fG0 = h;
            }
        }
        return (Set) interfaceC3739fG0.get();
    }

    @Override // defpackage.InterfaceC0707Iv
    public InterfaceC3739fG0 c(Class cls) {
        return f(C6997sG0.a(cls));
    }

    @Override // defpackage.InterfaceC3519e61
    public void d() {
        C8157yM c8157yM = (C8157yM) this.f;
        ((SparseArray) c8157yM.c).clear();
        ((SparseArray) c8157yM.d).clear();
        ((SparseArray) c8157yM.e).clear();
        ((SparseArray) c8157yM.f).clear();
        ((SparseArray) c8157yM.g).clear();
        c8157yM.h = null;
        c8157yM.i = null;
    }

    @Override // defpackage.InterfaceC0707Iv
    public C0249Cy0 e(C6997sG0 c6997sG0) {
        InterfaceC3739fG0 interfaceC3739fG0F = f(c6997sG0);
        return interfaceC3739fG0F == null ? new C0249Cy0(C0249Cy0.c, C0249Cy0.d) : interfaceC3739fG0F instanceof C0249Cy0 ? (C0249Cy0) interfaceC3739fG0F : new C0249Cy0(null, interfaceC3739fG0F);
    }

    @Override // defpackage.InterfaceC0707Iv
    public synchronized InterfaceC3739fG0 f(C6997sG0 c6997sG0) {
        RL1.a(c6997sG0, "Null interface requested.");
        return (InterfaceC3739fG0) ((HashMap) this.b).get(c6997sG0);
    }

    @Override // defpackage.InterfaceC3519e61
    public /* synthetic */ U51 g(byte[] bArr, int i2, int i3) {
        return AbstractC7209tN0.h(this, bArr, i3);
    }

    @Override // defpackage.InterfaceC6777r61, javax.inject.Provider
    public Object get() {
        C8398zd c8398zd = (C8398zd) this.e;
        int i2 = c8398zd.d;
        Range range = Z61.p;
        Range range2 = (Range) this.g;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(i2))).intValue() : i2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(i2);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj);
        AbstractC0759Jm0.f("VidEncVdPrflRslvr");
        AbstractC0759Jm0.f("VidEncVdPrflRslvr");
        Range range3 = ((C1903Ye) this.c).c;
        AbstractC0759Jm0.f("VidEncVdPrflRslvr");
        int i3 = ((CM) this.f).b;
        Size size = (Size) this.d;
        int iC = AbstractC1605Ui1.c(c8398zd.c, i3, c8398zd.h, iIntValue, c8398zd.d, size.getWidth(), c8398zd.e, size.getHeight(), c8398zd.f, range3);
        String str = (String) this.a;
        int i4 = c8398zd.g;
        C1747We c1747WeA = AbstractC1605Ui1.a(i4, str);
        C1666Vd c1666VdD = C1669Ve.d();
        c1666VdD.a = str;
        EnumC8011xa1 enumC8011xa1 = (EnumC8011xa1) this.b;
        if (enumC8011xa1 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c1666VdD.c = enumC8011xa1;
        c1666VdD.d = size;
        c1666VdD.i = Integer.valueOf(iC);
        c1666VdD.g = Integer.valueOf(iIntValue);
        c1666VdD.b = Integer.valueOf(i4);
        c1666VdD.f = c1747WeA;
        return c1666VdD.a();
    }

    @Override // defpackage.InterfaceC0707Iv
    public Object h(C6997sG0 c6997sG0) {
        InterfaceC3739fG0 interfaceC3739fG0F = f(c6997sG0);
        if (interfaceC3739fG0F == null) {
            return null;
        }
        return interfaceC3739fG0F.get();
    }

    @Override // defpackage.InterfaceC3519e61
    public void m(byte[] bArr, int i2, int i3, C3329d61 c3329d61, InterfaceC6365oy interfaceC6365oy) {
        C8157yM c8157yM;
        C7934xB c7934xB;
        int i4;
        char c;
        int i5;
        C7205tM c7205tM;
        ArrayList arrayList;
        int i6;
        C8157yM c8157yM2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C7777wM c7777wM;
        C7777wM c7777wM2;
        int i12;
        int iL;
        int i13;
        int i14;
        int i15 = 8;
        C0848Kq c0848Kq = new C0848Kq(bArr, i2 + i3);
        c0848Kq.t(i2);
        while (true) {
            int iC = c0848Kq.c();
            c8157yM = (C8157yM) this.f;
            if (iC >= 48 && c0848Kq.l(i15) == 15) {
                int iL2 = c0848Kq.l(i15);
                int i16 = 16;
                int iL3 = c0848Kq.l(16);
                int iL4 = c0848Kq.l(16);
                int i17 = c0848Kq.i() + iL4;
                if (iL4 * 8 > c0848Kq.c()) {
                    AbstractC6789rA1.h("Data field length exceeds limit");
                    c0848Kq.w(c0848Kq.c());
                } else {
                    switch (iL2) {
                        case 16:
                            if (iL3 == c8157yM.a) {
                                C5217ix0 c5217ix0 = (C5217ix0) c8157yM.i;
                                c0848Kq.l(i15);
                                int iL5 = c0848Kq.l(4);
                                int iL6 = c0848Kq.l(2);
                                c0848Kq.w(2);
                                int i18 = iL4 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i18 > 0) {
                                    int iL7 = c0848Kq.l(i15);
                                    c0848Kq.w(i15);
                                    i18 -= 6;
                                    sparseArray.put(iL7, new C7587vM(c0848Kq.l(16), c0848Kq.l(16)));
                                    i15 = 8;
                                }
                                C5217ix0 c5217ix02 = new C5217ix0(iL5, iL6, sparseArray);
                                if (iL6 == 0) {
                                    if (c5217ix0 != null && c5217ix0.a != iL5) {
                                        c8157yM.i = c5217ix02;
                                        break;
                                    }
                                } else {
                                    c8157yM.i = c5217ix02;
                                    ((SparseArray) c8157yM.c).clear();
                                    ((SparseArray) c8157yM.d).clear();
                                    ((SparseArray) c8157yM.e).clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C5217ix0 c5217ix03 = (C5217ix0) c8157yM.i;
                            if (iL3 == c8157yM.a && c5217ix03 != null) {
                                int iL8 = c0848Kq.l(i15);
                                c0848Kq.w(4);
                                boolean zK = c0848Kq.k();
                                c0848Kq.w(3);
                                int iL9 = c0848Kq.l(16);
                                int iL10 = c0848Kq.l(16);
                                c0848Kq.l(3);
                                int iL11 = c0848Kq.l(3);
                                c0848Kq.w(2);
                                int iL12 = c0848Kq.l(i15);
                                int iL13 = c0848Kq.l(i15);
                                int iL14 = c0848Kq.l(4);
                                int iL15 = c0848Kq.l(2);
                                c0848Kq.w(2);
                                int i19 = iL4 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i19 > 0) {
                                    int iL16 = c0848Kq.l(i16);
                                    int iL17 = c0848Kq.l(2);
                                    c0848Kq.l(2);
                                    int iL18 = c0848Kq.l(12);
                                    c0848Kq.w(4);
                                    int iL19 = c0848Kq.l(12);
                                    int i20 = i19 - 6;
                                    if (iL17 == 1 || iL17 == 2) {
                                        c0848Kq.l(i15);
                                        c0848Kq.l(i15);
                                        i19 -= 8;
                                    } else {
                                        i19 = i20;
                                    }
                                    sparseArray2.put(iL16, new C7967xM(iL18, iL19));
                                    i16 = 16;
                                }
                                C7777wM c7777wM3 = new C7777wM(iL8, zK, iL9, iL10, iL11, iL12, iL13, iL14, iL15, sparseArray2);
                                SparseArray sparseArray3 = (SparseArray) c8157yM.c;
                                if (c5217ix03.b == 0 && (c7777wM2 = (C7777wM) sparseArray3.get(iL8)) != null) {
                                    int i21 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c7777wM2.j;
                                        if (i21 < sparseArray4.size()) {
                                            c7777wM3.j.put(sparseArray4.keyAt(i21), (C7967xM) sparseArray4.valueAt(i21));
                                            i21++;
                                        }
                                    }
                                }
                                sparseArray3.put(c7777wM3.a, c7777wM3);
                                break;
                            }
                            break;
                        case 18:
                            if (iL3 != c8157yM.a) {
                                if (iL3 == c8157yM.b) {
                                    C7014sM c7014sMU = u(c0848Kq, iL4);
                                    ((SparseArray) c8157yM.f).put(c7014sMU.a, c7014sMU);
                                    break;
                                }
                            } else {
                                C7014sM c7014sMU2 = u(c0848Kq, iL4);
                                ((SparseArray) c8157yM.d).put(c7014sMU2.a, c7014sMU2);
                                break;
                            }
                            break;
                        case 19:
                            if (iL3 != c8157yM.a) {
                                if (iL3 == c8157yM.b) {
                                    C7396uM c7396uMV = v(c0848Kq);
                                    ((SparseArray) c8157yM.g).put(c7396uMV.a, c7396uMV);
                                    break;
                                }
                            } else {
                                C7396uM c7396uMV2 = v(c0848Kq);
                                ((SparseArray) c8157yM.e).put(c7396uMV2.a, c7396uMV2);
                                break;
                            }
                            break;
                        case 20:
                            if (iL3 == c8157yM.a) {
                                c0848Kq.w(4);
                                boolean zK2 = c0848Kq.k();
                                c0848Kq.w(3);
                                int iL20 = c0848Kq.l(16);
                                int iL21 = c0848Kq.l(16);
                                if (zK2) {
                                    int iL22 = c0848Kq.l(16);
                                    int iL23 = c0848Kq.l(16);
                                    int iL24 = c0848Kq.l(16);
                                    i12 = iL23;
                                    iL = c0848Kq.l(16);
                                    i14 = iL24;
                                    i13 = iL22;
                                } else {
                                    i12 = iL20;
                                    iL = iL21;
                                    i13 = 0;
                                    i14 = 0;
                                }
                                c8157yM.h = new C7205tM(iL20, iL21, i13, i12, i14, iL);
                                break;
                            }
                            break;
                    }
                    c0848Kq.x(i17 - c0848Kq.i());
                }
                i15 = 8;
            }
        }
        C5217ix0 c5217ix04 = (C5217ix0) c8157yM.i;
        if (c5217ix04 == null) {
            N70 n70 = P70.b;
            c7934xB = new C7934xB(C3769fQ0.e, -9223372036854775807L, -9223372036854775807L);
        } else {
            C7205tM c7205tM2 = (C7205tM) c8157yM.h;
            if (c7205tM2 == null) {
                c7205tM2 = (C7205tM) this.d;
            }
            Bitmap bitmap = (Bitmap) this.g;
            Canvas canvas = (Canvas) this.c;
            if (bitmap == null || c7205tM2.a + 1 != bitmap.getWidth() || c7205tM2.b + 1 != ((Bitmap) this.g).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c7205tM2.a + 1, c7205tM2.b + 1, Bitmap.Config.ARGB_8888);
                this.g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i22 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c5217ix04.c;
                if (i22 < sparseArray5.size()) {
                    canvas.save();
                    C7587vM c7587vM = (C7587vM) sparseArray5.valueAt(i22);
                    C7777wM c7777wM4 = (C7777wM) ((SparseArray) c8157yM.c).get(sparseArray5.keyAt(i22));
                    int i23 = c7587vM.a + c7205tM2.c;
                    int i24 = c7587vM.b + c7205tM2.e;
                    int iMin = Math.min(c7777wM4.c + i23, c7205tM2.d);
                    int i25 = c7777wM4.d;
                    int i26 = i24 + i25;
                    canvas.clipRect(i23, i24, iMin, Math.min(i26, c7205tM2.f));
                    SparseArray sparseArray6 = (SparseArray) c8157yM.d;
                    int i27 = c7777wM4.f;
                    C7014sM c7014sM = (C7014sM) sparseArray6.get(i27);
                    if (c7014sM == null && (c7014sM = (C7014sM) ((SparseArray) c8157yM.f).get(i27)) == null) {
                        c7014sM = (C7014sM) this.e;
                    }
                    int i28 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c7777wM4.j;
                        if (i28 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i28);
                            C7967xM c7967xM = (C7967xM) sparseArray7.valueAt(i28);
                            C5217ix0 c5217ix05 = c5217ix04;
                            C7396uM c7396uM = (C7396uM) ((SparseArray) c8157yM.e).get(iKeyAt);
                            if (c7396uM == null) {
                                c7396uM = (C7396uM) ((SparseArray) c8157yM.g).get(iKeyAt);
                            }
                            if (c7396uM != null) {
                                Paint paint = c7396uM.b ? null : (Paint) this.a;
                                c8157yM2 = c8157yM;
                                int i29 = c7967xM.a + i23;
                                int i30 = c7967xM.b + i24;
                                i6 = i22;
                                int i31 = c7777wM4.e;
                                int i32 = i28;
                                int[] iArr = i31 == 3 ? c7014sM.d : i31 == 2 ? c7014sM.c : c7014sM.b;
                                i7 = i32;
                                arrayList = arrayList2;
                                c7205tM = c7205tM2;
                                i9 = i25;
                                i8 = i26;
                                i11 = i23;
                                i10 = i24;
                                c7777wM = c7777wM4;
                                Paint paint2 = paint;
                                t(c7396uM.c, iArr, i31, i29, i30, paint2, canvas);
                                t(c7396uM.d, iArr, i31, i29, i30 + 1, paint2, canvas);
                            } else {
                                c7205tM = c7205tM2;
                                arrayList = arrayList2;
                                i6 = i22;
                                c8157yM2 = c8157yM;
                                i7 = i28;
                                i8 = i26;
                                i9 = i25;
                                i10 = i24;
                                i11 = i23;
                                c7777wM = c7777wM4;
                            }
                            i28 = i7 + 1;
                            c5217ix04 = c5217ix05;
                            c7777wM4 = c7777wM;
                            i23 = i11;
                            c8157yM = c8157yM2;
                            i22 = i6;
                            arrayList2 = arrayList;
                            c7205tM2 = c7205tM;
                            i25 = i9;
                            i26 = i8;
                            i24 = i10;
                        } else {
                            C5217ix0 c5217ix06 = c5217ix04;
                            C7205tM c7205tM3 = c7205tM2;
                            ArrayList arrayList3 = arrayList2;
                            int i33 = i22;
                            C8157yM c8157yM3 = c8157yM;
                            int i34 = i26;
                            int i35 = i25;
                            int i36 = i24;
                            int i37 = i23;
                            C7777wM c7777wM5 = c7777wM4;
                            boolean z = c7777wM5.b;
                            int i38 = c7777wM5.c;
                            if (z) {
                                int i39 = c7777wM5.e;
                                if (i39 == 3) {
                                    i5 = c7014sM.d[c7777wM5.g];
                                    c = 2;
                                } else {
                                    c = 2;
                                    i5 = i39 == 2 ? c7014sM.c[c7777wM5.h] : c7014sM.b[c7777wM5.i];
                                }
                                Paint paint3 = (Paint) this.b;
                                paint3.setColor(i5);
                                i4 = i36;
                                canvas.drawRect(i37, i4, i37 + i38, i34, paint3);
                            } else {
                                i4 = i36;
                                c = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.g, i37, i4, i38, i35);
                            float f = c7205tM3.a;
                            float f2 = c7205tM3.b;
                            arrayList3.add(new C7363uB(null, null, null, bitmapCreateBitmap2, i4 / f2, 0, 0, i37 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i38 / f, i35 / f2, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            c8157yM = c8157yM3;
                            i22 = i33 + 1;
                            c5217ix04 = c5217ix06;
                            arrayList2 = arrayList3;
                            c7205tM2 = c7205tM3;
                        }
                    }
                } else {
                    c7934xB = new C7934xB(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC6365oy.b(c7934xB);
    }

    public void n(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C7119sv c7119sv = (C7119sv) entry.getKey();
            InterfaceC3739fG0 interfaceC3739fG0 = (InterfaceC3739fG0) entry.getValue();
            int i2 = c7119sv.d;
            if (i2 == 1 || (i2 == 2 && z)) {
                interfaceC3739fG0.get();
            }
        }
        C7023sP c7023sP = (C7023sP) this.e;
        synchronized (c7023sP) {
            arrayDeque = c7023sP.b;
            if (arrayDeque != null) {
                c7023sP.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                c7023sP.a((C6069nP) it.next());
            }
        }
    }

    public void s(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.a);
        }
        n(map, z);
    }

    public void w(Throwable th, Thread thread, String str, final MP mp, boolean z) {
        ES1 es1;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        ES1 es12;
        final boolean zEquals = str.equals(CrashHianalyticsData.EVENT_ID_CRASH);
        UA ua = (UA) this.a;
        Context context = ua.a;
        int i2 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        C6860rY0 c6860rY0 = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            es1 = ua.d;
            if (zIsEmpty) {
                break;
            }
            Throwable th2 = (Throwable) stack.pop();
            c6860rY0 = new C6860rY0(th2.getLocalizedMessage(), th2.getClass().getName(), es1.E(th2.getStackTrace()), c6860rY0, 16);
        }
        C1819Xc c1819Xc = new C1819Xc();
        c1819Xc.b = str;
        c1819Xc.a = mp.b;
        c1819Xc.g = (byte) (c1819Xc.g | 1);
        IA iaZ = C7532v32.f.z(context);
        int i3 = ((C4380id) iaZ).c;
        Boolean boolValueOf = i3 > 0 ? Boolean.valueOf(i3 != 100) : null;
        ArrayList arrayListY = C7532v32.y(context);
        byte b = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c6860rY0.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b2 = (byte) 1;
        List listD = UA.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        if (b2 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b2 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
        }
        arrayList.add(new C3616ed(4, name, listD));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    es12 = es1;
                } else {
                    StackTraceElement[] stackTraceElementArrE = es1.E(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List listD2 = UA.d(stackTraceElementArrE, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b2 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        if (b2 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(AbstractC1705Vq.k(sb2, "Missing required properties:"));
                    }
                    es12 = es1;
                    arrayList.add(new C3616ed(0, name2, listD2));
                }
                it2 = it;
                es1 = es12;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C2550cd c2550cdC = UA.c(c6860rY0, 0);
        C3426dd c3426ddE = UA.e();
        List listA = ua.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        C2169ad c2169ad = new C2169ad(listUnmodifiableList, c2550cdC, null, c3426ddE, listA);
        if (b != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(AbstractC1705Vq.k(sb3, "Missing required properties:"));
        }
        c1819Xc.c = new C1975Zc(c2169ad, null, null, boolValueOf, iaZ, arrayListY, i2);
        c1819Xc.d = ua.b(i2);
        C1897Yc c1897YcA = c1819Xc.a();
        C4332iN c4332iN = (C4332iN) this.d;
        C5534kb1 c5534kb1 = (C5534kb1) this.e;
        final PA paJ = j(i(c1897YcA, c4332iN, c5534kb1, mp.c), c5534kb1);
        if (z) {
            ((XA) this.b).d(paJ, mp.a, zEquals);
        } else {
            ((ZA) ((C6846rT1) this.g).c).a(new Runnable() { // from class: iZ0
                @Override // java.lang.Runnable
                public final void run() {
                    C1252Pv c1252Pv = this.a;
                    c1252Pv.getClass();
                    ((XA) c1252Pv.b).d(paJ, mp.a, zEquals);
                }
            });
        }
    }

    public void x() {
        for (C7119sv c7119sv : ((HashMap) this.a).keySet()) {
            for (RH rh : c7119sv.c) {
                boolean z = rh.b == 2;
                C6997sG0 c6997sG0 = rh.a;
                if (z) {
                    HashMap map = (HashMap) this.c;
                    if (!map.containsKey(c6997sG0)) {
                        Set setEmptySet = Collections.emptySet();
                        C1991Zh0 c1991Zh0 = new C1991Zh0();
                        c1991Zh0.b = null;
                        c1991Zh0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        c1991Zh0.a.addAll(setEmptySet);
                        map.put(c6997sG0, c1991Zh0);
                    }
                }
                HashMap map2 = (HashMap) this.b;
                if (map2.containsKey(c6997sG0)) {
                    continue;
                } else {
                    int i2 = rh.b;
                    if (i2 == 1) {
                        throw new TH("Unsatisfied dependency for component " + c7119sv + ": " + c6997sG0);
                    }
                    if (i2 != 2) {
                        map2.put(c6997sG0, new C0249Cy0(C0249Cy0.c, C0249Cy0.d));
                    }
                }
            }
        }
    }

    public ArrayList y(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7119sv c7119sv = (C7119sv) it.next();
            if (c7119sv.e == 0) {
                InterfaceC3739fG0 interfaceC3739fG0 = (InterfaceC3739fG0) ((HashMap) this.a).get(c7119sv);
                for (C6997sG0 c6997sG0 : c7119sv.b) {
                    HashMap map = (HashMap) this.b;
                    if (map.containsKey(c6997sG0)) {
                        arrayList2.add(new RunnableC6769r4((C0249Cy0) ((InterfaceC3739fG0) map.get(c6997sG0)), 25, interfaceC3739fG0));
                    } else {
                        map.put(c6997sG0, interfaceC3739fG0);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList z() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            C7119sv c7119sv = (C7119sv) entry.getKey();
            if (c7119sv.e != 0) {
                InterfaceC3739fG0 interfaceC3739fG0 = (InterfaceC3739fG0) entry.getValue();
                for (C6997sG0 c6997sG0 : c7119sv.b) {
                    if (!map.containsKey(c6997sG0)) {
                        map.put(c6997sG0, new HashSet());
                    }
                    ((Set) map.get(c6997sG0)).add(interfaceC3739fG0);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = (HashMap) this.c;
            if (map2.containsKey(key)) {
                C1991Zh0 c1991Zh0 = (C1991Zh0) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC6769r4(c1991Zh0, 26, (InterfaceC3739fG0) it.next()));
                }
            } else {
                C6997sG0 c6997sG02 = (C6997sG0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C1991Zh0 c1991Zh02 = new C1991Zh0();
                c1991Zh02.b = null;
                c1991Zh02.a = Collections.newSetFromMap(new ConcurrentHashMap());
                c1991Zh02.a.addAll(set);
                map2.put(c6997sG02, c1991Zh02);
            }
        }
        return arrayList;
    }

    public C1252Pv(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC1018Mv interfaceC1018Mv) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        C7023sP c7023sP = new C7023sP(executor);
        this.e = c7023sP;
        this.g = interfaceC1018Mv;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C7119sv.c(c7023sP, C7023sP.class, M51.class, InterfaceC5279jG0.class));
        arrayList3.add(C7119sv.c(this, C1252Pv.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C7119sv c7119sv = (C7119sv) it.next();
            if (c7119sv != null) {
                arrayList3.add(c7119sv);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC3739fG0) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((InterfaceC1018Mv) this.g).d(componentRegistrar));
                        it3.remove();
                    }
                } catch (C2161aa0 unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C7119sv) it4.next()).b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                OY1.b(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                OY1.b(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C7119sv c7119sv2 = (C7119sv) it5.next();
                ((HashMap) this.a).put(c7119sv2, new C6697qh0(new C1174Ov(this, 0, c7119sv2)));
            }
            arrayList5.addAll(y(arrayList3));
            arrayList5.addAll(z());
            x();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            n((HashMap) this.a, bool.booleanValue());
        }
    }
}
