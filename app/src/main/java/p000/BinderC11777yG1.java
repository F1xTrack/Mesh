package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: yG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC11777yG1 extends AbstractBinderC10876rC1 implements OF1 {

    /* renamed from: a */
    public final C8963cI1 f46162a;

    public BinderC11777yG1(C8963cI1 c8963cI1) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f46162a = c8963cI1;
    }

    @Override // p000.AbstractBinderC10876rC1
    /* renamed from: G */
    public final boolean mo734G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            AbstractC10364nC1.m23103d(parcel);
            mo6001x(j, bundle, string, string2);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f46162a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
        }
        return true;
    }

    @Override // p000.OF1
    /* renamed from: x */
    public final void mo6001x(long j, Bundle bundle, String str, String str2) {
        this.f46162a.mo181a(j, bundle, str, str2);
    }

    @Override // p000.OF1
    public final int zza() {
        return System.identityHashCode(this.f46162a);
    }
}
