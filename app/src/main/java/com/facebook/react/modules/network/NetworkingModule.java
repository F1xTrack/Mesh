package com.facebook.react.modules.network;

import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import p000.AbstractC11161tR0;
import p000.AbstractC11416vQ1;
import p000.AbstractC11511wA1;
import p000.AbstractC1374Vq;
import p000.AbstractC3929dS;
import p000.AsyncTaskC10069kv0;
import p000.C0303Eo;
import p000.C10457nx0;
import p000.C10585ox0;
import p000.C10689pl0;
import p000.C11600wt0;
import p000.C1339VH;
import p000.C1509Xz;
import p000.C7018vX;
import p000.C8540Xp0;
import p000.C9599hE0;
import p000.C9727iE0;
import p000.C9941jv0;
import p000.G10;
import p000.GN0;
import p000.GS0;
import p000.HS0;
import p000.II1;
import p000.IS0;
import p000.InterfaceC0327FB;
import p000.InterfaceC10197lv0;
import p000.InterfaceC10325mv0;
import p000.InterfaceC10453nv0;
import p000.InterfaceC10741q90;
import p000.InterfaceC6208iz;
import p000.InterfaceC9101dL0;
import p000.J20;
import p000.K20;
import p000.NQ1;
import p000.O90;
import p000.TJ0;

