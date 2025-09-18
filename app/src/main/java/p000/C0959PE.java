package p000;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: PE */
/* loaded from: classes.dex */
public final class C0959PE implements InterfaceC0168Cf, InterfaceC9648hc1 {

    /* renamed from: n */
    public static final C9367fQ0 f8910n = P70.m6228A(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o */
    public static final C9367fQ0 f8911o = P70.m6228A(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p */
    public static final C9367fQ0 f8912p = P70.m6228A(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q */
    public static final C9367fQ0 f8913q = P70.m6228A(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r */
    public static final C9367fQ0 f8914r = P70.m6228A(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s */
    public static final C9367fQ0 f8915s = P70.m6228A(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t */
    public static C0959PE f8916t;

    /* renamed from: a */
    public final C10007kQ0 f8917a;

    /* renamed from: b */
    public final QQ0 f8918b = new QQ0(3);

    /* renamed from: c */
    public final M71 f8919c;

    /* renamed from: d */
    public final boolean f8920d;

    /* renamed from: e */
    public final C9830j21 f8921e;

    /* renamed from: f */
    public int f8922f;

    /* renamed from: g */
    public long f8923g;

    /* renamed from: h */
    public long f8924h;

    /* renamed from: i */
    public long f8925i;

    /* renamed from: j */
    public long f8926j;

    /* renamed from: k */
    public long f8927k;

    /* renamed from: l */
    public long f8928l;

    /* renamed from: m */
    public int f8929m;

    public C0959PE(Context context, HashMap map, int i, M71 m71, boolean z) {
        this.f8917a = C10007kQ0.m22206b(map);
        this.f8921e = new C9830j21(i);
        this.f8919c = m71;
        this.f8920d = z;
        if (context == null) {
            this.f8929m = 0;
            this.f8927k = m6270b(0);
            return;
        }
        C9557gv0 c9557gv0M18672b = C9557gv0.m18672b(context);
        int iM18673c = c9557gv0M18672b.m18673c();
        this.f8929m = iM18673c;
        this.f8927k = m6270b(iM18673c);
        C0896OE c0896oe = new C0896OE(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c9557gv0M18672b.f28087c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c0896oe));
        ((Handler) c9557gv0M18672b.f28086b).post(new RunnableC1096RQ(c9557gv0M18672b, 19, c0896oe));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1297:0x0011  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m6269a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0959PE.m6269a(java.lang.String):int[]");
    }

    /* renamed from: b */
    public final long m6270b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C10007kQ0 c10007kQ0 = this.f8917a;
        Long l = (Long) c10007kQ0.get(numValueOf);
        if (l == null) {
            l = (Long) c10007kQ0.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: c */
    public final void m6271c(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.f8928l) {
            return;
        }
        this.f8928l = j2;
        Iterator it = ((CopyOnWriteArrayList) this.f8918b.f9619a).iterator();
        while (it.hasNext()) {
            C0042Af c0042Af = (C0042Af) it.next();
            if (!c0042Af.f303c) {
                c0042Af.f301a.post(new RunnableC7210ya(c0042Af, i, j, j2, 1));
            }
        }
    }
}
