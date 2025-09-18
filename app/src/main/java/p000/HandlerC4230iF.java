package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: iF */
/* loaded from: classes.dex */
public final class HandlerC4230iF extends Handler {

    /* renamed from: a */
    public boolean f28977a;

    /* renamed from: b */
    public final /* synthetic */ C6288kF f28978b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4230iF(C6288kF c6288kF, Looper looper) {
        super(looper);
        this.f28978b = c6288kF;
    }

    /* renamed from: a */
    public final boolean m18988a(Message message, C9545gp0 c9545gp0) {
        long jMin;
        C6225jF c6225jF = (C6225jF) message.obj;
        if (!c6225jF.f35005b) {
            return false;
        }
        int i = c6225jF.f35007d + 1;
        c6225jF.f35007d = i;
        if (i > this.f28978b.f36378i.mo17891d(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable c6583ou = c9545gp0.getCause() instanceof IOException ? (IOException) c9545gp0.getCause() : new C6583ou(c9545gp0.getCause());
        C3979eG c3979eG = this.f28978b.f36378i;
        int i2 = c6225jF.f35007d;
        c3979eG.getClass();
        if ((c6583ou instanceof C10103lA0) || (c6583ou instanceof FileNotFoundException) || (c6583ou instanceof C10731q40) || (c6583ou instanceof C10559ok0)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = C1650aD.f15394b;
        while (c6583ou != null) {
            if ((c6583ou instanceof C1650aD) && ((C1650aD) c6583ou).f15395a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            c6583ou = c6583ou.getCause();
        }
        jMin = Math.min((i2 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f28977a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jMin);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable thM9119A;
        C6225jF c6225jF = (C6225jF) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                thM9119A = this.f28978b.f36380k.m9119A((C0405GQ) c6225jF.f35006c);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                C6288kF c6288kF = this.f28978b;
                thM9119A = c6288kF.f36380k.m9153w(c6288kF.f36381l, (C0279EQ) c6225jF.f35006c);
            }
        } catch (C9545gp0 e) {
            boolean zM18988a = m18988a(message, e);
            thM9119A = e;
            if (zM18988a) {
                return;
            }
        } catch (Exception e2) {
            AbstractC10872rA1.m24176i("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            thM9119A = e2;
        }
        C3979eG c3979eG = this.f28978b.f36378i;
        long j = c6225jF.f35004a;
        c3979eG.getClass();
        synchronized (this) {
            try {
                if (!this.f28977a) {
                    this.f28978b.f36383n.obtainMessage(message.what, Pair.create(c6225jF.f35006c, thM9119A)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
