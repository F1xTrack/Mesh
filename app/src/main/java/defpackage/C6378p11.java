package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: p11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6378p11 extends AbstractC0178Ca1 {
    public static final Object n = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public final C6721qp0 l;
    public final C5766lp0 m;

    static {
        SV sv = new SV();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        List listEmptyList = Collections.emptyList();
        C3769fQ0 c3769fQ02 = C3769fQ0.e;
        C5575kp0 c5575kp0 = new C5575kp0();
        C6148np0 c6148np0 = C6148np0.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C5957mp0(uri, null, null, listEmptyList, c3769fQ02, -9223372036854775807L);
        }
        sv.a();
        c5575kp0.a();
        C7484up0 c7484up0 = C7484up0.A;
    }

    public C6378p11(long j, boolean z, boolean z2, C6721qp0 c6721qp0) {
        this(j, j, 0L, 0L, z, false, z2, null, c6721qp0);
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int b(Object obj) {
        return n.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final C0022Aa1 f(int i, C0022Aa1 c0022Aa1, boolean z) {
        YN1.d(i, 1);
        Object obj = z ? n : null;
        long j = -this.f;
        c0022Aa1.getClass();
        c0022Aa1.h(null, obj, 0, this.d, j, C3507e3.c, false);
        return c0022Aa1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int h() {
        return 1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final Object l(int i) {
        YN1.d(i, 1);
        return n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC0178Ca1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0100Ba1 m(int r23, defpackage.C0100Ba1 r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            defpackage.YN1.d(r2, r1)
            long r1 = r0.g
            boolean r13 = r0.i
            if (r13 == 0) goto L2c
            boolean r3 = r0.j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.e
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
            java.lang.Object r1 = defpackage.C0100Ba1.q
            lp0 r14 = r0.m
            long r1 = r0.e
            r17 = r1
            qp0 r4 = r0.l
            java.lang.Object r5 = r0.k
            long r6 = r0.b
            long r8 = r0.c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.h
            r19 = 0
            long r1 = r0.f
            r20 = r1
            r3 = r24
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6378p11.m(int, Ba1, long):Ba1");
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int o() {
        return 1;
    }

    public C6378p11(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, C6721qp0 c6721qp0) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, c6721qp0, z3 ? c6721qp0.c : null);
    }

    public C6378p11(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, C6721qp0 c6721qp0, C5766lp0 c5766lp0) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = obj;
        c6721qp0.getClass();
        this.l = c6721qp0;
        this.m = c5766lp0;
    }
}
