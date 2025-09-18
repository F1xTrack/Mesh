package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.List;

/* renamed from: uE1 */
/* loaded from: classes.dex */
public final class C7374uE1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7374uE1> CREATOR = new C2093aD1(6);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final C7374uE1 g;
    public final GF1 h;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7374uE1(int i, int i2, String str, String str2, String str3, int i3, List list, C7374uE1 c7374uE1) {
        JF1 jf1;
        JF1 jf12;
        GF1 gf1;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i3;
        C7758wF1 c7758wF1 = GF1.b;
        if (list instanceof AbstractC7186tF1) {
            gf1 = (GF1) ((AbstractC7186tF1) list);
            gf1.getClass();
            if (gf1.i()) {
                Object[] array = gf1.toArray(AbstractC7186tF1.a);
                int length = array.length;
                if (length == 0) {
                    jf12 = JF1.e;
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
                    throw new NullPointerException(AbstractC7209tN0.u(i4, "at index "));
                }
            }
            if (length2 == 0) {
                jf12 = JF1.e;
                gf1 = jf12;
            } else {
                jf1 = new JF1(length2, array2);
                gf1 = jf1;
            }
        }
        this.h = gf1;
        this.g = c7374uE1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7374uE1) {
            C7374uE1 c7374uE1 = (C7374uE1) obj;
            if (this.a == c7374uE1.a && this.b == c7374uE1.b && this.e == c7374uE1.e && this.c.equals(c7374uE1.c) && AbstractC3888g22.b(this.d, c7374uE1.d) && AbstractC3888g22.b(this.f, c7374uE1.f) && AbstractC3888g22.b(this.g, c7374uE1.g) && this.h.equals(c7374uE1.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.a);
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
        String str3 = this.f;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.writeTypedList(parcel, 8, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
