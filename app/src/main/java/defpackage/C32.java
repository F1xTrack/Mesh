package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class C32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C32> CREATOR = new C2093aD1(29);
    public final double a;
    public final double b;

    public C32(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.a);
        SafeParcelWriter.writeDouble(parcel, 2, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
