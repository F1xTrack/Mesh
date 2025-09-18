package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Mz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7989Mz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7989Mz1> CREATOR = new C7363Ay1(18);

    /* renamed from: a */
    public final String f7427a;

    /* renamed from: b */
    public final String f7428b;

    /* renamed from: c */
    public final String f7429c;

    /* renamed from: d */
    public final String f7430d;

    /* renamed from: e */
    public final String f7431e;

    /* renamed from: f */
    public final String f7432f;

    /* renamed from: g */
    public final String f7433g;

    /* renamed from: h */
    public final String f7434h;

    /* renamed from: i */
    public final String f7435i;

    /* renamed from: j */
    public final String f7436j;

    /* renamed from: k */
    public final String f7437k;

    /* renamed from: l */
    public final String f7438l;

    /* renamed from: m */
    public final String f7439m;

    /* renamed from: n */
    public final String f7440n;

    public C7989Mz1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7427a = str;
        this.f7428b = str2;
        this.f7429c = str3;
        this.f7430d = str4;
        this.f7431e = str5;
        this.f7432f = str6;
        this.f7433g = str7;
        this.f7434h = str8;
        this.f7435i = str9;
        this.f7436j = str10;
        this.f7437k = str11;
        this.f7438l = str12;
        this.f7439m = str13;
        this.f7440n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f7427a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f7428b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f7429c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f7430d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f7431e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f7432f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f7433g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f7434h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f7435i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f7436j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f7437k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f7438l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f7439m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f7440n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
