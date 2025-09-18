package p000;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;

/* renamed from: TJ */
/* loaded from: classes.dex */
public final class ExecutorC1215TJ implements Executor {

    /* renamed from: b */
    public static volatile ExecutorC1215TJ f11316b;

    /* renamed from: c */
    public static final ExecutorC1215TJ f11317c = new ExecutorC1215TJ(1);

    /* renamed from: d */
    public static final /* synthetic */ ExecutorC1215TJ f11318d = new ExecutorC1215TJ(2);

    /* renamed from: e */
    public static final /* synthetic */ ExecutorC1215TJ f11319e = new ExecutorC1215TJ(3);

    /* renamed from: f */
    public static final /* synthetic */ ExecutorC1215TJ f11320f = new ExecutorC1215TJ(4);

    /* renamed from: a */
    public final /* synthetic */ int f11321a;

    public /* synthetic */ ExecutorC1215TJ(int i) {
        this.f11321a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11321a) {
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
                AbstractC7381Bh1.m807f().post(runnable);
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
                O90.m5968f(runnable, "command");
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
