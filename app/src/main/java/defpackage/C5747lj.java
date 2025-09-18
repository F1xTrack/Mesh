package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: lj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5747lj extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC0827Kj b;

    public /* synthetic */ C5747lj(InterfaceC0827Kj interfaceC0827Kj, int i) {
        this.a = i;
        this.b = interfaceC0827Kj;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.a) {
            case 0:
                return (int) Math.min(((C6129nj) this.b).b, Integer.MAX_VALUE);
            default:
                C8351zN0 c8351zN0 = (C8351zN0) this.b;
                if (c8351zN0.c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c8351zN0.b.b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                break;
            default:
                ((C8351zN0) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                C6129nj c6129nj = (C6129nj) this.b;
                if (c6129nj.b > 0) {
                    return c6129nj.J() & 255;
                }
                return -1;
            default:
                C8351zN0 c8351zN0 = (C8351zN0) this.b;
                if (c8351zN0.c) {
                    throw new IOException("closed");
                }
                C6129nj c6129nj2 = c8351zN0.b;
                if (c6129nj2.b == 0 && c8351zN0.a.H(c6129nj2, 8192L) == -1) {
                    return -1;
                }
                return c6129nj2.J() & 255;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((C6129nj) this.b) + ".inputStream()";
            default:
                return ((C8351zN0) this.b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                O90.f(bArr, "sink");
                return ((C6129nj) this.b).A(bArr, i, i2);
            default:
                O90.f(bArr, "data");
                C8351zN0 c8351zN0 = (C8351zN0) this.b;
                if (!c8351zN0.c) {
                    AbstractC1525Ti.b(bArr.length, i, i2);
                    C6129nj c6129nj = c8351zN0.b;
                    if (c6129nj.b == 0 && c8351zN0.a.H(c6129nj, 8192L) == -1) {
                        return -1;
                    }
                    return c6129nj.A(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    private final void m() {
    }
}
