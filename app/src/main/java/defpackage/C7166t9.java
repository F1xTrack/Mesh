package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: t9 */
/* loaded from: classes2.dex */
public final class C7166t9 implements Z11 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C7166t9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) {
        switch (this.a) {
            case 0:
                O90.f(c6129nj, "source");
                AbstractC1525Ti.b(c6129nj.b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    JX0 jx0 = c6129nj.a;
                    O90.c(jx0);
                    while (true) {
                        if (j2 < 65536) {
                            j2 += jx0.c - jx0.b;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                jx0 = jx0.f;
                                O90.c(jx0);
                            }
                        }
                    }
                    C7166t9 c7166t9 = (C7166t9) this.c;
                    J21 j21 = (J21) this.b;
                    j21.i();
                    try {
                        c7166t9.c0(c6129nj, j2);
                        if (j21.j()) {
                            throw j21.l(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!j21.j()) {
                            throw e;
                        }
                        throw j21.l(e);
                    } finally {
                        j21.j();
                    }
                }
            default:
                O90.f(c6129nj, "source");
                AbstractC1525Ti.b(c6129nj.b, 0L, j);
                while (j > 0) {
                    ((C0334Ea1) this.c).f();
                    JX0 jx02 = c6129nj.a;
                    O90.c(jx02);
                    int iMin = (int) Math.min(j, jx02.c - jx02.b);
                    ((OutputStream) this.b).write(jx02.a, jx02.b, iMin);
                    int i = jx02.b + iMin;
                    jx02.b = i;
                    long j3 = iMin;
                    j -= j3;
                    c6129nj.b -= j3;
                    if (i == jx02.c) {
                        c6129nj.a = jx02.a();
                        RX0.a(jx02);
                    }
                }
                return;
        }
    }

    @Override // defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                C7166t9 c7166t9 = (C7166t9) this.c;
                J21 j21 = (J21) this.b;
                j21.i();
                try {
                    c7166t9.close();
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
                ((OutputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.Z11, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                C7166t9 c7166t9 = (C7166t9) this.c;
                J21 j21 = (J21) this.b;
                j21.i();
                try {
                    c7166t9.flush();
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
                ((OutputStream) this.b).flush();
                return;
        }
    }

    @Override // defpackage.Z11
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
                return "AsyncTimeout.sink(" + ((C7166t9) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }
}
