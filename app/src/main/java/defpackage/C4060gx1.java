package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;

/* renamed from: gx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4060gx1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C4060gx1> CREATOR = new C6767r31(19);
    public final int a;
    public final zat b;

    public C4060gx1(int i, zat zatVar) {
        this.a = i;
        this.b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
