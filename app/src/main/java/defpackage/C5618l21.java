package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: l21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5618l21 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<C5618l21> CREATOR = new C0834Kl0(26);
    public final ArrayList a;

    public C5618l21(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C5427k21) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C5427k21) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((C5427k21) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        YN1.c(!z);
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ void d0(C7293tp0 c7293tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ byte[] e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5618l21.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C5618l21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
