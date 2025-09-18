package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public final class so {
    private final boolean a;
    private final String b;

    private so(uo<?> uoVar, boolean z, String str) {
        uoVar.getClass();
        this.a = z;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public static final so a(uo<?> uoVar) {
        return new so(uoVar, true, "");
    }

    public static final so a(uo<?> uoVar, String str) {
        return new so(uoVar, false, str);
    }
}
