package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Uf;

/* loaded from: classes2.dex */
public class Kd {
    private final Cc a;
    private final Jd b;

    public Kd(Cc cc, Jd jd) {
        this.a = cc;
        this.b = jd;
    }

    public Uf.b a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C3002pd c3002pdB = this.a.b(j, str);
                if (c3002pdB != null) {
                    return this.b.a(c3002pdB);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
