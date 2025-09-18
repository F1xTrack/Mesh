package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class W30 extends U30 {

    /* renamed from: d */
    public final D40 f12941d;

    /* renamed from: e */
    public long f12942e;

    /* renamed from: f */
    public boolean f12943f;

    /* renamed from: g */
    public final /* synthetic */ C6250je f12944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W30(C6250je c6250je, D40 d40) {
        super(c6250je);
        O90.m5968f(d40, "url");
        this.f12944g = c6250je;
        this.f12941d = d40;
        this.f12942e = -1L;
        this.f12943f = true;
    }

    @Override // p000.U30, p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        O90.m5968f(c6507nj, "sink");
        if (this.f11624b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f12943f) {
            return -1L;
        }
        long j2 = this.f12942e;
        C6250je c6250je = this.f12944g;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                ((C11917zN0) c6250je.f35300e).m26384W(Long.MAX_VALUE);
            }
            try {
                this.f12942e = ((C11917zN0) c6250je.f35300e).m26380D();
                String string = AbstractC11374v51.m25350Y(((C11917zN0) c6250je.f35300e).m26384W(Long.MAX_VALUE)).toString();
                if (this.f12942e < 0 || (string.length() > 0 && !D51.m1556o(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f12942e + string + '\"');
                }
                if (this.f12942e == 0) {
                    this.f12943f = false;
                    C0495Hr c0495Hr = (C0495Hr) c6250je.f35302g;
                    c0495Hr.getClass();
                    J20 j20 = new J20();
                    while (true) {
                        String strM26384W = ((C11917zN0) c0495Hr.f4554c).m26384W(c0495Hr.f4553b);
                        c0495Hr.f4553b -= strM26384W.length();
                        if (strM26384W.length() == 0) {
                            break;
                        }
                        j20.m4136c(strM26384W);
                    }
                    c6250je.f35303h = j20.m4140g();
                    C10585ox0 c10585ox0 = (C10585ox0) c6250je.f35298c;
                    O90.m5965c(c10585ox0);
                    K20 k20 = (K20) c6250je.f35303h;
                    O90.m5965c(k20);
                    AbstractC11498w40.m25559b(c10585ox0.f39380j, this.f12941d, k20);
                    m7868m();
                }
                if (!this.f12943f) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jMo96H = super.mo96H(c6507nj, Math.min(8192L, this.f12942e));
        if (jMo96H != -1) {
            this.f12942e -= jMo96H;
            return jMo96H;
        }
        ((FN0) c6250je.f35299d).m2616l();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        m7868m();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11624b) {
            return;
        }
        if (this.f12943f && !AbstractC7433Ch1.m1280i(this, TimeUnit.MILLISECONDS)) {
            ((FN0) this.f12944g.f35299d).m2616l();
            m7868m();
        }
        this.f11624b = true;
    }
}
