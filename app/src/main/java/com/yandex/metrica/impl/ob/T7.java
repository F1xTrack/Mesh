package com.yandex.metrica.impl.ob;

@Deprecated
/* loaded from: classes2.dex */
public class T7 implements N7<String> {
    private final C2968o4 a;

    public T7(C2968o4 c2968o4) {
        this.a = c2968o4;
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void a(String str) {
        this.a.a(J0.b(str, Im.g()));
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void b(String str) {
        this.a.a(J0.a(str, Im.g()));
    }
}
