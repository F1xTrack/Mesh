package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: e7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3520e7 extends View.BaseSavedState {
    public static final Parcelable.Creator<C3520e7> CREATOR = new H2(2);
    public boolean a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
