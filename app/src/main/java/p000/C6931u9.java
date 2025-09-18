package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: u9 */
/* loaded from: classes2.dex */
public final class C6931u9 implements U21 {

    /* renamed from: a */
    public final /* synthetic */ int f43539a = 0;

    /* renamed from: b */
    public final Object f43540b;

    /* renamed from: c */
    public final Object f43541c;

    public C6931u9(InputStream inputStream, C7523Ea1 c7523Ea1) {
        O90.m5968f(inputStream, "input");
        this.f43540b = inputStream;
        this.f43541c = c7523Ea1;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        switch (this.f43539a) {
            case 0:
                O90.m5968f(c6507nj, "sink");
                C6931u9 c6931u9 = (C6931u9) this.f43541c;
                J21 j21 = (J21) this.f43540b;
                j21.m25369i();
                try {
                    long jMo96H = c6931u9.mo96H(c6507nj, 8192L);
                    if (j21.m25370j()) {
                        throw j21.m4143l(null);
                    }
                    return jMo96H;
                } catch (IOException e) {
                    if (j21.m25370j()) {
                        throw j21.m4143l(e);
                    }
                    throw e;
                } finally {
                    j21.m25370j();
                }
            default:
                O90.m5968f(c6507nj, "sink");
                try {
                    ((C7523Ea1) this.f43541c).mo1729f();
                    JX0 jx0M23189n0 = c6507nj.m23189n0(1);
                    int i = ((InputStream) this.f43540b).read(jx0M23189n0.f5579a, jx0M23189n0.f5581c, (int) Math.min(8192L, 8192 - jx0M23189n0.f5581c));
                    if (i == -1) {
                        if (jx0M23189n0.f5580b == jx0M23189n0.f5581c) {
                            c6507nj.f38487a = jx0M23189n0.m4339a();
                            RX0.m7031a(jx0M23189n0);
                        }
                        return -1L;
                    }
                    jx0M23189n0.f5581c += i;
                    long j2 = i;
                    c6507nj.f38488b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (JI1.m4275c(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f43539a) {
            case 0:
                C6931u9 c6931u9 = (C6931u9) this.f43541c;
                J21 j21 = (J21) this.f43540b;
                j21.m25369i();
                try {
                    c6931u9.close();
                    if (j21.m25370j()) {
                        throw j21.m4143l(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!j21.m25370j()) {
                        throw e;
                    }
                    throw j21.m4143l(e);
                } finally {
                    j21.m25370j();
                }
            default:
                ((InputStream) this.f43540b).close();
                return;
        }
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        switch (this.f43539a) {
            case 0:
                return (J21) this.f43540b;
            default:
                return (C7523Ea1) this.f43541c;
        }
    }

    public final String toString() {
        switch (this.f43539a) {
            case 0:
                return "AsyncTimeout.source(" + ((C6931u9) this.f43541c) + ')';
            default:
                return "source(" + ((InputStream) this.f43540b) + ')';
        }
    }

    public C6931u9(J21 j21, C6931u9 c6931u9) {
        this.f43540b = j21;
        this.f43541c = c6931u9;
    }
}
