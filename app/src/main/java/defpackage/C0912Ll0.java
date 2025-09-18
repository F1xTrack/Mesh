package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: Ll0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912Ll0 extends View.BaseSavedState {
    public static final Parcelable.Creator<C0912Ll0> CREATOR = new C0834Kl0(0);
    public String a;
    public int b;
    public float c;
    public boolean d;
    public String e;
    public int f;
    public int g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
