package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8908bt0 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C8908bt0> CREATOR = new C7856Kl0(13);

    /* renamed from: a */
    public final long f17207a;

    /* renamed from: b */
    public final long f17208b;

    /* renamed from: c */
    public final long f17209c;

    public C8908bt0(long j, long j2, long j3) {
        this.f17207a = j;
        this.f17208b = j2;
        this.f17209c = j3;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final /* synthetic */ void mo31d0(C11209tp0 c11209tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: e0 */
    public final /* synthetic */ byte[] mo32e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8908bt0)) {
            return false;
        }
        C8908bt0 c8908bt0 = (C8908bt0) obj;
        return this.f17207a == c8908bt0.f17207a && this.f17208b == c8908bt0.f17208b && this.f17209c == c8908bt0.f17209c;
    }

    public final int hashCode() {
        return AbstractC9809it0.m21935a(this.f17209c) + ((AbstractC9809it0.m21935a(this.f17208b) + ((AbstractC9809it0.m21935a(this.f17207a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f17207a + ", modification time=" + this.f17208b + ", timescale=" + this.f17209c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17207a);
        parcel.writeLong(this.f17208b);
        parcel.writeLong(this.f17209c);
    }

    public C8908bt0(Parcel parcel) {
        this.f17207a = parcel.readLong();
        this.f17208b = parcel.readLong();
        this.f17209c = parcel.readLong();
    }
}
