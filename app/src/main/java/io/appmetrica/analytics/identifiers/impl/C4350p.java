package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.identifiers.impl.p */
/* loaded from: classes2.dex */
public final class C4350p extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C4350p f29829a = new C4350p();

    public C4350p() {
        super(1);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = AbstractBinderC4354t.f29833a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4355u)) ? new C4353s(iBinder) : (InterfaceC4355u) iInterfaceQueryLocalInterface;
    }
}
