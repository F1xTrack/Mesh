package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p000.AbstractC10889rJ0;
import p000.AbstractC11374v51;
import p000.C0600JW;
import p000.C0926Oi;
import p000.C6846so;
import p000.C8064Ol0;
import p000.C8168Ql0;
import p000.C8220Rl0;
import p000.C8480Wl0;
import p000.C8532Xl0;
import p000.InterfaceC10819qm0;
import p000.InterfaceC6947uP;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.OZ1;
import p000.S91;

@Metadata(m22266d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\rJ)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b \u0010\u001eJ!\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\"\u0010\u001eJ!\u0010%\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b*\u0010\u001eJ!\u0010,\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00106\u001a\u00020#H\u0007¢\u0006\u0004\b7\u0010&J\u001f\u00109\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00108\u001a\u00020#H\u0007¢\u0006\u0004\b9\u0010&J!\u0010;\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b;\u0010\u001eJ\u001f\u0010=\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010<\u001a\u00020#H\u0007¢\u0006\u0004\b=\u0010&J\u001f\u0010?\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010>\u001a\u00020#H\u0007¢\u0006\u0004\b?\u0010&J!\u0010A\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\bD\u0010BJ!\u0010F\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bF\u0010\u001eJ\u0017\u0010G\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, m22267d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "LOl0;", "<init>", "()V", "view", "LWl0;", "getOrCreatePropertyManager", "(LOl0;)LWl0;", "", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "LS91;", "context", "createViewInstance", "(LS91;)LOl0;", "", "getExportedCustomDirectEventTypeConstants", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "LTf1;", "receiveCommand", "(LOl0;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "name", "setSourceName", "(LOl0;Ljava/lang/String;)V", "json", "setSourceJson", "urlString", "setSourceURL", "", "cacheComposition", "setCacheComposition", "(LOl0;Z)V", "resizeMode", "setResizeMode", "renderMode", "setRenderMode", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "(LOl0;Ljava/lang/Boolean;)V", "", "progress", "setProgress", "(LOl0;F)V", "", "speed", "setSpeed", "(LOl0;D)V", "loop", "setLoop", "autoPlay", "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePaths", "enableSafeMode", "setEnableSafeMode", "colorFilters", "setColorFilters", "(LOl0;Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "setTextFilters", "uri", "setSourceDotLottie", "onAfterUpdateTransaction", "(LOl0;)V", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "lottie-react-native_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class LottieAnimationViewManager extends SimpleViewManager<C8064Ol0> {
    private final WeakHashMap<C8064Ol0, C8480Wl0> propManagersMap = new WeakHashMap<>();

    public static final void createViewInstance$lambda$0(C8064Ol0 c8064Ol0, Throwable th) {
        O90.m5968f(c8064Ol0, "$view");
        O90.m5965c(th);
        Context context = c8064Ol0.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        S91 s91 = (S91) context;
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(s91, c8064Ol0.getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C0600JW(th, s91.f10603b, c8064Ol0.getId()));
        }
    }

    public static final void createViewInstance$lambda$1(C8064Ol0 c8064Ol0, C8532Xl0 c8532Xl0) {
        O90.m5968f(c8064Ol0, "$view");
        Context context = c8064Ol0.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        S91 s91 = (S91) context;
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(s91, c8064Ol0.getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C6846so(s91.f10603b, c8064Ol0.getId(), 11));
        }
    }

    private final C8480Wl0 getOrCreatePropertyManager(C8064Ol0 view) {
        C8480Wl0 c8480Wl0 = this.propManagersMap.get(view);
        if (c8480Wl0 != null) {
            return c8480Wl0;
        }
        C8480Wl0 c8480Wl02 = new C8480Wl0(view);
        this.propManagersMap.put(view, c8480Wl02);
        return c8480Wl02;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8064Ol0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        final C8064Ol0 c8064Ol0 = new C8064Ol0(context);
        c8064Ol0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c8064Ol0.setFailureListener(new InterfaceC10819qm0() { // from class: Pl0
            @Override // p000.InterfaceC10819qm0
            public final void onResult(Object obj) {
                LottieAnimationViewManager.createViewInstance$lambda$0(c8064Ol0, (Throwable) obj);
            }
        });
        C8168Ql0 c8168Ql0 = new C8168Ql0(c8064Ol0);
        C8532Xl0 composition = c8064Ol0.getComposition();
        if (composition != null) {
            createViewInstance$lambda$1(c8064Ol0, composition);
        }
        c8064Ol0.f8608o.add(c8168Ql0);
        c8064Ol0.f8601h.f37888b.addListener(new C8220Rl0(0, c8064Ol0));
        return c8064Ol0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC10889rJ0.m24258e("topAnimationFinish", AbstractC10889rJ0.m24256c("registrationName", "onAnimationFinish"), "topAnimationFailure", AbstractC10889rJ0.m24256c("registrationName", "onAnimationFailure"), "topAnimationLoaded", AbstractC10889rJ0.m24256c("registrationName", "onAnimationLoaded"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("VERSION", 1);
        HashMap mapM6122h = c0926OiM24254a.m6122h();
        O90.m5967e(mapM6122h, "build(...)");
        return mapM6122h;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LottieAnimationView";
    }

    @InterfaceC9871jM0(name = "autoPlay")
    public final void setAutoPlay(C8064Ol0 view, boolean autoPlay) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13390q = Boolean.valueOf(autoPlay);
    }

    @InterfaceC9871jM0(name = "cacheComposition")
    public final void setCacheComposition(C8064Ol0 view, boolean cacheComposition) {
        O90.m5965c(view);
        view.setCacheComposition(cacheComposition);
    }

    @InterfaceC9871jM0(name = "colorFilters")
    public final void setColorFilters(C8064Ol0 view, ReadableArray colorFilters) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13381h = colorFilters;
    }

    @InterfaceC9871jM0(name = "enableMergePathsAndroidForKitKatAndAbove")
    public final void setEnableMergePaths(C8064Ol0 view, boolean enableMergePaths) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13379f = Boolean.valueOf(enableMergePaths);
    }

    @InterfaceC9871jM0(name = "enableSafeModeAndroid")
    public final void setEnableSafeMode(C8064Ol0 view, boolean enableSafeMode) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13380g = Boolean.valueOf(enableSafeMode);
    }

    @InterfaceC9871jM0(name = "hardwareAccelerationAndroid")
    public final void setHardwareAccelerationAndroid(C8064Ol0 view, Boolean hardwareAccelerationAndroid) {
        O90.m5968f(view, "view");
        O90.m5965c(hardwareAccelerationAndroid);
        boolean zBooleanValue = hardwareAccelerationAndroid.booleanValue();
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13384k = zBooleanValue ? 2 : 1;
    }

    @InterfaceC9871jM0(name = "imageAssetsFolder")
    public final void setImageAssetsFolder(C8064Ol0 view, String imageAssetsFolder) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13378e = imageAssetsFolder;
    }

    @InterfaceC9871jM0(name = "loop")
    public final void setLoop(C8064Ol0 view, boolean loop) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13389p = Boolean.valueOf(loop);
    }

    @InterfaceC9871jM0(name = "progress")
    public final void setProgress(C8064Ol0 view, float progress) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13388o = Float.valueOf(progress);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
    @p000.InterfaceC9871jM0(name = "renderMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setRenderMode(p000.C8064Ol0 r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r3, r0)
            Wl0 r3 = r2.getOrCreatePropertyManager(r3)
            java.lang.String r0 = "viewManager"
            p000.O90.m5968f(r3, r0)
            if (r4 == 0) goto L48
            int r0 = r4.hashCode()
            r1 = 165298699(0x9da420b, float:5.2543697E-33)
            if (r0 == r1) goto L3c
            r1 = 899536360(0x359dd5e8, float:1.1759666E-6)
            if (r0 == r1) goto L30
            r1 = 2101957031(0x7d4951a7, float:1.6724924E37)
            if (r0 == r1) goto L24
            goto L48
        L24:
            java.lang.String r0 = "SOFTWARE"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2d
            goto L48
        L2d:
            XQ0 r4 = p000.XQ0.f13753c
            goto L49
        L30:
            java.lang.String r0 = "HARDWARE"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L39
            goto L48
        L39:
            XQ0 r4 = p000.XQ0.f13752b
            goto L49
        L3c:
            java.lang.String r0 = "AUTOMATIC"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L45
            goto L48
        L45:
            XQ0 r4 = p000.XQ0.f13751a
            goto L49
        L48:
            r4 = 0
        L49:
            r3.f13383j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.LottieAnimationViewManager.setRenderMode(Ol0, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
    @p000.InterfaceC9871jM0(name = "resizeMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setResizeMode(p000.C8064Ol0 r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r3, r0)
            Wl0 r3 = r2.getOrCreatePropertyManager(r3)
            java.lang.String r0 = "viewManager"
            p000.O90.m5968f(r3, r0)
            if (r4 == 0) goto L48
            int r0 = r4.hashCode()
            r1 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r0 == r1) goto L3c
            r1 = 94852023(0x5a753b7, float:1.5735357E-35)
            if (r0 == r1) goto L30
            r1 = 951526612(0x38b724d4, float:8.73298E-5)
            if (r0 == r1) goto L24
            goto L48
        L24:
            java.lang.String r0 = "contain"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2d
            goto L48
        L2d:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L49
        L30:
            java.lang.String r0 = "cover"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L39
            goto L48
        L39:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L49
        L3c:
            java.lang.String r0 = "center"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L45
            goto L48
        L45:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            goto L49
        L48:
            r4 = 0
        L49:
            r3.f13377d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.LottieAnimationViewManager.setResizeMode(Ol0, java.lang.String):void");
    }

    @InterfaceC9871jM0(name = "sourceDotLottieURI")
    public final void setSourceDotLottie(C8064Ol0 view, String uri) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13387n = uri;
        orCreatePropertyManager.m8850a();
    }

    @InterfaceC9871jM0(name = "sourceJson")
    public final void setSourceJson(C8064Ol0 view, String json) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13385l = json;
        orCreatePropertyManager.m8850a();
    }

    @InterfaceC9871jM0(name = "sourceName")
    public final void setSourceName(C8064Ol0 view, String name) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        if (name != null && !AbstractC11374v51.m25351p(name, ".", false)) {
            name = name.concat(".json");
        }
        orCreatePropertyManager.f13376c = name;
        orCreatePropertyManager.f13375b = true;
        orCreatePropertyManager.m8850a();
    }

    @InterfaceC9871jM0(name = "sourceURL")
    public final void setSourceURL(C8064Ol0 view, String urlString) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13386m = urlString;
        orCreatePropertyManager.m8850a();
    }

    @InterfaceC9871jM0(name = "speed")
    public final void setSpeed(C8064Ol0 view, double speed) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13391r = Float.valueOf((float) speed);
    }

    @InterfaceC9871jM0(name = "textFiltersAndroid")
    public final void setTextFilters(C8064Ol0 view, ReadableArray textFilters) {
        O90.m5968f(view, "view");
        C8480Wl0 orCreatePropertyManager = getOrCreatePropertyManager(view);
        O90.m5968f(orCreatePropertyManager, "viewManager");
        orCreatePropertyManager.f13382i = textFilters;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C8064Ol0 view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((LottieAnimationViewManager) view);
        getOrCreatePropertyManager(view).m8850a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(final C8064Ol0 view, String commandName, ReadableArray args) {
        O90.m5968f(view, "view");
        O90.m5968f(commandName, "commandName");
        switch (commandName.hashCode()) {
            case -934426579:
                if (commandName.equals("resume")) {
                    final int i = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Sl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            EnumC7960Ml0 enumC7960Ml0 = EnumC7960Ml0.f7325f;
                            C8064Ol0 c8064Ol0 = view;
                            switch (i) {
                                case 0:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8605l = false;
                                        c8064Ol0.f8607n.add(enumC7960Ml0);
                                        C10307mm0 c10307mm0 = c8064Ol0.f8601h;
                                        c10307mm0.f37892f.clear();
                                        c10307mm0.f37888b.cancel();
                                        if (!c10307mm0.isVisible()) {
                                            c10307mm0.f37886R = 1;
                                        }
                                        c8064Ol0.setProgress(0.0f);
                                        break;
                                    }
                                    break;
                                case 1:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8607n.add(enumC7960Ml0);
                                        c8064Ol0.f8601h.m22959n();
                                        break;
                                    }
                                    break;
                                default:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8605l = false;
                                        c8064Ol0.f8601h.m22956k();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 3443508:
                if (commandName.equals("play")) {
                    final boolean z = false;
                    final int i2 = args != null ? args.getInt(0) : -1;
                    final int i3 = args != null ? args.getInt(1) : -1;
                    if (i2 != -1 && i3 != -1) {
                        z = true;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Tl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8064Ol0 c8064Ol0 = view;
                            O90.m5968f(c8064Ol0, "$view");
                            C10307mm0 c10307mm0 = c8064Ol0.f8601h;
                            boolean z2 = z;
                            if (z2) {
                                int i4 = i2;
                                int i5 = i3;
                                if (i4 > i5) {
                                    c10307mm0.m22963r(i5, i4);
                                    if (c8064Ol0.getSpeed() > 0.0f) {
                                        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = c10307mm0.f37888b;
                                        choreographerFrameCallbackC11586wm0.f45086d = -choreographerFrameCallbackC11586wm0.f45086d;
                                    }
                                } else {
                                    c10307mm0.m22963r(i4, i5);
                                    if (c8064Ol0.getSpeed() < 0.0f) {
                                        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm02 = c10307mm0.f37888b;
                                        choreographerFrameCallbackC11586wm02.f45086d = -choreographerFrameCallbackC11586wm02.f45086d;
                                    }
                                }
                            } else {
                                C8532Xl0 composition = c8064Ol0.getComposition();
                                Integer numValueOf = composition != null ? Integer.valueOf((int) composition.f13958l) : null;
                                C8532Xl0 composition2 = c8064Ol0.getComposition();
                                Integer numValueOf2 = composition2 != null ? Integer.valueOf((int) composition2.f13959m) : null;
                                int minFrame = (int) c8064Ol0.getMinFrame();
                                int maxFrame = (int) c8064Ol0.getMaxFrame();
                                if (numValueOf != null && numValueOf2 != null && (minFrame != numValueOf.intValue() || maxFrame != numValueOf2.intValue())) {
                                    c10307mm0.m22963r(numValueOf.intValue(), numValueOf2.intValue());
                                }
                            }
                            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                            if (!c8064Ol0.isAttachedToWindow()) {
                                c8064Ol0.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8376Ul0(c8064Ol0, z2));
                            } else if (z2) {
                                c8064Ol0.m6132e();
                            } else {
                                c8064Ol0.f8607n.add(EnumC7960Ml0.f7325f);
                                c10307mm0.m22959n();
                            }
                        }
                    });
                    break;
                }
                break;
            case 106440182:
                if (commandName.equals("pause")) {
                    final int i4 = 2;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Sl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            EnumC7960Ml0 enumC7960Ml0 = EnumC7960Ml0.f7325f;
                            C8064Ol0 c8064Ol0 = view;
                            switch (i4) {
                                case 0:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8605l = false;
                                        c8064Ol0.f8607n.add(enumC7960Ml0);
                                        C10307mm0 c10307mm0 = c8064Ol0.f8601h;
                                        c10307mm0.f37892f.clear();
                                        c10307mm0.f37888b.cancel();
                                        if (!c10307mm0.isVisible()) {
                                            c10307mm0.f37886R = 1;
                                        }
                                        c8064Ol0.setProgress(0.0f);
                                        break;
                                    }
                                    break;
                                case 1:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8607n.add(enumC7960Ml0);
                                        c8064Ol0.f8601h.m22959n();
                                        break;
                                    }
                                    break;
                                default:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8605l = false;
                                        c8064Ol0.f8601h.m22956k();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 108404047:
                if (commandName.equals("reset")) {
                    final int i5 = 0;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Sl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            EnumC7960Ml0 enumC7960Ml0 = EnumC7960Ml0.f7325f;
                            C8064Ol0 c8064Ol0 = view;
                            switch (i5) {
                                case 0:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8605l = false;
                                        c8064Ol0.f8607n.add(enumC7960Ml0);
                                        C10307mm0 c10307mm0 = c8064Ol0.f8601h;
                                        c10307mm0.f37892f.clear();
                                        c10307mm0.f37888b.cancel();
                                        if (!c10307mm0.isVisible()) {
                                            c10307mm0.f37886R = 1;
                                        }
                                        c8064Ol0.setProgress(0.0f);
                                        break;
                                    }
                                    break;
                                case 1:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8607n.add(enumC7960Ml0);
                                        c8064Ol0.f8601h.m22959n();
                                        break;
                                    }
                                    break;
                                default:
                                    O90.m5968f(c8064Ol0, "$view");
                                    WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                                    if (c8064Ol0.isAttachedToWindow()) {
                                        c8064Ol0.f8605l = false;
                                        c8064Ol0.f8601h.m22956k();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
        }
    }
}
