package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ua1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11308ua1 extends AbstractC10345n31 {
    public static final Parcelable.Creator<C11308ua1> CREATOR = new C10857r31(8);

    /* renamed from: a */
    public final long f43755a;

    /* renamed from: b */
    public final long f43756b;

    public C11308ua1(long j, long j2) {
        this.f43755a = j;
        this.f43756b = j2;
    }

    /* renamed from: a */
    public static long m25211a(long j, C9591hA0 c9591hA0) {
        long jM18763u = c9591hA0.m18763u();
        if ((128 & jM18763u) != 0) {
            return 8589934591L & ((((jM18763u & 1) << 32) | c9591hA0.m18765w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p000.AbstractC10345n31
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f43755a);
        sb.append(", playbackPositionUs= ");
        return AbstractC0852NX.m5760i(sb, this.f43756b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f43755a);
        parcel.writeLong(this.f43756b);
    }
}
