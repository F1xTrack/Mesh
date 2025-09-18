package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: xz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11740xz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11740xz1> CREATOR = new C7363Ay1(14);

    /* renamed from: a */
    public final int f45960a;

    /* renamed from: b */
    public final int f45961b;

    /* renamed from: c */
    public final int f45962c;

    /* renamed from: d */
    public final int f45963d;

    /* renamed from: e */
    public final int f45964e;

    /* renamed from: f */
    public final int f45965f;

    /* renamed from: g */
    public final boolean f45966g;

    /* renamed from: h */
    public final String f45967h;

    public C11740xz1(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f45960a = i;
        this.f45961b = i2;
        this.f45962c = i3;
        this.f45963d = i4;
        this.f45964e = i5;
        this.f45965f = i6;
        this.f45966g = z;
        this.f45967h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45960a);
        SafeParcelWriter.writeInt(parcel, 2, this.f45961b);
        SafeParcelWriter.writeInt(parcel, 3, this.f45962c);
        SafeParcelWriter.writeInt(parcel, 4, this.f45963d);
        SafeParcelWriter.writeInt(parcel, 5, this.f45964e);
        SafeParcelWriter.writeInt(parcel, 6, this.f45965f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f45966g);
        SafeParcelWriter.writeString(parcel, 8, this.f45967h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
