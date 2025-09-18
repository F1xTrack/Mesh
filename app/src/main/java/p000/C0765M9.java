package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: M9 */
/* loaded from: classes.dex */
public final class C0765M9 extends OutputStream {

    /* renamed from: a */
    public final FileOutputStream f7008a;

    /* renamed from: b */
    public boolean f7009b = false;

    public C0765M9(File file) {
        this.f7008a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f7008a;
        if (this.f7009b) {
            return;
        }
        this.f7009b = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            AbstractC10872rA1.m24176i("Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f7008a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f7008a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f7008a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f7008a.write(bArr, i, i2);
    }
}
