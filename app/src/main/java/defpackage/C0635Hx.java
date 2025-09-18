package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;
import java.util.UUID;

/* renamed from: Hx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0635Hx implements D90 {
    public final ReactApplicationContext a;
    public final int b;
    public final String c;

    public C0635Hx(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "context");
        this.a = reactApplicationContext;
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        this.b = (identifier <= 0 ? null : Integer.valueOf(identifier)) != null ? (int) (reactApplicationContext.getResources().getDimensionPixelSize(r1.intValue()) / (reactApplicationContext.getResources().getDisplayMetrics().densityDpi / 160.0f)) : 0;
        String string = UUID.randomUUID().toString();
        O90.e(string, "toString(...)");
        this.c = string;
    }

    @Override // defpackage.D90
    public final List a() {
        return AbstractC8259yu.e(C0635Hx.class);
    }

    @Override // defpackage.D90
    public final /* synthetic */ void b(C0777Js0 c0777Js0) {
    }

    @Override // defpackage.D90
    public final /* synthetic */ void onDestroy() {
    }
}
