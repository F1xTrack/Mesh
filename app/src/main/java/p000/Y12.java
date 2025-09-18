package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class Y12 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Y12> CREATOR = new C8697aD1(17);

    /* renamed from: a */
    public int f14099a;

    /* renamed from: b */
    public String f14100b;

    /* renamed from: c */
    public String f14101c;

    /* renamed from: d */
    public int f14102d;

    /* renamed from: e */
    public Point[] f14103e;

    /* renamed from: f */
    public C9124dW1 f14104f;

    /* renamed from: g */
    public LZ1 f14105g;

    /* renamed from: h */
    public C9825j02 f14106h;

    /* renamed from: i */
    public C11108t12 f14107i;

    /* renamed from: j */
    public K02 f14108j;

    /* renamed from: k */
    public C9382fX1 f14109k;

    /* renamed from: l */
    public VR1 f14110l;

    /* renamed from: m */
    public C11038sT1 f14111m;

    /* renamed from: n */
    public NU1 f14112n;

    /* renamed from: o */
    public byte[] f14113o;

    /* renamed from: p */
    public boolean f14114p;

    /* renamed from: q */
    public double f14115q;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f14099a);
        SafeParcelWriter.writeString(parcel, 3, this.f14100b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f14101c, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f14102d);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f14103e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f14104f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f14105g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f14106h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f14107i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f14108j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f14109k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f14110l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f14111m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f14112n, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.f14113o, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.f14114p);
        SafeParcelWriter.writeDouble(parcel, 18, this.f14115q);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
