package p000;

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
            UN1.m7999c(powerManager);
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, Q20.class.getCanonicalName());
            sWakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            sWakeLock.acquire();
        }
    }

    public PL0 getReactNativeHost() {
        return ((MainApplication) ((IJ0) getApplication())).f41951a;
    }

    public abstract M20 getTaskConfig(Intent intent);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ReactContext reactContextM6636f;
        super.onDestroy();
        if (getReactNativeHost().m6305e() && (reactContextM6636f = getReactNativeHost().m6302a().m6636f()) != null) {
            N20.m5523c(reactContextM6636f).f7470b.remove(this);
        }
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // p000.O20
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
        QK0 qk0M6302a = getReactNativeHost().m6302a();
        ReactContext reactContextM6636f = qk0M6302a.m6636f();
        if (reactContextM6636f == null) {
            qk0M6302a.m6632a(new P20(this, m20, qk0M6302a));
            qk0M6302a.m6635d();
        } else {
            N20 n20M5523c = N20.m5523c(reactContextM6636f);
            n20M5523c.m5524a(this);
            UiThreadUtil.runOnUiThread(new RunnableC1192Sx(this, n20M5523c, m20, 3, false));
        }
    }

    @Override // p000.O20
    public void onHeadlessJsTaskStart(int i) {
    }
}
