package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class WA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WA1> CREATOR = new C0094Ay1(12);
    public final C3347dC1 a;
    public final C5459kC1 b;
    public final boolean c = true;
    public final boolean d;

    public WA1(C3347dC1 c3347dC1, C5459kC1 c5459kC1, boolean z) {
        this.a = c3347dC1;
        this.b = c5459kC1;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
