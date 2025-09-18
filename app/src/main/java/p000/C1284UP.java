package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: UP */
/* loaded from: classes.dex */
public final class C1284UP extends InputStream {

    /* renamed from: c */
    public static final ArrayDeque f11771c;

    /* renamed from: a */
    public C10515oO0 f11772a;

    /* renamed from: b */
    public IOException f11773b;

    static {
        char[] cArr = AbstractC7381Bh1.f976a;
        f11771c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f11772a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11772a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f11772a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f11772a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f11772a.read();
        } catch (IOException e) {
            this.f11773b = e;
            throw e;
        }
    }

    public final void release() {
        this.f11773b = null;
        this.f11772a = null;
        ArrayDeque arrayDeque = f11771c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f11772a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f11772a.skip(j);
        } catch (IOException e) {
            this.f11773b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f11772a.read(bArr);
        } catch (IOException e) {
            this.f11773b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f11772a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f11773b = e;
            throw e;
        }
    }
}
