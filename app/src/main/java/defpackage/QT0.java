package defpackage;

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
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final L01 a = new L01();
    public final Context b;
    public final C5217ix0 c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public C6801rE1 g;

    public QT0(Context context) {
        this.b = context;
        C5217ix0 c5217ix0 = new C5217ix0();
        c5217ix0.b = 0;
        c5217ix0.c = context;
        this.c = c5217ix0;
        this.e = new Messenger(new HandlerC6749qy1(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i2;
        i2 = h;
        h = i2 + 1;
        return Integer.toString(i2);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC1494Sx1.a);
            }
            intent.putExtra("app", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C3892g32 a(Bundle bundle) {
        String strB = b();
        S81 s81 = new S81();
        synchronized (this.a) {
            this.a.put(strB, s81);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.b, intent);
        intent.putExtra("kid", "|ID|" + strB + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.g.a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
            }
        } else if (this.c.g() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        s81.a.m(TJ.f, new C2407bs1(this, strB, this.d.schedule(new RunnableC6133nk0(16, s81), 30L, TimeUnit.SECONDS)));
        return s81.a;
    }

    public final void d(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                S81 s81 = (S81) this.a.remove(str);
                if (s81 == null) {
                    return;
                }
                s81.b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
