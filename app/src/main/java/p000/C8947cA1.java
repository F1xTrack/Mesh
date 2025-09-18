package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: cA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8947cA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8947cA1> CREATOR = new C7363Ay1(25);

    /* renamed from: a */
    public final String f17338a;

    /* renamed from: b */
    public final String f17339b;

    /* renamed from: c */
    public final String f17340c;

    /* renamed from: d */
    public final String f17341d;

    /* renamed from: e */
    public final String f17342e;

    /* renamed from: f */
    public final String f17343f;

    /* renamed from: g */
    public final String f17344g;

    public C8947cA1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f17338a = str;
        this.f17339b = str2;
        this.f17340c = str3;
        this.f17341d = str4;
        this.f17342e = str5;
        this.f17343f = str6;
        this.f17344g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f17338a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f17339b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f17340c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f17341d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f17342e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f17343f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f17344g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
