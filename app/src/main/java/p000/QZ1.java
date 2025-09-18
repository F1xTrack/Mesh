package p000;

import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public abstract class QZ1 {
    /* renamed from: a */
    public static final ReactContext m6728a(FU0 fu0) {
        Context context = fu0.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    /* renamed from: b */
    public static boolean m6729b(ReactApplicationContext reactApplicationContext) {
        return new C10189lr0(new C4151h(reactApplicationContext, 1)).m22547D(15) == 0;
    }
}
