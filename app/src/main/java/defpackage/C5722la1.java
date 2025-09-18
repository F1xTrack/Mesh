package defpackage;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: la1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5722la1 implements Parcelable {
    public static final Parcelable.Creator<C5722la1> CREATOR = new C6767r31(7);
    public final C7672vo0 a;
    public final C7672vo0 b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public C5722la1(int i) {
        this(0, 0, 10, i);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.c == 1) {
            return this.d % 24;
        }
        int i = this.d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.g == 1 ? i - 12 : i;
    }

    public final void c(int i) {
        if (this.c == 1) {
            this.d = i;
        } else {
            this.d = (i % 12) + (this.g != 1 ? 0 : 12);
        }
    }

    public final void d(int i) {
        this.e = i % 60;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        if (i != this.g) {
            this.g = i;
            int i2 = this.d;
            if (i2 < 12 && i == 1) {
                this.d = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.d = i2 - 12;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5722la1)) {
            return false;
        }
        C5722la1 c5722la1 = (C5722la1) obj;
        return this.d == c5722la1.d && this.e == c5722la1.e && this.c == c5722la1.c && this.f == c5722la1.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.c);
    }

    public C5722la1(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.c = i4;
        this.g = i >= 12 ? 1 : 0;
        this.a = new C7672vo0(59);
        this.b = new C7672vo0(i4 == 1 ? 23 : 12);
    }
}
