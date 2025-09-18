package defpackage;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.swmansion.worklets.AndroidUIScheduler;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class H4 extends GuardedRunnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4(AndroidUIScheduler androidUIScheduler, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.b = androidUIScheduler;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                ((AndroidUIScheduler) this.b).c.run();
                break;
            default:
                ((C8216yf1) this.b).c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4(C8216yf1 c8216yf1, ReactContext reactContext) {
        super(reactContext);
        this.b = c8216yf1;
    }
}
