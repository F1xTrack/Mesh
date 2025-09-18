package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: uk */
/* loaded from: classes.dex */
public final class C6968uk extends InputStream {

    /* renamed from: a */
    public final ByteBuffer f43838a;

    /* renamed from: b */
    public int f43839b = -1;

    public C6968uk(ByteBuffer byteBuffer) {
        this.f43838a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f43838a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f43839b = this.f43838a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f43838a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f43839b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f43838a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f43838a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f43838a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
