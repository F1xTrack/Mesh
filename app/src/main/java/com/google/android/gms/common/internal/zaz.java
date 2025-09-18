package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import p000.AbstractC7222ym;
import p000.BinderC8916bx0;
import p000.HQ0;
import p000.IQ0;

/* loaded from: classes.dex */
public final class zaz extends IQ0 {
    private static final zaz zaa = new zaz();

    private zaz() {
    }

    public static View zaa(Context context, int i, int i2) throws HQ0 {
        zaz zazVar = zaa;
        try {
            zax zaxVar = new zax(1, i, i2, null);
            return (View) BinderC8916bx0.m10547H(((zam) zazVar.getRemoteCreatorInstance(context)).zae(new BinderC8916bx0(context), zaxVar));
        } catch (Exception e) {
            throw new HQ0(AbstractC7222ym.m26229f(i, "Could not get button with size ", i2, " and color "), e);
        }
    }

    @Override // p000.IQ0
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zam ? (zam) iInterfaceQueryLocalInterface : new zam(iBinder);
    }
}
