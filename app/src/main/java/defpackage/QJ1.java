package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class QJ1 implements IInterface {
    public final IBinder a;

    public QJ1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
