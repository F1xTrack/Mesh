package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: fl */
/* loaded from: classes2.dex */
public final class C4073fl implements U21 {

    /* renamed from: a */
    public boolean f27368a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0676Kj f27369b;

    /* renamed from: c */
    public final /* synthetic */ C4198hk f27370c;

    /* renamed from: d */
    public final /* synthetic */ C11790yN0 f27371d;

    public C4073fl(InterfaceC0676Kj interfaceC0676Kj, C4198hk c4198hk, C11790yN0 c11790yN0) {
        this.f27369b = interfaceC0676Kj;
        this.f27370c = c4198hk;
        this.f27371d = c11790yN0;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        O90.m5968f(c6507nj, "sink");
        try {
            long jMo96H = this.f27369b.mo96H(c6507nj, 8192L);
            C11790yN0 c11790yN0 = this.f27371d;
            if (jMo96H != -1) {
                c6507nj.m23192p(c11790yN0.f46237b, c6507nj.f38488b - jMo96H, jMo96H);
                c11790yN0.m26143m();
                return jMo96H;
            }
            if (!this.f27368a) {
                this.f27368a = true;
                c11790yN0.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f27368a) {
                this.f27368a = true;
                this.f27370c.m18861i();
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f27368a && !AbstractC7433Ch1.m1280i(this, TimeUnit.MILLISECONDS)) {
            this.f27368a = true;
            this.f27370c.m18861i();
        }
        this.f27369b.close();
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f27369b.mo97r();
    }
}
