package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: fX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9382fX1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9382fX1> CREATOR = new C10857r31(25);

    /* renamed from: a */
    public double f27226a;

    /* renamed from: b */
    public double f27227b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.f27226a);
        SafeParcelWriter.writeDouble(parcel, 3, this.f27227b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
