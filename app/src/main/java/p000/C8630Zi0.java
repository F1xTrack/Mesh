package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Zi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8630Zi0 implements Parcelable {
    public static final Parcelable.Creator<C8630Zi0> CREATOR = new C0444H2(29);

    /* renamed from: a */
    public int f15100a;

    /* renamed from: b */
    public int f15101b;

    /* renamed from: c */
    public boolean f15102c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15100a);
        parcel.writeInt(this.f15101b);
        parcel.writeInt(this.f15102c ? 1 : 0);
    }
}
