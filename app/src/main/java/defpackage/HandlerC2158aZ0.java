package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: aZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC2158aZ0 extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    public HandlerC2158aZ0(Looper looper) {
        super(looper);
        this.c = new ArrayList();
    }

    public final void a(Messenger messenger) throws RemoteException {
        if (this.a) {
            Object objB = MU.d().b(VY0.class);
            O90.e(objB, "Firebase.app[SessionGenerator::class.java]");
            NY0 ny0 = ((VY0) objB).e;
            if (ny0 != null) {
                c(messenger, ny0.a);
                return;
            } else {
                O90.o("currentSession");
                throw null;
            }
        }
        Object objB2 = MU.d().b(FY0.class);
        O90.e(objB2, "Firebase.app[SessionDatastore::class.java]");
        AV av = (AV) ((MY0) ((FY0) objB2)).c.get();
        String str = av != null ? av.a : null;
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() throws RemoteException {
        Object objB = MU.d().b(VY0.class);
        O90.e(objB, "Firebase.app[SessionGenerator::class.java]");
        VY0 vy0 = (VY0) objB;
        int i = vy0.d + 1;
        vy0.d = i;
        String strA = i == 0 ? vy0.c : vy0.a();
        int i2 = vy0.d;
        vy0.a.getClass();
        vy0.e = new NY0(strA, vy0.c, i2, 1000 * System.currentTimeMillis());
        Object objB2 = MU.d().b(QY0.class);
        O90.e(objB2, "Firebase.app[SessionFirelogPublisher::class.java]");
        QY0 qy0 = (QY0) objB2;
        Object objB3 = MU.d().b(VY0.class);
        O90.e(objB3, "Firebase.app[SessionGenerator::class.java]");
        NY0 ny0 = ((VY0) objB3).e;
        if (ny0 == null) {
            O90.o("currentSession");
            throw null;
        }
        TY0 ty0 = (TY0) qy0;
        AbstractC3767fP1.b(AbstractC7625vY1.a(ty0.e), null, new RY0(ty0, ny0, null), 3);
        Iterator it = new ArrayList(this.c).iterator();
        while (it.hasNext()) {
            Messenger messenger = (Messenger) it.next();
            O90.e(messenger, "it");
            a(messenger);
        }
        Object objB4 = MU.d().b(FY0.class);
        O90.e(objB4, "Firebase.app[SessionDatastore::class.java]");
        FY0 fy0 = (FY0) objB4;
        Object objB5 = MU.d().b(VY0.class);
        O90.e(objB5, "Firebase.app[SessionGenerator::class.java]");
        NY0 ny02 = ((VY0) objB5).e;
        if (ny02 == null) {
            O90.o("currentSession");
            throw null;
        }
        MY0 my0 = (MY0) fy0;
        String str = ny02.a;
        O90.f(str, "sessionId");
        AbstractC3767fP1.b(AbstractC7625vY1.a(my0.b), null, new LY0(my0, str, null), 3);
    }

    public final void c(Messenger messenger, String str) throws RemoteException {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Objects.toString(messenger);
            this.c.remove(messenger);
        } catch (Exception unused2) {
            Objects.toString(messenger);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r10) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HandlerC2158aZ0.handleMessage(android.os.Message):void");
    }
}
