package p000;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: Ra */
/* loaded from: classes.dex */
public final class C1106Ra {

    /* renamed from: A */
    public long f10276A;

    /* renamed from: B */
    public long f10277B;

    /* renamed from: C */
    public long f10278C;

    /* renamed from: D */
    public long f10279D;

    /* renamed from: E */
    public boolean f10280E;

    /* renamed from: F */
    public long f10281F;

    /* renamed from: G */
    public long f10282G;

    /* renamed from: H */
    public boolean f10283H;

    /* renamed from: I */
    public long f10284I;

    /* renamed from: J */
    public M71 f10285J;

    /* renamed from: a */
    public final C7978Mu0 f10286a;

    /* renamed from: b */
    public final long[] f10287b;

    /* renamed from: c */
    public AudioTrack f10288c;

    /* renamed from: d */
    public int f10289d;

    /* renamed from: e */
    public int f10290e;

    /* renamed from: f */
    public C1044Qa f10291f;

    /* renamed from: g */
    public int f10292g;

    /* renamed from: h */
    public boolean f10293h;

    /* renamed from: i */
    public long f10294i;

    /* renamed from: j */
    public float f10295j;

    /* renamed from: k */
    public boolean f10296k;

    /* renamed from: l */
    public long f10297l;

    /* renamed from: m */
    public long f10298m;

    /* renamed from: n */
    public Method f10299n;

    /* renamed from: o */
    public long f10300o;

    /* renamed from: p */
    public boolean f10301p;

    /* renamed from: q */
    public boolean f10302q;

    /* renamed from: r */
    public long f10303r;

    /* renamed from: s */
    public long f10304s;

    /* renamed from: t */
    public long f10305t;

    /* renamed from: u */
    public long f10306u;

    /* renamed from: v */
    public long f10307v;

    /* renamed from: w */
    public int f10308w;

    /* renamed from: x */
    public int f10309x;

    /* renamed from: y */
    public long f10310y;

    /* renamed from: z */
    public long f10311z;

    public C1106Ra(C7978Mu0 c7978Mu0) {
        this.f10286a = c7978Mu0;
        try {
            this.f10299n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f10287b = new long[10];
        this.f10285J = M71.f6997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0213 A[Catch: Exception -> 0x0229, TRY_LEAVE, TryCatch #0 {Exception -> 0x0229, blocks: (B:223:0x01ed, B:225:0x0213), top: B:267:0x01ed }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m7040a(boolean r26) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1106Ra.m7040a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x009f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m7041b() {
        /*
            r11 = this;
            M71 r0 = r11.f10285J
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.f10310y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L46
            android.media.AudioTrack r2 = r11.f10288c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L23
            long r0 = r11.f10276A
            return r0
        L23:
            long r0 = p000.AbstractC7485Dh1.m1802Q(r0)
            long r2 = r11.f10310y
            long r0 = r0 - r2
            float r2 = r11.f10295j
            long r3 = p000.AbstractC7485Dh1.m1840y(r0, r2)
            int r0 = r11.f10292g
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.CEILING
            long r0 = p000.AbstractC7485Dh1.m1810Y(r3, r5, r7, r9)
            long r2 = r11.f10277B
            long r4 = r11.f10276A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r6 = r11.f10304s
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto Lb7
            android.media.AudioTrack r2 = r11.f10288c
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
            boolean r2 = r11.f10293h
            r9 = 0
            if (r2 == 0) goto L7b
            if (r6 != r3) goto L78
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L78
            long r2 = r11.f10305t
            r11.f10307v = r2
        L78:
            long r2 = r11.f10307v
            long r7 = r7 + r2
        L7b:
            int r2 = p000.AbstractC7485Dh1.f2166a
            r3 = 29
            if (r2 > r3) goto L99
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L97
            long r2 = r11.f10305t
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L97
            r2 = 3
            if (r6 != r2) goto L97
            long r2 = r11.f10311z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb5
            r11.f10311z = r0
            goto Lb5
        L97:
            r11.f10311z = r4
        L99:
            long r2 = r11.f10305t
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb3
            boolean r4 = r11.f10283H
            if (r4 == 0) goto Lac
            long r4 = r11.f10284I
            long r4 = r4 + r2
            r11.f10284I = r4
            r2 = 0
            r11.f10283H = r2
            goto Lb3
        Lac:
            long r2 = r11.f10306u
            r4 = 1
            long r2 = r2 + r4
            r11.f10306u = r2
        Lb3:
            r11.f10305t = r7
        Lb5:
            r11.f10304s = r0
        Lb7:
            long r0 = r11.f10305t
            long r2 = r11.f10284I
            long r0 = r0 + r2
            long r2 = r11.f10306u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1106Ra.m7041b():long");
    }

    /* renamed from: c */
    public final boolean m7042c(long j) {
        long jM7040a = m7040a(false);
        int i = this.f10292g;
        int i2 = AbstractC7485Dh1.f2166a;
        if (j <= AbstractC7485Dh1.m1810Y(jM7040a, i, 1000000L, RoundingMode.CEILING)) {
            if (!this.f10293h) {
                return false;
            }
            AudioTrack audioTrack = this.f10288c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || m7041b() != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m7043d() {
        this.f10297l = 0L;
        this.f10309x = 0;
        this.f10308w = 0;
        this.f10298m = 0L;
        this.f10279D = 0L;
        this.f10282G = 0L;
        this.f10296k = false;
    }
}
