package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Im */
/* loaded from: classes2.dex */
public final class C4575Im implements InterfaceC5437s3 {

    /* renamed from: a */
    public final Object f30323a;

    /* renamed from: b */
    public final InterfaceC5437s3 f30324b;

    public C4575Im(Object obj, InterfaceC5437s3 interfaceC5437s3) {
        this.f30323a = obj;
        this.f30324b = interfaceC5437s3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5437s3
    public final int getBytesTruncated() {
        return this.f30324b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f30323a + ", metaInfo=" + this.f30324b + '}';
    }
}
