package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11077sn0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m22267d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;", "", "()V", "componentNames", "", "", "getFabricComponentName", "componentName", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class FabricNameComponentMapping {
    public static final FabricNameComponentMapping INSTANCE = new FabricNameComponentMapping();
    private static final Map<String, String> componentNames = AbstractC11077sn0.m24780h(new Pair("View", ReactViewManager.REACT_CLASS), new Pair("Image", ReactImageManager.REACT_CLASS), new Pair("ScrollView", ReactScrollViewManager.REACT_CLASS), new Pair("Slider", "RCTSlider"), new Pair("ModalHostView", ReactModalHostManager.REACT_CLASS), new Pair("Paragraph", ReactTextViewManager.REACT_CLASS), new Pair("Text", "RCText"), new Pair("RawText", ReactRawTextManager.REACT_CLASS), new Pair("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), new Pair("ShimmeringView", "RKShimmeringView"), new Pair("TemplateView", "RCTTemplateView"), new Pair("AxialGradientView", "RCTAxialGradientView"), new Pair("Video", "RCTVideo"), new Pair("Map", "RCTMap"), new Pair("WebView", "RCTWebView"), new Pair("Keyframes", "RCTKeyframes"), new Pair("ImpressionTrackingView", "RCTImpressionTrackingView"));

    private FabricNameComponentMapping() {
    }

    public static final String getFabricComponentName(String componentName) {
        O90.m5968f(componentName, "componentName");
        String str = componentNames.get(componentName);
        return str == null ? componentName : str;
    }
}
