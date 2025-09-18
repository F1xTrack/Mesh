package defpackage;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class PE implements InterfaceC0191Cf, InterfaceC4188hc1 {
    public static final C3769fQ0 n = P70.A(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final C3769fQ0 o = P70.A(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final C3769fQ0 p = P70.A(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final C3769fQ0 q = P70.A(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final C3769fQ0 r = P70.A(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final C3769fQ0 s = P70.A(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static PE t;
    public final C5500kQ0 a;
    public final QQ0 b = new QQ0(3);
    public final M71 c;
    public final boolean d;
    public final C5236j21 e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;

    public PE(Context context, HashMap map, int i, M71 m71, boolean z) {
        this.a = C5500kQ0.b(map);
        this.e = new C5236j21(i);
        this.c = m71;
        this.d = z;
        if (context == null) {
            this.m = 0;
            this.k = b(0);
            return;
        }
        C4053gv0 c4053gv0B = C4053gv0.b(context);
        int iC = c4053gv0B.c();
        this.m = iC;
        this.k = b(iC);
        OE oe = new OE(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c4053gv0B.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(oe));
        ((Handler) c4053gv0B.b).post(new RQ(c4053gv0B, 19, oe));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1297:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PE.a(java.lang.String):int[]");
    }

    public final long b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C5500kQ0 c5500kQ0 = this.a;
        Long l = (Long) c5500kQ0.get(numValueOf);
        if (l == null) {
            l = (Long) c5500kQ0.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void c(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.l) {
            return;
        }
        this.l = j2;
        Iterator it = ((CopyOnWriteArrayList) this.b.a).iterator();
        while (it.hasNext()) {
            C0035Af c0035Af = (C0035Af) it.next();
            if (!c0035Af.c) {
                c0035Af.a.post(new RunnableC8199ya(c0035Af, i, j, j2, 1));
            }
        }
    }
}
