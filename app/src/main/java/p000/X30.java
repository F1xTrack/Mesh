package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class X30 extends U30 {

    /* renamed from: d */
    public long f13548d;

    /* renamed from: e */
    public final /* synthetic */ C6250je f13549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X30(C6250je c6250je, long j) {
        super(c6250je);
        this.f13549e = c6250je;
        this.f13548d = j;
        if (j == 0) {
            m7868m();
        }
    }

    @Override // p000.U30, p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        O90.m5968f(c6507nj, "sink");
        if (this.f11624b) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f13548d;
        if (j2 == 0) {
            return -1L;
        }
        long jMo96H = super.mo96H(c6507nj, Math.min(j2, 8192L));
        if (jMo96H == -1) {
            ((FN0) this.f13549e.f35299d).m2616l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m7868m();
            throw protocolException;
        }
        long j3 = this.f13548d - jMo96H;
        this.f13548d = j3;
        if (j3 == 0) {
            m7868m();
        }
        return jMo96H;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11624b) {
            return;
        }
        if (this.f13548d != 0 && !AbstractC7433Ch1.m1280i(this, TimeUnit.MILLISECONDS)) {
            ((FN0) this.f13549e.f35299d).m2616l();
            m7868m();
        }
        this.f11624b = true;
    }
}
