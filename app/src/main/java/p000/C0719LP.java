package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: LP */
/* loaded from: classes.dex */
public final class C0719LP implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C0719LP> CREATOR;

    /* renamed from: g */
    public static final C6686qX f6620g;

    /* renamed from: h */
    public static final C6686qX f6621h;

    /* renamed from: a */
    public final String f6622a;

    /* renamed from: b */
    public final String f6623b;

    /* renamed from: c */
    public final long f6624c;

    /* renamed from: d */
    public final long f6625d;

    /* renamed from: e */
    public final byte[] f6626e;

    /* renamed from: f */
    public int f6627f;

    static {
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("application/id3");
        f6620g = new C6686qX(c6623pX);
        C6623pX c6623pX2 = new C6623pX();
        c6623pX2.f40161l = AbstractC8544Xr0.m9171n("application/x-scte35");
        f6621h = new C6686qX(c6623pX2);
        CREATOR = new C0444H2(18);
    }

    public C0719LP(String str, String str2, long j, long j2, byte[] bArr) {
        this.f6622a = str;
        this.f6623b = str2;
        this.f6624c = j;
        this.f6625d = j2;
        this.f6626e = bArr;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final C6686qX mo30A() {
        String str = this.f6622a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f6621h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f6620g;
            default:
                return null;
        }
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final /* synthetic */ void mo31d0(C11209tp0 c11209tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: e0 */
    public final byte[] mo32e0() {
        if (mo30A() != null) {
            return this.f6626e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0719LP.class != obj.getClass()) {
            return false;
        }
        C0719LP c0719lp = (C0719LP) obj;
        return this.f6624c == c0719lp.f6624c && this.f6625d == c0719lp.f6625d && AbstractC7485Dh1.m1812a(this.f6622a, c0719lp.f6622a) && AbstractC7485Dh1.m1812a(this.f6623b, c0719lp.f6623b) && Arrays.equals(this.f6626e, c0719lp.f6626e);
    }

    public final int hashCode() {
        if (this.f6627f == 0) {
            String str = this.f6622a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f6623b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f6624c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f6625d;
            this.f6627f = Arrays.hashCode(this.f6626e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f6627f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f6622a + ", id=" + this.f6625d + ", durationMs=" + this.f6624c + ", value=" + this.f6623b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6622a);
        parcel.writeString(this.f6623b);
        parcel.writeLong(this.f6624c);
        parcel.writeLong(this.f6625d);
        parcel.writeByteArray(this.f6626e);
    }

    public C0719LP(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f6622a = string;
        this.f6623b = parcel.readString();
        this.f6624c = parcel.readLong();
        this.f6625d = parcel.readLong();
        this.f6626e = parcel.createByteArray();
    }
}
