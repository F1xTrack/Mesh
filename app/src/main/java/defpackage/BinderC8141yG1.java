package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: yG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC8141yG1 extends AbstractBinderC6795rC1 implements OF1 {
    public final C2489cI1 a;

    public BinderC8141yG1(C2489cI1 c2489cI1) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.a = c2489cI1;
    }

    @Override // defpackage.AbstractBinderC6795rC1
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC6032nC1.a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            AbstractC6032nC1.d(parcel);
            x(j, bundle, string, string2);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
        }
        return true;
    }

    @Override // defpackage.OF1
    public final void x(long j, Bundle bundle, String str, String str2) {
        this.a.a(j, bundle, str, str2);
    }

    @Override // defpackage.OF1
    public final int zza() {
        return System.identityHashCode(this.a);
    }
}
