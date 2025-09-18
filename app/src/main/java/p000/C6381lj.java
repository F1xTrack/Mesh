package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: lj */
/* loaded from: classes2.dex */
public final class C6381lj extends InputStream {

    /* renamed from: a */
    public final /* synthetic */ int f37261a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0676Kj f37262b;

    public /* synthetic */ C6381lj(InterfaceC0676Kj interfaceC0676Kj, int i) {
        this.f37261a = i;
        this.f37262b = interfaceC0676Kj;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.f37261a) {
            case 0:
                return (int) Math.min(((C6507nj) this.f37262b).f38488b, Integer.MAX_VALUE);
            default:
                C11917zN0 c11917zN0 = (C11917zN0) this.f37262b;
                if (c11917zN0.f46811c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c11917zN0.f46810b.f38488b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f37261a) {
            case 0:
                break;
            default:
                ((C11917zN0) this.f37262b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f37261a) {
            case 0:
                C6507nj c6507nj = (C6507nj) this.f37262b;
                if (c6507nj.f38488b > 0) {
                    return c6507nj.m23176J() & 255;
                }
                return -1;
            default:
                C11917zN0 c11917zN0 = (C11917zN0) this.f37262b;
                if (c11917zN0.f46811c) {
                    throw new IOException("closed");
                }
                C6507nj c6507nj2 = c11917zN0.f46810b;
                if (c6507nj2.f38488b == 0 && c11917zN0.f46809a.mo96H(c6507nj2, 8192L) == -1) {
                    return -1;
                }
                return c6507nj2.m23176J() & 255;
        }
    }

    public final String toString() {
        switch (this.f37261a) {
            case 0:
                return ((C6507nj) this.f37262b) + ".inputStream()";
            default:
                return ((C11917zN0) this.f37262b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f37261a) {
            case 0:
                O90.m5968f(bArr, "sink");
                return ((C6507nj) this.f37262b).m23174A(bArr, i, i2);
            default:
                O90.m5968f(bArr, "data");
                C11917zN0 c11917zN0 = (C11917zN0) this.f37262b;
                if (!c11917zN0.f46811c) {
                    AbstractC1240Ti.m7729b(bArr.length, i, i2);
                    C6507nj c6507nj = c11917zN0.f46810b;
                    if (c6507nj.f38488b == 0 && c11917zN0.f46809a.mo96H(c6507nj, 8192L) == -1) {
                        return -1;
                    }
                    return c6507nj.m23174A(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    /* renamed from: m */
    private final void m22532m() {
    }
}
