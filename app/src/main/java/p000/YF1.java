package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class YF1 extends AbstractC10714px1 implements OF1 {
    public YF1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // p000.OF1
    /* renamed from: x */
    public final void mo6001x(long j, Bundle bundle, String str, String str2) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        parcelM23898G.writeLong(j);
        m23903L(1, parcelM23898G);
    }

    @Override // p000.OF1
    public final int zza() {
        Parcel parcelM23901J = m23901J(2, m23898G());
        int i = parcelM23901J.readInt();
        parcelM23901J.recycle();
        return i;
    }
}
