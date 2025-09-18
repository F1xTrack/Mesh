package p000;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import java.util.HashSet;
import java.util.List;

/* renamed from: nR */
/* loaded from: classes2.dex */
public final class C6489nR implements D90 {

    /* renamed from: a */
    public final HashSet f38309a = new HashSet();

    /* renamed from: b */
    public C7818Js0 f38310b;

    @Override // p000.D90
    /* renamed from: a */
    public final List mo174a() {
        return AbstractC7230yu.m26274e(C6489nR.class);
    }

    @Override // p000.D90
    /* renamed from: b */
    public final void mo175b(C7818Js0 c7818Js0) {
        O90.m5968f(c7818Js0, "moduleRegistry");
        this.f38310b = c7818Js0;
    }

    /* renamed from: c */
    public final Activity m23137c() throws C7248zB {
        C7818Js0 c7818Js0 = this.f38310b;
        if (c7818Js0 == null) {
            O90.m5977o("moduleRegistry");
            throw null;
        }
        C9398ff1 c9398ff1 = (C9398ff1) c7818Js0.f5762a.get(C9398ff1.class);
        if (c9398ff1 == null) {
            throw new C7248zB();
        }
        ReactContext reactContext = c9398ff1.f27311a;
        if (reactContext.getCurrentActivity() == null) {
            throw new C7248zB();
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        O90.m5965c(currentActivity);
        return currentActivity;
    }

    @Override // p000.D90
    public final /* synthetic */ void onDestroy() {
    }
}
