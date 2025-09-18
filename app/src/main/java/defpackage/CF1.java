package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CF1 extends AbstractC6555px1 implements InterfaceC7377uF1 {
    public CF1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // defpackage.InterfaceC7377uF1
    public final void zza(Bundle bundle) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, bundle);
        L(1, parcelG);
    }
}
