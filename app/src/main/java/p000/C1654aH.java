package p000;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: aH */
/* loaded from: classes.dex */
public final class C1654aH extends AbstractC10821qn0 {

    /* renamed from: k */
    public static final AbstractC7986My0 f15413k = new C3895cv(new C0295Eg(6));

    /* renamed from: d */
    public final Object f15414d;

    /* renamed from: e */
    public final Context f15415e;

    /* renamed from: f */
    public final OL0 f15416f;

    /* renamed from: g */
    public final boolean f15417g;

    /* renamed from: h */
    public C1212TG f15418h;

    /* renamed from: i */
    public final C1338VG f15419i;

    /* renamed from: j */
    public C1017Q9 f15420j;

    public C1654aH(Context context, OL0 ol0) {
        int i = C1212TG.f11262A;
        C1212TG c1212tg = new C1212TG(new C1149SG(context));
        this.f15414d = new Object();
        this.f15415e = context.getApplicationContext();
        this.f15416f = ol0;
        this.f15418h = c1212tg;
        this.f15420j = C1017Q9.f9497d;
        boolean zM1801P = AbstractC7485Dh1.m1801P(context);
        this.f15417g = zM1801P;
        if (!zM1801P && AbstractC7485Dh1.f2166a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f15419i = audioManager == null ? null : new C1338VG(audioManager.getSpatializer());
        }
        boolean z = this.f15418h.f11267v;
    }

