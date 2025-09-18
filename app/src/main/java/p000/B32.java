package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class B32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<B32> CREATOR = new C8697aD1(28);

    /* renamed from: a */
    public final int f535a;

    /* renamed from: b */
    public final String f536b;

    /* renamed from: c */
    public final String f537c;

    /* renamed from: d */
    public final String f538d;

    public B32(String str, int i, String str2, String str3) {
        this.f535a = i;
        this.f536b = str;
        this.f537c = str2;
        this.f538d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f535a);
        SafeParcelWriter.writeString(parcel, 2, this.f536b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f537c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f538d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
