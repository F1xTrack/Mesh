package p000;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* renamed from: n70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10353n70 extends AbstractC0043Ag {

    /* renamed from: A */
    public int f38111A;

    /* renamed from: B */
    public C6686qX f38112B;

    /* renamed from: C */
    public C1681ai f38113C;

    /* renamed from: D */
    public C1587ZD f38114D;

    /* renamed from: E */
    public ImageOutput f38115E;

    /* renamed from: F */
    public Bitmap f38116F;

    /* renamed from: G */
    public boolean f38117G;

    /* renamed from: H */
    public C0303Eo f38118H;

    /* renamed from: I */
    public C0303Eo f38119I;

    /* renamed from: J */
    public int f38120J;

    /* renamed from: r */
    public final C9432fw1 f38121r;

    /* renamed from: s */
    public final C1587ZD f38122s;

    /* renamed from: t */
    public final ArrayDeque f38123t;

    /* renamed from: u */
    public boolean f38124u;

    /* renamed from: v */
    public boolean f38125v;

    /* renamed from: w */
    public C10225m70 f38126w;

    /* renamed from: x */
    public long f38127x;

    /* renamed from: y */
    public long f38128y;

    /* renamed from: z */
    public int f38129z;

    public C10353n70(C9432fw1 c9432fw1) {
        super(4);
        this.f38121r = c9432fw1;
        this.f38115E = ImageOutput.f16353a;
        this.f38122s = new C1587ZD(0);
        this.f38126w = C10225m70.f37489c;
        this.f38123t = new ArrayDeque();
        this.f38128y = -9223372036854775807L;
        this.f38127x = -9223372036854775807L;
        this.f38129z = 0;
        this.f38111A = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m23080B(long r13) throws java.lang.InterruptedException, p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10353n70.m23080B(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m23081C(long r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10353n70.m23081C(long):boolean");
    }

    /* renamed from: D */
    public final void m23082D() throws InterruptedException, C0531IQ {
        C6686qX c6686qX = this.f38112B;
        C9432fw1 c9432fw1 = this.f38121r;
        int iM18339q = c9432fw1.m18339q(c6686qX);
        if (iM18339q != AbstractC11153tN0.m24901m(4, 0, 0, 0) && iM18339q != AbstractC11153tN0.m24901m(3, 0, 0, 0)) {
            throw m260f(new A60("Provided decoder factory can't create decoder for format."), this.f38112B, false, 4005);
        }
        C1681ai c1681ai = this.f38113C;
        if (c1681ai != null) {
            c1681ai.release();
        }
        this.f38113C = new C1681ai((C4262il) c9432fw1.f27505b);
    }

    /* renamed from: E */
    public final void m23083E() throws InterruptedException {
        this.f38114D = null;
        this.f38129z = 0;
        this.f38128y = -9223372036854775807L;
        C1681ai c1681ai = this.f38113C;
        if (c1681ai != null) {
            c1681ai.release();
            this.f38113C = null;
        }
    }

    @Override // p000.AbstractC0043Ag, p000.PB0
    /* renamed from: d */
    public final void mo259d(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f16353a;
        }
        this.f38115E = imageOutput;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: i */
    public final String mo263i() {
        return "ImageRenderer";
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: k */
    public final boolean mo265k() {
        return this.f38125v;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: l */
    public final boolean mo266l() {
        int i = this.f38111A;
        return i == 3 || (i == 0 && this.f38117G);
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: m */
    public final void mo267m() throws InterruptedException {
        this.f38112B = null;
        this.f38126w = C10225m70.f37489c;
        this.f38123t.clear();
        m23083E();
        this.f38115E.getClass();
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: n */
    public final void mo268n(boolean z, boolean z2) {
        this.f38111A = z2 ? 1 : 0;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: o */
    public final void mo269o(long j, boolean z) {
        this.f38111A = Math.min(this.f38111A, 1);
        this.f38125v = false;
        this.f38124u = false;
        this.f38116F = null;
        this.f38118H = null;
        this.f38119I = null;
        this.f38117G = false;
        this.f38114D = null;
        C1681ai c1681ai = this.f38113C;
        if (c1681ai != null) {
            c1681ai.flush();
        }
        this.f38123t.clear();
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: p */
    public final void mo270p() throws InterruptedException {
        m23083E();
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: q */
    public final void mo271q() throws InterruptedException {
        m23083E();
        this.f38111A = Math.min(this.f38111A, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // p000.AbstractC0043Ag
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo274t(p000.C6686qX[] r6, long r7, long r9) {
        /*
            r5 = this;
            m70 r6 = r5.f38126w
            long r6 = r6.f37491b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.f38123t
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.f38128y
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.f38127x
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            m70 r7 = new m70
            long r0 = r5.f38128y
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            m70 r6 = new m70
            r6.<init>(r0, r9)
            r5.f38126w = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10353n70.mo274t(qX[], long, long):void");
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: v */
    public final void mo276v(long j, long j2) throws InterruptedException, C0531IQ {
        if (this.f38125v) {
            return;
        }
        if (this.f38112B == null) {
            C0827N8 c0827n8 = this.f308c;
            c0827n8.m5557f();
            C1587ZD c1587zd = this.f38122s;
            c1587zd.mo7722t();
            int iM275u = m275u(c0827n8, c1587zd, 2);
            if (iM275u != -5) {
                if (iM275u == -4) {
                    YN1.m9281f(c1587zd.m2501g(4));
                    this.f38124u = true;
                    this.f38125v = true;
                    return;
                }
                return;
            }
            C6686qX c6686qX = (C6686qX) c0827n8.f7524c;
            YN1.m9283h(c6686qX);
            this.f38112B = c6686qX;
            m23082D();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m23080B(j)) {
            }
            while (m23081C(j)) {
            }
            Trace.endSection();
        } catch (A60 e) {
            throw m260f(e, null, false, 4003);
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: z */
    public final int mo280z(C6686qX c6686qX) {
        return this.f38121r.m18339q(c6686qX);
    }
}
