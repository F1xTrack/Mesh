package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: wQ */
/* loaded from: classes.dex */
public final class C7074wQ extends C6822sQ {
    public C7074wQ(byte[] bArr) {
        super(bArr);
        this.f42424a.mark(Integer.MAX_VALUE);
    }

    /* renamed from: c */
    public final void m25616c(long j) throws IOException {
        int i = this.f42426c;
        if (i > j) {
            this.f42426c = 0;
            this.f42424a.reset();
        } else {
            j -= i;
        }
        m24738a((int) j);
    }

    public C7074wQ(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f42424a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
