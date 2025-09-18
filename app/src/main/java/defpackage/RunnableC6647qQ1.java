package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: qQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6647qQ1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FY1 b;

    public /* synthetic */ RunnableC6647qQ1(FY1 fy1, int i) {
        this.a = i;
        this.b = fy1;
    }

    private final void a() {
        FY1 fy1 = this.b;
        synchronized (fy1) {
            if (fy1.a == 1) {
                fy1.a(1, "Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.b.a(2, "Service disconnected");
                return;
        }
        while (true) {
            FY1 fy1 = this.b;
            synchronized (fy1) {
                try {
                    if (fy1.a != 2) {
                        return;
                    }
                    if (fy1.d.isEmpty()) {
                        fy1.c();
                        return;
                    }
                    C5802m02 c5802m02 = (C5802m02) fy1.d.poll();
                    fy1.e.put(c5802m02.a, c5802m02);
                    ((ScheduledExecutorService) fy1.f.c).schedule(new RunnableC7990xT1(fy1, c5802m02, false, 4), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(c5802m02));
                    }
                    C22 c22 = fy1.f;
                    Messenger messenger = fy1.b;
                    int i = c5802m02.c;
                    Context context = (Context) c22.b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = c5802m02.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c5802m02.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", c5802m02.d);
                    messageObtain.setData(bundle);
                    try {
                        C1296Qj1 c1296Qj1 = fy1.c;
                        Messenger messenger2 = (Messenger) c1296Qj1.a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            C6801rE1 c6801rE1 = (C6801rE1) c1296Qj1.b;
                            if (c6801rE1 == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c6801rE1.a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        fy1.a(2, e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
