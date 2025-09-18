package p000;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.swmansion.worklets.AndroidUIScheduler;
import java.lang.reflect.InvocationTargetException;

/* renamed from: H4 */
/* loaded from: classes2.dex */
public final class C0446H4 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f4038a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f4039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0446H4(AndroidUIScheduler androidUIScheduler, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.f4039b = androidUIScheduler;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f4038a) {
            case 0:
                ((AndroidUIScheduler) this.f4039b).f20265c.run();
                break;
            default:
                ((C11827yf1) this.f4039b).m26214c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0446H4(C11827yf1 c11827yf1, ReactContext reactContext) {
        super(reactContext);
        this.f4039b = c11827yf1;
    }
}
