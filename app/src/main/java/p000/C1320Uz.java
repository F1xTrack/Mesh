package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: Uz */
/* loaded from: classes.dex */
public final class C1320Uz implements Parcelable {
    public static final Parcelable.Creator<C1320Uz> CREATOR = new C0444H2(13);

    /* renamed from: a */
    public final String f12269a;

    /* renamed from: b */
    public final AtomicLong f12270b;

    public C1320Uz(String str) {
        this.f12269a = str;
        this.f12270b = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12269a);
        parcel.writeLong(this.f12270b.get());
    }

    public C1320Uz(Parcel parcel) {
        this.f12269a = parcel.readString();
        this.f12270b = new AtomicLong(parcel.readLong());
    }
}
