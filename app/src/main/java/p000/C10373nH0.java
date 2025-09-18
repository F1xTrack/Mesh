package p000;

import android.app.Activity;
import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.WebSettings;
import com.facebook.react.bridge.ReadableMap;
import com.reactnativecommunity.webview.RNCWebViewModule;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: nH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10373nH0 {

    /* renamed from: a */
    public boolean f38232a;

    /* renamed from: b */
    public boolean f38233b;

    /* renamed from: c */
    public String f38234c;

    /* renamed from: d */
    public String f38235d;

    /* renamed from: e */
    public boolean f38236e;

    /* renamed from: f */
    public ReadableMap f38237f;

    /* renamed from: g */
    public String f38238g;

    /* renamed from: h */
    public String f38239h;

    /* renamed from: a */
    public final C11141tH0 m23121a(S91 s91, final C9733iH0 c9733iH0) {
        O90.m5968f(s91, "context");
        O90.m5968f(c9733iH0, "webView");
        m23123c(c9733iH0);
        s91.addLifecycleEventListener(c9733iH0);
        WebSettings settings = c9733iH0.getSettings();
        O90.m5967e(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        c9733iH0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c9733iH0.setDownloadListener(new DownloadListener() { // from class: kH0
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) throws UnsupportedEncodingException {
                String strSubstring;
                int iLastIndexOf;
                Matcher matcher;
                String strDecode;
                int iLastIndexOf2;
                C9733iH0 c9733iH02 = c9733iH0;
                O90.m5968f(c9733iH02, "$webView");
                C10373nH0 c10373nH0 = this;
                O90.m5968f(c10373nH0, "this$0");
                c9733iH02.setIgnoreErrFailedForThisURL(str);
                RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) c9733iH02.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
                if (rNCWebViewModule == null) {
                    return;
                }
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    Pattern pattern = AbstractC7377Bf1.f970a;
                    String strSubstring2 = null;
                    if (str3 != null) {
                        try {
                            matcher = AbstractC7377Bf1.f970a.matcher(str3);
                        } catch (IllegalStateException unused) {
                        }
                        if (!matcher.find()) {
                            strSubstring = null;
                        } else if (matcher.group(3) == null || matcher.group(4) == null) {
                            strSubstring = matcher.group(2);
                        } else {
                            try {
                                strSubstring = URLDecoder.decode(matcher.group(4), matcher.group(3).isEmpty() ? "UTF-8" : matcher.group(3));
                            } catch (UnsupportedEncodingException unused2) {
                            }
                        }
                        if (strSubstring != null && (iLastIndexOf = strSubstring.lastIndexOf(47) + 1) > 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf);
                        }
                    } else {
                        strSubstring = null;
                    }
                    if (strSubstring == null && (strDecode = Uri.decode(str)) != null) {
                        int iIndexOf = strDecode.indexOf(63);
                        if (iIndexOf > 0) {
                            strDecode = strDecode.substring(0, iIndexOf);
                        }
                        if (!strDecode.endsWith("/") && (iLastIndexOf2 = strDecode.lastIndexOf(47) + 1) > 0) {
                            strSubstring = strDecode.substring(iLastIndexOf2);
                        }
                    }
                    if (strSubstring == null) {
                        strSubstring = "downloadfile";
                    }
                    int iIndexOf2 = strSubstring.indexOf(46);
                    if (iIndexOf2 < 0) {
                        if (str4 != null && (strSubstring2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4)) != null) {
                            strSubstring2 = ".".concat(strSubstring2);
                        }
                        if (strSubstring2 == null) {
                            strSubstring2 = (str4 == null || !str4.toLowerCase(Locale.ROOT).startsWith("text/")) ? ".bin" : str4.equalsIgnoreCase("text/html") ? ".html" : ".txt";
                        }
                    } else {
                        if (str4 != null) {
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring.substring(strSubstring.lastIndexOf(46) + 1));
                            if (mimeTypeFromExtension != null && !mimeTypeFromExtension.equalsIgnoreCase(str4) && (strSubstring2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4)) != null) {
                                strSubstring2 = ".".concat(strSubstring2);
                            }
                        }
                        if (strSubstring2 == null) {
                            strSubstring2 = strSubstring.substring(iIndexOf2);
                        }
                        strSubstring = strSubstring.substring(0, iIndexOf2);
                    }
                    String str5 = strSubstring + strSubstring2;
                    O90.m5965c(str5);
                    String strReplaceAll = AbstractC10501oH0.f38939a.f17471a.matcher(str5).replaceAll("_");
                    O90.m5967e(strReplaceAll, "replaceAll(...)");
                    String strConcat = "Downloading ".concat(strReplaceAll);
                    try {
                        URL url = new URL(str);
                        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                    } catch (MalformedURLException unused3) {
                    }
                    request.addRequestHeader("User-Agent", str2);
                    request.setTitle(strReplaceAll);
                    request.setDescription(strConcat);
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strReplaceAll);
                    rNCWebViewModule.setDownloadRequest(request);
                    String str6 = c10373nH0.f38234c;
                    if (str6 == null) {
                        str6 = "Downloading";
                    }
                    String str7 = c10373nH0.f38235d;
                    if (str7 == null) {
                        str7 = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
                    }
                    if (rNCWebViewModule.grantFileDownloaderPermissions(str6, str7)) {
                        String str8 = c10373nH0.f38234c;
                        rNCWebViewModule.downloadFile(str8 != null ? str8 : "Downloading");
                    }
                } catch (IllegalArgumentException unused4) {
                }
            }
        });
        return new C11141tH0(s91, c9733iH0);
    }

    /* renamed from: b */
    public final void m23122b(C11141tH0 c11141tH0) {
        C9733iH0 webView = c11141tH0.getWebView();
        if (this.f38238g != null) {
            webView.getSettings().setUserAgentString(this.f38238g);
        } else if (this.f38239h != null) {
            webView.getSettings().setUserAgentString(this.f38239h);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    /* renamed from: c */
    public final void m23123c(C9733iH0 c9733iH0) {
        Activity currentActivity = c9733iH0.getThemedReactContext().f10602a.getCurrentActivity();
        if (this.f38232a && currentActivity != null) {
            C10245mH0 c10245mH0 = new C10245mH0(c9733iH0, currentActivity, currentActivity.getRequestedOrientation());
            c10245mH0.f26646k = this.f38233b;
            c10245mH0.f26647l = this.f38236e;
            c9733iH0.setWebChromeClient(c10245mH0);
            return;
        }
        AbstractC9221eH0 abstractC9221eH0 = (AbstractC9221eH0) c9733iH0.getWebChromeClient();
        if (abstractC9221eH0 != null) {
            abstractC9221eH0.onHideCustomView();
        }
        C10117lH0 c10117lH0 = new C10117lH0(c9733iH0);
        c10117lH0.f26646k = this.f38233b;
        c10117lH0.f26647l = this.f38236e;
        c9733iH0.setWebChromeClient(c10117lH0);
    }
}
