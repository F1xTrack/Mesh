package com.facebook.react.devsupport;

import defpackage.InterfaceC3917gC;
import defpackage.MN0;

/* loaded from: classes.dex */
public final class b implements InterfaceC3917gC {
    public final /* synthetic */ MN0 a;

    public b(MN0 mn0) {
        this.a = mn0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b(1000, "End of session");
    }
}
