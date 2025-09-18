package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: kC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5459kC1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5459kC1> CREATOR = new C0094Ay1(24);
    public final float[] a;

    public C5459kC1(float[] fArr) {
        this.a = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloatArray(parcel, 1, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
