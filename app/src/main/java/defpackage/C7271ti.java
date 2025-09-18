package defpackage;

import java.io.EOFException;

/* renamed from: ti, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7271ti implements Z11 {
    @Override // defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) throws EOFException {
        O90.f(c6129nj, "source");
        c6129nj.i0(j);
    }

    @Override // defpackage.Z11
    public final C0334Ea1 r() {
        return C0334Ea1.d;
    }

    @Override // defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.Z11, java.io.Flushable
    public final void flush() {
    }
}
