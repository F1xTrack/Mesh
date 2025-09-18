package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public abstract class QZ1 {
    public static final ReactContext a(FU0 fu0) {
        Context context = fu0.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    public static boolean b(ReactApplicationContext reactApplicationContext) {
        return new C5772lr0(new C4067h(reactApplicationContext, 1)).D(15) == 0;
    }
}
