package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.List;

/* renamed from: uE1 */
/* loaded from: classes.dex */
public final class C11264uE1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11264uE1> CREATOR = new C8697aD1(6);

    /* renamed from: a */
    public final int f43607a;

    /* renamed from: b */
    public final int f43608b;

    /* renamed from: c */
    public final String f43609c;

    /* renamed from: d */
    public final String f43610d;

    /* renamed from: e */
    public final int f43611e;

    /* renamed from: f */
    public final String f43612f;

    /* renamed from: g */
    public final C11264uE1 f43613g;

    /* renamed from: h */
    public final GF1 f43614h;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11264uE1(int i, int i2, String str, String str2, String str3, int i3, List list, C11264uE1 c11264uE1) {
        JF1 jf1;
        JF1 jf12;
        GF1 gf1;
        this.f43607a = i;
        this.f43608b = i2;
        this.f43609c = str;
        this.f43610d = str2;
        this.f43612f = str3;
        this.f43611e = i3;
        C11521wF1 c11521wF1 = GF1.f3656b;
        if (list instanceof AbstractC11138tF1) {
            gf1 = (GF1) ((AbstractC11138tF1) list);
            gf1.getClass();
            if (gf1.mo573i()) {
                Object[] array = gf1.toArray(AbstractC11138tF1.f42972a);
                int length = array.length;
                if (length == 0) {
                    jf12 = JF1.f5427e;
                    gf1 = jf12;
                } else {
                    jf1 = new JF1(length, array);
                    gf1 = jf1;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i4 = 0; i4 < length2; i4++) {
                if (array2[i4] == null) {
                    throw new NullPointerException(AbstractC11153tN0.m24909u(i4, "at index "));
                }
            }
            if (length2 == 0) {
                jf12 = JF1.f5427e;
                gf1 = jf12;
            } else {
                jf1 = new JF1(length2, array2);
                gf1 = jf1;
            }
        }
        this.f43614h = gf1;
        this.f43613g = c11264uE1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11264uE1) {
            C11264uE1 c11264uE1 = (C11264uE1) obj;
            if (this.f43607a == c11264uE1.f43607a && this.f43608b == c11264uE1.f43608b && this.f43611e == c11264uE1.f43611e && this.f43609c.equals(c11264uE1.f43609c) && AbstractC9447g22.m18384b(this.f43610d, c11264uE1.f43610d) && AbstractC9447g22.m18384b(this.f43612f, c11264uE1.f43612f) && AbstractC9447g22.m18384b(this.f43613g, c11264uE1.f43613g) && this.f43614h.equals(c11264uE1.f43614h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43607a), this.f43609c, this.f43610d, this.f43612f});
    }

    public final String toString() {
        String str = this.f43609c;
        int length = str.length() + 18;
        String str2 = this.f43610d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f43607a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (str2.startsWith(str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f43612f;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f43607a);
        SafeParcelWriter.writeInt(parcel, 2, this.f43608b);
        SafeParcelWriter.writeString(parcel, 3, this.f43609c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f43610d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f43611e);
        SafeParcelWriter.writeString(parcel, 6, this.f43612f, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f43613g, i, false);
        SafeParcelWriter.writeTypedList(parcel, 8, this.f43614h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
