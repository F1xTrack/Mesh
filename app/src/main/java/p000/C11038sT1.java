package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: sT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11038sT1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11038sT1> CREATOR = new C8697aD1(21);

    /* renamed from: a */
    public AY1 f42447a;

    /* renamed from: b */
    public String f42448b;

    /* renamed from: c */
    public String f42449c;

    /* renamed from: d */
    public LZ1[] f42450d;

    /* renamed from: e */
    public C9124dW1[] f42451e;

    /* renamed from: f */
    public String[] f42452f;

    /* renamed from: g */
    public PO1[] f42453g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f42447a, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42448b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42449c, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f42450d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f42451e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 7, this.f42452f, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f42453g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
