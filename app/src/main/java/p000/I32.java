package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class I32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<I32> CREATOR = new P32(4);

    /* renamed from: a */
    public final String f4690a;

    /* renamed from: b */
    public final String f4691b;

    /* renamed from: c */
    public final int f4692c;

    public I32(String str, String str2, int i) {
        this.f4690a = str;
        this.f4691b = str2;
        this.f4692c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f4690a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f4691b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f4692c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
