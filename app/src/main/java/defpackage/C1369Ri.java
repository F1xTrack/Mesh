package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: Ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369Ri extends AbstractC7516v {
    public static final Parcelable.Creator<C1369Ri> CREATOR = new C7325u(2);
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public C1369Ri(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public C1369Ri(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.c = bottomSheetBehavior.L;
        this.d = bottomSheetBehavior.e;
        this.e = bottomSheetBehavior.b;
        this.f = bottomSheetBehavior.I;
        this.g = bottomSheetBehavior.J;
    }
}
