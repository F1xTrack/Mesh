package com.reactnativecommunity.webview;

import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewGroupManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.AbstractC1374Vq;
import p000.AbstractC1618Zi;
import p000.AbstractC7038vr;
import p000.AbstractC8015Nm1;
import p000.AbstractC8671a12;
import p000.AbstractC9221eH0;
import p000.C0328FC;
import p000.C0926Oi;
import p000.C10373nH0;
import p000.C11141tH0;
import p000.C1210TE;
import p000.C8832bH0;
import p000.C9733iH0;
import p000.C9861jH0;
import p000.D51;
import p000.EnumC7963Mm1;
import p000.InterfaceC9871jM0;
import p000.MW0;
import p000.O90;
import p000.S91;

/* loaded from: classes2.dex */
public class RNCWebViewManager extends ViewGroupManager<C11141tH0> {
    private final C10373nH0 mRNCWebViewManagerImpl = new C10373nH0();

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        this.mRNCWebViewManagerImpl.getClass();
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("goBack", 1);
        c0926OiM24254a.m6125k("goForward", 2);
        c0926OiM24254a.m6125k("reload", 3);
        c0926OiM24254a.m6125k("stopLoading", 4);
        c0926OiM24254a.m6125k("postMessage", 5);
        c0926OiM24254a.m6125k("injectJavaScript", 6);
        c0926OiM24254a.m6125k("loadUrl", 7);
        c0926OiM24254a.m6125k("requestFocus", 8);
        c0926OiM24254a.m6125k("clearFormData", 1000);
        c0926OiM24254a.m6125k("clearCache", 1001);
        c0926OiM24254a.m6125k("clearHistory", 1002);
        return c0926OiM24254a.m6122h();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", AbstractC10889rJ0.m24256c("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", AbstractC10889rJ0.m24256c("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", AbstractC10889rJ0.m24256c("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", AbstractC10889rJ0.m24256c("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", AbstractC10889rJ0.m24256c("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", AbstractC10889rJ0.m24256c("registrationName", "onShouldStartLoadWithRequest"));
        MW0 mw0 = MW0.f7205d;
        MW0.f7202a.getClass();
        exportedCustomDirectEventTypeConstants.put(C1210TE.m7635J(mw0), AbstractC10889rJ0.m24256c("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", AbstractC10889rJ0.m24256c("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", AbstractC10889rJ0.m24256c("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", AbstractC10889rJ0.m24256c("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", AbstractC10889rJ0.m24256c("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "allowFileAccess")
    public void setAllowFileAccess(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setAllowFileAccess(z);
    }

    @InterfaceC9871jM0(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @InterfaceC9871jM0(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @InterfaceC9871jM0(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(C11141tH0 c11141tH0, boolean z) {
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        c10373nH0.f38232a = z;
        c10373nH0.m23123c(webView);
    }

    @InterfaceC9871jM0(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(C11141tH0 c11141tH0, boolean z) {
        WebChromeClient webChromeClient;
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        c10373nH0.f38233b = z;
        if (Build.VERSION.SDK_INT < 26 || (webChromeClient = webView.getWebChromeClient()) == null || !(webChromeClient instanceof AbstractC9221eH0)) {
            return;
        }
        ((AbstractC9221eH0) webChromeClient).f26646k = z;
    }

    @InterfaceC9871jM0(name = "androidLayerType")
    public void setAndroidLayerType(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().setLayerType(O90.m5963a(str, "hardware") ? 2 : O90.m5963a(str, "software") ? 1 : 0, null);
    }

    @InterfaceC9871jM0(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(C11141tH0 c11141tH0, String str) {
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        if (str != null) {
            c10373nH0.f38239h = AbstractC1374Vq.m8589h(WebSettings.getDefaultUserAgent(c11141tH0.getWebView().getContext()), " ", str);
        } else {
            c10373nH0.f38239h = null;
        }
        c10373nH0.m23122b(c11141tH0);
    }

    @InterfaceC9871jM0(name = "basicAuthCredential")
    public void setBasicAuthCredential(C11141tH0 c11141tH0, ReadableMap readableMap) {
        C8832bH0 c8832bH0;
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        if (readableMap != null && readableMap.hasKey("username") && readableMap.hasKey("password")) {
            String string = readableMap.getString("username");
            String string2 = readableMap.getString("password");
            c8832bH0 = new C8832bH0();
            c8832bH0.f16926a = string;
            c8832bH0.f16927b = string2;
        } else {
            c8832bH0 = null;
        }
        c11141tH0.getWebView().setBasicAuthCredential(c8832bH0);
    }

    @InterfaceC9871jM0(name = "cacheEnabled")
    public void setCacheEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setCacheMode(z ? -1 : 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC9871jM0(name = "cacheMode")
    public void setCacheMode(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        WebSettings settings = c11141tH0.getWebView().getSettings();
        int i = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i = 2;
                        break;
                    }
                    break;
                case -1215135800:
                    str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i = 1;
                        break;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i = 3;
                        break;
                    }
                    break;
            }
        }
        settings.setCacheMode(i);
    }

    @InterfaceC9871jM0(name = "domStorageEnabled")
    public void setDomStorageEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setDomStorageEnabled(z);
    }

    @InterfaceC9871jM0(name = "downloadingMessage")
    public void setDownloadingMessage(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.f38234c = str;
    }

    @InterfaceC9871jM0(name = "forceDarkOn")
    public void setForceDarkOn(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (AbstractC8671a12.m9662a("FORCE_DARK")) {
                int i = z ? 2 : 0;
                WebSettings settings = webView.getSettings();
                if (!EnumC7963Mm1.FORCE_DARK.m5435a()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                ((WebSettingsBoundaryInterface) AbstractC1618Zi.m9579b(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) AbstractC8015Nm1.f7993a.f41672a).convertSettings(settings))).setForceDark(i);
            }
            if (z && AbstractC8671a12.m9662a("FORCE_DARK_STRATEGY")) {
                WebSettings settings2 = webView.getSettings();
                if (!EnumC7963Mm1.FORCE_DARK_STRATEGY.m5435a()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                ((WebSettingsBoundaryInterface) AbstractC1618Zi.m9579b(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) AbstractC8015Nm1.f7993a.f41672a).convertSettings(settings2))).setForceDarkBehavior(2);
            }
        }
    }

    @InterfaceC9871jM0(name = "geolocationEnabled")
    public void setGeolocationEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setGeolocationEnabled(z);
    }

    @InterfaceC9871jM0(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(C11141tH0 c11141tH0, boolean z) {
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        c10373nH0.f38236e = z;
        c10373nH0.m23123c(webView);
    }

    @InterfaceC9871jM0(name = "hasOnScroll")
    public void setHasOnScroll(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().setHasScrollEvent(z);
    }

    @InterfaceC9871jM0(name = "incognito")
    public void setIncognito(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        if (z) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    @InterfaceC9871jM0(name = "injectedJavaScript")
    public void setInjectedJavaScript(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().f29029a = str;
    }

    @InterfaceC9871jM0(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().f29030b = str;
    }

    @InterfaceC9871jM0(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getClass();
    }

    @InterfaceC9871jM0(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getClass();
    }

    @InterfaceC9871jM0(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().setInjectedJavaScriptObject(str);
    }

    @InterfaceC9871jM0(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
    }

    @InterfaceC9871jM0(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setJavaScriptEnabled(z);
    }

    @InterfaceC9871jM0(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.f38235d = str;
    }

    @InterfaceC9871jM0(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @InterfaceC9871jM0(name = "menuItems")
    public void setMenuCustomItems(C11141tH0 c11141tH0, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        if (readableArray == null) {
            webView.setMenuCustomItems(null);
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        O90.m5966d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        webView.setMenuCustomItems(arrayList);
    }

    @InterfaceC9871jM0(name = "messagingEnabled")
    public void setMessagingEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().setMessagingEnabled(z);
    }

    @InterfaceC9871jM0(name = "messagingModuleName")
    public void setMessagingModuleName(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().f29034f = str;
    }

    @InterfaceC9871jM0(name = "minimumFontSize")
    public void setMinimumFontSize(C11141tH0 c11141tH0, int i) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setMinimumFontSize(i);
    }

    @InterfaceC9871jM0(name = "mixedContentMode")
    public void setMixedContentMode(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        if (str == null || "never".equals(str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if ("always".equals(str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if ("compatibility".equals(str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    @InterfaceC9871jM0(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().f29040l = z;
    }

    @InterfaceC9871jM0(name = "overScrollMode")
    public void setOverScrollMode(C11141tH0 c11141tH0, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        int i = 0;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1414557169) {
                str.equals("always");
            } else if (iHashCode != 104712844) {
                if (iHashCode == 951530617 && str.equals(RemoteMessageConst.Notification.CONTENT)) {
                    i = 1;
                }
            } else if (str.equals("never")) {
                i = 2;
            }
        }
        webView.setOverScrollMode(i);
    }

    @InterfaceC9871jM0(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setSaveFormData(!z);
    }

    @InterfaceC9871jM0(name = "scalesPageToFit")
    public void setScalesPageToFit(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @InterfaceC9871jM0(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setBuiltInZoomControls(z);
    }

    @InterfaceC9871jM0(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setDisplayZoomControls(z);
    }

    @InterfaceC9871jM0(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setSupportMultipleWindows(z);
    }

    @InterfaceC9871jM0(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().setHorizontalScrollBarEnabled(z);
    }

    @InterfaceC9871jM0(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().setVerticalScrollBarEnabled(z);
    }

    @InterfaceC9871jM0(name = "source")
    public void setSource(C11141tH0 c11141tH0, ReadableMap readableMap) {
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c10373nH0.f38237f = readableMap;
    }

    @InterfaceC9871jM0(name = "textZoom")
    public void setTextZoom(C11141tH0 c11141tH0, int i) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c11141tH0.getWebView().getSettings().setTextZoom(i);
    }

    @InterfaceC9871jM0(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(c11141tH0.getWebView(), z);
    }

    @InterfaceC9871jM0(name = "userAgent")
    public void setUserAgent(C11141tH0 c11141tH0, String str) {
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        c10373nH0.f38238g = str;
        c10373nH0.m23122b(c11141tH0);
    }

    @InterfaceC9871jM0(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(C11141tH0 c11141tH0, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        WebView.setWebContentsDebuggingEnabled(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(S91 s91, C11141tH0 c11141tH0) {
        C9733iH0 webView = c11141tH0.getWebView();
        C9861jH0 c9861jH0 = new C9861jH0();
        c9861jH0.f35015a = false;
        c9861jH0.f35016b = null;
        c9861jH0.f35017c = null;
        c9861jH0.f35018d = null;
        webView.setWebViewClient(c9861jH0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C11141tH0 createViewInstance(S91 s91) {
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(s91, "context");
        C9733iH0 c9733iH0 = new C9733iH0(s91);
        c9733iH0.f29032d = null;
        c9733iH0.f29033e = false;
        c9733iH0.f29037i = false;
        c9733iH0.f29039k = false;
        c9733iH0.f29040l = false;
        c9733iH0.f29044p = null;
        c9733iH0.f29035g = (RNCWebViewMessagingModule) ((S91) c9733iH0.getContext()).f10602a.getJSModule(RNCWebViewMessagingModule.class);
        C0328FC c0328fc = new C0328FC();
        c0328fc.f3086a = false;
        c9733iH0.f29041m = c0328fc;
        return c10373nH0.m23121a(s91, c9733iH0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C11141tH0 c11141tH0) {
        byte[] bytes;
        super.onAfterUpdateTransaction((RNCWebViewManager) c11141tH0);
        C10373nH0 c10373nH0 = this.mRNCWebViewManagerImpl;
        c10373nH0.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        ReadableMap readableMap = c10373nH0.f38237f;
        if (readableMap != null) {
            C9733iH0 webView = c11141tH0.getWebView();
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                String string2 = readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "";
                O90.m5965c(string);
                webView.loadDataWithBaseURL(string2, string, "text/html", "UTF-8", null);
            } else if (readableMap.hasKey("uri")) {
                String string3 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !url.equals(string3)) {
                    if (readableMap.hasKey("method") && D51.m1551j(readableMap.getString("method"), "POST")) {
                        if (readableMap.hasKey("body")) {
                            String string4 = readableMap.getString("body");
                            try {
                                O90.m5965c(string4);
                                Charset charsetForName = Charset.forName("UTF-8");
                                O90.m5967e(charsetForName, "forName(...)");
                                bytes = string4.getBytes(charsetForName);
                                O90.m5967e(bytes, "getBytes(...)");
                            } catch (UnsupportedEncodingException unused) {
                                O90.m5965c(string4);
                                bytes = string4.getBytes(AbstractC7038vr.f44561a);
                                O90.m5967e(bytes, "getBytes(...)");
                            }
                        } else {
                            bytes = null;
                        }
                        if (bytes == null) {
                            bytes = new byte[0];
                        }
                        O90.m5965c(string3);
                        webView.postUrl(string3, bytes);
                    } else {
                        HashMap map = new HashMap();
                        if (readableMap.hasKey("headers")) {
                            ReadableMap map2 = readableMap.getMap("headers");
                            O90.m5965c(map2);
                            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map2.keySetIterator();
                            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                                Locale locale = Locale.ENGLISH;
                                O90.m5967e(locale, "ENGLISH");
                                String lowerCase = strNextKey.toLowerCase(locale);
                                O90.m5967e(lowerCase, "toLowerCase(...)");
                                if ("user-agent".equals(lowerCase)) {
                                    webView.getSettings().setUserAgentString(map2.getString(strNextKey));
                                } else {
                                    map.put(strNextKey, map2.getString(strNextKey));
                                }
                            }
                        }
                        O90.m5965c(string3);
                        webView.loadUrl(string3, map);
                    }
                }
            } else {
                webView.loadUrl("about:blank");
            }
        }
        c10373nH0.f38237f = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C11141tH0 c11141tH0) {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        C9733iH0 webView = c11141tH0.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.setWebViewClient(null);
        webView.destroy();
        webView.f29043o = null;
        super.onDropViewInstance((RNCWebViewManager) c11141tH0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C11141tH0 c11141tH0, String str, ReadableArray readableArray) throws JSONException {
        this.mRNCWebViewManagerImpl.getClass();
        O90.m5968f(c11141tH0, "viewWrapper");
        O90.m5968f(str, "commandId");
        O90.m5968f(readableArray, "args");
        C9733iH0 webView = c11141tH0.getWebView();
        switch (str.hashCode()) {
            case -1241591313:
                if (str.equals("goBack")) {
                    webView.goBack();
                    break;
                }
                break;
            case -948122918:
                if (str.equals("stopLoading")) {
                    webView.stopLoading();
                    break;
                }
                break;
            case -934641255:
                if (str.equals("reload")) {
                    webView.reload();
                    break;
                }
                break;
            case -759238347:
                if (str.equals("clearCache")) {
                    webView.clearCache(readableArray.getBoolean(0));
                    break;
                }
                break;
            case -318289731:
                if (str.equals("goForward")) {
                    webView.goForward();
                    break;
                }
                break;
            case -265032709:
                if (str.equals("clearFormData")) {
                    webView.clearFormData();
                    break;
                }
                break;
            case 336631465:
                if (str.equals("loadUrl")) {
                    String string = readableArray.getString(0);
                    if (string == null) {
                        throw new RuntimeException("Arguments for loading an url are null!");
                    }
                    webView.f29041m.f3086a = false;
                    webView.loadUrl(string);
                    break;
                }
                break;
            case 903120263:
                if (str.equals("clearHistory")) {
                    webView.clearHistory();
                    break;
                }
                break;
            case 1280029577:
                if (str.equals("requestFocus")) {
                    webView.requestFocus();
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", readableArray.getString(0));
                        webView.evaluateJavascript("(function () {var event;var data = " + jSONObject + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();", null);
                        break;
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
                break;
            case 2104576510:
                if (str.equals("injectJavaScript")) {
                    webView.evaluateJavascript(readableArray.getString(0), null);
                    break;
                }
                break;
        }
        super.receiveCommand((RNCWebViewManager) c11141tH0, str, readableArray);
    }

    public C11141tH0 createViewInstance(S91 s91, C9733iH0 c9733iH0) {
        return this.mRNCWebViewManagerImpl.m23121a(s91, c9733iH0);
    }
}
