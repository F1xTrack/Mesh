package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C7856Kl0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C7856Kl0(16);

    /* renamed from: a */
    public int f15715a;

    /* renamed from: b */
    public int f15716b;

    /* renamed from: c */
    public int f15717c;

    /* renamed from: d */
    public int f15718d;

    /* renamed from: e */
    public int f15719e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15715a);
        parcel.writeInt(this.f15717c);
        parcel.writeInt(this.f15718d);
        parcel.writeInt(this.f15719e);
        parcel.writeInt(this.f15716b);
    }
}
