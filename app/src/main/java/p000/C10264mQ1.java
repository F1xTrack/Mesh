package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: mQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10264mQ1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C10264mQ1> CREATOR = new C8697aD1(18);

    /* renamed from: a */
    public int f37677a;

    /* renamed from: b */
    public int f37678b;

    /* renamed from: c */
    public int f37679c;

    /* renamed from: d */
    public int f37680d;

    /* renamed from: e */
    public int f37681e;

    /* renamed from: f */
    public int f37682f;

    /* renamed from: g */
    public boolean f37683g;

    /* renamed from: h */
    public String f37684h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f37677a);
        SafeParcelWriter.writeInt(parcel, 3, this.f37678b);
        SafeParcelWriter.writeInt(parcel, 4, this.f37679c);
        SafeParcelWriter.writeInt(parcel, 5, this.f37680d);
        SafeParcelWriter.writeInt(parcel, 6, this.f37681e);
        SafeParcelWriter.writeInt(parcel, 7, this.f37682f);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f37683g);
        SafeParcelWriter.writeString(parcel, 9, this.f37684h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
