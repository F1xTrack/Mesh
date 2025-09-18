package defpackage;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes.dex */
public abstract class Q20 extends Service implements O20 {
    private static PowerManager.WakeLock sWakeLock;
    private final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();

    @SuppressLint({"WakelockTimeout"})
    public static void acquireWakeLockNow(Context context) {
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            UN1.c(powerManager);
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, Q20.class.getCanonicalName());
            sWakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            sWakeLock.acquire();
        }
    }

    public PL0 getReactNativeHost() {
        return ((MainApplication) ((IJ0) getApplication())).a;
    }

    public abstract M20 getTaskConfig(Intent intent);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ReactContext reactContextF;
        super.onDestroy();
        if (getReactNativeHost().e() && (reactContextF = getReactNativeHost().a().f()) != null) {
            N20.c(reactContextF).b.remove(this);
        }
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // defpackage.O20
    public void onHeadlessJsTaskFinish(int i) {
        this.mActiveTasks.remove(Integer.valueOf(i));
        if (this.mActiveTasks.size() == 0) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        M20 taskConfig = getTaskConfig(intent);
        if (taskConfig == null) {
            return 2;
        }
        startTask(taskConfig);
        return 3;
    }

    public void startTask(M20 m20) {
        UiThreadUtil.assertOnUiThread();
        acquireWakeLockNow(this);
        QK0 qk0A = getReactNativeHost().a();
        ReactContext reactContextF = qk0A.f();
        if (reactContextF == null) {
            qk0A.a(new P20(this, m20, qk0A));
            qk0A.d();
        } else {
            N20 n20C = N20.c(reactContextF);
            n20C.a(this);
            UiThreadUtil.runOnUiThread(new RunnableC1492Sx(this, n20C, m20, 3, false));
        }
    }

    @Override // defpackage.O20
    public void onHeadlessJsTaskStart(int i) {
    }
}
