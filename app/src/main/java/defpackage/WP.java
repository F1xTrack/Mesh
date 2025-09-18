package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes2.dex */
public final class WP extends FX {
    public final long b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ C4210hk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WP(C4210hk c4210hk, U21 u21, long j) {
        super(u21);
        O90.f(u21, "delegate");
        this.g = c4210hk;
        this.b = j;
        this.d = true;
        if (j == 0) {
            a(null);
        }
    }

    @Override // defpackage.FX, defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        O90.f(c6129nj, "sink");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        try {
            long jH = this.a.H(c6129nj, 8192L);
            if (this.d) {
                this.d = false;
                C4210hk c4210hk = this.g;
                c4210hk.getClass();
                O90.f((DN0) c4210hk.b, "call");
            }
            if (jH == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.c + jH;
            long j3 = this.b;
            if (j3 == -1 || j2 <= j3) {
                this.c = j2;
                if (j2 == j3) {
                    a(null);
                }
                return jH;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw a(e);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.e) {
            return iOException;
        }
        this.e = true;
        C4210hk c4210hk = this.g;
        if (iOException == null && this.d) {
            this.d = false;
            c4210hk.getClass();
            O90.f((DN0) c4210hk.b, "call");
        }
        return c4210hk.j(true, false, iOException);
    }

    @Override // defpackage.FX, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
