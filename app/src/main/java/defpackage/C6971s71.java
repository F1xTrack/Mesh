package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: s71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6971s71 extends View.BaseSavedState {
    public static final Parcelable.Creator<C6971s71> CREATOR = new C6767r31(5);
    public final boolean a;

    public C6971s71(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.a = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public C6971s71(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }
}
