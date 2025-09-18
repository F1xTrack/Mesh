package p000;

import android.app.Notification;
import android.os.Parcel;

/* renamed from: rw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10967rw0 {

    /* renamed from: a */
    public final String f42164a;

    /* renamed from: b */
    public final int f42165b;

    /* renamed from: c */
    public final Notification f42166c;

    public C10967rw0(String str, int i, Notification notification) {
        this.f42164a = str;
        this.f42165b = i;
        this.f42166c = notification;
    }

    /* renamed from: a */
    public final void m24551a(InterfaceC8936c50 interfaceC8936c50) {
        String str = this.f42164a;
        int i = this.f42165b;
        C8680a50 c8680a50 = (C8680a50) interfaceC8936c50;
        c8680a50.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC8936c50.f17294e);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            Notification notification = this.f42166c;
            parcelObtain.writeInt(1);
            notification.writeToParcel(parcelObtain, 0);
            c8680a50.f15305a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f42164a);
        sb.append(", id:");
        return AbstractC1374Vq.m8591j(sb, this.f42165b, ", tag:null]");
    }
}
