package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: wQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7789wQ extends C7026sQ {
    public C7789wQ(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }

    public final void c(long j) throws IOException {
        int i = this.c;
        if (i > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public C7789wQ(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
