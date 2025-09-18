package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class D01 extends AbstractC6984v {
    public static final Parcelable.Creator<D01> CREATOR = new C6921u(10);

    /* renamed from: c */
    public final int f1798c;

    public D01(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1798c = parcel.readInt();
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1798c);
    }

    public D01(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f1798c = sideSheetBehavior.f18240h;
    }
}
