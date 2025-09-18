package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class W30 extends U30 {
    public final D40 d;
    public long e;
    public boolean f;
    public final /* synthetic */ C5350je g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W30(C5350je c5350je, D40 d40) {
        super(c5350je);
        O90.f(d40, "url");
        this.g = c5350je;
        this.d = d40;
        this.e = -1L;
        this.f = true;
    }

    @Override // defpackage.U30, defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        O90.f(c6129nj, "sink");
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f) {
            return -1L;
        }
        long j2 = this.e;
        C5350je c5350je = this.g;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                ((C8351zN0) c5350je.e).W(Long.MAX_VALUE);
            }
            try {
                this.e = ((C8351zN0) c5350je.e).D();
                String string = AbstractC7538v51.Y(((C8351zN0) c5350je.e).W(Long.MAX_VALUE)).toString();
                if (this.e < 0 || (string.length() > 0 && !D51.o(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + string + '\"');
                }
                if (this.e == 0) {
                    this.f = false;
                    C0617Hr c0617Hr = (C0617Hr) c5350je.g;
                    c0617Hr.getClass();
                    J20 j20 = new J20();
                    while (true) {
                        String strW = ((C8351zN0) c0617Hr.c).W(c0617Hr.b);
                        c0617Hr.b -= strW.length();
                        if (strW.length() == 0) {
                            break;
                        }
                        j20.c(strW);
                    }
                    c5350je.h = j20.g();
                    C6363ox0 c6363ox0 = (C6363ox0) c5350je.c;
                    O90.c(c6363ox0);
                    K20 k20 = (K20) c5350je.h;
                    O90.c(k20);
                    AbstractC7724w40.b(c6363ox0.j, this.d, k20);
                    m();
                }
                if (!this.f) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jH = super.H(c6129nj, Math.min(8192L, this.e));
        if (jH != -1) {
            this.e -= jH;
            return jH;
        }
        ((FN0) c5350je.d).l();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        m();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.f && !AbstractC0199Ch1.i(this, TimeUnit.MILLISECONDS)) {
            ((FN0) this.g.d).l();
            m();
        }
        this.b = true;
    }
}
