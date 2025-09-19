package com.th3rdwave.safeareacontext;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AU0;
import p000.AbstractC11077sn0;
import p000.AbstractC11205tn0;
import p000.AbstractC11406vL1;
import p000.AbstractC9754iR1;
import p000.C10003kO0;
import p000.C1407WM;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = SafeAreaContextModule.NAME)
@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b\r\u0010\n¨\u0006\u0010"}, m22267d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;", "Lcom/th3rdwave/safeareacontext/NativeSafeAreaContextSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getInitialWindowMetrics", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "getTypedExportedConstants", "Companion", "AU0", "react-native-safe-area-context_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {
    public static final AU0 Companion = new AU0();
    public static final String NAME = "RNCSafeAreaContext";

    public SafeAreaContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final Map<String, Object> getInitialWindowMetrics() {
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        ViewGroup viewGroup = (ViewGroup) ((currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView());
        View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.content) : null;
        if (viewFindViewById == null) {
            return null;
        }
        C1407WM c1407wmM19039c = AbstractC9754iR1.m19039c(viewGroup);
        C10003kO0 c10003kO0M19037a = AbstractC9754iR1.m19037a(viewGroup, viewFindViewById);
        if (c1407wmM19039c == null || c10003kO0M19037a == null) {
            return null;
        }
        return AbstractC11077sn0.m24780h(new Pair("insets", AbstractC11077sn0.m24780h(new Pair("top", Float.valueOf(AbstractC11406vL1.m25402a(c1407wmM19039c.f13142a))), new Pair("right", Float.valueOf(AbstractC11406vL1.m25402a(c1407wmM19039c.f13143b))), new Pair("bottom", Float.valueOf(AbstractC11406vL1.m25402a(c1407wmM19039c.f13144c))), new Pair("left", Float.valueOf(AbstractC11406vL1.m25402a(c1407wmM19039c.f13145d))))), new Pair("frame", AbstractC11077sn0.m24780h(new Pair("x", Float.valueOf(AbstractC11406vL1.m25402a(c10003kO0M19037a.f36478a))), new Pair("y", Float.valueOf(AbstractC11406vL1.m25402a(c10003kO0M19037a.f36479b))), new Pair(Snapshot.WIDTH, Float.valueOf(AbstractC11406vL1.m25402a(c10003kO0M19037a.f36480c))), new Pair(Snapshot.HEIGHT, Float.valueOf(AbstractC11406vL1.m25402a(c10003kO0M19037a.f36481d))))));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec
    public Map<String, Object> getTypedExportedConstants() {
        return AbstractC11205tn0.m24984c(new Pair("initialWindowMetrics", getInitialWindowMetrics()));
    }
}
