package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: es0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3662es0 extends V50 {
    public static final Parcelable.Creator<C3662es0> CREATOR = new C0834Kl0(9);
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public C3662es0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    @Override // defpackage.V50, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3662es0.class != obj.getClass()) {
            return false;
        }
        C3662es0 c3662es0 = (C3662es0) obj;
        return this.b == c3662es0.b && this.c == c3662es0.c && this.d == c3662es0.d && Arrays.equals(this.e, c3662es0.e) && Arrays.equals(this.f, c3662es0.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
    }

    public C3662es0(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = AbstractC0277Dh1.a;
        this.e = iArrCreateIntArray;
        this.f = parcel.createIntArray();
    }
}
