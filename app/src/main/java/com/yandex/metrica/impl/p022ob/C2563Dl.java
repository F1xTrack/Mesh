package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Dl */
/* loaded from: classes2.dex */
public class C2563Dl implements InterfaceC2911Rk {

    /* renamed from: a */
    private final int f21054a;

    public C2563Dl(int i) {
        this.f21054a = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2911Rk
    /* renamed from: a */
    public void mo14012a(C2588El c2588El) {
        if (c2588El.f21136h.length() > this.f21054a) {
            int length = c2588El.f21136h.length();
            int i = this.f21054a;
            int i2 = length - i;
            String strSubstring = c2588El.f21136h.substring(0, i);
            c2588El.f21136h = strSubstring;
            c2588El.f21138j = Integer.valueOf(strSubstring.length() + i2);
        }
    }
}
