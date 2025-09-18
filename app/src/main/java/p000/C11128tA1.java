package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: tA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11128tA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11128tA1> CREATOR = new C7363Ay1(29);

    /* renamed from: a */
    public final String f42898a;

    /* renamed from: b */
    public final String f42899b;

    /* renamed from: c */
    public final int f42900c;

    public C11128tA1(String str, String str2, int i) {
        this.f42898a = str;
        this.f42899b = str2;
        this.f42900c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42898a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42899b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f42900c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
