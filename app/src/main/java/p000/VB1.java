package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class VB1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VB1> CREATOR = new C7363Ay1(22);

    /* renamed from: a */
    public final boolean f12404a;

    /* renamed from: b */
    public final byte[] f12405b;

    /* renamed from: c */
    public final boolean f12406c;

    /* renamed from: d */
    public final float f12407d;

    /* renamed from: e */
    public final boolean f12408e;

    public VB1(boolean z, byte[] bArr, boolean z2, float f, boolean z3) {
        this.f12404a = z;
        this.f12405b = bArr;
        this.f12406c = z2;
        this.f12407d = f;
        this.f12408e = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f12404a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f12405b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f12406c);
        SafeParcelWriter.writeFloat(parcel, 4, this.f12407d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f12408e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
