package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2409bt0 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<C2409bt0> CREATOR = new C0834Kl0(13);
    public final long a;
    public final long b;
    public final long c;

    public C2409bt0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ void d0(C7293tp0 c7293tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ byte[] e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2409bt0)) {
            return false;
        }
        C2409bt0 c2409bt0 = (C2409bt0) obj;
        return this.a == c2409bt0.a && this.b == c2409bt0.b && this.c == c2409bt0.c;
    }

    public final int hashCode() {
        return AbstractC5205it0.a(this.c) + ((AbstractC5205it0.a(this.b) + ((AbstractC5205it0.a(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public C2409bt0(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
    }
}
