package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Az1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097Az1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C0097Az1> CREATOR = new C0094Ay1(15);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final C8086xz1 f;
    public final C8086xz1 g;

    public C0097Az1(String str, String str2, String str3, String str4, String str5, C8086xz1 c8086xz1, C8086xz1 c8086xz12) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = c8086xz1;
        this.g = c8086xz12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
