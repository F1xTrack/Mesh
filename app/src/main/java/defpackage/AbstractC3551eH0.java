package defpackage;

import android.content.ComponentCallbacks2;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.reactnativecommunity.webview.RNCWebViewModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: eH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3551eH0 extends WebChromeClient implements LifecycleEventListener {
    public static final FrameLayout.LayoutParams n = new FrameLayout.LayoutParams(-1, -1, 17);
    public final C4315iH0 a;
    public View b;
    public WebChromeClient.CustomViewCallback c;
    public PermissionRequest d;
    public ArrayList e;
    public GeolocationPermissions.Callback f;
    public String g;
    public boolean h = false;
    public final ArrayList i = new ArrayList();
    public FC j = null;
    public boolean k = false;
    public boolean l = false;
    public final C1724Vw0 m = new C1724Vw0(5, this);

    public AbstractC3551eH0(C4315iH0 c4315iH0) {
        this.a = c4315iH0;
    }

    public final synchronized void a(List list) {
        if (this.h) {
            this.i.addAll(list);
            return;
        }
        ComponentCallbacks2 currentActivity = this.a.getThemedReactContext().a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof PA0)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        this.h = true;
        ((AbstractActivityC8339zJ0) ((PA0) currentActivity)).k((String[]) list.toArray(new String[0]), 3, this.m);
        this.i.clear();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.l) {
            webView2.setWebViewClient(new C3361dH0(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (AbstractC3556eJ.a(this.a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f = callback;
        this.g = str;
        a(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        View view = this.b;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.b.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= length) {
                break;
            }
            String str2 = resources[i];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.k) {
                    this.e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (AbstractC3556eJ.a(this.a.getThemedReactContext(), str) == 0) {
                    this.e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.e.toArray(new String[0]));
            this.e = null;
        } else {
            this.d = permissionRequest;
            a(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        String url = webView.getUrl();
        if (this.j.a) {
            return;
        }
        int iA = C7191tH0.a(webView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", iA);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putString("url", url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble("progress", i / 100.0f);
        OZ1.b(this.a.getThemedReactContext(), iA).g(new C3622ef(iA, writableMapCreateMap, 12, false));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((RNCWebViewModule) this.a.getThemedReactContext().a.getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }
}
