package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class AY1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AY1> CREATOR = new C10857r31(26);

    /* renamed from: a */
    public String f241a;

    /* renamed from: b */
    public String f242b;

    /* renamed from: c */
    public String f243c;

    /* renamed from: d */
    public String f244d;

    /* renamed from: e */
    public String f245e;

    /* renamed from: f */
    public String f246f;

    /* renamed from: g */
    public String f247g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f241a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f242b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f243c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f244d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f245e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f246f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f247g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
