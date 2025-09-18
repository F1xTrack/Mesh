package io.appmetrica.analytics.impl;

import defpackage.AbstractC8235ym;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4827r3 implements InterfaceC4851s3 {
    public final int a;

    public C4827r3(int i) {
        this.a = i;
    }

    public static InterfaceC4851s3 a(InterfaceC4851s3... interfaceC4851s3Arr) {
        return new C4827r3(b(interfaceC4851s3Arr));
    }

    public static int b(InterfaceC4851s3... interfaceC4851s3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC4851s3 interfaceC4851s3 : interfaceC4851s3Arr) {
            if (interfaceC4851s3 != null) {
                bytesTruncated = interfaceC4851s3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4851s3
    public final int getBytesTruncated() {
        return this.a;
    }

    public String toString() {
        return AbstractC8235ym.l(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.a, '}');
    }
}
