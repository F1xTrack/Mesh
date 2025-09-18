package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.AbstractC0852NX;
import p000.AbstractC7500Dp0;
import p000.C7856Kl0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C7856Kl0(19);

    /* renamed from: a */
    public final int f15720a;

    /* renamed from: b */
    public final long f15721b;

    /* renamed from: c */
    public final long f15722c;

    /* renamed from: d */
    public final float f15723d;

    /* renamed from: e */
    public final long f15724e;

    /* renamed from: f */
    public final int f15725f;

    /* renamed from: g */
    public final CharSequence f15726g;

    /* renamed from: h */
    public final long f15727h;

    /* renamed from: i */
    public final ArrayList f15728i;

    /* renamed from: j */
    public final long f15729j;

    /* renamed from: k */
    public final Bundle f15730k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C1689b();

        /* renamed from: a */
        public final String f15731a;

        /* renamed from: b */
        public final CharSequence f15732b;

        /* renamed from: c */
        public final int f15733c;

        /* renamed from: d */
        public final Bundle f15734d;

        public CustomAction(Parcel parcel) {
            this.f15731a = parcel.readString();
            this.f15732b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15733c = parcel.readInt();
            this.f15734d = parcel.readBundle(AbstractC7500Dp0.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f15732b) + ", mIcon=" + this.f15733c + ", mExtras=" + this.f15734d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f15731a);
            TextUtils.writeToParcel(this.f15732b, parcel, i);
            parcel.writeInt(this.f15733c);
            parcel.writeBundle(this.f15734d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f15720a = parcel.readInt();
        this.f15721b = parcel.readLong();
        this.f15723d = parcel.readFloat();
        this.f15727h = parcel.readLong();
        this.f15722c = parcel.readLong();
        this.f15724e = parcel.readLong();
        this.f15726g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15728i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f15729j = parcel.readLong();
        this.f15730k = parcel.readBundle(AbstractC7500Dp0.class.getClassLoader());
        this.f15725f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f15720a);
        sb.append(", position=");
        sb.append(this.f15721b);
        sb.append(", buffered position=");
        sb.append(this.f15722c);
        sb.append(", speed=");
        sb.append(this.f15723d);
        sb.append(", updated=");
        sb.append(this.f15727h);
        sb.append(", actions=");
        sb.append(this.f15724e);
        sb.append(", error code=");
        sb.append(this.f15725f);
        sb.append(", error message=");
        sb.append(this.f15726g);
        sb.append(", custom actions=");
        sb.append(this.f15728i);
        sb.append(", active item id=");
        return AbstractC0852NX.m5760i(sb, this.f15729j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15720a);
        parcel.writeLong(this.f15721b);
        parcel.writeFloat(this.f15723d);
        parcel.writeLong(this.f15727h);
        parcel.writeLong(this.f15722c);
        parcel.writeLong(this.f15724e);
        TextUtils.writeToParcel(this.f15726g, parcel, i);
        parcel.writeTypedList(this.f15728i);
        parcel.writeLong(this.f15729j);
        parcel.writeBundle(this.f15730k);
        parcel.writeInt(this.f15725f);
    }
}
