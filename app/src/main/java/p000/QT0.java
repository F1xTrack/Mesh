package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class QT0 {

    /* renamed from: h */
    public static int f9633h;

    /* renamed from: i */
    public static PendingIntent f9634i;

    /* renamed from: j */
    public static final Pattern f9635j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    public final L01 f9636a = new L01();

    /* renamed from: b */
    public final Context f9637b;

    /* renamed from: c */
    public final C9817ix0 f9638c;

    /* renamed from: d */
    public final ScheduledThreadPoolExecutor f9639d;

    /* renamed from: e */
    public final Messenger f9640e;

    /* renamed from: f */
    public Messenger f9641f;

    /* renamed from: g */
    public C10880rE1 f9642g;

    public QT0(Context context) {
        this.f9637b = context;
        C9817ix0 c9817ix0 = new C9817ix0();
        c9817ix0.f34815b = 0;
        c9817ix0.f34816c = context;
        this.f9638c = c9817ix0;
        this.f9640e = new Messenger(new HandlerC10844qy1(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f9639d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static synchronized String m6719b() {
        int i;
        i = f9633h;
        f9633h = i + 1;
        return Integer.toString(i);
    }

    /* renamed from: c */
    public static synchronized void m6720c(Context context, Intent intent) {
        try {
            if (f9634i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f9634i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC8297Sx1.f11082a);
            }
            intent.putExtra("app", f9634i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final C9450g32 m6721a(Bundle bundle) {
        String strM6719b = m6719b();
        S81 s81 = new S81();
        synchronized (this.f9636a) {
            this.f9636a.put(strM6719b, s81);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f9638c.m21949g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m6720c(this.f9637b, intent);
        intent.putExtra("kid", "|ID|" + strM6719b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f9640e);
        if (this.f9641f != null || this.f9642g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f9641f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f9642g.f41395a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
            }
        } else if (this.f9638c.m21949g() == 2) {
            this.f9637b.sendBroadcast(intent);
        } else {
            this.f9637b.startService(intent);
        }
        s81.f10598a.m18386m(ExecutorC1215TJ.f11320f, new C8907bs1(this, strM6719b, this.f9639d.schedule(new RunnableC10431nk0(16, s81), 30L, TimeUnit.SECONDS)));
        return s81.f10598a;
    }

    /* renamed from: d */
    public final void m6722d(Bundle bundle, String str) {
        synchronized (this.f9636a) {
            try {
                S81 s81 = (S81) this.f9636a.remove(str);
                if (s81 == null) {
                    return;
                }
                s81.m7184b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
