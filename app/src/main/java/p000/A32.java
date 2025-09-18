package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class A32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<A32> CREATOR = new C8697aD1(27);

    /* renamed from: a */
    public final String f44a;

    /* renamed from: b */
    public final String f45b;

    /* renamed from: c */
    public final String f46c;

    /* renamed from: d */
    public final String f47d;

    /* renamed from: e */
    public final String f48e;

    /* renamed from: f */
    public final String f49f;

    /* renamed from: g */
    public final String f50g;

    /* renamed from: h */
    public final String f51h;

    /* renamed from: i */
    public final String f52i;

    /* renamed from: j */
    public final String f53j;

    /* renamed from: k */
    public final String f54k;

    /* renamed from: l */
    public final String f55l;

    /* renamed from: m */
    public final String f56m;

    /* renamed from: n */
    public final String f57n;

    public A32(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f44a = str;
        this.f45b = str2;
        this.f46c = str3;
        this.f47d = str4;
        this.f48e = str5;
        this.f49f = str6;
        this.f50g = str7;
        this.f51h = str8;
        this.f52i = str9;
        this.f53j = str10;
        this.f54k = str11;
        this.f55l = str12;
        this.f56m = str13;
        this.f57n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f44a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f45b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f49f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f50g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f51h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f52i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f53j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f54k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f55l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f56m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f57n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
