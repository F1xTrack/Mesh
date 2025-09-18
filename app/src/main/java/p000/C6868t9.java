package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: t9 */
/* loaded from: classes2.dex */
public final class C6868t9 implements Z11 {

    /* renamed from: a */
    public final /* synthetic */ int f42886a;

    /* renamed from: b */
    public final Object f42887b;

    /* renamed from: c */
    public final Object f42888c;

    public /* synthetic */ C6868t9(Object obj, int i, Object obj2) {
        this.f42886a = i;
        this.f42887b = obj;
        this.f42888c = obj2;
    }

    @Override // p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) {
        switch (this.f42886a) {
            case 0:
                O90.m5968f(c6507nj, "source");
                AbstractC1240Ti.m7729b(c6507nj.f38488b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    JX0 jx0 = c6507nj.f38487a;
                    O90.m5965c(jx0);
                    while (true) {
                        if (j2 < 65536) {
                            j2 += jx0.f5581c - jx0.f5580b;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                jx0 = jx0.f5584f;
                                O90.m5965c(jx0);
                            }
                        }
                    }
                    C6868t9 c6868t9 = (C6868t9) this.f42888c;
                    J21 j21 = (J21) this.f42887b;
                    j21.m25369i();
                    try {
                        c6868t9.mo2328c0(c6507nj, j2);
                        if (j21.m25370j()) {
                            throw j21.m4143l(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!j21.m25370j()) {
                            throw e;
                        }
                        throw j21.m4143l(e);
                    } finally {
                        j21.m25370j();
                    }
                }
            default:
                O90.m5968f(c6507nj, "source");
                AbstractC1240Ti.m7729b(c6507nj.f38488b, 0L, j);
                while (j > 0) {
                    ((C7523Ea1) this.f42888c).mo1729f();
                    JX0 jx02 = c6507nj.f38487a;
                    O90.m5965c(jx02);
                    int iMin = (int) Math.min(j, jx02.f5581c - jx02.f5580b);
                    ((OutputStream) this.f42887b).write(jx02.f5579a, jx02.f5580b, iMin);
                    int i = jx02.f5580b + iMin;
                    jx02.f5580b = i;
                    long j3 = iMin;
                    j -= j3;
                    c6507nj.f38488b -= j3;
                    if (i == jx02.f5581c) {
                        c6507nj.f38487a = jx02.m4339a();
                        RX0.m7031a(jx02);
                    }
                }
                return;
        }
    }

    @Override // p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f42886a) {
            case 0:
                C6868t9 c6868t9 = (C6868t9) this.f42888c;
                J21 j21 = (J21) this.f42887b;
                j21.m25369i();
                try {
                    c6868t9.close();
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
                ((OutputStream) this.f42887b).close();
                return;
        }
    }

    @Override // p000.Z11, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f42886a) {
            case 0:
                C6868t9 c6868t9 = (C6868t9) this.f42888c;
                J21 j21 = (J21) this.f42887b;
                j21.m25369i();
                try {
                    c6868t9.flush();
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
                ((OutputStream) this.f42887b).flush();
                return;
        }
    }

    @Override // p000.Z11
    /* renamed from: r */
    public final C7523Ea1 mo2329r() {
        switch (this.f42886a) {
            case 0:
                return (J21) this.f42887b;
            default:
                return (C7523Ea1) this.f42888c;
        }
    }

    public final String toString() {
        switch (this.f42886a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C6868t9) this.f42888c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f42887b) + ')';
        }
    }
}
