package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* renamed from: rw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6932rw0 {
    public final String a;
    public final int b;
    public final Notification c;

    public C6932rw0(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(InterfaceC2449c50 interfaceC2449c50) {
        String str = this.a;
        int i = this.b;
        C2068a50 c2068a50 = (C2068a50) interfaceC2449c50;
        c2068a50.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC2449c50.e);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            Notification notification = this.c;
            parcelObtain.writeInt(1);
            notification.writeToParcel(parcelObtain, 0);
            c2068a50.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return AbstractC1705Vq.j(sb, this.b, ", tag:null]");
    }
}
