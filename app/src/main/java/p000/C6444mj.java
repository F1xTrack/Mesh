package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: mj */
/* loaded from: classes2.dex */
public final class C6444mj extends OutputStream {

    /* renamed from: a */
    public final /* synthetic */ int f37844a;

    /* renamed from: b */
    public final Object f37845b;

    public /* synthetic */ C6444mj(InterfaceC0613Jj interfaceC0613Jj, int i) {
        this.f37844a = i;
        this.f37845b = interfaceC0613Jj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f37844a) {
            case 1:
                ((C11790yN0) this.f37845b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f37844a) {
            case 0:
                break;
            case 1:
                C11790yN0 c11790yN0 = (C11790yN0) this.f37845b;
                if (!c11790yN0.f46238c) {
                    c11790yN0.flush();
                    break;
                }
                break;
            default:
                ((FileOutputStream) this.f37845b).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f37844a) {
            case 0:
                return ((C6507nj) this.f37845b) + ".outputStream()";
            case 1:
                return ((C11790yN0) this.f37845b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f37844a) {
            case 0:
                ((C6507nj) this.f37845b).m23195r0(i);
                return;
            case 1:
                C11790yN0 c11790yN0 = (C11790yN0) this.f37845b;
                if (c11790yN0.f46238c) {
                    throw new IOException("closed");
                }
                c11790yN0.f46237b.m23195r0((byte) i);
                c11790yN0.m26143m();
                return;
            default:
                ((FileOutputStream) this.f37845b).write(i);
                return;
        }
    }

    public C6444mj(FileOutputStream fileOutputStream) {
        this.f37844a = 2;
        this.f37845b = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f37844a) {
            case 2:
                O90.m5968f(bArr, "b");
                ((FileOutputStream) this.f37845b).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f37844a) {
            case 0:
                O90.m5968f(bArr, "data");
                ((C6507nj) this.f37845b).m23194q0(bArr, i, i2);
                return;
            case 1:
                O90.m5968f(bArr, "data");
                C11790yN0 c11790yN0 = (C11790yN0) this.f37845b;
                if (!c11790yN0.f46238c) {
                    c11790yN0.f46237b.m23194q0(bArr, i, i2);
                    c11790yN0.m26143m();
                    return;
                }
                throw new IOException("closed");
            default:
                O90.m5968f(bArr, "bytes");
                ((FileOutputStream) this.f37845b).write(bArr, i, i2);
                return;
        }
    }

    /* renamed from: m */
    private final void m22921m() {
    }

    /* renamed from: n */
    private final void m22922n() {
    }

    /* renamed from: o */
    private final void m22923o() {
    }
}
