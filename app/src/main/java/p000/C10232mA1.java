package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: mA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10232mA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C10232mA1> CREATOR = new C7363Ay1(27);

    /* renamed from: a */
    public final String f37545a;

    /* renamed from: b */
    public final String f37546b;

    public C10232mA1(String str, String str2) {
        this.f37545a = str;
        this.f37546b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f37545a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f37546b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
