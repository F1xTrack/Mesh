package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: wo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11590wo0 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C11590wo0> CREATOR = new C7856Kl0(2);

    /* renamed from: a */
    public final String f45112a;

    /* renamed from: b */
    public final byte[] f45113b;

    /* renamed from: c */
    public final int f45114c;

    /* renamed from: d */
    public final int f45115d;

    public C11590wo0(String str, byte[] bArr, int i, int i2) {
        this.f45112a = str;
        this.f45113b = bArr;
        this.f45114c = i;
        this.f45115d = i2;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
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
    public final /* synthetic */ byte[] mo32e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11590wo0.class != obj.getClass()) {
            return false;
        }
        C11590wo0 c11590wo0 = (C11590wo0) obj;
        return this.f45112a.equals(c11590wo0.f45112a) && Arrays.equals(this.f45113b, c11590wo0.f45113b) && this.f45114c == c11590wo0.f45114c && this.f45115d == c11590wo0.f45115d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f45113b) + AbstractC1374Vq.m8586e(527, 31, this.f45112a)) * 31) + this.f45114c) * 31) + this.f45115d;
    }

    public final String toString() {
        String strM1830o;
        byte[] bArr = this.f45113b;
        int i = this.f45115d;
        if (i == 1) {
            strM1830o = AbstractC7485Dh1.m1830o(bArr);
        } else if (i == 23) {
            strM1830o = String.valueOf(Float.intBitsToFloat(AbstractC10983s22.m24582d(bArr)));
        } else if (i != 67) {
            int i2 = AbstractC7485Dh1.f2166a;
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i3 = 0; i3 < bArr.length; i3++) {
                sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i3] & 15, 16));
            }
            strM1830o = sb.toString();
        } else {
            strM1830o = String.valueOf(AbstractC10983s22.m24582d(bArr));
        }
        return AbstractC11153tN0.m24914z(new StringBuilder("mdta: key="), this.f45112a, ", value=", strM1830o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45112a);
        parcel.writeByteArray(this.f45113b);
        parcel.writeInt(this.f45114c);
        parcel.writeInt(this.f45115d);
    }

    public C11590wo0(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f45112a = string;
        this.f45113b = parcel.createByteArray();
        this.f45114c = parcel.readInt();
        this.f45115d = parcel.readInt();
    }
}
