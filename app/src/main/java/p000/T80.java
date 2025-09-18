package p000;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class T80 extends OutputStream {

    /* renamed from: a */
    public final OutputStream f11177a;

    /* renamed from: b */
    public final C7731Ia1 f11178b;

    /* renamed from: c */
    public final C8654Zu0 f11179c;

    /* renamed from: d */
    public long f11180d = -1;

    public T80(OutputStream outputStream, C8654Zu0 c8654Zu0, C7731Ia1 c7731Ia1) {
        this.f11177a = outputStream;
        this.f11179c = c8654Zu0;
        this.f11178b = c7731Ia1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.f11180d;
        C8654Zu0 c8654Zu0 = this.f11179c;
        if (j != -1) {
            c8654Zu0.m9631f(j);
        }
        C7731Ia1 c7731Ia1 = this.f11178b;
        long jM3946a = c7731Ia1.m3946a();
        C8498Wu0 c8498Wu0 = c8654Zu0.f15212d;
        c8498Wu0.m23922n();
        C8602Yu0.m9389A((C8602Yu0) c8498Wu0.f40483b, jM3946a);
        try {
            this.f11177a.close();
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f11177a.flush();
        } catch (IOException e) {
            long jM3946a = this.f11178b.m3946a();
            C8654Zu0 c8654Zu0 = this.f11179c;
            c8654Zu0.m9635j(jM3946a);
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C8654Zu0 c8654Zu0 = this.f11179c;
        try {
            this.f11177a.write(i);
            long j = this.f11180d + 1;
            this.f11180d = j;
            c8654Zu0.m9631f(j);
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(this.f11178b, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        C8654Zu0 c8654Zu0 = this.f11179c;
        try {
            this.f11177a.write(bArr);
            long length = this.f11180d + bArr.length;
            this.f11180d = length;
            c8654Zu0.m9631f(length);
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(this.f11178b, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C8654Zu0 c8654Zu0 = this.f11179c;
        try {
            this.f11177a.write(bArr, i, i2);
            long j = this.f11180d + i2;
            this.f11180d = j;
            c8654Zu0.m9631f(j);
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(this.f11178b, c8654Zu0, c8654Zu0);
            throw e;
        }
    }
}
