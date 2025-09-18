package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: kC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9980kC1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9980kC1> CREATOR = new C7363Ay1(24);

    /* renamed from: a */
    public final float[] f36352a;

    public C9980kC1(float[] fArr) {
        this.f36352a = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloatArray(parcel, 1, this.f36352a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
