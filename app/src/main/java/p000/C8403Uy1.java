package p000;

import android.os.Parcel;

/* renamed from: Uy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8403Uy1 extends AbstractC10714px1 {
    /* renamed from: O */
    public final Y12[] m8207O(BinderC8916bx0 binderC8916bx0, C11613wz1 c11613wz1) {
        Parcel parcelM23900I = m23900I();
        NC1.m5582a(parcelM23900I, binderC8916bx0);
        parcelM23900I.writeInt(1);
        c11613wz1.writeToParcel(parcelM23900I, 0);
        Parcel parcelM23902K = m23902K(1, parcelM23900I);
        Y12[] y12Arr = (Y12[]) parcelM23902K.createTypedArray(Y12.CREATOR);
        parcelM23902K.recycle();
        return y12Arr;
    }
}