    /* renamed from: c */
    public static int m9687c(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m9688d(C8201Rb1 c8201Rb1, C1212TG c1212tg, HashMap map) {
        for (int i = 0; i < c8201Rb1.f10321a; i++) {
            C8461Wb1 c8461Wb1 = (C8461Wb1) c1212tg.f15010p.get(c8201Rb1.m7046a(i));
            if (c8461Wb1 != null) {
                C8149Qb1 c8149Qb1 = c8461Wb1.f13276a;
                C8461Wb1 c8461Wb12 = (C8461Wb1) map.get(Integer.valueOf(c8149Qb1.f9689c));
                if (c8461Wb12 == null || (c8461Wb12.f13277b.isEmpty() && !c8461Wb1.f13277b.isEmpty())) {
                    map.put(Integer.valueOf(c8149Qb1.f9689c), c8461Wb1);
                }
            }
        }
    }

    /* renamed from: e */
    public static int m9689e(C6686qX c6686qX, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c6686qX.f40965d)) {
            return 4;
        }
        String strM9690h = m9690h(str);
        String strM9690h2 = m9690h(c6686qX.f40965d);
        if (strM9690h2 == null || strM9690h == null) {
            return (z && strM9690h2 == null) ? 1 : 0;
        }
        if (strM9690h2.startsWith(strM9690h) || strM9690h.startsWith(strM9690h2)) {
            return 3;
        }
        int i = AbstractC7485Dh1.f2166a;
        return strM9690h2.split("-", 2)[0].equals(strM9690h.split("-", 2)[0]) ? 2 : 0;
    }

    /* renamed from: h */
    public static String m9690h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: j */
    public static Pair m9691j(int i, C4218i3 c4218i3, int[][][] iArr, InterfaceC1464XG interfaceC1464XG, Comparator comparator) {
        RandomAccess randomAccessM6229B;
        boolean z;
        C4218i3 c4218i32 = c4218i3;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < c4218i32.f28781a) {
            if (i == ((int[]) c4218i32.f28782b)[i2]) {
                C8201Rb1 c8201Rb1 = ((C8201Rb1[]) c4218i32.f28783c)[i2];
                for (int i3 = 0; i3 < c8201Rb1.f10321a; i3++) {
                    C8149Qb1 c8149Qb1M7046a = c8201Rb1.m7046a(i3);
                    C9367fQ0 c9367fQ0Mo2075i = interfaceC1464XG.mo2075i(i2, c8149Qb1M7046a, iArr[i2][i3]);
                    int i4 = c8149Qb1M7046a.f9687a;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        AbstractC1527YG abstractC1527YG = (AbstractC1527YG) c9367fQ0Mo2075i.get(i5);
                        int iMo6282a = abstractC1527YG.mo6282a();
                        if (!zArr[i5] && iMo6282a != 0) {
                            if (iMo6282a == 1) {
                                randomAccessM6229B = P70.m6229B(abstractC1527YG);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC1527YG);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    AbstractC1527YG abstractC1527YG2 = (AbstractC1527YG) c9367fQ0Mo2075i.get(i6);
                                    if (abstractC1527YG2.mo6282a() == 2 && abstractC1527YG.mo6283b(abstractC1527YG2)) {
                                        arrayList2.add(abstractC1527YG2);
                                        z = true;
                                        zArr[i6] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccessM6229B = arrayList2;
                            }
                            arrayList.add(randomAccessM6229B);
                        }
                    }
                }
            }
            i2++;
            c4218i32 = c4218i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((AbstractC1527YG) list.get(i7)).f14217c;
        }
        AbstractC1527YG abstractC1527YG3 = (AbstractC1527YG) list.get(0);
        return Pair.create(new C4242iR(abstractC1527YG3.f14216b, iArr2), Integer.valueOf(abstractC1527YG3.f14215a));
    }

    @Override // p000.AbstractC10821qn0
    /* renamed from: a */
    public final void mo9692a() {
        C1338VG c1338vg;
        C1275UG c1275ug;
        synchronized (this.f15414d) {
            try {
                if (AbstractC7485Dh1.f2166a >= 32 && (c1338vg = this.f15419i) != null && (c1275ug = (C1275UG) c1338vg.f12477e) != null && ((Handler) c1338vg.f12476d) != null) {
                    ((Spatializer) c1338vg.f12475c).removeOnSpatializerStateChangedListener(c1275ug);
                    ((Handler) c1338vg.f12476d).removeCallbacksAndMessages(null);
                    c1338vg.f12476d = null;
                    c1338vg.f12477e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f41153a = null;
        this.f41154b = null;
    }

    @Override // p000.AbstractC10821qn0
    /* renamed from: b */
    public final void mo9693b(C1017Q9 c1017q9) {
        boolean zEquals;
        synchronized (this.f15414d) {
            zEquals = this.f15420j.equals(c1017q9);
            this.f15420j = c1017q9;
        }
        if (zEquals) {
            return;
        }
        m9695g();
    }

    /* renamed from: f */
    public final C1212TG m9694f() {
        C1212TG c1212tg;
        synchronized (this.f15414d) {
            c1212tg = this.f15418h;
        }
        return c1212tg;
    }

    /* renamed from: g */
    public final void m9695g() {
        boolean z;
        C3928dR c3928dR;
        C1338VG c1338vg;
        synchronized (this.f15414d) {
            try {
                z = this.f15418h.f11267v && !this.f15417g && AbstractC7485Dh1.f2166a >= 32 && (c1338vg = this.f15419i) != null && c1338vg.f12474b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (c3928dR = this.f41153a) == null) {
            return;
        }
        c3928dR.f26088h.m6907e(10);
    }

    /* renamed from: i */
    public final void m9696i() {
        synchronized (this.f15414d) {
            this.f15418h.getClass();
        }
    }

    /* renamed from: k */
    public final void m9697k(C1212TG c1212tg) {
        m9698l(c1212tg);
        C1149SG c1149sg = new C1149SG(m9694f());
        c1149sg.m9322a(c1212tg);
        m9698l(new C1212TG(c1149sg));
    }

    /* renamed from: l */
    public final void m9698l(C1212TG c1212tg) {
        boolean zEquals;
        synchronized (this.f15414d) {
            zEquals = this.f15418h.equals(c1212tg);
            this.f15418h = c1212tg;
        }
        if (zEquals) {
            return;
        }
        if (c1212tg.f11267v && this.f15415e == null) {
            AbstractC10872rA1.m24175h("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C3928dR c3928dR = this.f41153a;
        if (c3928dR != null) {
            c3928dR.f26088h.m6907e(10);
        }
    }
}
