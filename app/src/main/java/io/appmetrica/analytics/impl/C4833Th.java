package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Th */
/* loaded from: classes2.dex */
public final class C4833Th implements InterfaceC5437s3 {

    /* renamed from: a */
    public final Object f30788a;

    /* renamed from: b */
    public final InterfaceC5437s3 f30789b;

    public C4833Th(Object obj, InterfaceC5437s3 interfaceC5437s3) {
        this.f30788a = obj;
        this.f30789b = interfaceC5437s3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5437s3
    public final int getBytesTruncated() {
        return this.f30789b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f30788a + ", metaInfo=" + this.f30789b + '}';
    }
}
