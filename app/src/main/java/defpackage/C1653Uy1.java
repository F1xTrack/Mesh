package defpackage;

import android.os.Parcel;

/* renamed from: Uy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1653Uy1 extends AbstractC6555px1 {
    public final Y12[] O(BinderC2421bx0 binderC2421bx0, C7896wz1 c7896wz1) {
        Parcel parcelI = I();
        NC1.a(parcelI, binderC2421bx0);
        parcelI.writeInt(1);
        c7896wz1.writeToParcel(parcelI, 0);
        Parcel parcelK = K(1, parcelI);
        Y12[] y12Arr = (Y12[]) parcelK.createTypedArray(Y12.CREATOR);
        parcelK.recycle();
        return y12Arr;
    }
}
