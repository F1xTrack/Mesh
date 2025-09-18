package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LP implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<LP> CREATOR;
    public static final C6666qX g;
    public static final C6666qX h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("application/id3");
        g = new C6666qX(c6475pX);
        C6475pX c6475pX2 = new C6475pX();
        c6475pX2.l = AbstractC1865Xr0.n("application/x-scte35");
        h = new C6666qX(c6475pX2);
        CREATOR = new H2(18);
    }

    public LP(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final C6666qX A() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ void d0(C7293tp0 c7293tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final byte[] e0() {
        if (A() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LP.class != obj.getClass()) {
            return false;
        }
        LP lp = (LP) obj;
        return this.c == lp.c && this.d == lp.d && AbstractC0277Dh1.a(this.a, lp.a) && AbstractC0277Dh1.a(this.b, lp.b) && Arrays.equals(this.e, lp.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    public LP(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.createByteArray();
    }
}
