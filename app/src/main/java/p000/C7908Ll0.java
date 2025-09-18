package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: Ll0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7908Ll0 extends View.BaseSavedState {
    public static final Parcelable.Creator<C7908Ll0> CREATOR = new C7856Kl0(0);

    /* renamed from: a */
    public String f6828a;

    /* renamed from: b */
    public int f6829b;

    /* renamed from: c */
    public float f6830c;

    /* renamed from: d */
    public boolean f6831d;

    /* renamed from: e */
    public String f6832e;

    /* renamed from: f */
    public int f6833f;

    /* renamed from: g */
    public int f6834g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f6828a);
        parcel.writeFloat(this.f6830c);
        parcel.writeInt(this.f6831d ? 1 : 0);
        parcel.writeString(this.f6832e);
        parcel.writeInt(this.f6833f);
        parcel.writeInt(this.f6834g);
    }
}
