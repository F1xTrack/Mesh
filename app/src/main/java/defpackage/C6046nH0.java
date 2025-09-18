package defpackage;

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
public final class C6046nH0 {
    public boolean a;
    public boolean b;
    public String c;
    public String d;
    public boolean e;
    public ReadableMap f;
    public String g;
    public String h;

    public final C7191tH0 a(S91 s91, final C4315iH0 c4315iH0) {
        O90.f(s91, "context");
        O90.f(c4315iH0, "webView");
        c(c4315iH0);
        s91.addLifecycleEventListener(c4315iH0);
        WebSettings settings = c4315iH0.getSettings();
        O90.e(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        c4315iH0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c4315iH0.setDownloadListener(new DownloadListener() { // from class: kH0
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) throws UnsupportedEncodingException {
                String strSubstring;
                int iLastIndexOf;
                Matcher matcher;
                String strDecode;
                int iLastIndexOf2;
                C4315iH0 c4315iH02 = c4315iH0;
                O90.f(c4315iH02, "$webView");
                C6046nH0 c6046nH0 = this;
                O90.f(c6046nH0, "this$0");
                c4315iH02.setIgnoreErrFailedForThisURL(str);
                RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) c4315iH02.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
                if (rNCWebViewModule == null) {
                    return;
                }
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    Pattern pattern = AbstractC0115Bf1.a;
                    String strSubstring2 = null;
                    if (str3 != null) {
                        try {
                            matcher = AbstractC0115Bf1.a.matcher(str3);
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
                    O90.c(str5);
                    String strReplaceAll = AbstractC6237oH0.a.a.matcher(str5).replaceAll("_");
                    O90.e(strReplaceAll, "replaceAll(...)");
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
                    String str6 = c6046nH0.c;
                    if (str6 == null) {
                        str6 = "Downloading";
                    }
                    String str7 = c6046nH0.d;
                    if (str7 == null) {
                        str7 = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
                    }
                    if (rNCWebViewModule.grantFileDownloaderPermissions(str6, str7)) {
                        String str8 = c6046nH0.c;
                        rNCWebViewModule.downloadFile(str8 != null ? str8 : "Downloading");
                    }
                } catch (IllegalArgumentException unused4) {
                }
            }
        });
        return new C7191tH0(s91, c4315iH0);
    }

    public final void b(C7191tH0 c7191tH0) {
        C4315iH0 webView = c7191tH0.getWebView();
        if (this.g != null) {
            webView.getSettings().setUserAgentString(this.g);
        } else if (this.h != null) {
            webView.getSettings().setUserAgentString(this.h);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    public final void c(C4315iH0 c4315iH0) {
        Activity currentActivity = c4315iH0.getThemedReactContext().a.getCurrentActivity();
        if (this.a && currentActivity != null) {
            C5855mH0 c5855mH0 = new C5855mH0(c4315iH0, currentActivity, currentActivity.getRequestedOrientation());
            c5855mH0.k = this.b;
            c5855mH0.l = this.e;
            c4315iH0.setWebChromeClient(c5855mH0);
            return;
        }
        AbstractC3551eH0 abstractC3551eH0 = (AbstractC3551eH0) c4315iH0.getWebChromeClient();
        if (abstractC3551eH0 != null) {
            abstractC3551eH0.onHideCustomView();
        }
        C5664lH0 c5664lH0 = new C5664lH0(c4315iH0);
        c5664lH0.k = this.b;
        c5664lH0.l = this.e;
        c4315iH0.setWebChromeClient(c5664lH0);
    }
}
