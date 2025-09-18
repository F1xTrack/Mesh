package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class T80 extends OutputStream {
    public final OutputStream a;
    public final C0646Ia1 b;
    public final C2030Zu0 c;
    public long d = -1;

    public T80(OutputStream outputStream, C2030Zu0 c2030Zu0, C0646Ia1 c0646Ia1) {
        this.a = outputStream;
        this.c = c2030Zu0;
        this.b = c0646Ia1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.d;
        C2030Zu0 c2030Zu0 = this.c;
        if (j != -1) {
            c2030Zu0.f(j);
        }
        C0646Ia1 c0646Ia1 = this.b;
        long jA = c0646Ia1.a();
        C1796Wu0 c1796Wu0 = c2030Zu0.d;
        c1796Wu0.n();
        C1952Yu0.A((C1952Yu0) c1796Wu0.b, jA);
        try {
            this.a.close();
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.a.flush();
        } catch (IOException e) {
            long jA = this.b.a();
            C2030Zu0 c2030Zu0 = this.c;
            c2030Zu0.j(jA);
            AbstractC2224av0.c(c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C2030Zu0 c2030Zu0 = this.c;
        try {
            this.a.write(i);
            long j = this.d + 1;
            this.d = j;
            c2030Zu0.f(j);
        } catch (IOException e) {
            AbstractC1705Vq.o(this.b, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        C2030Zu0 c2030Zu0 = this.c;
        try {
            this.a.write(bArr);
            long length = this.d + bArr.length;
            this.d = length;
            c2030Zu0.f(length);
        } catch (IOException e) {
            AbstractC1705Vq.o(this.b, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C2030Zu0 c2030Zu0 = this.c;
        try {
            this.a.write(bArr, i, i2);
            long j = this.d + i2;
            this.d = j;
            c2030Zu0.f(j);
        } catch (IOException e) {
            AbstractC1705Vq.o(this.b, c2030Zu0, c2030Zu0);
            throw e;
        }
    }
}
