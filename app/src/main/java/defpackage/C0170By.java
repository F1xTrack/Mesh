package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: By, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170By extends FilterInputStream {
    public final long a;
    public int b;

    public C0170By(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    public final void a(int i) throws IOException {
        if (i >= 0) {
            this.b += i;
            return;
        }
        long j = this.b;
        long j2 = this.a;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbP = AbstractC8235ym.p("Failed to read all expected data, expected: ", j2, ", but read: ");
        sbP.append(this.b);
        throw new IOException(sbP.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.a - this.b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        a(i3);
        return i3;
    }
}
