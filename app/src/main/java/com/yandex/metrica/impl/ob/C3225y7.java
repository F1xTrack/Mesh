package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7680vr;
import defpackage.O90;
import java.nio.charset.Charset;

/* renamed from: com.yandex.metrica.impl.ob.y7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3225y7 implements InterfaceC2725ea<String, byte[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public String a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] b(String str) {
        if ("native".equals(str)) {
            str = "JVM";
        }
        Charset charset = AbstractC7680vr.a;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        O90.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
