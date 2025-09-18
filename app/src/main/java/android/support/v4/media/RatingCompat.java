package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C7856Kl0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C7856Kl0(22);

    /* renamed from: a */
    public final int f15708a;

    /* renamed from: b */
    public final float f15709b;

    public RatingCompat(float f, int i) {
        this.f15708a = i;
        this.f15709b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f15708a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f15708a);
        sb.append(" rating=");
        float f = this.f15709b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15708a);
        parcel.writeFloat(this.f15709b);
    }
}
