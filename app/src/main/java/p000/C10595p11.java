package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: p11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10595p11 extends AbstractC7419Ca1 {

    /* renamed from: n */
    public static final Object f39727n = new Object();

    /* renamed from: b */
    public final long f39728b;

    /* renamed from: c */
    public final long f39729c;

    /* renamed from: d */
    public final long f39730d;

    /* renamed from: e */
    public final long f39731e;

    /* renamed from: f */
    public final long f39732f;

    /* renamed from: g */
    public final long f39733g;

    /* renamed from: h */
    public final boolean f39734h;

    /* renamed from: i */
    public final boolean f39735i;

    /* renamed from: j */
    public final boolean f39736j;

    /* renamed from: k */
    public final Object f39737k;

    /* renamed from: l */
    public final C10825qp0 f39738l;

    /* renamed from: m */
    public final C10185lp0 f39739m;

    static {
        C1164SV c1164sv = new C1164SV();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        List listEmptyList = Collections.emptyList();
        C9367fQ0 c9367fQ02 = C9367fQ0.f27184e;
        C10057kp0 c10057kp0 = new C10057kp0();
        C10441np0 c10441np0 = C10441np0.f38550a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C10313mp0(uri, null, null, listEmptyList, c9367fQ02, -9223372036854775807L);
        }
        c1164sv.m7374a();
        c10057kp0.m22273a();
        C11337up0 c11337up0 = C11337up0.f43931A;
    }

    public C10595p11(long j, boolean z, boolean z2, C10825qp0 c10825qp0) {
        this(j, j, 0L, 0L, z, false, z2, null, c10825qp0);
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: b */
    public final int mo1245b(Object obj) {
        return f39727n.equals(obj) ? 0 : -1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: f */
    public final C7315Aa1 mo1249f(int i, C7315Aa1 c7315Aa1, boolean z) {
        YN1.m9279d(i, 1);
        Object obj = z ? f39727n : null;
        long j = -this.f39732f;
        c7315Aa1.getClass();
        c7315Aa1.m243h(null, obj, 0, this.f39730d, j, C3966e3.f26513c, false);
        return c7315Aa1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: h */
    public final int mo1251h() {
        return 1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: l */
    public final Object mo1255l(int i) {
        YN1.m9279d(i, 1);
        return f39727n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.AbstractC7419Ca1
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7367Ba1 mo1256m(int r23, p000.C7367Ba1 r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            p000.YN1.m9279d(r2, r1)
            long r1 = r0.f39733g
            boolean r13 = r0.f39735i
            if (r13 == 0) goto L2c
            boolean r3 = r0.f39736j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f39731e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = p000.C7367Ba1.f912q
            lp0 r14 = r0.f39739m
            long r1 = r0.f39731e
            r17 = r1
            qp0 r4 = r0.f39738l
            java.lang.Object r5 = r0.f39737k
            long r6 = r0.f39728b
            long r8 = r0.f39729c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f39734h
            r19 = 0
            long r1 = r0.f39732f
            r20 = r1
            r3 = r24
            r3.m773b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10595p11.mo1256m(int, Ba1, long):Ba1");
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: o */
    public final int mo1258o() {
        return 1;
    }

    public C10595p11(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, C10825qp0 c10825qp0) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, c10825qp0, z3 ? c10825qp0.f41187c : null);
    }

    public C10595p11(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, C10825qp0 c10825qp0, C10185lp0 c10185lp0) {
        this.f39728b = j;
        this.f39729c = j2;
        this.f39730d = j3;
        this.f39731e = j4;
        this.f39732f = j5;
        this.f39733g = j6;
        this.f39734h = z;
        this.f39735i = z2;
        this.f39736j = z3;
        this.f39737k = obj;
        c10825qp0.getClass();
        this.f39738l = c10825qp0;
        this.f39739m = c10185lp0;
    }
}
