package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: Du0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7510Du0 extends View.BaseSavedState {
    public static final Parcelable.Creator<C7510Du0> CREATOR = new C7856Kl0(14);

    /* renamed from: a */
    public int f2293a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC1374Vq.m8591j(sb, this.f2293a, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2293a);
    }
}
