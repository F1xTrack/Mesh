package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Nn */
/* loaded from: classes2.dex */
public class C2815Nn extends AbstractC2540Cn<String> {
    public C2815Nn(int i, String str) {
        this(i, str, C2689Im.m14369g());
    }

    public C2815Nn(int i, String str, C2689Im c2689Im) {
        super(i, str, c2689Im);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2865Pn
    /* renamed from: a */
    public String mo14016a(String str) {
        if (str == null || str.length() <= super.m13974b()) {
            return str;
        }
        String strSubstring = str.substring(0, super.m13974b());
        if (this.f20990c.m17370c()) {
            this.f20990c.m17369c("\"%s\" %s size exceeded limit of %d characters", super.m13973a(), str, Integer.valueOf(super.m13974b()));
        }
        return strSubstring;
    }
}
