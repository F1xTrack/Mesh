package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface Z11 extends Closeable, Flushable {
    void c0(C6129nj c6129nj, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C0334Ea1 r();
}
