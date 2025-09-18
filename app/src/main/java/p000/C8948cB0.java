package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: cB0 */
/* loaded from: classes.dex */
public final class C8948cB0 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C8948cB0> CREATOR = new C7856Kl0(18);

    /* renamed from: a */
    public final int f17349a;

    /* renamed from: b */
    public final String f17350b;

    /* renamed from: c */
    public final String f17351c;

    /* renamed from: d */
    public final int f17352d;

    /* renamed from: e */
    public final int f17353e;

    /* renamed from: f */
    public final int f17354f;

    /* renamed from: g */
    public final int f17355g;

    /* renamed from: h */
    public final byte[] f17356h;

    public C8948cB0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f17349a = i;
        this.f17350b = str;
        this.f17351c = str2;
        this.f17352d = i2;
        this.f17353e = i3;
        this.f17354f = i4;
        this.f17355g = i5;
        this.f17356h = bArr;
    }

    /* renamed from: a */
    public static C8948cB0 m10617a(C9591hA0 c9591hA0) {
        int iM18749g = c9591hA0.m18749g();
        String strM9171n = AbstractC8544Xr0.m9171n(c9591hA0.m18761s(c9591hA0.m18749g(), AbstractC7227yr.f46509a));
        String strM18761s = c9591hA0.m18761s(c9591hA0.m18749g(), AbstractC7227yr.f46511c);
        int iM18749g2 = c9591hA0.m18749g();
        int iM18749g3 = c9591hA0.m18749g();
        int iM18749g4 = c9591hA0.m18749g();
        int iM18749g5 = c9591hA0.m18749g();
        int iM18749g6 = c9591hA0.m18749g();
        byte[] bArr = new byte[iM18749g6];
        c9591hA0.m18747e(bArr, 0, iM18749g6);
        return new C8948cB0(iM18749g, strM9171n, strM18761s, iM18749g2, iM18749g3, iM18749g4, iM18749g5, bArr);
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final void mo31d0(C11209tp0 c11209tp0) {
        c11209tp0.m24990a(this.f17349a, this.f17356h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: e0 */
    public final /* synthetic */ byte[] mo32e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8948cB0.class != obj.getClass()) {
            return false;
        }
        C8948cB0 c8948cB0 = (C8948cB0) obj;
        return this.f17349a == c8948cB0.f17349a && this.f17350b.equals(c8948cB0.f17350b) && this.f17351c.equals(c8948cB0.f17351c) && this.f17352d == c8948cB0.f17352d && this.f17353e == c8948cB0.f17353e && this.f17354f == c8948cB0.f17354f && this.f17355g == c8948cB0.f17355g && Arrays.equals(this.f17356h, c8948cB0.f17356h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17356h) + ((((((((AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e((527 + this.f17349a) * 31, 31, this.f17350b), 31, this.f17351c) + this.f17352d) * 31) + this.f17353e) * 31) + this.f17354f) * 31) + this.f17355g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f17350b + ", description=" + this.f17351c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17349a);
        parcel.writeString(this.f17350b);
        parcel.writeString(this.f17351c);
        parcel.writeInt(this.f17352d);
        parcel.writeInt(this.f17353e);
        parcel.writeInt(this.f17354f);
        parcel.writeInt(this.f17355g);
        parcel.writeByteArray(this.f17356h);
    }

    public C8948cB0(Parcel parcel) {
        this.f17349a = parcel.readInt();
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f17350b = string;
        this.f17351c = parcel.readString();
        this.f17352d = parcel.readInt();
        this.f17353e = parcel.readInt();
        this.f17354f = parcel.readInt();
        this.f17355g = parcel.readInt();
        this.f17356h = parcel.createByteArray();
    }
}
