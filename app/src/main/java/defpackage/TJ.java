package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class TJ implements Executor {
    public static volatile TJ b;
    public static final TJ c = new TJ(1);
    public static final /* synthetic */ TJ d = new TJ(2);
    public static final /* synthetic */ TJ e = new TJ(3);
    public static final /* synthetic */ TJ f = new TJ(4);
    public final /* synthetic */ int a;

    public /* synthetic */ TJ(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 6:
                new Thread(runnable).start();
                break;
            case 7:
                AbstractC0121Bh1.f().post(runnable);
                break;
            case 8:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case 10:
                UiThreadUtil.runOnUiThread(runnable);
                break;
            case 11:
                O90.f(runnable, "command");
                if (!UiThreadUtil.isOnUiThread()) {
                    UiThreadUtil.runOnUiThread(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            case 12:
                runnable.run();
                break;
            case 13:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 14:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
