package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class y32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<y32> CREATOR = new C8697aD1(25);

    /* renamed from: a */
    public final String f46067a;

    /* renamed from: b */
    public final String f46068b;

    /* renamed from: c */
    public final String f46069c;

    /* renamed from: d */
    public final String f46070d;

    /* renamed from: e */
    public final String f46071e;

    /* renamed from: f */
    public final x32 f46072f;

    /* renamed from: g */
    public final x32 f46073g;

    public y32(String str, String str2, String str3, String str4, String str5, x32 x32Var, x32 x32Var2) {
        this.f46067a = str;
        this.f46068b = str2;
        this.f46069c = str3;
        this.f46070d = str4;
        this.f46071e = str5;
        this.f46072f = x32Var;
        this.f46073g = x32Var2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46067a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46068b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46069c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46070d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46071e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f46072f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f46073g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
