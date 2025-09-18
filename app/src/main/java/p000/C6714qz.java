package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: qz */
/* loaded from: classes.dex */
public final class C6714qz extends AbstractC6984v {
    public static final Parcelable.Creator<C6714qz> CREATOR = new C6921u(4);

    /* renamed from: c */
    public SparseArray f41276c;

    public C6714qz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f41276c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f41276c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f41276c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f41276c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f41276c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
