package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: gE0 */
/* loaded from: classes.dex */
public final class C9471gE0 extends FilterOutputStream {

    /* renamed from: a */
    public long f27625a;

    /* renamed from: b */
    public final /* synthetic */ C9599hE0 f27626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9471gE0(C9599hE0 c9599hE0, OutputStream outputStream) {
        super(outputStream);
        this.f27626b = c9599hE0;
        this.f27625a = 0L;
    }

    /* renamed from: a */
    public final void m18411a(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f27625a++;
    }

    /* renamed from: c */
    public final void m18412c(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f27625a += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m18412c(bArr, i, i2);
        long j = this.f27625a;
        C9599hE0 c9599hE0 = this.f27626b;
        long jMo9186a = c9599hE0.mo9186a();
        c9599hE0.f28327b.m2422a(j, jMo9186a, j == jMo9186a);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        m18411a(i);
        long j = this.f27625a;
        C9599hE0 c9599hE0 = this.f27626b;
        long jMo9186a = c9599hE0.mo9186a();
        c9599hE0.f28327b.m2422a(j, jMo9186a, j == jMo9186a);
    }
}
