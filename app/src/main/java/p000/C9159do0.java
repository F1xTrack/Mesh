package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: do0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9159do0 extends View.BaseSavedState {
    public static final Parcelable.Creator<C9159do0> CREATOR = new C7856Kl0(1);

    /* renamed from: a */
    public int f26278a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f26278a;
        return AbstractC1374Vq.m8593l(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f26278a));
    }
}
