package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: es0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9295es0 extends V50 {
    public static final Parcelable.Creator<C9295es0> CREATOR = new C7856Kl0(9);

    /* renamed from: b */
    public final int f26920b;

    /* renamed from: c */
    public final int f26921c;

    /* renamed from: d */
    public final int f26922d;

    /* renamed from: e */
    public final int[] f26923e;

    /* renamed from: f */
    public final int[] f26924f;

    public C9295es0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f26920b = i;
        this.f26921c = i2;
        this.f26922d = i3;
        this.f26923e = iArr;
        this.f26924f = iArr2;
    }

    @Override // p000.V50, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9295es0.class != obj.getClass()) {
            return false;
        }
        C9295es0 c9295es0 = (C9295es0) obj;
        return this.f26920b == c9295es0.f26920b && this.f26921c == c9295es0.f26921c && this.f26922d == c9295es0.f26922d && Arrays.equals(this.f26923e, c9295es0.f26923e) && Arrays.equals(this.f26924f, c9295es0.f26924f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26924f) + ((Arrays.hashCode(this.f26923e) + ((((((527 + this.f26920b) * 31) + this.f26921c) * 31) + this.f26922d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26920b);
        parcel.writeInt(this.f26921c);
        parcel.writeInt(this.f26922d);
        parcel.writeIntArray(this.f26923e);
        parcel.writeIntArray(this.f26924f);
    }

    public C9295es0(Parcel parcel) {
        super("MLLT");
        this.f26920b = parcel.readInt();
        this.f26921c = parcel.readInt();
        this.f26922d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = AbstractC7485Dh1.f2166a;
        this.f26923e = iArrCreateIntArray;
        this.f26924f = parcel.createIntArray();
    }
}
