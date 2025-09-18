package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7680vr;
import defpackage.O90;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.z7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3250z7 implements InterfaceC2725ea<Map<String, ? extends String>, Kf[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Map<String, ? extends String> a(Kf[] kfArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public /* bridge */ /* synthetic */ Kf[] b(Map<String, ? extends String> map) {
        return a((Map<String, String>) map);
    }

    public Kf[] a(Map<String, String> map) {
        int size = map.size();
        Kf[] kfArr = new Kf[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            kfArr[i2] = new Kf();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Kf kf = kfArr[i];
            String key = entry.getKey();
            Charset charset = AbstractC7680vr.a;
            if (key != null) {
                byte[] bytes = key.getBytes(charset);
                O90.e(bytes, "(this as java.lang.String).getBytes(charset)");
                kf.b = bytes;
                Kf kf2 = kfArr[i];
                String value = entry.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes2 = value.getBytes(charset);
                O90.e(bytes2, "(this as java.lang.String).getBytes(charset)");
                kf2.c = bytes2;
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return kfArr;
    }
}
