package com.facebook.react.devsupport;

import p000.InterfaceC4101gC;
import p000.MN0;

/* renamed from: com.facebook.react.devsupport.b */
/* loaded from: classes.dex */
public final class C1916b implements InterfaceC4101gC {

    /* renamed from: a */
    public final /* synthetic */ MN0 f17909a;

    public C1916b(MN0 mn0) {
        this.f17909a = mn0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17909a.m5350b(1000, "End of session");
    }
}
