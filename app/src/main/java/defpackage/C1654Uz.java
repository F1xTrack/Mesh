package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: Uz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1654Uz implements Parcelable {
    public static final Parcelable.Creator<C1654Uz> CREATOR = new H2(13);
    public final String a;
    public final AtomicLong b;

    public C1654Uz(String str) {
        this.a = str;
        this.b = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b.get());
    }

    public C1654Uz(Parcel parcel) {
        this.a = parcel.readString();
        this.b = new AtomicLong(parcel.readLong());
    }
}
