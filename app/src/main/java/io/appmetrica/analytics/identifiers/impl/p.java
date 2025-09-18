package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC6099nZ;

/* loaded from: classes2.dex */
public final class p extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public static final p a = new p();

    public p() {
        super(1);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = t.a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new s(iBinder) : (u) iInterfaceQueryLocalInterface;
    }
}
