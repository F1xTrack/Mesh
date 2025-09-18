package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: zX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8382zX1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8382zX1> CREATOR = new C2093aD1(11);
    public final String a;
    public final long b;
    public final int c;

    public C8382zX1(int i, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
