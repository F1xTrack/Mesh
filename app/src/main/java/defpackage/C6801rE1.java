package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6801rE1 implements Parcelable {
    public static final Parcelable.Creator<C6801rE1> CREATOR = new C0094Ay1(9);
    public final Messenger a;

    public C6801rE1(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C6801rE1) obj).a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
