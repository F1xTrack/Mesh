package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Un extends Rn {
    public Un(int i) {
        super(i);
    }

    @Override // com.yandex.metrica.impl.ob.Rn
    public Qn<String, Fn> a(String str) {
        int length = 0;
        if (str != null && str.length() > a()) {
            String strSubstring = str.substring(0, a());
            int length2 = O2.c(str).length;
            int length3 = O2.c(strSubstring).length;
            length = str.getBytes().length - strSubstring.getBytes().length;
            str = strSubstring;
        }
        return new Qn<>(str, new En(length));
    }
}
