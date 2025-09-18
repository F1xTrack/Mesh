package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class RA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RA1> CREATOR = new C0094Ay1(11);
    public final int a;
    public final boolean b;

    public RA1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
