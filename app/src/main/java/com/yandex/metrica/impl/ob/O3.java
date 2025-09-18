package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;
import defpackage.O90;
import java.util.Map;

/* loaded from: classes2.dex */
public final class O3 implements InterfaceC2740f0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2740f0, defpackage.InterfaceC6099nZ
    public Object invoke(Object obj) {
        P0 p0I = P0.i();
        O90.e(p0I, "GlobalServiceLocator.getInstance()");
        return Boolean.valueOf(p0I.e().b(new P3.a((Map) obj, E0.RETAIL)));
    }
}
