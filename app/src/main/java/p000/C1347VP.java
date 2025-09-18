package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: VP */
/* loaded from: classes2.dex */
public final class C1347VP extends AbstractC0286EX {

    /* renamed from: b */
    public final long f12544b;

    /* renamed from: c */
    public boolean f12545c;

    /* renamed from: d */
    public long f12546d;

    /* renamed from: e */
    public boolean f12547e;

    /* renamed from: f */
    public final /* synthetic */ C4198hk f12548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347VP(C4198hk c4198hk, Z11 z11, long j) {
        super(z11);
        O90.m5968f(z11, "delegate");
        this.f12548f = c4198hk;
        this.f12544b = j;
    }

    /* renamed from: a */
    public final IOException m8437a(IOException iOException) {
        if (this.f12545c) {
            return iOException;
        }
        this.f12545c = true;
        return this.f12548f.m18862j(false, true, iOException);
    }

    @Override // p000.AbstractC0286EX, p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) throws IOException {
        O90.m5968f(c6507nj, "source");
        if (this.f12547e) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f12544b;
        if (j2 != -1 && this.f12546d + j > j2) {
            StringBuilder sbM26239p = AbstractC7222ym.m26239p("expected ", j2, " bytes but received ");
            sbM26239p.append(this.f12546d + j);
            throw new ProtocolException(sbM26239p.toString());
        }
        try {
            super.mo2328c0(c6507nj, j);
            this.f12546d += j;
        } catch (IOException e) {
            throw m8437a(e);
        }
    }

    @Override // p000.AbstractC0286EX, p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f12547e) {
            return;
        }
        this.f12547e = true;
        long j = this.f12544b;
        if (j != -1 && this.f12546d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m8437a(null);
        } catch (IOException e) {
            throw m8437a(e);
        }
    }

    @Override // p000.AbstractC0286EX, p000.Z11, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw m8437a(e);
        }
    }
}
