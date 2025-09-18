package p000;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface Z11 extends Closeable, Flushable {
    /* renamed from: c0 */
    void mo2328c0(C6507nj c6507nj, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* renamed from: r */
    C7523Ea1 mo2329r();
}
