package p000;

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
public final /* synthetic */ class RunnableC10776qQ1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f40866a;

    /* renamed from: b */
    public final /* synthetic */ FY1 f40867b;

    public /* synthetic */ RunnableC10776qQ1(FY1 fy1, int i) {
        this.f40866a = i;
        this.f40867b = fy1;
    }

    /* renamed from: a */
    private final void m23997a() {
        FY1 fy1 = this.f40867b;
        synchronized (fy1) {
            if (fy1.f3302a == 1) {
                fy1.m2668a(1, "Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.f40866a) {
            case 0:
                break;
            case 1:
                m23997a();
                return;
            default:
                this.f40867b.m2668a(2, "Service disconnected");
                return;
        }
        while (true) {
            FY1 fy1 = this.f40867b;
            synchronized (fy1) {
                try {
                    if (fy1.f3302a != 2) {
                        return;
                    }
                    if (fy1.f3305d.isEmpty()) {
                        fy1.m2670c();
                        return;
                    }
                    C10209m02 c10209m02 = (C10209m02) fy1.f3305d.poll();
                    fy1.f3306e.put(c10209m02.f37388a, c10209m02);
                    ((ScheduledExecutorService) fy1.f3307f.f1151c).schedule(new RunnableC11676xT1(fy1, c10209m02, false, 4), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(c10209m02));
                    }
                    C22 c22 = fy1.f3307f;
                    Messenger messenger = fy1.f3303b;
                    int i = c10209m02.f37390c;
                    Context context = (Context) c22.f1150b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = c10209m02.f37388a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c10209m02.m22625a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", c10209m02.f37391d);
                    messageObtain.setData(bundle);
                    try {
                        C8165Qj1 c8165Qj1 = fy1.f3304c;
                        Messenger messenger2 = (Messenger) c8165Qj1.f9756a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            C10880rE1 c10880rE1 = (C10880rE1) c8165Qj1.f9757b;
                            if (c10880rE1 == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c10880rE1.f41395a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        fy1.m2668a(2, e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
