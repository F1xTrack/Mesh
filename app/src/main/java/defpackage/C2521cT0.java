package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: cT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2521cT0 extends BufferedOutputStream {
    public boolean a;

    public final void a(OutputStream outputStream) {
        YN1.f(this.a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = AbstractC0277Dh1.a;
        throw th;
    }
}
