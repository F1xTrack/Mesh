package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC0881O;
import p000.AbstractC10889rJ0;
import p000.AbstractC11406vL1;
import p000.AbstractC11619x12;
import p000.AbstractC3929dS;
import p000.AbstractC4061fZ;
import p000.AbstractC9191e22;
import p000.AbstractC9703i22;
import p000.AbstractC9828j12;
import p000.EnumC10993s70;
import p000.F10;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.InterfaceC9999kM0;
import p000.JK0;
import p000.LJ0;
import p000.S91;

@InterfaceC9101dL0(name = ReactImageManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactImageManager extends SimpleViewManager<JK0> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private final LJ0 mCallerContextFactory;
    private AbstractC0881O mDraweeControllerBuilder;
    private F10 mGlobalImageLoadListener;

    @Deprecated
    public ReactImageManager(AbstractC0881O abstractC0881O, Object obj) {
        this(abstractC0881O, (F10) null, obj);
    }

    @Deprecated
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractC0881O getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = AbstractC4061fZ.f27229a.get();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap();
        }
        String strM17826a = AbstractC9191e22.m17826a(4);
        HashMap mapM24256c = AbstractC10889rJ0.m24256c("registrationName", "onLoadStart");
        String strM17826a2 = AbstractC9191e22.m17826a(5);
        HashMap mapM24256c2 = AbstractC10889rJ0.m24256c("registrationName", "onProgress");
        String strM17826a3 = AbstractC9191e22.m17826a(2);
        HashMap mapM24256c3 = AbstractC10889rJ0.m24256c("registrationName", "onLoad");
        HashMap mapM24256c4 = AbstractC10889rJ0.m24256c("registrationName", "onError");
        String strM17826a4 = AbstractC9191e22.m17826a(3);
        HashMap mapM24256c5 = AbstractC10889rJ0.m24256c("registrationName", "onLoadEnd");
        HashMap map = new HashMap();
        map.put(strM17826a, mapM24256c);
        map.put(strM17826a2, mapM24256c2);
        map.put(strM17826a3, mapM24256c3);
        map.put("topError", mapM24256c4);
        map.put(strM17826a4, mapM24256c5);
        exportedCustomDirectEventTypeConstants.putAll(map);
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC9871jM0(name = "accessible")
    public void setAccessible(JK0 jk0, boolean z) {
        jk0.setFocusable(z);
    }

    @InterfaceC9871jM0(name = "blurRadius")
    public void setBlurRadius(JK0 jk0, float f) {
        jk0.setBlurRadius(f);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "borderColor")
    public void setBorderColor(JK0 jk0, Integer num) {
        if (num == null) {
            jk0.setBorderColor(0);
        } else {
            jk0.setBorderColor(num.intValue());
        }
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(JK0 jk0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        if (i == 0) {
            jk0.setBorderRadius(f);
            return;
        }
        int i2 = i - 1;
        if (jk0.f5478t == null) {
            float[] fArr = new float[4];
            jk0.f5478t = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (AbstractC9828j12.m21957a(jk0.f5478t[i2], f)) {
            return;
        }
        jk0.f5478t[i2] = f;
        jk0.f5481w = true;
    }

    @InterfaceC9871jM0(name = "borderWidth")
    public void setBorderWidth(JK0 jk0, float f) {
        jk0.setBorderWidth(f);
    }

    @InterfaceC9871jM0(name = "defaultSrc")
    public void setDefaultSource(JK0 jk0, String str) {
        jk0.setDefaultSource(str);
    }

    @InterfaceC9871jM0(name = "fadeDuration")
    public void setFadeDuration(JK0 jk0, int i) {
        jk0.setFadeDuration(i);
    }

    @InterfaceC9871jM0(name = "headers")
    public void setHeaders(JK0 jk0, ReadableMap readableMap) {
        jk0.setHeaders(readableMap);
    }

    @InterfaceC9871jM0(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(JK0 jk0, boolean z) {
        jk0.setShouldNotifyLoadEvents(z);
    }

    @InterfaceC9871jM0(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(JK0 jk0, String str) {
        jk0.setLoadingIndicatorSource(str);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "overlayColor")
    public void setOverlayColor(JK0 jk0, Integer num) {
        if (num == null) {
            jk0.setOverlayColor(0);
        } else {
            jk0.setOverlayColor(num.intValue());
        }
    }

    @InterfaceC9871jM0(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(JK0 jk0, boolean z) {
        jk0.setProgressiveRenderingEnabled(z);
    }

    @InterfaceC9871jM0(name = "resizeMethod")
    public void setResizeMethod(JK0 jk0, String str) {
        if (str == null || "auto".equals(str)) {
            jk0.setResizeMethod(EnumC10993s70.f42267a);
            return;
        }
        if ("resize".equals(str)) {
            jk0.setResizeMethod(EnumC10993s70.f42268b);
        } else if ("scale".equals(str)) {
            jk0.setResizeMethod(EnumC10993s70.f42269c);
        } else {
            jk0.setResizeMethod(EnumC10993s70.f42267a);
            AbstractC3929dS.m17683p("ReactNative");
        }
    }

    @InterfaceC9871jM0(name = "resizeMode")
    public void setResizeMode(JK0 jk0, String str) {
        Shader.TileMode tileMode;
        jk0.setScaleType(AbstractC9703i22.m18934a(str));
        if ("contain".equals(str) || "cover".equals(str) || "stretch".equals(str) || "center".equals(str)) {
            tileMode = Shader.TileMode.CLAMP;
        } else if ("repeat".equals(str)) {
            tileMode = Shader.TileMode.REPEAT;
        } else {
            if (str != null) {
                AbstractC3929dS.m17683p("ReactNative");
            }
            tileMode = Shader.TileMode.CLAMP;
        }
        jk0.setTileMode(tileMode);
    }

    @InterfaceC9871jM0(name = "resizeMultiplier")
    public void setResizeMultiplier(JK0 jk0, float f) {
        if (f < 0.01f) {
            AbstractC3929dS.m17683p("ReactNative");
        }
        jk0.setResizeMultiplier(f);
    }

    @InterfaceC9871jM0(name = "source")
    public void setSource(JK0 jk0, ReadableArray readableArray) {
        jk0.setSource(readableArray);
    }

    @InterfaceC9871jM0(name = "src")
    public void setSrc(JK0 jk0, ReadableArray readableArray) {
        setSource(jk0, readableArray);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "tintColor")
    public void setTintColor(JK0 jk0, Integer num) {
        if (num == null) {
            jk0.clearColorFilter();
        } else {
            jk0.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Deprecated
    public ReactImageManager(AbstractC0881O abstractC0881O, F10 f10, Object obj) {
        this.mDraweeControllerBuilder = abstractC0881O;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public JK0 createViewInstance(S91 s91) {
        return new JK0(s91, getDraweeControllerBuilder(), getCallerContext());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(JK0 jk0) {
        super.onAfterUpdateTransaction((ReactImageManager) jk0);
        jk0.m4287d();
    }

    public ReactImageManager(AbstractC0881O abstractC0881O, LJ0 lj0) {
        this(abstractC0881O, (F10) null, lj0);
    }

    public ReactImageManager(AbstractC0881O abstractC0881O, F10 f10, LJ0 lj0) {
        this.mDraweeControllerBuilder = abstractC0881O;
        this.mCallerContext = null;
    }

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
    }

    @InterfaceC9871jM0(name = "internal_analyticTag")
    public void setInternal_AnalyticsTag(JK0 jk0, String str) {
    }
}
