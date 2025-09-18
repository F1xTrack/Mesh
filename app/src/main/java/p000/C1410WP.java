package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: WP */
/* loaded from: classes2.dex */
public final class C1410WP extends AbstractC0349FX {

    /* renamed from: b */
    public final long f13168b;

    /* renamed from: c */
    public long f13169c;

    /* renamed from: d */
    public boolean f13170d;

    /* renamed from: e */
    public boolean f13171e;

    /* renamed from: f */
    public boolean f13172f;

    /* renamed from: g */
    public final /* synthetic */ C4198hk f13173g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410WP(C4198hk c4198hk, U21 u21, long j) {
        super(u21);
        O90.m5968f(u21, "delegate");
        this.f13173g = c4198hk;
        this.f13168b = j;
        this.f13170d = true;
        if (j == 0) {
            m8758a(null);
        }
    }

    @Override // p000.AbstractC0349FX, p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        O90.m5968f(c6507nj, "sink");
        if (this.f13172f) {
            throw new IllegalStateException("closed");
        }
        try {
            long jMo96H = this.f3294a.mo96H(c6507nj, 8192L);
            if (this.f13170d) {
                this.f13170d = false;
                C4198hk c4198hk = this.f13173g;
                c4198hk.getClass();
                O90.m5968f((DN0) c4198hk.f28554b, "call");
            }
            if (jMo96H == -1) {
                m8758a(null);
                return -1L;
            }
            long j2 = this.f13169c + jMo96H;
            long j3 = this.f13168b;
            if (j3 == -1 || j2 <= j3) {
                this.f13169c = j2;
                if (j2 == j3) {
                    m8758a(null);
                }
                return jMo96H;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw m8758a(e);
        }
    }

    /* renamed from: a */
    public final IOException m8758a(IOException iOException) {
        if (this.f13171e) {
            return iOException;
        }
        this.f13171e = true;
        C4198hk c4198hk = this.f13173g;
        if (iOException == null && this.f13170d) {
            this.f13170d = false;
            c4198hk.getClass();
            O90.m5968f((DN0) c4198hk.f28554b, "call");
        }
        return c4198hk.m18862j(true, false, iOException);
    }

    @Override // p000.AbstractC0349FX, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13172f) {
            return;
        }
        this.f13172f = true;
        try {
            super.close();
            m8758a(null);
        } catch (IOException e) {
            throw m8758a(e);
        }
    }
}
