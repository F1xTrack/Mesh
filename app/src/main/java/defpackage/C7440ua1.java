package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ua1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7440ua1 extends AbstractC6004n31 {
    public static final Parcelable.Creator<C7440ua1> CREATOR = new C6767r31(8);
    public final long a;
    public final long b;

    public C7440ua1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, C4103hA0 c4103hA0) {
        long jU = c4103hA0.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | c4103hA0.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.AbstractC6004n31
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return NX.i(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
