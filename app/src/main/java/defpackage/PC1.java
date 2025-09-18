package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class PC1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PC1> CREATOR = new C2093aD1(1);
    public final String a;
    public final int b;

    public PC1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
