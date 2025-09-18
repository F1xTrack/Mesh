package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.C1719a;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p000.AW0;
import p000.AbstractC10963ru0;
import p000.AbstractC7222ym;
import p000.C10275mW0;
import p000.C6846so;
import p000.GW0;
import p000.InterfaceC0965PK;
import p000.InterfaceC10787qW0;
import p000.InterfaceC6947uP;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9891jW0;
import p000.O90;
import p000.OZ1;
import p000.R02;
import p000.RV0;

@InterfaceC9101dL0(name = "RNSModule")
@Metadata(m22266d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m22267d2 = {"Lcom/swmansion/rnscreens/ScreensModule;", "Lcom/swmansion/rnscreens/NativeScreensModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "jsiPtr", "LTf1;", "nativeInstall", "(J)V", "", "reactTag", "", "startTransition", "(Ljava/lang/Integer;)[I", "", "progress", "updateTransition", "(D)V", "", "canceled", "finishTransition", "(Ljava/lang/Integer;Z)V", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "topScreenId", "I", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isActiveTransition", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru0;", "proxy", "Lru0;", "Companion", "GW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ScreensModule extends NativeScreensModuleSpec {
    public static final GW0 Companion = new GW0();
    public static final String NAME = "RNSModule";
    private final AtomicBoolean isActiveTransition;
    private AbstractC10963ru0 proxy;
    private final ReactApplicationContext reactContext;
    private int topScreenId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
        this.topScreenId = -1;
        this.isActiveTransition = new AtomicBoolean(false);
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder != null) {
                nativeInstall(javaScriptContextHolder.get());
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @InterfaceC0965PK
    private final void finishTransition(Integer reactTag, boolean canceled) {
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() || reactTag == null) {
            return;
        }
        UIManager uIManagerM6095f = OZ1.m6095f(this.reactContext, R02.m6874b(reactTag.intValue()), true);
        View viewResolveView = uIManagerM6095f != null ? uIManagerM6095f.resolveView(reactTag.intValue()) : null;
        if (viewResolveView instanceof C10275mW0) {
            if (canceled) {
                C10275mW0 c10275mW0 = (C10275mW0) viewResolveView;
                ArrayList arrayList = c10275mW0.f10815a;
                if (arrayList.size() < 2) {
                    throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
                }
                C1719a c1719aM7376b = c10275mW0.m7376b();
                c1719aM7376b.m10018i(((InterfaceC9891jW0) AbstractC7222ym.m26228e(2, arrayList)).mo13724d());
                c1719aM7376b.m10016g();
            } else {
                C10275mW0 c10275mW02 = (C10275mW0) viewResolveView;
                RV0 topScreen = c10275mW02.getTopScreen();
                O90.m5966d(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
                if (c10275mW02.getContext() instanceof ReactContext) {
                    int iM6093d = OZ1.m6093d(c10275mW02.getContext());
                    Context context = c10275mW02.getContext();
                    O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, topScreen.getId());
                    if (interfaceC6947uPM6091b != null) {
                        interfaceC6947uPM6091b.mo11046g(new C6846so(iM6093d, topScreen.getId(), 18));
                    }
                }
            }
            this.isActiveTransition.set(false);
        }
        this.topScreenId = -1;
    }

    private final native void nativeInstall(long jsiPtr);

    @InterfaceC0965PK
    private final int[] startTransition(Integer reactTag) {
        C10275mW0 c10275mW0;
        ArrayList<InterfaceC10787qW0> fragments;
        int size;
        UiThreadUtil.assertOnUiThread();
        if (this.isActiveTransition.get() || reactTag == null) {
            return new int[]{-1, -1};
        }
        this.topScreenId = -1;
        int[] iArr = {-1, -1};
        UIManager uIManagerM6095f = OZ1.m6095f(this.reactContext, R02.m6874b(reactTag.intValue()), true);
        View viewResolveView = uIManagerM6095f != null ? uIManagerM6095f.resolveView(reactTag.intValue()) : null;
        if ((viewResolveView instanceof C10275mW0) && (size = (fragments = (c10275mW0 = (C10275mW0) viewResolveView).getFragments()).size()) > 1) {
            this.isActiveTransition.set(true);
            ArrayList arrayList = c10275mW0.f10815a;
            if (arrayList.size() < 2) {
                throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
            }
            C1719a c1719aM7376b = c10275mW0.m7376b();
            RV0 topScreen = c10275mW0.getTopScreen();
            O90.m5966d(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
            Fragment fragment = topScreen.getFragment();
            O90.m5966d(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            c1719aM7376b.m10018i(fragment);
            c1719aM7376b.mo10013c(c10275mW0.getId(), ((InterfaceC9891jW0) arrayList.get(arrayList.size() - 2)).mo13724d(), null, 1);
            Fragment fragment2 = topScreen.getFragment();
            O90.m5966d(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            c1719aM7376b.mo10013c(c10275mW0.getId(), fragment2, null, 1);
            c1719aM7376b.m10016g();
            int id = fragments.get(size - 1).mo13727h().getId();
            this.topScreenId = id;
            iArr[0] = id;
            iArr[1] = fragments.get(size - 2).mo13727h().getId();
        }
        return iArr;
    }

    @InterfaceC0965PK
    private final void updateTransition(double progress) {
        UiThreadUtil.assertOnUiThread();
        int i = this.topScreenId;
        if (i == -1) {
            return;
        }
        float f = (float) progress;
        short s = (short) (f == 0.0f ? 1 : f == 1.0f ? 2 : 3);
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(this.reactContext, i);
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new AW0(OZ1.m6093d(this.reactContext), this.topScreenId, f, true, true, s));
        }
    }

    @Override // com.swmansion.rnscreens.NativeScreensModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }
}
