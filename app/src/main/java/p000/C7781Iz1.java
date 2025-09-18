package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Iz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7781Iz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7781Iz1> CREATOR = new C7363Ay1(6);

    /* renamed from: a */
    public final Bundle f5248a;

    public C7781Iz1(Bundle bundle) {
        this.f5248a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.f5248a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
