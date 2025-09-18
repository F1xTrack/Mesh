package com.yandex.metrica.impl.p022ob;

import java.nio.charset.Charset;
import p000.AbstractC7038vr;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.y7 */
/* loaded from: classes2.dex */
public final class C3747y7 implements InterfaceC3230ea<String, byte[]> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public String mo13846a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] mo13847b(String str) {
        if ("native".equals(str)) {
            str = "JVM";
        }
        Charset charset = AbstractC7038vr.f44561a;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        O90.m5967e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
