package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class VR1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VR1> CREATOR = new C2093aD1(19);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public C5883mQ1 f;
    public C5883mQ1 g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeString(parcel, 6, this.e, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
