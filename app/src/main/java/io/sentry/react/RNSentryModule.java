package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.AbstractActivityC1730l;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.common.Scopes;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.p019vk.push.core.base.AidlException;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.yandex.metrica.C2460e;
import io.sentry.AbstractC5802S0;
import io.sentry.C5754C;
import io.sentry.C5759D1;
import io.sentry.C5782L0;
import io.sentry.C6017f;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.android.core.AbstractC5840L;
import io.sentry.android.core.AbstractC5851X;
import io.sentry.android.core.AbstractC5911t;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5835G;
import io.sentry.android.core.C5841M;
import io.sentry.android.core.C5847T;
import io.sentry.android.core.C5852Y;
import io.sentry.android.core.C5900p;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.android.core.internal.util.C5882b;
import io.sentry.android.core.internal.util.C5893m;
import io.sentry.android.core.performance.C5902b;
import io.sentry.android.core.performance.C5905e;
import io.sentry.android.core.performance.C5906f;
import io.sentry.android.replay.RunnableC5958r;
import io.sentry.cache.RunnableC5994f;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6083F;
import io.sentry.protocol.C6085a;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6104t;
import io.sentry.util.AbstractC6168a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.C6244jY;
import p000.C7655Go1;
import p000.C9708i41;
import p000.H30;

/* loaded from: classes2.dex */
public class RNSentryModule extends ReactContextBaseJavaModule {
    private final C6120d impl;

