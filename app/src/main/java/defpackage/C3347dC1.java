package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: dC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3347dC1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3347dC1> CREATOR = new C0094Ay1(23);
    public final float[] a;
    public final int b;
    public final boolean c;

    public C3347dC1(float[] fArr, int i, boolean z) {
        this.a = fArr;
        this.b = i;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloatArray(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
