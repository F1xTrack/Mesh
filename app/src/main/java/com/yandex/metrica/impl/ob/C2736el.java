package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.el, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2736el implements Bl {
    private final Ok a;

    public C2736el() {
        this(new Ok());
    }

    @Override // com.yandex.metrica.impl.ob.Bl
    public boolean a(String str, C2662bm c2662bm) {
        if (!c2662bm.g) {
            return !U2.a("allow-parsing", str);
        }
        this.a.getClass();
        return U2.a("do-not-parse", str);
    }

    public C2736el(Ok ok) {
        this.a = ok;
    }
}
