package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class KB1 implements SB1, IInterface {
    public final IBinder a;

    public KB1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
