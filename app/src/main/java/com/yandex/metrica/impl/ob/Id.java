package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Uf;

/* loaded from: classes2.dex */
public class Id {
    private final Cc a;
    private final Hd b;

    public Id(Cc cc, Hd hd) {
        this.a = cc;
        this.b = hd;
    }

    public Uf.a a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Tc tcA = this.a.a(j, str);
                if (tcA != null) {
                    return this.b.a(tcA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
