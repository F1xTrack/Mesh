package com.swmansion.rnscreens.utils;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import p000.XV0;

@DoNotStrip
@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m22267d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "fontSize", "", "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "XV0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {

    /* renamed from: a */
    public static final XV0 f20261a = new XV0();

    /* renamed from: b */
    public static final WeakReference f20262b = new WeakReference(null);

    @DoNotStrip
    private final float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        throw null;
    }

    @DoNotStrip
    public static final ScreenDummyLayoutHelper getInstance() {
        return f20261a.getInstance();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        throw null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        throw null;
    }
}
