package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.rg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3054rg implements uo<Void> {
    private final C3104tg a;

    public C3054rg(C3104tg c3104tg) {
        this.a = c3104tg;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(Void r1) {
        this.a.getClass();
        return C2892l3.h() ? so.a(this) : so.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }

    public so a() {
        this.a.getClass();
        if (C2892l3.h()) {
            return so.a(this);
        }
        return so.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }
}
