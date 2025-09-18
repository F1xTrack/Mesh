package p000;

import java.nio.ByteBuffer;

/* renamed from: Co */
/* loaded from: classes.dex */
public final class C0177Co extends AbstractC0043Ag {

    /* renamed from: r */
    public final C1587ZD f1659r;

    /* renamed from: s */
    public final C9591hA0 f1660s;

    /* renamed from: t */
    public long f1661t;

    /* renamed from: u */
    public InterfaceC0114Bo f1662u;

    /* renamed from: v */
    public long f1663v;

    public C0177Co() {
        super(6);
        this.f1659r = new C1587ZD(1);
        this.f1660s = new C9591hA0();
    }

    @Override // p000.AbstractC0043Ag, p000.PB0
    /* renamed from: d */
    public final void mo259d(int i, Object obj) {
        if (i == 8) {
            this.f1662u = (InterfaceC0114Bo) obj;
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: i */
    public final String mo263i() {
        return "CameraMotionRenderer";
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: k */
    public final boolean mo265k() {
        return m264j();
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: l */
    public final boolean mo266l() {
        return true;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: m */
    public final void mo267m() {
        InterfaceC0114Bo interfaceC0114Bo = this.f1662u;
        if (interfaceC0114Bo != null) {
            interfaceC0114Bo.mo881b();
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: o */
    public final void mo269o(long j, boolean z) {
        this.f1663v = Long.MIN_VALUE;
        InterfaceC0114Bo interfaceC0114Bo = this.f1662u;
        if (interfaceC0114Bo != null) {
            interfaceC0114Bo.mo881b();
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: t */
    public final void mo274t(C6686qX[] c6686qXArr, long j, long j2) {
        this.f1661t = j2;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: v */
    public final void mo276v(long j, long j2) {
        float[] fArr;
        while (!m264j() && this.f1663v < 100000 + j) {
            C1587ZD c1587zd = this.f1659r;
            c1587zd.mo7722t();
            C0827N8 c0827n8 = this.f308c;
            c0827n8.m5557f();
            if (m275u(c0827n8, c1587zd, 0) != -4 || c1587zd.m2501g(4)) {
                return;
            }
            long j3 = c1587zd.f14800g;
            this.f1663v = j3;
            boolean z = j3 < this.f317l;
            if (this.f1662u != null && !z) {
                c1587zd.m9507w();
                ByteBuffer byteBuffer = c1587zd.f14798e;
                int i = AbstractC7485Dh1.f2166a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C9591hA0 c9591hA0 = this.f1660s;
                    c9591hA0.m18739E(iLimit, bArrArray);
                    c9591hA0.m18741G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(c9591hA0.m18751i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f1662u.mo880a(this.f1663v - this.f1661t, fArr);
                }
            }
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: z */
    public final int mo280z(C6686qX c6686qX) {
        return "application/x-camera-motion".equals(c6686qX.f40974m) ? AbstractC11153tN0.m24901m(4, 0, 0, 0) : AbstractC11153tN0.m24901m(0, 0, 0, 0);
    }
}
