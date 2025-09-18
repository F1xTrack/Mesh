package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: dC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9084dC1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9084dC1> CREATOR = new C7363Ay1(23);

    /* renamed from: a */
    public final float[] f25867a;

    /* renamed from: b */
    public final int f25868b;

    /* renamed from: c */
    public final boolean f25869c;

    public C9084dC1(float[] fArr, int i, boolean z) {
        this.f25867a = fArr;
        this.f25868b = i;
        this.f25869c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloatArray(parcel, 1, this.f25867a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f25868b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f25869c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
