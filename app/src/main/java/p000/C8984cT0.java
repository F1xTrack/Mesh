package p000;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: cT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8984cT0 extends BufferedOutputStream {

    /* renamed from: a */
    public boolean f17531a;

    /* renamed from: a */
    public final void m10703a(OutputStream outputStream) {
        YN1.m9281f(this.f17531a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f17531a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f17531a = true;
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
        int i = AbstractC7485Dh1.f2166a;
        throw th;
    }
}
