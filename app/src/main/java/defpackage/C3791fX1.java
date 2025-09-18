package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: fX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3791fX1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3791fX1> CREATOR = new C6767r31(25);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.a);
        SafeParcelWriter.writeDouble(parcel, 3, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
