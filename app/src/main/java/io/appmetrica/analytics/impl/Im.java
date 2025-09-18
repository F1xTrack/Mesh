package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Im implements InterfaceC4851s3 {
    public final Object a;
    public final InterfaceC4851s3 b;

    public Im(Object obj, InterfaceC4851s3 interfaceC4851s3) {
        this.a = obj;
        this.b = interfaceC4851s3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4851s3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