@InterfaceC9101dL0(name = "Networking")
/* loaded from: classes.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static InterfaceC0327FB customClientBuilder;
    private final C10585ox0 mClient;
    private final C7018vX mCookieHandler;
    private final InterfaceC6208iz mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<InterfaceC10197lv0> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<InterfaceC10325mv0> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<InterfaceC10453nv0> mUriHandlers;

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, C10585ox0 c10585ox0, List<Object> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            C10457nx0 c10457nx0M23579a = c10585ox0.m23579a();
            Iterator<Object> it = list.iterator();
            if (it.hasNext()) {
                AbstractC1374Vq.m8597p(it.next());
                throw null;
            }
            c10585ox0 = new C10585ox0(c10457nx0M23579a);
        }
        this.mClient = c10585ox0;
        this.mCookieHandler = new C7018vX();
        this.mCookieJarContainer = (InterfaceC6208iz) c10585ox0.f39380j;
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.mRequestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.mRequestIds.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void cancelRequest(int i) {
        new AsyncTaskC10069kv0(this, getReactApplicationContext(), i).execute(new Void[0]);
    }

    private C11600wt0 constructMultipartBody(ReadableArray readableArray, String str, int i) {
        C8540Xp0 c8540Xp0M25570c;
        C11600wt0 c11600wt0 = new C11600wt0();
        Pattern pattern = C8540Xp0.f13986d;
        C8540Xp0 c8540Xp0M25570c2 = AbstractC11511wA1.m25570c(str);
        O90.m5968f(c8540Xp0M25570c2, "type");
        if (!c8540Xp0M25570c2.f13989b.equals("multipart")) {
            throw new IllegalArgumentException(("multipart != " + c8540Xp0M25570c2).toString());
        }
        c11600wt0.f45156b = c8540Xp0M25570c2;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            K20 k20ExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (k20ExtractHeaders == null) {
                NQ1.m5674b(reactApplicationContextIfActiveOrWarn, i, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String strM4524b = k20ExtractHeaders.m4524b(CONTENT_TYPE_HEADER_NAME);
            if (strM4524b != null) {
                Pattern pattern2 = C8540Xp0.f13986d;
                c8540Xp0M25570c = AbstractC11511wA1.m25570c(strM4524b);
                J20 j20M4526i = k20ExtractHeaders.m4526i();
                j20M4526i.m4142i(CONTENT_TYPE_HEADER_NAME);
                k20ExtractHeaders = j20M4526i.m4140g();
            } else {
                c8540Xp0M25570c = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                String string = map.getString(REQUEST_BODY_KEY_STRING);
                O90.m5968f(string, RemoteMessageConst.Notification.CONTENT);
                c11600wt0.m25723a(k20ExtractHeaders, C10689pl0.m23864i(string, c8540Xp0M25570c));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                NQ1.m5674b(reactApplicationContextIfActiveOrWarn, i, "Unrecognized FormData part.", null);
            } else {
                if (c8540Xp0M25570c == null) {
                    NQ1.m5674b(reactApplicationContextIfActiveOrWarn, i, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string2 = map.getString(REQUEST_BODY_KEY_URI);
                InputStream inputStreamM25419c = AbstractC11416vQ1.m25419c(getReactApplicationContext(), string2);
                if (inputStreamM25419c == null) {
                    NQ1.m5674b(reactApplicationContextIfActiveOrWarn, i, "Could not retrieve file for uri " + string2, null);
                    return null;
                }
                c11600wt0.m25723a(k20ExtractHeaders, new C1509Xz(c8540Xp0M25570c, 3, inputStreamM25419c));
            }
        }
        return c11600wt0;
    }

    private K20 extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        J20 j20 = new J20();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String string = array.getString(0);
                StringBuilder sb = new StringBuilder(string.length());
                int length = string.length();
                boolean z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = string.charAt(i2);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        z = true;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                if (z) {
                    string = sb.toString();
                }
                String string2 = array.getString(1);
                if (string != null && string2 != null) {
                    j20.m4139f(string, string2);
                }
            }
            return null;
        }
        if (j20.m4141h(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            j20.m4135b(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            j20.m4142i(CONTENT_ENCODING_HEADER_NAME);
        }
        return j20.m4140g();
    }

    public HS0 lambda$sendRequestInternal$0(String str, ReactApplicationContext reactApplicationContext, int i, InterfaceC10741q90 interfaceC10741q90) throws IOException {
        GN0 gn0 = (GN0) interfaceC10741q90;
        HS0 hs0M3055b = gn0.m3055b(gn0.f3715e);
        C9727iE0 c9727iE0 = new C9727iE0(hs0M3055b.f4301g, new C9941jv0(str, reactApplicationContext, i));
        GS0 gs0M3429o = hs0M3055b.m3429o();
        gs0M3429o.f3747g = c9727iE0;
        return gs0M3429o.m3066a();
    }

    public void readWithProgress(int i, IS0 is0) throws IOException {
        long j;
        long jMo3383o = -1;
        try {
            C9727iE0 c9727iE0 = (C9727iE0) is0;
            j = c9727iE0.f28974d;
            try {
                jMo3383o = c9727iE0.f28971a.mo3383o();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        C1339VH c1339vh = new C1339VH(is0.mo3384p() == null ? StandardCharsets.UTF_8 : is0.mo3384p().m9156a(StandardCharsets.UTF_8));
        InputStream inputStreamM3876m = is0.m3876m();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int i2 = inputStreamM3876m.read(bArr);
                if (i2 == -1) {
                    return;
                }
                String strM8367i = c1339vh.m8367i(i2, bArr);
                WritableArray writableArrayCreateArray = Arguments.createArray();
                writableArrayCreateArray.pushInt(i);
                writableArrayCreateArray.pushString(strM8367i);
                writableArrayCreateArray.pushInt((int) j);
                writableArrayCreateArray.pushInt((int) jMo3383o);
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
                }
            }
        } finally {
            inputStreamM3876m.close();
        }
    }

    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    public static WritableMap translateHeaders(K20 k20) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < k20.size(); i++) {
            String strM4525d = k20.m4525d(i);
            if (bundle.containsKey(strM4525d)) {
                bundle.putString(strM4525d, bundle.getString(strM4525d) + ", " + k20.m4528q(i));
            } else {
                bundle.putString(strM4525d, k20.m4528q(i));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private AbstractC11161tR0 wrapRequestBodyWithProgressEmitter(AbstractC11161tR0 abstractC11161tR0, int i) {
        if (abstractC11161tR0 == null) {
            return null;
        }
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        C0303Eo c0303Eo = new C0303Eo();
        c0303Eo.f2909c = reactApplicationContextIfActiveOrWarn;
        c0303Eo.f2907a = i;
        c0303Eo.f2908b = System.nanoTime();
        return new C9599hE0(abstractC11161tR0, c0303Eo);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d) {
        int i = (int) d;
        cancelRequest(i);
        removeRequest(i);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(InterfaceC10197lv0 interfaceC10197lv0) {
        this.mRequestBodyHandlers.add(interfaceC10197lv0);
    }

    public void addResponseHandler(InterfaceC10325mv0 interfaceC10325mv0) {
        this.mResponseHandlers.add(interfaceC10325mv0);
    }

    public void addUriHandler(InterfaceC10453nv0 interfaceC10453nv0) {
        this.mUriHandlers.add(interfaceC10453nv0);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(final Callback callback) {
        CookieManager cookieManagerM25429a = this.mCookieHandler.m25429a();
        if (cookieManagerM25429a != null) {
            cookieManagerM25429a.removeAllCookies(new ValueCallback() { // from class: uX
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    callback.invoke((Boolean) obj);
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ((TJ0) this.mCookieJarContainer).f11322a = new G10(this.mCookieHandler);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.getClass();
        ((TJ0) this.mCookieJarContainer).f11322a = null;
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d) {
    }

    public void removeRequestBodyHandler(InterfaceC10197lv0 interfaceC10197lv0) {
        this.mRequestBodyHandlers.remove(interfaceC10197lv0);
    }

    public void removeResponseHandler(InterfaceC10325mv0 interfaceC10325mv0) {
        this.mResponseHandlers.remove(interfaceC10325mv0);
    }

    public void removeUriHandler(InterfaceC10453nv0 interfaceC10453nv0) {
        this.mUriHandlers.remove(interfaceC10453nv0);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2) {
        int i = (int) d;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, (int) d2, z2);
        } catch (Throwable th) {
            AbstractC3929dS.m17675h("Networking");
            NQ1.m5674b(getReactApplicationContextIfActiveOrWarn(), i, th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendRequestInternal(java.lang.String r17, java.lang.String r18, final int r19, com.facebook.react.bridge.ReadableArray r20, com.facebook.react.bridge.ReadableMap r21, final java.lang.String r22, boolean r23, int r24, boolean r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.network.NetworkingModule.sendRequestInternal(java.lang.String, java.lang.String, int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableMap, java.lang.String, boolean, int, boolean):void");
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, C10585ox0 c10585ox0) {
        this(reactApplicationContext, str, c10585ox0, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, II1.m3809c(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<Object> list) {
        this(reactApplicationContext, null, II1.m3809c(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, II1.m3809c(reactApplicationContext), null);
    }

    private static void applyCustomBuilder(C10457nx0 c10457nx0) {
    }

    public static void setCustomClientBuilder(InterfaceC0327FB interfaceC0327FB) {
    }
}
