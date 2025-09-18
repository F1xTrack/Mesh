package defpackage;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: Wi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761Wi1 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer a;

    public C1761Wi1(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.a;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
