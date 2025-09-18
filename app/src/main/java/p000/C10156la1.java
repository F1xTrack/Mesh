package p000;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: la1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10156la1 implements Parcelable {
    public static final Parcelable.Creator<C10156la1> CREATOR = new C10857r31(7);

    /* renamed from: a */
    public final C11463vo0 f37168a;

    /* renamed from: b */
    public final C11463vo0 f37169b;

    /* renamed from: c */
    public final int f37170c;

    /* renamed from: d */
    public int f37171d;

    /* renamed from: e */
    public int f37172e;

    /* renamed from: f */
    public int f37173f;

    /* renamed from: g */
    public int f37174g;

    public C10156la1(int i) {
        this(0, 0, 10, i);
    }

    /* renamed from: a */
    public static String m22510a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final int m22511b() {
        if (this.f37170c == 1) {
            return this.f37171d % 24;
        }
        int i = this.f37171d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f37174g == 1 ? i - 12 : i;
    }

    /* renamed from: c */
    public final void m22512c(int i) {
        if (this.f37170c == 1) {
            this.f37171d = i;
        } else {
            this.f37171d = (i % 12) + (this.f37174g != 1 ? 0 : 12);
        }
    }

    /* renamed from: d */
    public final void m22513d(int i) {
        this.f37172e = i % 60;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m22514e(int i) {
        if (i != this.f37174g) {
            this.f37174g = i;
            int i2 = this.f37171d;
            if (i2 < 12 && i == 1) {
                this.f37171d = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.f37171d = i2 - 12;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10156la1)) {
            return false;
        }
        C10156la1 c10156la1 = (C10156la1) obj;
        return this.f37171d == c10156la1.f37171d && this.f37172e == c10156la1.f37172e && this.f37170c == c10156la1.f37170c && this.f37173f == c10156la1.f37173f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37170c), Integer.valueOf(this.f37171d), Integer.valueOf(this.f37172e), Integer.valueOf(this.f37173f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37171d);
        parcel.writeInt(this.f37172e);
        parcel.writeInt(this.f37173f);
        parcel.writeInt(this.f37170c);
    }

    public C10156la1(int i, int i2, int i3, int i4) {
        this.f37171d = i;
        this.f37172e = i2;
        this.f37173f = i3;
        this.f37170c = i4;
        this.f37174g = i >= 12 ? 1 : 0;
        this.f37168a = new C11463vo0(59);
        this.f37169b = new C11463vo0(i4 == 1 ? 23 : 12);
    }
}
