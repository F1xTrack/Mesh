package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import p000.AbstractBinderC8451Vw1;
import p000.C9946jx1;

/* loaded from: classes.dex */
final class zaar extends AbstractBinderC8451Vw1 {
    private final WeakReference zaa;

    public zaar(zaaw zaawVar) {
        this.zaa = new WeakReference(zaawVar);
    }

    @Override // p000.InterfaceC8917bx1
    public final void zab(C9946jx1 c9946jx1) {
        zaaw zaawVar = (zaaw) this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.zaa.zal(new zaaq(this, zaawVar, zaawVar, c9946jx1));
    }
}
