package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Jn {
    private final String a;
    private final Im b;

    public Jn(int i, String str, Im im) {
        this.a = str;
        this.b = im;
    }

    public boolean a(Gm gm, String str, String str2) {
        int iA = gm.a();
        if (str2 != null) {
            iA += str2.length();
        }
        if (gm.containsKey(str)) {
            String str3 = gm.get(str);
            if (str3 != null) {
                iA -= str3.length();
            }
        } else {
            iA += str.length();
        }
        return iA > 4500;
    }

    public void a(String str) {
        if (this.b.c()) {
            this.b.c("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.a, 4500, str);
        }
    }
}
