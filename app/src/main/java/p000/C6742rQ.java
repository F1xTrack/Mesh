package p000;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: rQ */
/* loaded from: classes.dex */
public final class C6742rQ extends MediaDataSource {

    /* renamed from: a */
    public long f41665a;

    /* renamed from: b */
    public final /* synthetic */ C7074wQ f41666b;

    public C6742rQ(C7074wQ c7074wQ) {
        this.f41666b = c7074wQ;
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
            long j2 = this.f41665a;
            C7074wQ c7074wQ = this.f41666b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + c7074wQ.f42424a.available()) {
                    return -1;
                }
                c7074wQ.m25616c(j);
                this.f41665a = j;
            }
            if (i2 > c7074wQ.f42424a.available()) {
                i2 = c7074wQ.f42424a.available();
            }
            int i3 = c7074wQ.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f41665a += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f41665a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
