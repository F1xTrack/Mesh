package defpackage;

import java.nio.ByteBuffer;

/* renamed from: Co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218Co extends AbstractC0038Ag {
    public final ZD r;
    public final C4103hA0 s;
    public long t;
    public InterfaceC0140Bo u;
    public long v;

    public C0218Co() {
        super(6);
        this.r = new ZD(1);
        this.s = new C4103hA0();
    }

    @Override // defpackage.AbstractC0038Ag, defpackage.PB0
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.u = (InterfaceC0140Bo) obj;
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean k() {
        return j();
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean l() {
        return true;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void m() {
        InterfaceC0140Bo interfaceC0140Bo = this.u;
        if (interfaceC0140Bo != null) {
            interfaceC0140Bo.b();
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void o(long j, boolean z) {
        this.v = Long.MIN_VALUE;
        InterfaceC0140Bo interfaceC0140Bo = this.u;
        if (interfaceC0140Bo != null) {
            interfaceC0140Bo.b();
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void t(C6666qX[] c6666qXArr, long j, long j2) {
        this.t = j2;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void v(long j, long j2) {
        float[] fArr;
        while (!j() && this.v < 100000 + j) {
            ZD zd = this.r;
            zd.t();
            N8 n8 = this.c;
            n8.f();
            if (u(n8, zd, 0) != -4 || zd.g(4)) {
                return;
            }
            long j3 = zd.g;
            this.v = j3;
            boolean z = j3 < this.l;
            if (this.u != null && !z) {
                zd.w();
                ByteBuffer byteBuffer = zd.e;
                int i = AbstractC0277Dh1.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C4103hA0 c4103hA0 = this.s;
                    c4103hA0.E(iLimit, bArrArray);
                    c4103hA0.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(c4103hA0.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.u.a(this.v - this.t, fArr);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final int z(C6666qX c6666qX) {
        return "application/x-camera-motion".equals(c6666qX.m) ? AbstractC7209tN0.m(4, 0, 0, 0) : AbstractC7209tN0.m(0, 0, 0, 0);
    }
}
