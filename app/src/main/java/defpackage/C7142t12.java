package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: t12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7142t12 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7142t12> CREATOR = new C0094Ay1(0);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeInt(parcel, 4, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
