package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import java.util.HashSet;
import java.util.List;

/* renamed from: nR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6075nR implements D90 {
    public final HashSet a = new HashSet();
    public C0777Js0 b;

    @Override // defpackage.D90
    public final List a() {
        return AbstractC8259yu.e(C6075nR.class);
    }

    @Override // defpackage.D90
    public final void b(C0777Js0 c0777Js0) {
        O90.f(c0777Js0, "moduleRegistry");
        this.b = c0777Js0;
    }

    public final Activity c() throws C8314zB {
        C0777Js0 c0777Js0 = this.b;
        if (c0777Js0 == null) {
            O90.o("moduleRegistry");
            throw null;
        }
        C3815ff1 c3815ff1 = (C3815ff1) c0777Js0.a.get(C3815ff1.class);
        if (c3815ff1 == null) {
            throw new C8314zB();
        }
        ReactContext reactContext = c3815ff1.a;
        if (reactContext.getCurrentActivity() == null) {
            throw new C8314zB();
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        O90.c(currentActivity);
        return currentActivity;
    }

    @Override // defpackage.D90
    public final /* synthetic */ void onDestroy() {
    }
}
