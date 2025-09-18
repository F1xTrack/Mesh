package io.appmetrica.analytics.impl;

import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.r3 */
/* loaded from: classes2.dex */
public class C5412r3 implements InterfaceC5437s3 {

    /* renamed from: a */
    public final int f32496a;

    public C5412r3(int i) {
        this.f32496a = i;
    }

    /* renamed from: a */
    public static InterfaceC5437s3 m21005a(InterfaceC5437s3... interfaceC5437s3Arr) {
        return new C5412r3(m21006b(interfaceC5437s3Arr));
    }

    /* renamed from: b */
    public static int m21006b(InterfaceC5437s3... interfaceC5437s3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC5437s3 interfaceC5437s3 : interfaceC5437s3Arr) {
            if (interfaceC5437s3 != null) {
                bytesTruncated = interfaceC5437s3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5437s3
    public final int getBytesTruncated() {
        return this.f32496a;
    }

    public String toString() {
        return AbstractC7222ym.m26235l(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.f32496a, '}');
    }
}
