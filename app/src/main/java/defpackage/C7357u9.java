package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: u9 */
/* loaded from: classes2.dex */
public final class C7357u9 implements U21 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public C7357u9(InputStream inputStream, C0334Ea1 c0334Ea1) {
        O90.f(inputStream, "input");
        this.b = inputStream;
        this.c = c0334Ea1;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        switch (this.a) {
            case 0:
                O90.f(c6129nj, "sink");
                C7357u9 c7357u9 = (C7357u9) this.c;
                J21 j21 = (J21) this.b;
                j21.i();
                try {
                    long jH = c7357u9.H(c6129nj, 8192L);
                    if (j21.j()) {
                        throw j21.l(null);
                    }
                    return jH;
                } catch (IOException e) {
                    if (j21.j()) {
                        throw j21.l(e);
                    }
                    throw e;
                } finally {
                    j21.j();
                }
            default:
                O90.f(c6129nj, "sink");
                try {
                    ((C0334Ea1) this.c).f();
                    JX0 jx0N0 = c6129nj.n0(1);
                    int i = ((InputStream) this.b).read(jx0N0.a, jx0N0.c, (int) Math.min(8192L, 8192 - jx0N0.c));
                    if (i == -1) {
                        if (jx0N0.b == jx0N0.c) {
                            c6129nj.a = jx0N0.a();
                            RX0.a(jx0N0);
                        }
                        return -1L;
                    }
                    jx0N0.c += i;
                    long j2 = i;
                    c6129nj.b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (JI1.c(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                C7357u9 c7357u9 = (C7357u9) this.c;
                J21 j21 = (J21) this.b;
                j21.i();
                try {
                    c7357u9.close();
                    if (j21.j()) {
                        throw j21.l(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!j21.j()) {
                        throw e;
                    }
                    throw j21.l(e);
                } finally {
                    j21.j();
                }
            default:
                ((InputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        switch (this.a) {
            case 0:
                return (J21) this.b;
            default:
                return (C0334Ea1) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((C7357u9) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }

    public C7357u9(J21 j21, C7357u9 c7357u9) {
        this.b = j21;
        this.c = c7357u9;
    }
}
