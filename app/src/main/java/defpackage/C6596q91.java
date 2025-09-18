package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: q91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6596q91 extends V50 {
    public static final Parcelable.Creator<C6596q91> CREATOR = new C6767r31(6);
    public final String b;
    public final String c;
    public final P70 d;

    public C6596q91(String str, String str2, C3769fQ0 c3769fQ0) {
        super(str);
        YN1.c(!c3769fQ0.isEmpty());
        this.b = str2;
        P70 p70U = P70.u(c3769fQ0);
        this.d = p70U;
        this.c = (String) p70U.get(0);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    @Override // defpackage.V50, defpackage.InterfaceC0384Er0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(defpackage.C7293tp0 r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6596q91.d0(tp0):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6596q91.class != obj.getClass()) {
            return false;
        }
        C6596q91 c6596q91 = (C6596q91) obj;
        return AbstractC0277Dh1.a(this.a, c6596q91.a) && AbstractC0277Dh1.a(this.b, c6596q91.b) && this.d.equals(c6596q91.d);
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e(527, 31, this.a);
        String str = this.b;
        return this.d.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.V50
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringArray((String[]) this.d.toArray(new String[0]));
    }
}
