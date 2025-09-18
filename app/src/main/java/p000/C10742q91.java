package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: q91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10742q91 extends V50 {
    public static final Parcelable.Creator<C10742q91> CREATOR = new C10857r31(6);

    /* renamed from: b */
    public final String f40635b;

    /* renamed from: c */
    public final String f40636c;

    /* renamed from: d */
    public final P70 f40637d;

    public C10742q91(String str, String str2, C9367fQ0 c9367fQ0) {
        super(str);
        YN1.m9278c(!c9367fQ0.isEmpty());
        this.f40635b = str2;
        P70 p70M6234u = P70.m6234u(c9367fQ0);
        this.f40637d = p70M6234u;
        this.f40636c = (String) p70M6234u.get(0);
    }

    /* renamed from: a */
    public static ArrayList m23936a(String str) {
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
    @Override // p000.V50, p000.InterfaceC7556Er0
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo31d0(p000.C11209tp0 r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10742q91.mo31d0(tp0):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10742q91.class != obj.getClass()) {
            return false;
        }
        C10742q91 c10742q91 = (C10742q91) obj;
        return AbstractC7485Dh1.m1812a(this.f12347a, c10742q91.f12347a) && AbstractC7485Dh1.m1812a(this.f40635b, c10742q91.f40635b) && this.f40637d.equals(c10742q91.f40637d);
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e(527, 31, this.f12347a);
        String str = this.f40635b;
        return this.f40637d.hashCode() + ((iM8586e + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p000.V50
    public final String toString() {
        return this.f12347a + ": description=" + this.f40635b + ": values=" + this.f40637d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12347a);
        parcel.writeString(this.f40635b);
        parcel.writeStringArray((String[]) this.f40637d.toArray(new String[0]));
    }
}
