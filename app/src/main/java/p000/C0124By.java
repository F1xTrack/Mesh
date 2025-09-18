package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: By */
/* loaded from: classes.dex */
public final class C0124By extends FilterInputStream {

    /* renamed from: a */
    public final long f1101a;

    /* renamed from: b */
    public int f1102b;

    public C0124By(InputStream inputStream, long j) {
        super(inputStream);
        this.f1101a = j;
    }

    /* renamed from: a */
    public final void m930a(int i) throws IOException {
        if (i >= 0) {
            this.f1102b += i;
            return;
        }
        long j = this.f1102b;
        long j2 = this.f1101a;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbM26239p = AbstractC7222ym.m26239p("Failed to read all expected data, expected: ", j2, ", but read: ");
        sbM26239p.append(this.f1102b);
        throw new IOException(sbM26239p.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f1101a - this.f1102b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m930a(i >= 0 ? 1 : -1);
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
        m930a(i3);
        return i3;
    }
}
