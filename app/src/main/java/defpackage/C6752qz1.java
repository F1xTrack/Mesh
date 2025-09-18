package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: qz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6752qz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C6752qz1> CREATOR = new C0094Ay1(4);
    public final int a;
    public final String[] b;

    public C6752qz1(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeStringArray(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
