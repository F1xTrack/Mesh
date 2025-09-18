package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class D32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<D32> CREATOR = new P32(0);

    /* renamed from: a */
    public final String f1814a;

    /* renamed from: b */
    public final String f1815b;

    /* renamed from: c */
    public final String f1816c;

    /* renamed from: d */
    public final String f1817d;

    /* renamed from: e */
    public final String f1818e;

    /* renamed from: f */
    public final String f1819f;

    /* renamed from: g */
    public final String f1820g;

    public D32(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1814a = str;
        this.f1815b = str2;
        this.f1816c = str3;
        this.f1817d = str4;
        this.f1818e = str5;
        this.f1819f = str6;
        this.f1820g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f1814a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f1815b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f1816c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f1817d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f1818e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f1819f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f1820g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
