package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class PC1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PC1> CREATOR = new C8697aD1(1);

    /* renamed from: a */
    public final String f8890a;

    /* renamed from: b */
    public final int f8891b;

    public PC1(String str, int i) {
        this.f8890a = str;
        this.f8891b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f8890a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f8891b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
