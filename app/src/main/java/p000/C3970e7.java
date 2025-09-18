package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: e7 */
/* loaded from: classes.dex */
public final class C3970e7 extends View.BaseSavedState {
    public static final Parcelable.Creator<C3970e7> CREATOR = new C0444H2(2);

    /* renamed from: a */
    public boolean f26543a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f26543a ? (byte) 1 : (byte) 0);
    }
}
