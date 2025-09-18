package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: zX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11938zX1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11938zX1> CREATOR = new C8697aD1(11);

    /* renamed from: a */
    public final String f46861a;

    /* renamed from: b */
    public final long f46862b;

    /* renamed from: c */
    public final int f46863c;

    public C11938zX1(int i, String str, long j) {
        this.f46861a = str;
        this.f46862b = j;
        this.f46863c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46861a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f46862b);
        SafeParcelWriter.writeInt(parcel, 3, this.f46863c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
