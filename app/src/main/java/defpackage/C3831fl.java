package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: fl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3831fl implements U21 {
    public boolean a;
    public final /* synthetic */ InterfaceC0827Kj b;
    public final /* synthetic */ C4210hk c;
    public final /* synthetic */ C8161yN0 d;

    public C3831fl(InterfaceC0827Kj interfaceC0827Kj, C4210hk c4210hk, C8161yN0 c8161yN0) {
        this.b = interfaceC0827Kj;
        this.c = c4210hk;
        this.d = c8161yN0;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        O90.f(c6129nj, "sink");
        try {
            long jH = this.b.H(c6129nj, 8192L);
            C8161yN0 c8161yN0 = this.d;
            if (jH != -1) {
                c6129nj.p(c8161yN0.b, c6129nj.b - jH, jH);
                c8161yN0.m();
                return jH;
            }
            if (!this.a) {
                this.a = true;
                c8161yN0.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.a) {
                this.a = true;
                this.c.i();
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.a && !AbstractC0199Ch1.i(this, TimeUnit.MILLISECONDS)) {
            this.a = true;
            this.c.i();
        }
        this.b.close();
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.b.r();
    }
}
