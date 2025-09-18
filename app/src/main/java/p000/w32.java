package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class w32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<w32> CREATOR = new C8697aD1(20);

    /* renamed from: a */
    public final int f44671a;

    /* renamed from: b */
    public final String[] f44672b;

    public w32(int i, String[] strArr) {
        this.f44671a = i;
        this.f44672b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44671a);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f44672b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