    public RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new C6120d(reactApplicationContext);
    }

    @ReactMethod
    public void addBreadcrumb(ReadableMap readableMap) {
        this.impl.getClass();
        AbstractC5802S0.m21464b(new C7655Go1(6, readableMap));
    }

    @ReactMethod
    public void addListener(String str) {
        this.impl.getClass();
        C6120d.f34519l.mo21407k(EnumC6069n1.ERROR, "addListener of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        if (r12 == 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        if (r12 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fa, code lost:
    
        if (r12 == 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
    
        if (r12 == 4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
    
        r4 = r14 + 1;
        r8[r14] = (byte) (r13 >> 10);
        r14 = r14 + 2;
        r8[r4] = (byte) (r13 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0110, code lost:
    
        r8[r14] = (byte) (r13 >> 4);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0119, code lost:
    
        if (r14 != r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
    
        r4 = new byte[r14];
        java.lang.System.arraycopy(r8, 0, r4, 0, r14);
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0127, code lost:
    
        if (r19.hasKey("hardCrashed") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012d, code lost:
    
        if (r19.getBoolean("hardCrashed") != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0130, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0131, code lost:
    
        io.sentry.android.core.AbstractC5911t.m21621b(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        io.sentry.react.C6120d.f34519l.mo21407k(io.sentry.EnumC6069n1.ERROR, "Error while capturing envelope", new java.lang.Object[0]);
        r20.resolve(java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void captureEnvelope(java.lang.String r18, com.facebook.react.bridge.ReadableMap r19, com.facebook.react.bridge.Promise r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.react.RNSentryModule.captureEnvelope(java.lang.String, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void captureReplay(boolean z, Promise promise) {
        C6104t c6104t;
        this.impl.getClass();
        AbstractC5802S0.m21465c().mo21364A().getReplayController().mo21392a(Boolean.valueOf(z));
        AtomicReference atomicReference = new AtomicReference();
        AbstractC5802S0.m21464b(new C5841M(2, atomicReference));
        C5782L0 c5782l0 = (C5782L0) atomicReference.get();
        String string = null;
        if (c5782l0 != null && (c6104t = c5782l0.f33322r) != C6104t.f34442b) {
            string = c6104t.toString();
        }
        promise.resolve(string);
    }

    @ReactMethod
    public void captureScreenshot(Promise promise) throws InterruptedException {
        byte[] bArr;
        Activity currentActivity = this.impl.f34523a.getCurrentActivity();
        C5847T c5847t = C6120d.f34519l;
        if (currentActivity == null) {
            c5847t.mo21407k(EnumC6069n1.WARNING, "CurrentActivity is null, can't capture screenshot.", new Object[0]);
            promise.resolve(null);
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        byte[][] bArr2 = {new byte[0]};
        RunnableC5958r runnableC5958r = new RunnableC5958r(bArr2, currentActivity, countDownLatch, 3);
        if (UiThreadUtil.isOnUiThread()) {
            runnableC5958r.run();
        } else {
            UiThreadUtil.runOnUiThread(runnableC5958r);
        }
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
            bArr = bArr2[0];
        } catch (InterruptedException unused) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "Screenshot process was interrupted.", new Object[0]);
            bArr = new byte[0];
        }
        if (bArr == null || bArr.length == 0) {
            c5847t.mo21407k(EnumC6069n1.WARNING, "Screenshot is null, screen was not captured.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (byte b : bArr) {
            writableNativeArray.pushInt(b);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("contentType", ClipboardModule.MIMETYPE_PNG);
        writableNativeMap.putArray("data", writableNativeArray);
        writableNativeMap.putString("filename", "screenshot.png");
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        writableNativeArray2.pushMap(writableNativeMap);
        promise.resolve(writableNativeArray2);
    }

    @ReactMethod
    public void clearBreadcrumbs() {
        this.impl.getClass();
        AbstractC5802S0.m21464b(new C5754C(7));
    }

    @ReactMethod
    public void closeNativeSdk(Promise promise) {
        FrameMetricsAggregator frameMetricsAggregator;
        C6120d c6120d = this.impl;
        c6120d.getClass();
        AbstractC5802S0.m21463a();
        if (c6120d.f34526d && (frameMetricsAggregator = c6120d.f34525c) != null) {
            frameMetricsAggregator.f16089a.mo2455n();
            c6120d.f34525c = null;
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void crash() {
        this.impl.getClass();
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    @ReactMethod
    public void crashedLastRun(Promise promise) {
        this.impl.getClass();
        promise.resolve(AbstractC5802S0.m21465c().mo21378x());
    }

    @ReactMethod
    public void disableNativeFramesTracking() {
        FrameMetricsAggregator frameMetricsAggregator;
        C6120d c6120d = this.impl;
        if (!c6120d.f34526d || (frameMetricsAggregator = c6120d.f34525c) == null) {
            return;
        }
        frameMetricsAggregator.f16089a.mo2455n();
        c6120d.f34525c = null;
    }

    @ReactMethod
    public void enableNativeFramesTracking() {
        C6120d c6120d = this.impl;
        c6120d.f34526d = true;
        c6120d.f34525c = new FrameMetricsAggregator();
        Activity currentActivity = c6120d.f34523a.getCurrentActivity();
        FrameMetricsAggregator frameMetricsAggregator = c6120d.f34525c;
        C5847T c5847t = C6120d.f34519l;
        if (frameMetricsAggregator == null || currentActivity == null) {
            c5847t.mo21407k(EnumC6069n1.INFO, "currentActivity isn't available.", new Object[0]);
            return;
        }
        try {
            frameMetricsAggregator.f16089a.mo2450a(currentActivity);
            c5847t.mo21407k(EnumC6069n1.INFO, "FrameMetricsAggregator installed.", new Object[0]);
        } catch (Throwable unused) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "Error adding Activity to frameMetricsAggregator.", new Object[0]);
        }
    }

    @ReactMethod
    public void fetchModules(Promise promise) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.impl.f34523a.getResources().getAssets().open("modules.json"));
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                bufferedInputStream.close();
                promise.resolve(new String(bArr, C6120d.f34521n));
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            promise.resolve(null);
        } catch (Throwable unused2) {
            C6120d.f34519l.mo21407k(EnumC6069n1.WARNING, "Fetching JS Modules failed.", new Object[0]);
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void fetchNativeAppStart(Promise promise) {
        this.impl.getClass();
        C5905e c5905eM21604c = C5905e.m21604c();
        ArrayList arrayList = new ArrayList();
        C5906f c5906f = new C5906f();
        c5906f.m21613e(c5905eM21604c.f33821c.f33834c);
        C5906f c5906f2 = c5905eM21604c.f33821c;
        c5906f.f33833b = c5906f2.f33833b;
        c5906f.f33835d = C5905e.f33817n;
        c5906f.f33832a = "Process Initialization";
        AbstractC5911t.m21620a(c5906f, arrayList);
        AbstractC5911t.m21620a(c5905eM21604c.f33823e, arrayList);
        ArrayList arrayList2 = new ArrayList(c5905eM21604c.f33824f.values());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC5911t.m21620a((C5906f) it.next(), arrayList);
        }
        ArrayList arrayList3 = new ArrayList(c5905eM21604c.f33825g);
        Collections.sort(arrayList3);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            C5902b c5902b = (C5902b) it2.next();
            AbstractC5911t.m21620a(c5902b.f33812a, arrayList);
            AbstractC5911t.m21620a(c5902b.f33813b, arrayList);
        }
        HashMap map = new HashMap();
        map.put("spans", arrayList);
        map.put("type", c5905eM21604c.f33819a.toString().toLowerCase(Locale.ROOT));
        if (c5906f2.m21611c()) {
            map.put("app_start_timestamp_ms", Long.valueOf(c5906f2.f33833b));
        }
        C5847T c5847t = C6120d.f34519l;
        if (!C5905e.m21604c().f33820b) {
            c5847t.mo21407k(EnumC6069n1.WARNING, "Invalid app start data: app not launched in foreground.", new Object[0]);
            promise.resolve(null);
        } else {
            WritableMap writableMap = (WritableMap) AbstractC6117a.m21854a(map);
            writableMap.putBoolean("has_fetched", C6120d.f34522o);
            C6120d.f34522o = true;
            promise.resolve(writableMap);
        }
    }

    @ReactMethod
    public void fetchNativeDeviceContexts(Promise promise) {
        C6120d c6120d = this.impl;
        c6120d.getClass();
        C5759D1 c5759d1Mo21364A = AbstractC5802S0.m21465c().mo21364A();
        Context applicationContext = c6120d.f34523a.getApplicationContext();
        AtomicReference atomicReference = new AtomicReference();
        AbstractC5802S0.m21464b(new C5841M(2, atomicReference));
        C5782L0 c5782l0 = (C5782L0) atomicReference.get();
        if (!(c5759d1Mo21364A instanceof SentryAndroidOptions)) {
            promise.resolve(null);
            return;
        }
        if (applicationContext == null) {
            promise.resolve(null);
            return;
        }
        if (c5782l0 != null) {
            Iterator it = c5782l0.f33310f.f33437a.iterator();
            while (it.hasNext()) {
                if ("react-native".equals(((C6017f) it.next()).f34149g)) {
                    it.remove();
                }
            }
        }
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c5759d1Mo21364A;
        HashMap map = new HashMap();
        if (c5782l0 != null) {
            try {
                C6087c c6087c = c5782l0.f33319o;
                ILogger logger = sentryAndroidOptions.getLogger();
                C2460e c2460e = new C2460e(map);
                ArrayDeque arrayDeque = (ArrayDeque) c2460e.f20786a;
                C5835G c5835gM21526c = C5835G.m21526c(applicationContext, sentryAndroidOptions);
                c6087c.put("device", c5835gM21526c.m21528a(true, true));
                c6087c.put("os", c5835gM21526c.f33538f);
                C6082E c6082e = c5782l0.f33306b;
                if (c6082e == null) {
                    c6082e = new C6082E();
                    c5782l0.m21416g(c6082e);
                }
                if (c6082e.f34289b == null) {
                    try {
                        c6082e.f34289b = AbstractC5840L.m21534a(applicationContext);
                    } catch (RuntimeException e) {
                        logger.mo21406d(EnumC6069n1.ERROR, "Could not retrieve installation ID", e);
                    }
                }
                C6085a c6085a = (C6085a) c5782l0.f33319o.m21852d(C6085a.class, "app");
                if (c6085a == null) {
                    c6085a = new C6085a();
                }
                c6085a.f34316e = AbstractC5911t.m21624e(applicationContext, sentryAndroidOptions.getLogger());
                C5906f c5906fM21606b = C5905e.m21604c().m21606b(sentryAndroidOptions);
                if (c5906fM21606b.m21611c()) {
                    c6085a.f34313b = c5906fM21606b.m21610b() == null ? null : AbstractC6003a.m21753l(Double.valueOf(r9.f34270a / 1000000.0d).longValue());
                }
                C5832D c5832d = new C5832D(sentryAndroidOptions.getLogger());
                PackageInfo packageInfoM21629j = AbstractC5911t.m21629j(applicationContext, 4096, sentryAndroidOptions.getLogger(), c5832d);
                if (packageInfoM21629j != null) {
                    AbstractC5911t.m21640u(packageInfoM21629j, c5832d, c6085a);
                }
                c5782l0.f33319o.m21850b(c6085a);
                arrayDeque.add("user");
                c2460e.m13807E(logger, c5782l0.f33306b);
                arrayDeque.add("contexts");
                c2460e.m13807E(logger, c5782l0.f33319o);
                arrayDeque.add("tags");
                c2460e.m13807E(logger, AbstractC6003a.m21732A(c5782l0.f33311g));
                arrayDeque.add("extras");
                c2460e.m13807E(logger, c5782l0.f33312h);
                arrayDeque.add(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
                c2460e.m13807E(logger, c5782l0.f33309e);
                arrayDeque.add("level");
                c2460e.m13807E(logger, null);
                arrayDeque.add("breadcrumbs");
                c2460e.m13807E(logger, c5782l0.f33310f);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Could not serialize scope.", th);
                map = new HashMap();
            }
        }
        promise.resolve(AbstractC6117a.m21854a(map));
    }

    @ReactMethod
    public void fetchNativeFrames(Promise promise) {
        int i;
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        C6120d c6120d = this.impl;
        if (!(c6120d.f34526d && c6120d.f34525c != null)) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray[] sparseIntArrayArrMo2452k = c6120d.f34525c.f16089a.mo2452k();
            if (sparseIntArrayArrMo2452k == null || (sparseIntArray = sparseIntArrayArrMo2452k[0]) == null) {
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                    int iKeyAt = sparseIntArray.keyAt(i4);
                    int iValueAt = sparseIntArray.valueAt(i4);
                    i += iValueAt;
                    if (iKeyAt > 700) {
                        i3 += iValueAt;
                    } else if (iKeyAt > 16) {
                        i2 += iValueAt;
                    }
                }
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("totalFrames", i);
            writableMapCreateMap.putInt("slowFrames", i2);
            writableMapCreateMap.putInt("frozenFrames", i3);
            promise.resolve(writableMapCreateMap);
        } catch (Throwable unused) {
            C6120d.f34519l.mo21407k(EnumC6069n1.WARNING, "Error fetching native frames.", new Object[0]);
            promise.resolve(null);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String fetchNativePackageName() {
        return this.impl.f34524b.packageName;
    }

    @ReactMethod
    public void fetchNativeRelease(Promise promise) {
        C6120d c6120d = this.impl;
        c6120d.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        PackageInfo packageInfo = c6120d.f34524b;
        writableMapCreateMap.putString(NotificationConstants.f19487ID, packageInfo.packageName);
        writableMapCreateMap.putString("version", packageInfo.versionName);
        writableMapCreateMap.putString("build", String.valueOf(packageInfo.versionCode));
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void fetchNativeSdkInfo(Promise promise) {
        this.impl.getClass();
        C6102r sdkVersion = AbstractC5802S0.m21465c().mo21364A().getSdkVersion();
        if (sdkVersion == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("name", sdkVersion.f34430a);
        writableNativeMap.putString("version", sdkVersion.f34431b);
        promise.resolve(writableNativeMap);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap fetchNativeStackFramesBy(ReadableArray readableArray) {
        return null;
    }

    @ReactMethod
    public void fetchViewHierarchy(Promise promise) {
        Activity currentActivity = this.impl.f34523a.getCurrentActivity();
        C5847T c5847t = C6120d.f34519l;
        C6083F c6083fM21552d = ViewHierarchyEventProcessor.m21552d(currentActivity, new ArrayList(0), C5882b.f33751b, c5847t);
        if (c6083fM21552d == null) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "Could not get ViewHierarchy.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] bArrM21878b = AbstractC6168a.m21878b(AbstractC5802S0.m21465c().mo21364A().getSerializer(), c5847t, c6083fM21552d);
        if (bArrM21878b == null) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "Could not serialize ViewHierarchy.", new Object[0]);
            promise.resolve(null);
        } else {
            if (bArrM21878b.length < 1) {
                c5847t.mo21407k(EnumC6069n1.ERROR, "Got empty bytes array after serializing ViewHierarchy.", new Object[0]);
                promise.resolve(null);
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (byte b : bArrM21878b) {
                writableNativeArray.pushInt(b);
            }
            promise.resolve(writableNativeArray);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCurrentReplayId() {
        C6104t c6104t;
        this.impl.getClass();
        AtomicReference atomicReference = new AtomicReference();
        AbstractC5802S0.m21464b(new C5841M(2, atomicReference));
        C5782L0 c5782l0 = (C5782L0) atomicReference.get();
        if (c5782l0 == null || (c6104t = c5782l0.f33322r) == C6104t.f34442b) {
            return null;
        }
        return c6104t.toString();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSentry";
    }

    @ReactMethod
    public void getNewScreenTimeToDisplay(Promise promise) {
        C5852Y c5852y = this.impl.f34533k;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            promise.reject("GetTimeToDisplay is not able to measure the time to display: Main looper not available.");
        } else {
            new Handler(mainLooper).post(new RunnableC5994f(c5852y, 6, promise));
        }
    }

    @ReactMethod
    public void initNativeReactNavigationNewFrameTracking(Promise promise) {
        C6244jY c6244jYM10034e;
        C6120d c6120d = this.impl;
        C6125i c6125i = new C6125i(C6120d.f34520m, c6120d.f34532j);
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) c6120d.f34523a.getCurrentActivity();
        if (abstractActivityC1730l == null || (c6244jYM10034e = abstractActivityC1730l.m10034e()) == null) {
            return;
        }
        c6244jYM10034e.m10052R(c6125i);
    }

    @ReactMethod
    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        C6120d c6120d = this.impl;
        c6120d.getClass();
        H30 h30 = new H30(c6120d, 29, readableMap);
        AbstractC5851X.m21555b(c6120d.f34523a, new C5847T(), h30);
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void removeListeners(double d) {
        this.impl.getClass();
        C6120d.f34519l.mo21407k(EnumC6069n1.ERROR, "removeListeners of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    @ReactMethod
    public void setContext(String str, ReadableMap readableMap) {
        this.impl.getClass();
        if (str == null) {
            C6120d.f34519l.mo21407k(EnumC6069n1.ERROR, "RNSentry.setContext called with null key, can't change context.", new Object[0]);
        } else {
            AbstractC5802S0.m21464b(new C6119c(readableMap, str));
        }
    }

    @ReactMethod
    public void setExtra(String str, String str2) {
        this.impl.getClass();
        if (str == null || str2 == null) {
            C6120d.f34519l.mo21407k(EnumC6069n1.ERROR, "RNSentry.setExtra called with null key or value, can't change extra.", new Object[0]);
        } else {
            AbstractC5802S0.m21464b(new C6118b(str, str2, 0));
        }
    }

    @ReactMethod
    public void setTag(String str, String str2) {
        this.impl.getClass();
        AbstractC5802S0.m21464b(new C6118b(str, str2, 1));
    }

    @ReactMethod
    public void setUser(ReadableMap readableMap, ReadableMap readableMap2) {
        this.impl.getClass();
        AbstractC5802S0.m21464b(new H30(readableMap, 27, readableMap2));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap startProfiling(boolean z) {
        C6120d c6120d = this.impl;
        c6120d.getClass();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (c6120d.f34527e == null && z) {
            if (c6120d.f34531i == null) {
                c6120d.f34531i = new C2460e(4, false);
            }
            String str = c6120d.f34530h;
            ReactApplicationContext reactApplicationContext = c6120d.f34523a;
            if (str == null) {
                c6120d.f34530h = new File(reactApplicationContext.getCacheDir(), "sentry/react").getAbsolutePath();
            }
            File file = new File(c6120d.f34530h, "profiling_trace");
            file.mkdirs();
            String absolutePath = file.getAbsolutePath();
            int micros = ((int) TimeUnit.SECONDS.toMicros(1L)) / AidlException.ILLEGAL_ARGUMENT_EXCEPTION;
            C5847T c5847t = C6120d.f34519l;
            C5832D c5832d = C6120d.f34520m;
            c6120d.f34527e = new C5900p(absolutePath, micros, new C5893m(reactApplicationContext, c5847t, c5832d), c6120d.f34531i, c5847t, c5832d);
        }
        try {
            HermesSamplingProfiler.enable();
            C5900p c5900p = c6120d.f34527e;
            if (c5900p != null) {
                c5900p.m21603c();
            }
            writableNativeMap.putBoolean("started", true);
        } catch (Throwable th) {
            writableNativeMap.putBoolean("started", false);
            writableNativeMap.putString("error", th.toString());
        }
        return writableNativeMap;
    }

    /* JADX WARN: Finally extract failed */
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap stopProfiling() {
        C6120d c6120d = this.impl;
        c6120d.getClass();
        C5847T c5847t = C6120d.f34519l;
        boolean zIsDebug = AbstractC5802S0.m21465c().mo21364A().isDebug();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        File fileCreateTempFile = null;
        try {
            C5900p c5900p = c6120d.f34527e;
            C9708i41 c9708i41M21601a = c5900p != null ? c5900p.m21601a(null, false) : null;
            HermesSamplingProfiler.disable();
            fileCreateTempFile = File.createTempFile("sampling-profiler-trace", ".cpuprofile", c6120d.f34523a.getCacheDir());
            if (zIsDebug) {
                c5847t.mo21407k(EnumC6069n1.INFO, "Profile saved to: " + fileCreateTempFile.getAbsolutePath(), new Object[0]);
            }
            HermesSamplingProfiler.dumpSampledTraceToFile(fileCreateTempFile.getPath());
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileCreateTempFile));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                String string = sb.toString();
                bufferedReader.close();
                writableNativeMap.putString(Scopes.PROFILE, string);
                if (c9708i41M21601a != null) {
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    try {
                        writableNativeMap2.putString("sampled_profile", new String(AbstractC6003a.m21746e(AbstractC6003a.m21733B(5242880L, ((File) c9708i41M21601a.f28813d).getPath())), "US-ASCII"));
                        C6120d.f34520m.getClass();
                        writableNativeMap2.putInt("android_api_level", Build.VERSION.SDK_INT);
                        writableNativeMap2.putString("build_id", c6120d.m21855a());
                        writableNativeMap.putMap("androidProfile", writableNativeMap2);
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
                try {
                    if (!fileCreateTempFile.delete()) {
                        c5847t.mo21407k(EnumC6069n1.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    }
                } catch (Throwable unused) {
                    c5847t.mo21407k(EnumC6069n1.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                writableNativeMap.putString("error", th3.toString());
                if (fileCreateTempFile != null) {
                    try {
                        if (!fileCreateTempFile.delete()) {
                            c5847t.mo21407k(EnumC6069n1.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused2) {
                        c5847t.mo21407k(EnumC6069n1.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    }
                }
            } catch (Throwable th4) {
                if (fileCreateTempFile != null) {
                    try {
                        if (!fileCreateTempFile.delete()) {
                            c5847t.mo21407k(EnumC6069n1.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused3) {
                        c5847t.mo21407k(EnumC6069n1.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    }
                }
                throw th4;
            }
        }
        return writableNativeMap;
    }
}
