package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

/* loaded from: classes2.dex */
public final class E7 implements D90 {
    public final ReactApplicationContext a;

    public E7(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "context");
        this.a = reactApplicationContext;
    }

    @Override // defpackage.D90
    public final List a() {
        return AbstractC8259yu.e(E7.class);
    }

    @Override // defpackage.D90
    public final /* synthetic */ void b(C0777Js0 c0777Js0) {
    }

    @Override // defpackage.D90
    public final /* synthetic */ void onDestroy() {
    }
}
