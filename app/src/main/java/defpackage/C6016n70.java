package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* renamed from: n70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6016n70 extends AbstractC0038Ag {
    public int A;
    public C6666qX B;
    public C2184ai C;
    public ZD D;
    public ImageOutput E;
    public Bitmap F;
    public boolean G;
    public C0374Eo H;
    public C0374Eo I;
    public int J;
    public final C3866fw1 r;
    public final ZD s;
    public final ArrayDeque t;
    public boolean u;
    public boolean v;
    public C5825m70 w;
    public long x;
    public long y;
    public int z;

    public C6016n70(C3866fw1 c3866fw1) {
        super(4);
        this.r = c3866fw1;
        this.E = ImageOutput.a;
        this.s = new ZD(0);
        this.w = C5825m70.c;
        this.t = new ArrayDeque();
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = 0;
        this.A = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(long r13) throws java.lang.InterruptedException, defpackage.IQ {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6016n70.B(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(long r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6016n70.C(long):boolean");
    }

    public final void D() throws InterruptedException, IQ {
        C6666qX c6666qX = this.B;
        C3866fw1 c3866fw1 = this.r;
        int iQ = c3866fw1.q(c6666qX);
        if (iQ != AbstractC7209tN0.m(4, 0, 0, 0) && iQ != AbstractC7209tN0.m(3, 0, 0, 0)) {
            throw f(new A60("Provided decoder factory can't create decoder for format."), this.B, false, 4005);
        }
        C2184ai c2184ai = this.C;
        if (c2184ai != null) {
            c2184ai.release();
        }
        this.C = new C2184ai((C4403il) c3866fw1.b);
    }

    public final void E() throws InterruptedException {
        this.D = null;
        this.z = 0;
        this.y = -9223372036854775807L;
        C2184ai c2184ai = this.C;
        if (c2184ai != null) {
            c2184ai.release();
            this.C = null;
        }
    }

    @Override // defpackage.AbstractC0038Ag, defpackage.PB0
    public final void d(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.E = imageOutput;
    }

    @Override // defpackage.AbstractC0038Ag
    public final String i() {
        return "ImageRenderer";
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean k() {
        return this.v;
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean l() {
        int i = this.A;
        return i == 3 || (i == 0 && this.G);
    }

    @Override // defpackage.AbstractC0038Ag
    public final void m() throws InterruptedException {
        this.B = null;
        this.w = C5825m70.c;
        this.t.clear();
        E();
        this.E.getClass();
    }

    @Override // defpackage.AbstractC0038Ag
    public final void n(boolean z, boolean z2) {
        this.A = z2 ? 1 : 0;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void o(long j, boolean z) {
        this.A = Math.min(this.A, 1);
        this.v = false;
        this.u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        C2184ai c2184ai = this.C;
        if (c2184ai != null) {
            c2184ai.flush();
        }
        this.t.clear();
    }

    @Override // defpackage.AbstractC0038Ag
    public final void p() throws InterruptedException {
        E();
    }

    @Override // defpackage.AbstractC0038Ag
    public final void q() throws InterruptedException {
        E();
        this.A = Math.min(this.A, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // defpackage.AbstractC0038Ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.C6666qX[] r6, long r7, long r9) {
        /*
            r5 = this;
            m70 r6 = r5.w
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.t
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.y
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.x
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            m70 r7 = new m70
            long r0 = r5.y
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            m70 r6 = new m70
            r6.<init>(r0, r9)
            r5.w = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6016n70.t(qX[], long, long):void");
    }

    @Override // defpackage.AbstractC0038Ag
    public final void v(long j, long j2) throws InterruptedException, IQ {
        if (this.v) {
            return;
        }
        if (this.B == null) {
            N8 n8 = this.c;
            n8.f();
            ZD zd = this.s;
            zd.t();
            int iU = u(n8, zd, 2);
            if (iU != -5) {
                if (iU == -4) {
                    YN1.f(zd.g(4));
                    this.u = true;
                    this.v = true;
                    return;
                }
                return;
            }
            C6666qX c6666qX = (C6666qX) n8.c;
            YN1.h(c6666qX);
            this.B = c6666qX;
            D();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (B(j)) {
            }
            while (C(j)) {
            }
            Trace.endSection();
        } catch (A60 e) {
            throw f(e, null, false, 4003);
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final int z(C6666qX c6666qX) {
        return this.r.q(c6666qX);
    }
}
