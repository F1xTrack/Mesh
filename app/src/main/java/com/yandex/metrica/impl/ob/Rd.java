package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2642b2;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public class Rd implements Ud {
    private static final EnumSet<C2642b2.d> c = EnumSet.of(C2642b2.d.OFFLINE);
    private InterfaceC3190wm a = new C3060rm();
    private final Context b;

    public Rd(Context context) {
        this.b = context;
    }

    @Override // com.yandex.metrica.impl.ob.Ud
    public boolean a() {
        InterfaceC3190wm interfaceC3190wm = this.a;
        Context context = this.b;
        ((C3060rm) interfaceC3190wm).getClass();
        return !c.contains(C2642b2.a(context));
    }
}
