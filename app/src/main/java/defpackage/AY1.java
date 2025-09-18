package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class AY1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AY1> CREATOR = new C6767r31(26);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeString(parcel, 6, this.e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f, false);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
