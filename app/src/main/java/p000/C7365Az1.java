package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Az1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7365Az1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7365Az1> CREATOR = new C7363Ay1(15);

    /* renamed from: a */
    public final String f496a;

    /* renamed from: b */
    public final String f497b;

    /* renamed from: c */
    public final String f498c;

    /* renamed from: d */
    public final String f499d;

    /* renamed from: e */
    public final String f500e;

    /* renamed from: f */
    public final C11740xz1 f501f;

    /* renamed from: g */
    public final C11740xz1 f502g;

    public C7365Az1(String str, String str2, String str3, String str4, String str5, C11740xz1 c11740xz1, C11740xz1 c11740xz12) {
        this.f496a = str;
        this.f497b = str2;
        this.f498c = str3;
        this.f499d = str4;
        this.f500e = str5;
        this.f501f = c11740xz1;
        this.f502g = c11740xz12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f496a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f497b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f498c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f499d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f500e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f501f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f502g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
