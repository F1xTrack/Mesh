package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: zB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8316zB1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8316zB1> CREATOR = new C0094Ay1(20);
    public final String a;
    public final C6029nB1 b;
    public final String c;
    public final long d;

    public C8316zB1(C8316zB1 c8316zB1, long j) {
        Preconditions.checkNotNull(c8316zB1);
        this.a = c8316zB1.a;
        this.b = c8316zB1.b;
        this.c = c8316zB1.c;
        this.d = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(this.c);
        sb.append(",name=");
        return AbstractC7209tN0.z(sb, this.a, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeLong(parcel, 5, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C8316zB1(String str, C6029nB1 c6029nB1, String str2, long j) {
        this.a = str;
        this.b = c6029nB1;
        this.c = str2;
        this.d = j;
    }
}
