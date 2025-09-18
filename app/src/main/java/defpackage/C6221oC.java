package defpackage;

import java.io.Closeable;
import javax.inject.Provider;

/* renamed from: oC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6221oC implements Closeable {
    public Provider a;
    public C0552Gv0 b;
    public Provider c;
    public C7409uQ0 d;
    public Provider e;
    public Provider f;
    public Provider g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C7992xU0) ((PP) this.f.get())).close();
    }
}
