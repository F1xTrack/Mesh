package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* renamed from: sH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6999sH implements Z11 {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public C6999sH(C6129nj c6129nj, Deflater deflater) {
        this.c = JI1.a(c6129nj);
        this.d = deflater;
    }

    public void a(boolean z) throws IOException {
        JX0 jx0N0;
        int iDeflate;
        C8161yN0 c8161yN0 = (C8161yN0) this.c;
        C6129nj c6129nj = c8161yN0.b;
        while (true) {
            jx0N0 = c6129nj.n0(1);
            Deflater deflater = (Deflater) this.d;
            byte[] bArr = jx0N0.a;
            if (z) {
                try {
                    int i = jx0N0.c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = jx0N0.c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                jx0N0.c += iDeflate;
                c6129nj.b += iDeflate;
                c8161yN0.m();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (jx0N0.b == jx0N0.c) {
            c6129nj.a = jx0N0.a();
            RX0.a(jx0N0);
        }
    }

    @Override // defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) throws IOException {
        switch (this.a) {
            case 0:
                O90.f(c6129nj, "source");
                AbstractC1525Ti.b(c6129nj.b, 0L, j);
                while (j > 0) {
                    JX0 jx0 = c6129nj.a;
                    O90.c(jx0);
                    int iMin = (int) Math.min(j, jx0.c - jx0.b);
                    ((Deflater) this.d).setInput(jx0.a, jx0.b, iMin);
                    a(false);
                    long j2 = iMin;
                    c6129nj.b -= j2;
                    int i = jx0.b + iMin;
                    jx0.b = i;
                    if (i == jx0.c) {
                        c6129nj.a = jx0.a();
                        RX0.a(jx0);
                    }
                    j -= j2;
                }
                return;
            default:
                O90.f(c6129nj, "source");
                if (this.b) {
                    throw new IllegalStateException("closed");
                }
                AbstractC0199Ch1.c(c6129nj.b, 0L, j);
                ((C8161yN0) ((C5350je) this.d).f).c0(c6129nj, j);
                return;
        }
    }

    @Override // defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                Deflater deflater = (Deflater) this.d;
                if (this.b) {
                    return;
                }
                try {
                    deflater.finish();
                    a(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((C8161yN0) this.c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                if (this.b) {
                    return;
                }
                this.b = true;
                C5350je c5350je = (C5350je) this.d;
                c5350je.getClass();
                HX hx = (HX) this.c;
                C0334Ea1 c0334Ea1 = hx.e;
                hx.e = C0334Ea1.d;
                c0334Ea1.a();
                c0334Ea1.b();
                c5350je.b = 3;
                return;
        }
    }

    @Override // defpackage.Z11, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                a(true);
                ((C8161yN0) this.c).flush();
                break;
            default:
                if (!this.b) {
                    ((C8161yN0) ((C5350je) this.d).f).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.Z11
    public final C0334Ea1 r() {
        switch (this.a) {
            case 0:
                return ((C8161yN0) this.c).a.r();
            default:
                return (HX) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((C8161yN0) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public C6999sH(C5350je c5350je) {
        this.d = c5350je;
        this.c = new HX(((C8161yN0) c5350je.f).a.r());
    }
}
