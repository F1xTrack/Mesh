package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class Am extends zo {
    private static String c = "";
    private final String b;

    public Am(String str) {
        super(false);
        this.b = "[" + U2.a(str) + "] ";
    }

    @Override // com.yandex.metrica.impl.ob.zo
    public String a() {
        String str = c;
        int i = O2.a;
        if (str == null) {
            str = "";
        }
        String str2 = this.b;
        return str.concat(str2 != null ? str2 : "");
    }

    public static void a(Context context) {
        c = "[" + context.getPackageName() + "] : ";
    }
}
