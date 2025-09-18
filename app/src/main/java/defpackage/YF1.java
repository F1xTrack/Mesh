package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class YF1 extends AbstractC6555px1 implements OF1 {
    public YF1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // defpackage.OF1
    public final void x(long j, Bundle bundle, String str, String str2) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC6032nC1.c(parcelG, bundle);
        parcelG.writeLong(j);
        L(1, parcelG);
    }

    @Override // defpackage.OF1
    public final int zza() {
        Parcel parcelJ = J(2, G());
        int i = parcelJ.readInt();
        parcelJ.recycle();
        return i;
    }
}
