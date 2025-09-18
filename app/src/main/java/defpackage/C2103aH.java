package defpackage;

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

/* renamed from: aH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2103aH extends AbstractC6715qn0 {
    public static final AbstractC1028My0 k = new C3289cv(new C0350Eg(6));
    public final Object d;
    public final Context e;
    public final OL0 f;
    public final boolean g;
    public TG h;
    public final VG i;
    public Q9 j;

    public C2103aH(Context context, OL0 ol0) {
        int i = TG.A;
        TG tg = new TG(new SG(context));
        this.d = new Object();
        this.e = context.getApplicationContext();
        this.f = ol0;
        this.h = tg;
        this.j = Q9.d;
        boolean zP = AbstractC0277Dh1.P(context);
        this.g = zP;
        if (!zP && AbstractC0277Dh1.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.i = audioManager == null ? null : new VG(audioManager.getSpatializer());
        }
        boolean z = this.h.v;
    }

    public static int c(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static void d(C1350Rb1 c1350Rb1, TG tg, HashMap map) {
        for (int i = 0; i < c1350Rb1.a; i++) {
            C1740Wb1 c1740Wb1 = (C1740Wb1) tg.p.get(c1350Rb1.a(i));
            if (c1740Wb1 != null) {
                C1272Qb1 c1272Qb1 = c1740Wb1.a;
                C1740Wb1 c1740Wb12 = (C1740Wb1) map.get(Integer.valueOf(c1272Qb1.c));
                if (c1740Wb12 == null || (c1740Wb12.b.isEmpty() && !c1740Wb1.b.isEmpty())) {
                    map.put(Integer.valueOf(c1272Qb1.c), c1740Wb1);
                }
            }
        }
    }

    public static int e(C6666qX c6666qX, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c6666qX.d)) {
            return 4;
        }
        String strH = h(str);
        String strH2 = h(c6666qX.d);
        if (strH2 == null || strH == null) {
            return (z && strH2 == null) ? 1 : 0;
        }
        if (strH2.startsWith(strH) || strH.startsWith(strH2)) {
            return 3;
        }
        int i = AbstractC0277Dh1.a;
        return strH2.split("-", 2)[0].equals(strH.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair j(int i, C4271i3 c4271i3, int[][][] iArr, XG xg, Comparator comparator) {
        RandomAccess randomAccessB;
        boolean z;
        C4271i3 c4271i32 = c4271i3;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < c4271i32.a) {
            if (i == ((int[]) c4271i32.b)[i2]) {
                C1350Rb1 c1350Rb1 = ((C1350Rb1[]) c4271i32.c)[i2];
                for (int i3 = 0; i3 < c1350Rb1.a; i3++) {
                    C1272Qb1 c1272Qb1A = c1350Rb1.a(i3);
                    C3769fQ0 c3769fQ0I = xg.i(i2, c1272Qb1A, iArr[i2][i3]);
                    int i4 = c1272Qb1A.a;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        YG yg = (YG) c3769fQ0I.get(i5);
                        int iA = yg.a();
                        if (!zArr[i5] && iA != 0) {
                            if (iA == 1) {
                                randomAccessB = P70.B(yg);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(yg);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    YG yg2 = (YG) c3769fQ0I.get(i6);
                                    if (yg2.a() == 2 && yg.b(yg2)) {
                                        arrayList2.add(yg2);
                                        z = true;
                                        zArr[i6] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccessB = arrayList2;
                            }
                            arrayList.add(randomAccessB);
                        }
                    }
                }
            }
            i2++;
            c4271i32 = c4271i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((YG) list.get(i7)).c;
        }
        YG yg3 = (YG) list.get(0);
        return Pair.create(new C4344iR(yg3.b, iArr2), Integer.valueOf(yg3.a));
    }

    @Override // defpackage.AbstractC6715qn0
    public final void a() {
        VG vg;
        UG ug;
        synchronized (this.d) {
            try {
                if (AbstractC0277Dh1.a >= 32 && (vg = this.i) != null && (ug = (UG) vg.e) != null && ((Handler) vg.d) != null) {
                    ((Spatializer) vg.c).removeOnSpatializerStateChangedListener(ug);
                    ((Handler) vg.d).removeCallbacksAndMessages(null);
                    vg.d = null;
                    vg.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.AbstractC6715qn0
    public final void b(Q9 q9) {
        boolean zEquals;
        synchronized (this.d) {
            zEquals = this.j.equals(q9);
            this.j = q9;
        }
        if (zEquals) {
            return;
        }
        g();
    }

    public final TG f() {
        TG tg;
        synchronized (this.d) {
            tg = this.h;
        }
        return tg;
    }

    public final void g() {
        boolean z;
        C3390dR c3390dR;
        VG vg;
        synchronized (this.d) {
            try {
                z = this.h.v && !this.g && AbstractC0277Dh1.a >= 32 && (vg = this.i) != null && vg.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (c3390dR = this.a) == null) {
            return;
        }
        c3390dR.h.e(10);
    }

    public final void i() {
        synchronized (this.d) {
            this.h.getClass();
        }
    }

    public final void k(TG tg) {
        l(tg);
        SG sg = new SG(f());
        sg.a(tg);
        l(new TG(sg));
    }

    public final void l(TG tg) {
        boolean zEquals;
        synchronized (this.d) {
            zEquals = this.h.equals(tg);
            this.h = tg;
        }
        if (zEquals) {
            return;
        }
        if (tg.v && this.e == null) {
            AbstractC6789rA1.h("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C3390dR c3390dR = this.a;
        if (c3390dR != null) {
            c3390dR.h.e(10);
        }
    }
}
