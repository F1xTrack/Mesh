package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3681vj;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.J2 */
/* loaded from: classes2.dex */
public class C2694J2 implements InterfaceC2917S1<C3681vj> {

    /* renamed from: a */
    private final C3655uj f21485a;

    /* renamed from: b */
    private final C3152ba f21486b;

    public C2694J2() {
        this(new C3655uj(), new C3152ba());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2917S1
    /* renamed from: a */
    public C3681vj mo14408a(int i, byte[] bArr, Map map) {
        if (200 == i) {
            List list = (List) map.get("Content-Encoding");
            if (!C2968U2.m15249b(list) && "encrypted".equals(list.get(0))) {
                bArr = this.f21486b.m15680a(bArr, "hBnBQbZrmjPXEWVJ");
            }
            if (bArr != null) {
                C3681vj c3681vjM16931a = this.f21485a.m16931a(bArr);
                if (C3681vj.a.OK == c3681vjM16931a.m17095z()) {
                    return c3681vjM16931a;
                }
            }
        }
        return null;
    }

    public C2694J2(C3655uj c3655uj, C3152ba c3152ba) {
        this.f21485a = c3655uj;
        this.f21486b = c3152ba;
    }
}
