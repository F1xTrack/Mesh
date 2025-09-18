package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: Ri */
/* loaded from: classes.dex */
public final class C1114Ri extends AbstractC6984v {
    public static final Parcelable.Creator<C1114Ri> CREATOR = new C6921u(2);

    /* renamed from: c */
    public final int f10381c;

    /* renamed from: d */
    public final int f10382d;

    /* renamed from: e */
    public final boolean f10383e;

    /* renamed from: f */
    public final boolean f10384f;

    /* renamed from: g */
    public final boolean f10385g;

    public C1114Ri(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10381c = parcel.readInt();
        this.f10382d = parcel.readInt();
        this.f10383e = parcel.readInt() == 1;
        this.f10384f = parcel.readInt() == 1;
        this.f10385g = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10381c);
        parcel.writeInt(this.f10382d);
        parcel.writeInt(this.f10383e ? 1 : 0);
        parcel.writeInt(this.f10384f ? 1 : 0);
        parcel.writeInt(this.f10385g ? 1 : 0);
    }

    public C1114Ri(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f10381c = bottomSheetBehavior.f18101L;
        this.f10382d = bottomSheetBehavior.f18124e;
        this.f10383e = bottomSheetBehavior.f18118b;
        this.f10384f = bottomSheetBehavior.f18098I;
        this.f10385g = bottomSheetBehavior.f18099J;
    }
}
