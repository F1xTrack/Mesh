package p000;

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
public final class HandlerC8740aZ0 extends Handler {

    /* renamed from: a */
    public boolean f15564a;

    /* renamed from: b */
    public long f15565b;

    /* renamed from: c */
    public final ArrayList f15566c;

    public HandlerC8740aZ0(Looper looper) {
        super(looper);
        this.f15566c = new ArrayList();
    }

    /* renamed from: a */
    public final void m9762a(Messenger messenger) throws RemoteException {
        if (this.f15564a) {
            Object objM5380b = C0786MU.m5375d().m5380b(VY0.class);
            O90.m5967e(objM5380b, "Firebase.app[SessionGenerator::class.java]");
            NY0 ny0 = ((VY0) objM5380b).f12618e;
            if (ny0 != null) {
                m9764c(messenger, ny0.f7867a);
                return;
            } else {
                O90.m5977o("currentSession");
                throw null;
            }
        }
        Object objM5380b2 = C0786MU.m5375d().m5380b(FY0.class);
        O90.m5967e(objM5380b2, "Firebase.app[SessionDatastore::class.java]");
        C0032AV c0032av = (C0032AV) ((MY0) ((FY0) objM5380b2)).f7222c.get();
        String str = c0032av != null ? c0032av.f211a : null;
        if (str != null) {
            m9764c(messenger, str);
        }
    }

    /* renamed from: b */
    public final void m9763b() throws RemoteException {
        Object objM5380b = C0786MU.m5375d().m5380b(VY0.class);
        O90.m5967e(objM5380b, "Firebase.app[SessionGenerator::class.java]");
        VY0 vy0 = (VY0) objM5380b;
        int i = vy0.f12617d + 1;
        vy0.f12617d = i;
        String strM8506a = i == 0 ? vy0.f12616c : vy0.m8506a();
        int i2 = vy0.f12617d;
        vy0.f12614a.getClass();
        vy0.f12618e = new NY0(strM8506a, vy0.f12616c, i2, 1000 * System.currentTimeMillis());
        Object objM5380b2 = C0786MU.m5375d().m5380b(QY0.class);
        O90.m5967e(objM5380b2, "Firebase.app[SessionFirelogPublisher::class.java]");
        QY0 qy0 = (QY0) objM5380b2;
        Object objM5380b3 = C0786MU.m5375d().m5380b(VY0.class);
        O90.m5967e(objM5380b3, "Firebase.app[SessionGenerator::class.java]");
        NY0 ny0 = ((VY0) objM5380b3).f12618e;
        if (ny0 == null) {
            O90.m5977o("currentSession");
            throw null;
        }
        TY0 ty0 = (TY0) qy0;
        AbstractC9366fP1.m18230b(AbstractC11432vY1.m25444a(ty0.f11424e), null, new RY0(ty0, ny0, null), 3);
        Iterator it = new ArrayList(this.f15566c).iterator();
        while (it.hasNext()) {
            Messenger messenger = (Messenger) it.next();
            O90.m5967e(messenger, "it");
            m9762a(messenger);
        }
        Object objM5380b4 = C0786MU.m5375d().m5380b(FY0.class);
        O90.m5967e(objM5380b4, "Firebase.app[SessionDatastore::class.java]");
        FY0 fy0 = (FY0) objM5380b4;
        Object objM5380b5 = C0786MU.m5375d().m5380b(VY0.class);
        O90.m5967e(objM5380b5, "Firebase.app[SessionGenerator::class.java]");
        NY0 ny02 = ((VY0) objM5380b5).f12618e;
        if (ny02 == null) {
            O90.m5977o("currentSession");
            throw null;
        }
        MY0 my0 = (MY0) fy0;
        String str = ny02.f7867a;
        O90.m5968f(str, "sessionId");
        AbstractC9366fP1.m18230b(AbstractC11432vY1.m25444a(my0.f7221b), null, new LY0(my0, str, null), 3);
    }

    /* renamed from: c */
    public final void m9764c(Messenger messenger, String str) throws RemoteException {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Objects.toString(messenger);
            this.f15566c.remove(messenger);
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
        throw new UnsupportedOperationException("Method not decompiled: p000.HandlerC8740aZ0.handleMessage(android.os.Message):void");
    }
}
