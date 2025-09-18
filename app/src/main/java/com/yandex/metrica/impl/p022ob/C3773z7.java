package com.yandex.metrica.impl.p022ob;

import java.nio.charset.Charset;
import java.util.Map;
import p000.AbstractC7038vr;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.z7 */
/* loaded from: classes2.dex */
public final class C3773z7 implements InterfaceC3230ea<Map<String, ? extends String>, C2732Kf[]> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Map<String, ? extends String> mo13846a(C2732Kf[] c2732KfArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C2732Kf[] mo13847b(Map<String, ? extends String> map) {
        return m17325a((Map<String, String>) map);
    }

    /* renamed from: a */
    public C2732Kf[] m17325a(Map<String, String> map) {
        int size = map.size();
        C2732Kf[] c2732KfArr = new C2732Kf[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c2732KfArr[i2] = new C2732Kf();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C2732Kf c2732Kf = c2732KfArr[i];
            String key = entry.getKey();
            Charset charset = AbstractC7038vr.f44561a;
            if (key != null) {
                byte[] bytes = key.getBytes(charset);
                O90.m5967e(bytes, "(this as java.lang.String).getBytes(charset)");
                c2732Kf.f21587b = bytes;
                C2732Kf c2732Kf2 = c2732KfArr[i];
                String value = entry.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes2 = value.getBytes(charset);
                O90.m5967e(bytes2, "(this as java.lang.String).getBytes(charset)");
                c2732Kf2.f21588c = bytes2;
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return c2732KfArr;
    }
}
