package p000;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: Wi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8475Wi1 extends MediaDataSource {

    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f13345a;

    public C8475Wi1(ByteBuffer byteBuffer) {
        this.f13345a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f13345a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f13345a;
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
