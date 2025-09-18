package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: l21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10086l21 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C10086l21> CREATOR = new C7856Kl0(26);

    /* renamed from: a */
    public final ArrayList f36842a;

    public C10086l21(ArrayList arrayList) {
        this.f36842a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C9958k21) arrayList.get(0)).f36232b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C9958k21) arrayList.get(i)).f36231a < j) {
                    z = true;
                    break;
                } else {
                    j = ((C9958k21) arrayList.get(i)).f36232b;
                    i++;
                }
            }
        }
        YN1.m9278c(!z);
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
        if (obj == null || C10086l21.class != obj.getClass()) {
            return false;
        }
        return this.f36842a.equals(((C10086l21) obj).f36842a);
    }

    public final int hashCode() {
        return this.f36842a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f36842a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f36842a);
    }
}
