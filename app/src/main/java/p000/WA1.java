package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class WA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WA1> CREATOR = new C7363Ay1(12);

    /* renamed from: a */
    public final C9084dC1 f13029a;

    /* renamed from: b */
    public final C9980kC1 f13030b;

    /* renamed from: c */
    public final boolean f13031c = true;

    /* renamed from: d */
    public final boolean f13032d;

    public WA1(C9084dC1 c9084dC1, C9980kC1 c9980kC1, boolean z) {
        this.f13029a = c9084dC1;
        this.f13030b = c9980kC1;
        this.f13032d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f13029a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f13030b, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f13031c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f13032d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
