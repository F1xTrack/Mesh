package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: s71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10994s71 extends View.BaseSavedState {
    public static final Parcelable.Creator<C10994s71> CREATOR = new C10857r31(5);

    /* renamed from: a */
    public final boolean f42271a;

    public C10994s71(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f42271a = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f42271a ? (byte) 1 : (byte) 0);
    }

    public C10994s71(Parcel parcel) {
        super(parcel);
        this.f42271a = parcel.readByte() != 0;
    }
}
