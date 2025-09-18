package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2981Uf;

/* renamed from: com.yandex.metrica.impl.ob.Id */
/* loaded from: classes2.dex */
public class C2680Id {

    /* renamed from: a */
    private final C2529Cc f21428a;

    /* renamed from: b */
    private final C2655Hd f21429b;

    public C2680Id(C2529Cc c2529Cc, C2655Hd c2655Hd) {
        this.f21428a = c2529Cc;
        this.f21429b = c2655Hd;
    }

    /* renamed from: a */
    public C2981Uf.a m14340a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C2953Tc c2953TcM13962a = this.f21428a.m13962a(j, str);
                if (c2953TcM13962a != null) {
                    return this.f21429b.m14263a(c2953TcM13962a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
