package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: iF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC4308iF extends Handler {
    public boolean a;
    public final /* synthetic */ C5466kF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4308iF(C5466kF c5466kF, Looper looper) {
        super(looper);
        this.b = c5466kF;
    }

    public final boolean a(Message message, C4035gp0 c4035gp0) {
        long jMin;
        C5275jF c5275jF = (C5275jF) message.obj;
        if (!c5275jF.b) {
            return false;
        }
        int i = c5275jF.d + 1;
        c5275jF.d = i;
        if (i > this.b.i.d(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable c6353ou = c4035gp0.getCause() instanceof IOException ? (IOException) c4035gp0.getCause() : new C6353ou(c4035gp0.getCause());
        C3547eG c3547eG = this.b.i;
        int i2 = c5275jF.d;
        c3547eG.getClass();
        if ((c6353ou instanceof C5643lA0) || (c6353ou instanceof FileNotFoundException) || (c6353ou instanceof C6580q40) || (c6353ou instanceof C6324ok0)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = C2091aD.b;
        while (c6353ou != null) {
            if ((c6353ou instanceof C2091aD) && ((C2091aD) c6353ou).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            c6353ou = c6353ou.getCause();
        }
        jMin = Math.min((i2 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.a) {
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
        Throwable thA;
        C5275jF c5275jF = (C5275jF) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                thA = this.b.k.A((GQ) c5275jF.c);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                C5466kF c5466kF = this.b;
                thA = c5466kF.k.w(c5466kF.l, (EQ) c5275jF.c);
            }
        } catch (C4035gp0 e) {
            boolean zA = a(message, e);
            thA = e;
            if (zA) {
                return;
            }
        } catch (Exception e2) {
            AbstractC6789rA1.i("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            thA = e2;
        }
        C3547eG c3547eG = this.b.i;
        long j = c5275jF.a;
        c3547eG.getClass();
        synchronized (this) {
            try {
                if (!this.a) {
                    this.b.n.obtainMessage(message.what, Pair.create(c5275jF.c, thA)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
