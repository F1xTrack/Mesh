package com.brentvatne.react;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import p000.C10115lG0;
import p000.C10891rK0;
import p000.C4027f1;
import p000.C7427Ce1;
import p000.C7593Fj1;
import p000.C9534gj1;
import p000.C9918jj1;
import p000.InterfaceC6497nZ;
import p000.O90;
import p000.OZ1;
import p000.RunnableC6694qf;

@Metadata(m22266d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001,B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010!J!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*¨\u0006-"}, m22267d2 = {"Lcom/brentvatne/react/VideoManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "reactTag", "Lkotlin/Function1;", "LrK0;", "LTf1;", "callback", "performOnPlayerView", "(ILnZ;)V", "", "getName", "()Ljava/lang/String;", "", "paused", "setPlayerPauseStateCmd", "(ILjava/lang/Boolean;)V", "", CrashHianalyticsData.TIME, "tolerance", "seekCmd", "(IFF)V", "volume", "setVolumeCmd", "(IF)V", "fullScreen", "setFullScreenCmd", "(IZ)V", "enterPictureInPictureCmd", "(I)V", "exitPictureInPictureCmd", "Lcom/facebook/react/bridge/ReadableMap;", "source", "setSourceCmd", "(ILcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getCurrentPosition", "(ILcom/facebook/react/bridge/Promise;)V", "Companion", "Fj1", "react-native-video_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class VideoManagerModule extends ReactContextBaseJavaModule {
    public static final C7593Fj1 Companion = new C7593Fj1();
    private static final String REACT_CLASS = "VideoManager";

    public VideoManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final void performOnPlayerView(int reactTag, InterfaceC6497nZ callback) {
        UiThreadUtil.runOnUiThread(new RunnableC6694qf(this, reactTag, callback, 14));
    }

    public static final void performOnPlayerView$lambda$0(VideoManagerModule videoManagerModule, int i, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(videoManagerModule, "this$0");
        O90.m5968f(interfaceC6497nZ, "$callback");
        try {
            UIManager uIManagerM6095f = OZ1.m6095f(videoManagerModule.getReactApplicationContext(), 1, true);
            View viewResolveView = uIManagerM6095f != null ? uIManagerM6095f.resolveView(i) : null;
            if (viewResolveView instanceof C10891rK0) {
                interfaceC6497nZ.invoke(viewResolveView);
            } else {
                interfaceC6497nZ.invoke(null);
            }
        } catch (Exception unused) {
            interfaceC6497nZ.invoke(null);
        }
    }

    @ReactMethod
    public final void enterPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, C7427Ce1.f1549i);
    }

    @ReactMethod
    public final void exitPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, C7427Ce1.f1550j);
    }

    @ReactMethod
    public final void getCurrentPosition(int reactTag, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        performOnPlayerView(reactTag, new C10115lG0(15, promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public final void seekCmd(int reactTag, float f, float tolerance) {
        performOnPlayerView(reactTag, new C9918jj1(f, 2));
    }

    @ReactMethod
    public final void setFullScreenCmd(int reactTag, boolean fullScreen) {
        performOnPlayerView(reactTag, new C9534gj1(fullScreen, 4));
    }

    @ReactMethod
    public final void setPlayerPauseStateCmd(int reactTag, Boolean paused) {
        performOnPlayerView(reactTag, new C10115lG0(16, paused));
    }

    @ReactMethod
    public final void setSourceCmd(int reactTag, ReadableMap source) {
        performOnPlayerView(reactTag, new C4027f1(source, 15, this));
    }

    @ReactMethod
    public final void setVolumeCmd(int reactTag, float volume) {
        performOnPlayerView(reactTag, new C9918jj1(volume, 3));
    }
}
