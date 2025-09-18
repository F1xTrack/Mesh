package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class VR1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VR1> CREATOR = new C8697aD1(19);

    /* renamed from: a */
    public String f12567a;

    /* renamed from: b */
    public String f12568b;

    /* renamed from: c */
    public String f12569c;

    /* renamed from: d */
    public String f12570d;

    /* renamed from: e */
    public String f12571e;

    /* renamed from: f */
    public C10264mQ1 f12572f;

    /* renamed from: g */
    public C10264mQ1 f12573g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f12567a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f12568b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f12569c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f12570d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f12571e, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f12572f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f12573g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
