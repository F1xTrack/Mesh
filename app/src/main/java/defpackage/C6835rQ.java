package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: rQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6835rQ extends MediaDataSource {
    public long a;
    public final /* synthetic */ C7789wQ b;

    public C6835rQ(C7789wQ c7789wQ) {
        this.b = c7789wQ;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            C7789wQ c7789wQ = this.b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + c7789wQ.a.available()) {
                    return -1;
                }
                c7789wQ.c(j);
                this.a = j;
            }
            if (i2 > c7789wQ.a.available()) {
                i2 = c7789wQ.a.available();
            }
            int i3 = c7789wQ.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
