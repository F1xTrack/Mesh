package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Nn extends Cn<String> {
    public Nn(int i, String str) {
        this(i, str, Im.g());
    }

    public Nn(int i, String str, Im im) {
        super(i, str, im);
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public String a(String str) {
        if (str == null || str.length() <= super.b()) {
            return str;
        }
        String strSubstring = str.substring(0, super.b());
        if (this.c.c()) {
            this.c.c("\"%s\" %s size exceeded limit of %d characters", super.a(), str, Integer.valueOf(super.b()));
        }
        return strSubstring;
    }
}
