package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class F32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<F32> CREATOR = new P32(2);

    /* renamed from: a */
    public final String f3050a;

    /* renamed from: b */
    public final String f3051b;

    public F32(String str, String str2) {
        this.f3050a = str;
        this.f3051b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f3050a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f3051b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
