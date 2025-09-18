package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5938mj extends OutputStream {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C5938mj(InterfaceC0749Jj interfaceC0749Jj, int i) {
        this.a = i;
        this.b = interfaceC0749Jj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 1:
                ((C8161yN0) this.b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                break;
            case 1:
                C8161yN0 c8161yN0 = (C8161yN0) this.b;
                if (!c8161yN0.c) {
                    c8161yN0.flush();
                    break;
                }
                break;
            default:
                ((FileOutputStream) this.b).flush();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((C6129nj) this.b) + ".outputStream()";
            case 1:
                return ((C8161yN0) this.b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.a) {
            case 0:
                ((C6129nj) this.b).r0(i);
                return;
            case 1:
                C8161yN0 c8161yN0 = (C8161yN0) this.b;
                if (c8161yN0.c) {
                    throw new IOException("closed");
                }
                c8161yN0.b.r0((byte) i);
                c8161yN0.m();
                return;
            default:
                ((FileOutputStream) this.b).write(i);
                return;
        }
    }

    public C5938mj(FileOutputStream fileOutputStream) {
        this.a = 2;
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 2:
                O90.f(bArr, "b");
                ((FileOutputStream) this.b).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                O90.f(bArr, "data");
                ((C6129nj) this.b).q0(bArr, i, i2);
                return;
            case 1:
                O90.f(bArr, "data");
                C8161yN0 c8161yN0 = (C8161yN0) this.b;
                if (!c8161yN0.c) {
                    c8161yN0.b.q0(bArr, i, i2);
                    c8161yN0.m();
                    return;
                }
                throw new IOException("closed");
            default:
                O90.f(bArr, "bytes");
                ((FileOutputStream) this.b).write(bArr, i, i2);
                return;
        }
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }
}
