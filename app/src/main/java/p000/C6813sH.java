package p000;

import java.io.IOException;
import java.util.zip.Deflater;

/* renamed from: sH */
/* loaded from: classes2.dex */
public final class C6813sH implements Z11 {

    /* renamed from: a */
    public final /* synthetic */ int f42352a = 1;

    /* renamed from: b */
    public boolean f42353b;

    /* renamed from: c */
    public final Object f42354c;

    /* renamed from: d */
    public final Object f42355d;

    public C6813sH(C6507nj c6507nj, Deflater deflater) {
        this.f42354c = JI1.m4273a(c6507nj);
        this.f42355d = deflater;
    }

    /* renamed from: a */
    public void m24688a(boolean z) throws IOException {
        JX0 jx0M23189n0;
        int iDeflate;
        C11790yN0 c11790yN0 = (C11790yN0) this.f42354c;
        C6507nj c6507nj = c11790yN0.f46237b;
        while (true) {
            jx0M23189n0 = c6507nj.m23189n0(1);
            Deflater deflater = (Deflater) this.f42355d;
            byte[] bArr = jx0M23189n0.f5579a;
            if (z) {
                try {
                    int i = jx0M23189n0.f5581c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = jx0M23189n0.f5581c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                jx0M23189n0.f5581c += iDeflate;
                c6507nj.f38488b += iDeflate;
                c11790yN0.m26143m();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (jx0M23189n0.f5580b == jx0M23189n0.f5581c) {
            c6507nj.f38487a = jx0M23189n0.m4339a();
            RX0.m7031a(jx0M23189n0);
        }
    }

    @Override // p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) throws IOException {
        switch (this.f42352a) {
            case 0:
                O90.m5968f(c6507nj, "source");
                AbstractC1240Ti.m7729b(c6507nj.f38488b, 0L, j);
                while (j > 0) {
                    JX0 jx0 = c6507nj.f38487a;
                    O90.m5965c(jx0);
                    int iMin = (int) Math.min(j, jx0.f5581c - jx0.f5580b);
                    ((Deflater) this.f42355d).setInput(jx0.f5579a, jx0.f5580b, iMin);
                    m24688a(false);
                    long j2 = iMin;
                    c6507nj.f38488b -= j2;
                    int i = jx0.f5580b + iMin;
                    jx0.f5580b = i;
                    if (i == jx0.f5581c) {
                        c6507nj.f38487a = jx0.m4339a();
                        RX0.m7031a(jx0);
                    }
                    j -= j2;
                }
                return;
            default:
                O90.m5968f(c6507nj, "source");
                if (this.f42353b) {
                    throw new IllegalStateException("closed");
                }
                AbstractC7433Ch1.m1274c(c6507nj.f38488b, 0L, j);
                ((C11790yN0) ((C6250je) this.f42355d).f35301f).mo2328c0(c6507nj, j);
                return;
        }
    }

    @Override // p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f42352a) {
            case 0:
                Deflater deflater = (Deflater) this.f42355d;
                if (this.f42353b) {
                    return;
                }
                try {
                    deflater.finish();
                    m24688a(false);
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
                    ((C11790yN0) this.f42354c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f42353b = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                if (this.f42353b) {
                    return;
                }
                this.f42353b = true;
                C6250je c6250je = (C6250je) this.f42355d;
                c6250je.getClass();
                C0475HX c0475hx = (C0475HX) this.f42354c;
                C7523Ea1 c7523Ea1 = c0475hx.f4333e;
                c0475hx.f4333e = C7523Ea1.f2789d;
                c7523Ea1.mo2356a();
                c7523Ea1.mo2357b();
                c6250je.f35297b = 3;
                return;
        }
    }

    @Override // p000.Z11, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f42352a) {
            case 0:
                m24688a(true);
                ((C11790yN0) this.f42354c).flush();
                break;
            default:
                if (!this.f42353b) {
                    ((C11790yN0) ((C6250je) this.f42355d).f35301f).flush();
                    break;
                }
                break;
        }
    }

    @Override // p000.Z11
    /* renamed from: r */
    public final C7523Ea1 mo2329r() {
        switch (this.f42352a) {
            case 0:
                return ((C11790yN0) this.f42354c).f46236a.mo2329r();
            default:
                return (C0475HX) this.f42354c;
        }
    }

    public String toString() {
        switch (this.f42352a) {
            case 0:
                return "DeflaterSink(" + ((C11790yN0) this.f42354c) + ')';
            default:
                return super.toString();
        }
    }

    public C6813sH(C6250je c6250je) {
        this.f42355d = c6250je;
        this.f42354c = new C0475HX(((C11790yN0) c6250je.f35301f).f46236a.mo2329r());
    }
}
