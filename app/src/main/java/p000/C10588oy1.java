package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: oy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10588oy1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C10588oy1> CREATOR = new C7363Ay1(1);

    /* renamed from: a */
    public final long f39402a;

    /* renamed from: b */
    public final int f39403b;

    /* renamed from: c */
    public final long f39404c;

    public C10588oy1(int i, long j, long j2) {
        this.f39402a = j;
        this.f39403b = i;
        this.f39404c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f39402a);
        SafeParcelWriter.writeInt(parcel, 2, this.f39403b);
        SafeParcelWriter.writeLong(parcel, 3, this.f39404c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
