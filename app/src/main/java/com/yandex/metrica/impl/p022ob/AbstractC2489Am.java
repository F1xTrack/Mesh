package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Am */
/* loaded from: classes2.dex */
public abstract class AbstractC2489Am extends AbstractC3790zo {

    /* renamed from: c */
    private static String f20874c = "";

    /* renamed from: b */
    private final String f20875b;

    public AbstractC2489Am(String str) {
        super(false);
        this.f20875b = "[" + C2968U2.m15231a(str) + "] ";
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3790zo
    /* renamed from: a */
    public String mo13872a() {
        String str = f20874c;
        int i = C2819O2.f21836a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f20875b;
        return str.concat(str2 != null ? str2 : "");
    }

    /* renamed from: a */
    public static void m13871a(Context context) {
        f20874c = "[" + context.getPackageName() + "] : ";
    }
}
