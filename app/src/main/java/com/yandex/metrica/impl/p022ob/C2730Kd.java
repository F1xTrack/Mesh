package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2981Uf;

/* renamed from: com.yandex.metrica.impl.ob.Kd */
/* loaded from: classes2.dex */
public class C2730Kd {

    /* renamed from: a */
    private final C2529Cc f21584a;

    /* renamed from: b */
    private final C2705Jd f21585b;

    public C2730Kd(C2529Cc c2529Cc, C2705Jd c2705Jd) {
        this.f21584a = c2529Cc;
        this.f21585b = c2705Jd;
    }

    /* renamed from: a */
    public C2981Uf.b m14475a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C3519pd c3519pdM13965b = this.f21584a.m13965b(j, str);
                if (c3519pdM13965b != null) {
                    return this.f21585b.m14439a(c3519pdM13965b);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
