package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class NU1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NU1> CREATOR = new P32(6);

    /* renamed from: a */
    public String f7812a;

    /* renamed from: b */
    public String f7813b;

    /* renamed from: c */
    public String f7814c;

    /* renamed from: d */
    public String f7815d;

    /* renamed from: e */
    public String f7816e;

    /* renamed from: f */
    public String f7817f;

    /* renamed from: g */
    public String f7818g;

    /* renamed from: h */
    public String f7819h;

    /* renamed from: i */
    public String f7820i;

    /* renamed from: j */
    public String f7821j;

    /* renamed from: k */
    public String f7822k;

    /* renamed from: l */
    public String f7823l;

    /* renamed from: m */
    public String f7824m;

    /* renamed from: n */
    public String f7825n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f7812a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f7813b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f7814c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f7815d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f7816e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f7817f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f7818g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f7819h, false);
        SafeParcelWriter.writeString(parcel, 10, this.f7820i, false);
        SafeParcelWriter.writeString(parcel, 11, this.f7821j, false);
        SafeParcelWriter.writeString(parcel, 12, this.f7822k, false);
        SafeParcelWriter.writeString(parcel, 13, this.f7823l, false);
        SafeParcelWriter.writeString(parcel, 14, this.f7824m, false);
        SafeParcelWriter.writeString(parcel, 15, this.f7825n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
