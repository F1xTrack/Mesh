package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3144b2;
import java.util.EnumSet;

/* renamed from: com.yandex.metrica.impl.ob.Rd */
/* loaded from: classes2.dex */
public class C2904Rd implements InterfaceC2979Ud {

    /* renamed from: c */
    private static final EnumSet<C3144b2.d> f22126c = EnumSet.of(C3144b2.d.OFFLINE);

    /* renamed from: a */
    private InterfaceC3710wm f22127a = new C3580rm();

    /* renamed from: b */
    private final Context f22128b;

    public C2904Rd(Context context) {
        this.f22128b = context;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2979Ud
    /* renamed from: a */
    public boolean mo14997a() {
        InterfaceC3710wm interfaceC3710wm = this.f22127a;
        Context context = this.f22128b;
        ((C3580rm) interfaceC3710wm).getClass();
        return !f22126c.contains(C3144b2.m15661a(context));
    }
}
