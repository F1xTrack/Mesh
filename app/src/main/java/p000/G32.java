package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class G32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<G32> CREATOR = new P32(3);

    /* renamed from: a */
    public final String f3559a;

    /* renamed from: b */
    public final String f3560b;

    public G32(String str, String str2) {
        this.f3559a = str;
        this.f3560b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f3559a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f3560b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
