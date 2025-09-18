package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class VB1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VB1> CREATOR = new C0094Ay1(22);
    public final boolean a;
    public final byte[] b;
    public final boolean c;
    public final float d;
    public final boolean e;

    public VB1(boolean z, byte[] bArr, boolean z2, float f, boolean z3) {
        this.a = z;
        this.b = bArr;
        this.c = z2;
        this.d = f;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeFloat(parcel, 4, this.d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
