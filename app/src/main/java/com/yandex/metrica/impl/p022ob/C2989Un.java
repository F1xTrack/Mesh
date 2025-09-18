package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Un */
/* loaded from: classes2.dex */
public class C2989Un extends AbstractC2914Rn {
    public C2989Un(int i) {
        super(i);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2914Rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2890Qn<String, InterfaceC2615Fn> mo15090a(String str) {
        int length = 0;
        if (str != null && str.length() > m15089a()) {
            String strSubstring = str.substring(0, m15089a());
            int length2 = C2819O2.m14689c(str).length;
            int length3 = C2819O2.m14689c(strSubstring).length;
            length = str.getBytes().length - strSubstring.getBytes().length;
            str = strSubstring;
        }
        return new C2890Qn<>(str, new C2590En(length));
    }
}
