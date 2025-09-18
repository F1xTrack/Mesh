package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class NU1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NU1> CREATOR = new P32(6);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

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
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.writeString(parcel, 10, this.i, false);
        SafeParcelWriter.writeString(parcel, 11, this.j, false);
        SafeParcelWriter.writeString(parcel, 12, this.k, false);
        SafeParcelWriter.writeString(parcel, 13, this.l, false);
        SafeParcelWriter.writeString(parcel, 14, this.m, false);
        SafeParcelWriter.writeString(parcel, 15, this.n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
