package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class S80 extends InputStream {
    public final InputStream a;
    public final C2030Zu0 b;
    public final C0646Ia1 c;
    public long e;
    public long d = -1;
    public long f = -1;

    public S80(InputStream inputStream, C2030Zu0 c2030Zu0, C0646Ia1 c0646Ia1) {
        this.c = c0646Ia1;
        this.a = inputStream;
        this.b = c2030Zu0;
        this.e = ((C1952Yu0) c2030Zu0.d.b).R();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.a.available();
        } catch (IOException e) {
            long jA = this.c.a();
            C2030Zu0 c2030Zu0 = this.b;
            c2030Zu0.j(jA);
            AbstractC2224av0.c(c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C2030Zu0 c2030Zu0 = this.b;
        C0646Ia1 c0646Ia1 = this.c;
        long jA = c0646Ia1.a();
        if (this.f == -1) {
            this.f = jA;
        }
        try {
            this.a.close();
            long j = this.d;
            if (j != -1) {
                c2030Zu0.i(j);
            }
            long j2 = this.e;
            if (j2 != -1) {
                C1796Wu0 c1796Wu0 = c2030Zu0.d;
                c1796Wu0.n();
                C1952Yu0.B((C1952Yu0) c1796Wu0.b, j2);
            }
            c2030Zu0.j(this.f);
            c2030Zu0.b();
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C0646Ia1 c0646Ia1 = this.c;
        C2030Zu0 c2030Zu0 = this.b;
        try {
            int i = this.a.read();
            long jA = c0646Ia1.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i == -1 && this.f == -1) {
                this.f = jA;
                c2030Zu0.j(jA);
                c2030Zu0.b();
            } else {
                long j = this.d + 1;
                this.d = j;
                c2030Zu0.i(j);
            }
            return i;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.a.reset();
        } catch (IOException e) {
            long jA = this.c.a();
            C2030Zu0 c2030Zu0 = this.b;
            c2030Zu0.j(jA);
            AbstractC2224av0.c(c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        C0646Ia1 c0646Ia1 = this.c;
        C2030Zu0 c2030Zu0 = this.b;
        try {
            long jSkip = this.a.skip(j);
            long jA = c0646Ia1.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (jSkip == -1 && this.f == -1) {
                this.f = jA;
                c2030Zu0.j(jA);
            } else {
                long j2 = this.d + jSkip;
                this.d = j2;
                c2030Zu0.i(j2);
            }
            return jSkip;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C0646Ia1 c0646Ia1 = this.c;
        C2030Zu0 c2030Zu0 = this.b;
        try {
            int i3 = this.a.read(bArr, i, i2);
            long jA = c0646Ia1.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i3 == -1 && this.f == -1) {
                this.f = jA;
                c2030Zu0.j(jA);
                c2030Zu0.b();
            } else {
                long j = this.d + i3;
                this.d = j;
                c2030Zu0.i(j);
            }
            return i3;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        C0646Ia1 c0646Ia1 = this.c;
        C2030Zu0 c2030Zu0 = this.b;
        try {
            int i = this.a.read(bArr);
            long jA = c0646Ia1.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i == -1 && this.f == -1) {
                this.f = jA;
                c2030Zu0.j(jA);
                c2030Zu0.b();
            } else {
                long j = this.d + i;
                this.d = j;
                c2030Zu0.i(j);
            }
            return i;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }
}
