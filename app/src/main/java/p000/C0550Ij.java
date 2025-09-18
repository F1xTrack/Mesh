package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: Ij */
/* loaded from: classes.dex */
public final class C0550Ij extends OutputStream {

    /* renamed from: a */
    public final FileOutputStream f5091a;

    /* renamed from: b */
    public byte[] f5092b;

    /* renamed from: c */
    public final C11967zm0 f5093c;

    /* renamed from: d */
    public int f5094d;

    public C0550Ij(FileOutputStream fileOutputStream, C11967zm0 c11967zm0) {
        this.f5091a = fileOutputStream;
        this.f5093c = c11967zm0;
        this.f5092b = (byte[]) c11967zm0.m26542d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f5091a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f5092b;
            if (bArr != null) {
                this.f5093c.m26546h(bArr);
                this.f5092b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f5094d;
        FileOutputStream fileOutputStream = this.f5091a;
        if (i > 0) {
            fileOutputStream.write(this.f5092b, 0, i);
            this.f5094d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f5092b;
        int i2 = this.f5094d;
        int i3 = i2 + 1;
        this.f5094d = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f5091a.write(bArr, 0, i3);
        this.f5094d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f5094d;
            FileOutputStream fileOutputStream = this.f5091a;
            if (i6 == 0 && i4 >= this.f5092b.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f5092b.length - i6);
            System.arraycopy(bArr, i5, this.f5092b, this.f5094d, iMin);
            int i7 = this.f5094d + iMin;
            this.f5094d = i7;
            i3 += iMin;
            byte[] bArr2 = this.f5092b;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f5094d = 0;
            }
        } while (i3 < i2);
    }
}
