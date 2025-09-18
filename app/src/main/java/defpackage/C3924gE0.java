package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: gE0 */
/* loaded from: classes.dex */
public final class C3924gE0 extends FilterOutputStream {
    public long a;
    public final /* synthetic */ C4115hE0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3924gE0(C4115hE0 c4115hE0, OutputStream outputStream) {
        super(outputStream);
        this.b = c4115hE0;
        this.a = 0L;
    }

    public final void a(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.a++;
    }

    public final void c(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.a += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        c(bArr, i, i2);
        long j = this.a;
        C4115hE0 c4115hE0 = this.b;
        long jA = c4115hE0.a();
        c4115hE0.b.a(j, jA, j == jA);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        a(i);
        long j = this.a;
        C4115hE0 c4115hE0 = this.b;
        long jA = c4115hE0.a();
        c4115hE0.b.a(j, jA, j == jA);
    }
}
