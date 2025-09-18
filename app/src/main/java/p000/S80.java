package p000;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class S80 extends InputStream {

    /* renamed from: a */
    public final InputStream f10592a;

    /* renamed from: b */
    public final C8654Zu0 f10593b;

    /* renamed from: c */
    public final C7731Ia1 f10594c;

    /* renamed from: e */
    public long f10596e;

    /* renamed from: d */
    public long f10595d = -1;

    /* renamed from: f */
    public long f10597f = -1;

    public S80(InputStream inputStream, C8654Zu0 c8654Zu0, C7731Ia1 c7731Ia1) {
        this.f10594c = c7731Ia1;
        this.f10592a = inputStream;
        this.f10593b = c8654Zu0;
        this.f10596e = ((C8602Yu0) c8654Zu0.f15212d.f40483b).m9413R();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f10592a.available();
        } catch (IOException e) {
            long jM3946a = this.f10594c.m3946a();
            C8654Zu0 c8654Zu0 = this.f10593b;
            c8654Zu0.m9635j(jM3946a);
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C8654Zu0 c8654Zu0 = this.f10593b;
        C7731Ia1 c7731Ia1 = this.f10594c;
        long jM3946a = c7731Ia1.m3946a();
        if (this.f10597f == -1) {
            this.f10597f = jM3946a;
        }
        try {
            this.f10592a.close();
            long j = this.f10595d;
            if (j != -1) {
                c8654Zu0.m9634i(j);
            }
            long j2 = this.f10596e;
            if (j2 != -1) {
                C8498Wu0 c8498Wu0 = c8654Zu0.f15212d;
                c8498Wu0.m23922n();
                C8602Yu0.m9390B((C8602Yu0) c8498Wu0.f40483b, j2);
            }
            c8654Zu0.m9635j(this.f10597f);
            c8654Zu0.m9628b();
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f10592a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f10592a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C7731Ia1 c7731Ia1 = this.f10594c;
        C8654Zu0 c8654Zu0 = this.f10593b;
        try {
            int i = this.f10592a.read();
            long jM3946a = c7731Ia1.m3946a();
            if (this.f10596e == -1) {
                this.f10596e = jM3946a;
            }
            if (i == -1 && this.f10597f == -1) {
                this.f10597f = jM3946a;
                c8654Zu0.m9635j(jM3946a);
                c8654Zu0.m9628b();
            } else {
                long j = this.f10595d + 1;
                this.f10595d = j;
                c8654Zu0.m9634i(j);
            }
            return i;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f10592a.reset();
        } catch (IOException e) {
            long jM3946a = this.f10594c.m3946a();
            C8654Zu0 c8654Zu0 = this.f10593b;
            c8654Zu0.m9635j(jM3946a);
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        C7731Ia1 c7731Ia1 = this.f10594c;
        C8654Zu0 c8654Zu0 = this.f10593b;
        try {
            long jSkip = this.f10592a.skip(j);
            long jM3946a = c7731Ia1.m3946a();
            if (this.f10596e == -1) {
                this.f10596e = jM3946a;
            }
            if (jSkip == -1 && this.f10597f == -1) {
                this.f10597f = jM3946a;
                c8654Zu0.m9635j(jM3946a);
            } else {
                long j2 = this.f10595d + jSkip;
                this.f10595d = j2;
                c8654Zu0.m9634i(j2);
            }
            return jSkip;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C7731Ia1 c7731Ia1 = this.f10594c;
        C8654Zu0 c8654Zu0 = this.f10593b;
        try {
            int i3 = this.f10592a.read(bArr, i, i2);
            long jM3946a = c7731Ia1.m3946a();
            if (this.f10596e == -1) {
                this.f10596e = jM3946a;
            }
            if (i3 == -1 && this.f10597f == -1) {
                this.f10597f = jM3946a;
                c8654Zu0.m9635j(jM3946a);
                c8654Zu0.m9628b();
            } else {
                long j = this.f10595d + i3;
                this.f10595d = j;
                c8654Zu0.m9634i(j);
            }
            return i3;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        C7731Ia1 c7731Ia1 = this.f10594c;
        C8654Zu0 c8654Zu0 = this.f10593b;
        try {
            int i = this.f10592a.read(bArr);
            long jM3946a = c7731Ia1.m3946a();
            if (this.f10596e == -1) {
                this.f10596e = jM3946a;
            }
            if (i == -1 && this.f10597f == -1) {
                this.f10597f = jM3946a;
                c8654Zu0.m9635j(jM3946a);
                c8654Zu0.m9628b();
            } else {
                long j = this.f10595d + i;
                this.f10595d = j;
                c8654Zu0.m9634i(j);
            }
            return i;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }
}
