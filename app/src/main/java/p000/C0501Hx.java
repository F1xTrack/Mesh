package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;
import java.util.UUID;

/* renamed from: Hx */
/* loaded from: classes2.dex */
public final class C0501Hx implements D90 {

    /* renamed from: a */
    public final ReactApplicationContext f4611a;

    /* renamed from: b */
    public final int f4612b;

    /* renamed from: c */
    public final String f4613c;

    public C0501Hx(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "context");
        this.f4611a = reactApplicationContext;
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        this.f4612b = (identifier <= 0 ? null : Integer.valueOf(identifier)) != null ? (int) (reactApplicationContext.getResources().getDimensionPixelSize(r1.intValue()) / (reactApplicationContext.getResources().getDisplayMetrics().densityDpi / 160.0f)) : 0;
        String string = UUID.randomUUID().toString();
        O90.m5967e(string, "toString(...)");
        this.f4613c = string;
    }

    @Override // p000.D90
    /* renamed from: a */
    public final List mo174a() {
        return AbstractC7230yu.m26274e(C0501Hx.class);
    }

    @Override // p000.D90
    /* renamed from: b */
    public final /* synthetic */ void mo175b(C7818Js0 c7818Js0) {
    }

    @Override // p000.D90
    public final /* synthetic */ void onDestroy() {
    }
}
