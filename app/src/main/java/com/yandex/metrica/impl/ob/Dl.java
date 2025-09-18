package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Dl implements Rk {
    private final int a;

    public Dl(int i) {
        this.a = i;
    }

    @Override // com.yandex.metrica.impl.ob.Rk
    public void a(El el) {
        if (el.h.length() > this.a) {
            int length = el.h.length();
            int i = this.a;
            int i2 = length - i;
            String strSubstring = el.h.substring(0, i);
            el.h = strSubstring;
            el.j = Integer.valueOf(strSubstring.length() + i2);
        }
    }
}
