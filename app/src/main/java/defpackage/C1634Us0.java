package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Us0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634Us0 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<C1634Us0> CREATOR = new C0834Kl0(11);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public C1634Us0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
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
        if (obj == null || C1634Us0.class != obj.getClass()) {
            return false;
        }
        C1634Us0 c1634Us0 = (C1634Us0) obj;
        return this.a == c1634Us0.a && this.b == c1634Us0.b && this.c == c1634Us0.c && this.d == c1634Us0.d && this.e == c1634Us0.e;
    }

    public final int hashCode() {
        return AbstractC5205it0.a(this.e) + ((AbstractC5205it0.a(this.d) + ((AbstractC5205it0.a(this.c) + ((AbstractC5205it0.a(this.b) + ((AbstractC5205it0.a(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    public C1634Us0(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
    }
}
