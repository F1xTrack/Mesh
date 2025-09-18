package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: oy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6367oy1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C6367oy1> CREATOR = new C0094Ay1(1);
    public final long a;
    public final int b;
    public final long c;

    public C6367oy1(int i, long j, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
