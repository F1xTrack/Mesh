package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class X30 extends U30 {
    public long d;
    public final /* synthetic */ C5350je e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X30(C5350je c5350je, long j) {
        super(c5350je);
        this.e = c5350je;
        this.d = j;
        if (j == 0) {
            m();
        }
    }

    @Override // defpackage.U30, defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        O90.f(c6129nj, "sink");
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jH = super.H(c6129nj, Math.min(j2, 8192L));
        if (jH == -1) {
            ((FN0) this.e.d).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        long j3 = this.d - jH;
        this.d = j3;
        if (j3 == 0) {
            m();
        }
        return jH;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.d != 0 && !AbstractC0199Ch1.i(this, TimeUnit.MILLISECONDS)) {
            ((FN0) this.e.d).l();
            m();
        }
        this.b = true;
    }
}
