package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C3167w;
import java.io.File;

/* loaded from: classes2.dex */
class Sh implements C3167w.c {
    final /* synthetic */ String a;
    final /* synthetic */ File b;
    final /* synthetic */ C2733ei c;
    final /* synthetic */ Ei d;
    final /* synthetic */ Uh e;

    public Sh(Uh uh, String str, File file, C2733ei c2733ei, Ei ei) {
        this.e = uh;
        this.a = str;
        this.b = file;
        this.c = c2733ei;
        this.d = ei;
    }

    @Override // com.yandex.metrica.impl.ob.C3167w.c
    public void a() {
        Qd qd = this.e.d;
        String str = this.a;
        Uh uh = this.e;
        File file = this.b;
        C2733ei c2733ei = this.c;
        Ei ei = this.d;
        uh.getClass();
        qd.a(str, new Th(uh, ei, file, c2733ei));
    }
}
