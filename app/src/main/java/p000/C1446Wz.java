package p000;

import java.io.FilterOutputStream;
import java.io.IOException;

/* renamed from: Wz */
/* loaded from: classes.dex */
public final class C1446Wz extends FilterOutputStream {

    /* renamed from: a */
    public long f13471a;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f13471a += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f13471a++;
    }
}
