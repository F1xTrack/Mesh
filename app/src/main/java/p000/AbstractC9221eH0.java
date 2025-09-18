package p000;

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
public abstract class AbstractC9221eH0 extends WebChromeClient implements LifecycleEventListener {

    /* renamed from: n */
    public static final FrameLayout.LayoutParams f26635n = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: a */
    public final C9733iH0 f26636a;

    /* renamed from: b */
    public View f26637b;

    /* renamed from: c */
    public WebChromeClient.CustomViewCallback f26638c;

    /* renamed from: d */
    public PermissionRequest f26639d;

    /* renamed from: e */
    public ArrayList f26640e;

    /* renamed from: f */
    public GeolocationPermissions.Callback f26641f;

    /* renamed from: g */
    public String f26642g;

    /* renamed from: h */
    public boolean f26643h = false;

    /* renamed from: i */
    public final ArrayList f26644i = new ArrayList();

    /* renamed from: j */
    public C0328FC f26645j = null;

    /* renamed from: k */
    public boolean f26646k = false;

    /* renamed from: l */
    public boolean f26647l = false;

    /* renamed from: m */
    public final C8450Vw0 f26648m = new C8450Vw0(5, this);

    public AbstractC9221eH0(C9733iH0 c9733iH0) {
        this.f26636a = c9733iH0;
    }

    /* renamed from: a */
    public final synchronized void m17895a(List list) {
        if (this.f26643h) {
            this.f26644i.addAll(list);
            return;
        }
        ComponentCallbacks2 currentActivity = this.f26636a.getThemedReactContext().f10602a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof PA0)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        this.f26643h = true;
        ((AbstractActivityC11909zJ0) ((PA0) currentActivity)).m26369k((String[]) list.toArray(new String[0]), 3, this.f26648m);
        this.f26644i.clear();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f26647l) {
            webView2.setWebViewClient(new C9093dH0(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (AbstractC3982eJ.m17899a(this.f26636a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f26641f = callback;
        this.f26642g = str;
        m17895a(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        View view = this.f26637b;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.f26637b.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f26640e = new ArrayList();
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
                if (this.f26646k) {
                    this.f26640e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (AbstractC3982eJ.m17899a(this.f26636a.getThemedReactContext(), str) == 0) {
                    this.f26640e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f26640e.toArray(new String[0]));
            this.f26640e = null;
        } else {
            this.f26639d = permissionRequest;
            m17895a(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        String url = webView.getUrl();
        if (this.f26645j.f3086a) {
            return;
        }
        int iM24864a = C11141tH0.m24864a(webView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", iM24864a);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putString("url", url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble("progress", i / 100.0f);
        OZ1.m6091b(this.f26636a.getThemedReactContext(), iM24864a).mo11046g(new C4004ef(iM24864a, writableMapCreateMap, 12, false));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((RNCWebViewModule) this.f26636a.getThemedReactContext().f10602a.getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }
}
