package defpackage;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: Ra */
/* loaded from: classes.dex */
public final class C1345Ra {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public boolean H;
    public long I;
    public M71 J;
    public final C1016Mu0 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public C1267Qa f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public C1345Ra(C1016Mu0 c1016Mu0) {
        this.a = c1016Mu0;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.J = M71.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0213 A[Catch: Exception -> 0x0229, TRY_LEAVE, TryCatch #0 {Exception -> 0x0229, blocks: (B:223:0x01ed, B:225:0x0213), top: B:267:0x01ed }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r26) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1345Ra.a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r11 = this;
            M71 r0 = r11.J
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L46
            android.media.AudioTrack r2 = r11.c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L23
            long r0 = r11.A
            return r0
        L23:
            long r0 = defpackage.AbstractC0277Dh1.Q(r0)
            long r2 = r11.y
            long r0 = r0 - r2
            float r2 = r11.j
            long r3 = defpackage.AbstractC0277Dh1.y(r0, r2)
            int r0 = r11.g
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.CEILING
            long r0 = defpackage.AbstractC0277Dh1.Y(r3, r5, r7, r9)
            long r2 = r11.B
            long r4 = r11.A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r6 = r11.s
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto Lb7
            android.media.AudioTrack r2 = r11.c
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L5d
            goto Lb5
        L5d:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            boolean r2 = r11.h
            r9 = 0
            if (r2 == 0) goto L7b
            if (r6 != r3) goto L78
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L78
            long r2 = r11.t
            r11.v = r2
        L78:
            long r2 = r11.v
            long r7 = r7 + r2
        L7b:
            int r2 = defpackage.AbstractC0277Dh1.a
            r3 = 29
            if (r2 > r3) goto L99
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L97
            long r2 = r11.t
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L97
            r2 = 3
            if (r6 != r2) goto L97
            long r2 = r11.z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb5
            r11.z = r0
            goto Lb5
        L97:
            r11.z = r4
        L99:
            long r2 = r11.t
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb3
            boolean r4 = r11.H
            if (r4 == 0) goto Lac
            long r4 = r11.I
            long r4 = r4 + r2
            r11.I = r4
            r2 = 0
            r11.H = r2
            goto Lb3
        Lac:
            long r2 = r11.u
            r4 = 1
            long r2 = r2 + r4
            r11.u = r2
        Lb3:
            r11.t = r7
        Lb5:
            r11.s = r0
        Lb7:
            long r0 = r11.t
            long r2 = r11.I
            long r0 = r0 + r2
            long r2 = r11.u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1345Ra.b():long");
    }

    public final boolean c(long j) {
        long jA = a(false);
        int i = this.g;
        int i2 = AbstractC0277Dh1.a;
        if (j <= AbstractC0277Dh1.Y(jA, i, 1000000L, RoundingMode.CEILING)) {
            if (!this.h) {
                return false;
            }
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
