package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes2.dex */
public final class VP extends EX {
    public final long b;
    public boolean c;
    public long d;
    public boolean e;
    public final /* synthetic */ C4210hk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VP(C4210hk c4210hk, Z11 z11, long j) {
        super(z11);
        O90.f(z11, "delegate");
        this.f = c4210hk;
        this.b = j;
    }

    public final IOException a(IOException iOException) {
        if (this.c) {
            return iOException;
        }
        this.c = true;
        return this.f.j(false, true, iOException);
    }

    @Override // defpackage.EX, defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) throws IOException {
        O90.f(c6129nj, "source");
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.b;
        if (j2 != -1 && this.d + j > j2) {
            StringBuilder sbP = AbstractC8235ym.p("expected ", j2, " bytes but received ");
            sbP.append(this.d + j);
            throw new ProtocolException(sbP.toString());
        }
        try {
            super.c0(c6129nj, j);
            this.d += j;
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.EX, defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        long j = this.b;
        if (j != -1 && this.d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.EX, defpackage.Z11, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }
}
