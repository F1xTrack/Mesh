package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.JavascriptException;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.p018my.tracker.obfuscated.C2304d;
import com.remoteconfig.RemoteConfigModule;
import com.rustorepush.RustorePushModule;
import com.rustorereview.RustoreReviewModule;
import com.swmansion.reanimated.ReanimatedModule;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.sentry.C5759D1;
import io.sentry.C5771H1;
import io.sentry.C5782L0;
import io.sentry.C6039i1;
import io.sentry.C6052j0;
import io.sentry.C6055k0;
import io.sentry.C6059l1;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5785M0;
import io.sentry.InterfaceC5799R0;
import io.sentry.InterfaceC5807U;
import io.sentry.InterfaceC5819Y;
import io.sentry.InterfaceC6009d0;
import io.sentry.InterfaceC6181v1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5847T;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC5875e;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6105u;
import io.sentry.react.C6118b;
import io.sentry.react.C6120d;
import io.sentry.react.C6126j;
import io.sentry.react.replay.C6128a;
import io.sentry.react.replay.C6129b;
import io.sentry.vendor.gson.stream.C6184a;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import ru.rustore.sdk.remoteconfig.RemoteConfig;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class H30 implements HmsLocalNotificationPicturesLoader.Callback, InterfaceC0750Lv, InterfaceC9713i70, InterfaceC6227jH, InterfaceC8571Ye1, InterfaceC9179dy0, InterfaceC1319Uy, InterfaceC6711qw, InterfaceC11423vU0, InterfaceC8036Nx0, InterfaceC0363Fl, InterfaceC6471n9, InterfaceC11886z71, InterfaceC8244Rx0, InterfaceC6009d0, InterfaceC5785M0, InterfaceC6181v1, InterfaceC5799R0 {

    /* renamed from: a */
    public final /* synthetic */ int f4029a;

    /* renamed from: b */
    public final /* synthetic */ Object f4030b;

    /* renamed from: c */
    public final /* synthetic */ Object f4031c;

    public /* synthetic */ H30(Object obj, int i, Object obj2) {
        this.f4029a = i;
        this.f4030b = obj;
        this.f4031c = obj2;
    }

    @Override // io.sentry.InterfaceC5799R0
    /* renamed from: a */
    public void mo3251a(C5759D1 c5759d1) {
        ReadableMap map;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c5759d1;
        C6120d c6120d = (C6120d) this.f4030b;
        c6120d.getClass();
        C5847T c5847t = C6120d.f34519l;
        C6102r sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new C6102r("sentry.java.android.react-native", "7.20.1");
        } else {
            sdkVersion.f34430a = "sentry.java.android.react-native";
        }
        C6059l1.m21830v().m21832o("npm:@sentry/react-native", "6.7.0");
        sentryAndroidOptions.setSentryClientName(sdkVersion.f34430a + "/" + sdkVersion.f34431b);
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        ReadableMap readableMap = (ReadableMap) this.f4031c;
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            c5847t.mo21407k(EnumC6069n1.INFO, AbstractC7222ym.m26234k("Starting with DSN: '", string, "'"), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("sampleRate")) {
            sentryAndroidOptions.setSampleRate(Double.valueOf(readableMap.getDouble("sampleRate")));
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        if (readableMap.hasKey("enableNdk")) {
            sentryAndroidOptions.setEnableNdk(readableMap.getBoolean("enableNdk"));
        }
        if (readableMap.hasKey("spotlight")) {
            if (readableMap.getType("spotlight") == ReadableType.Boolean) {
                sentryAndroidOptions.setEnableSpotlight(readableMap.getBoolean("spotlight"));
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("defaultSidecarUrl"));
            } else if (readableMap.getType("spotlight") == ReadableType.String) {
                sentryAndroidOptions.setEnableSpotlight(true);
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("spotlight"));
            }
        }
        C5771H1 c5771h1 = new C5771H1(false, new C6102r("sentry.javascript.react-native", "6.7.0"));
        CopyOnWriteArraySet copyOnWriteArraySet = c5771h1.f33285c;
        String str = null;
        if (readableMap.hasKey("replaysSessionSampleRate") || readableMap.hasKey("replaysOnErrorSampleRate")) {
            c5771h1.m21400f(readableMap.hasKey("replaysSessionSampleRate") ? Double.valueOf(readableMap.getDouble("replaysSessionSampleRate")) : null);
            c5771h1.m21399e(readableMap.hasKey("replaysOnErrorSampleRate") ? Double.valueOf(readableMap.getDouble("replaysOnErrorSampleRate")) : null);
            if (readableMap.hasKey("mobileReplayOptions") && (map = readableMap.getMap("mobileReplayOptions")) != null) {
                c5771h1.m21398d(!map.hasKey("maskAllText") || map.getBoolean("maskAllText"));
                c5771h1.m21397c(!map.hasKey("maskAllImages") || map.getBoolean("maskAllImages"));
                if (!map.hasKey("maskAllVectors") || map.getBoolean("maskAllVectors")) {
                    copyOnWriteArraySet.add("com.horcrux.svg.SvgView");
                }
                String name = C6128a.class.getName();
                copyOnWriteArraySet.add(name);
                c5771h1.f33287e = name;
                c5771h1.f33288f = C6129b.class.getName();
            }
        }
        sentryAndroidOptions.setSessionReplay(c5771h1);
        if (c5771h1.f33283a != null || c5771h1.f33284b != null) {
            sentryAndroidOptions.getReplayController().mo21393o(new C6126j());
        }
        String string2 = readableMap.getString("dsn");
        if (string2 != null) {
            try {
                URI uri = new URI(string2);
                str = uri.getScheme() + "://" + uri.getHost();
            } catch (URISyntaxException unused) {
            }
        }
        sentryAndroidOptions.setBeforeBreadcrumb(new C6118b(str, readableMap.getString("devServerUrl"), 2));
        sentryAndroidOptions.addIgnoredExceptionForType(JavascriptException.class);
        sentryAndroidOptions.setBeforeSend(new H30(c6120d, 28, sentryAndroidOptions));
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<InterfaceC5819Y> integrations = sentryAndroidOptions.getIntegrations();
            for (InterfaceC5819Y interfaceC5819Y : integrations) {
                if ((interfaceC5819Y instanceof UncaughtExceptionHandlerIntegration) || (interfaceC5819Y instanceof AnrIntegration) || (interfaceC5819Y instanceof NdkIntegration)) {
                    integrations.remove(interfaceC5819Y);
                }
            }
        }
        c5847t.mo21407k(EnumC6069n1.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
        C5832D c5832d = C5832D.f33521b;
        Activity currentActivity = c6120d.f34523a.getCurrentActivity();
        if (currentActivity != null) {
            WeakReference weakReference = (WeakReference) c5832d.f33522a;
            if (weakReference == null || weakReference.get() != currentActivity) {
                c5832d.f33522a = new WeakReference(currentActivity);
            }
        }
    }

    @Override // p000.InterfaceC11423vU0
    /* renamed from: apply */
    public Object mo26597apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C11677xU0 c11677xU0 = (C11677xU0) this.f4030b;
        C0229Dd c0229Dd = c11677xU0.f45658d;
        int i = c0229Dd.f2085b;
        C1236Te c1236Te = (C1236Te) this.f4031c;
        ArrayList arrayListM25903p = c11677xU0.m25903p(sQLiteDatabase, c1236Te, i);
        for (EnumC11261uD0 enumC11261uD0 : EnumC11261uD0.values()) {
            if (enumC11261uD0 != c1236Te.f11452c) {
                int size = c0229Dd.f2085b - arrayListM25903p.size();
                if (size <= 0) {
                    break;
                }
                arrayListM25903p.addAll(c11677xU0.m25903p(sQLiteDatabase, c1236Te.m7708b(enumC11261uD0), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayListM25903p.size(); i2++) {
            sb.append(((C4255ie) arrayListM25903p.get(i2)).f29397a);
            if (i2 < arrayListM25903p.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new C11550wU0(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM25903p.listIterator();
        while (listIterator.hasNext()) {
            C4255ie c4255ie = (C4255ie) listIterator.next();
            if (map.containsKey(Long.valueOf(c4255ie.f29397a))) {
                C0103Bd c0103BdM1262c = c4255ie.f29399c.m1262c();
                long j2 = c4255ie.f29397a;
                for (C11550wU0 c11550wU0 : (Set) map.get(Long.valueOf(j2))) {
                    c0103BdM1262c.m778a(c11550wU0.f44911a, c11550wU0.f44912b);
                }
                listIterator.set(new C4255ie(j2, c4255ie.f29398b, c0103BdM1262c.m779b()));
            }
        }
        return arrayListM25903p;
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public void mo3170b(C5782L0 c5782l0) {
        switch (this.f4029a) {
            case 23:
                ((AtomicReference) this.f4030b).set(c5782l0.f33306b);
                ((AtomicReference) this.f4031c).set(c5782l0.f33322r);
                return;
            case 26:
                GestureDetectorOnGestureListenerC5875e gestureDetectorOnGestureListenerC5875e = (GestureDetectorOnGestureListenerC5875e) this.f4030b;
                InterfaceC5807U interfaceC5807U = (InterfaceC5807U) this.f4031c;
                gestureDetectorOnGestureListenerC5875e.getClass();
                synchronized (c5782l0.f33317m) {
                    if (c5782l0.f33305a == null) {
                        c5782l0.m21415f(interfaceC5807U);
                    } else {
                        gestureDetectorOnGestureListenerC5875e.f33717c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC5807U.getName());
                    }
                }
                return;
            default:
                ReadableMap readableMap = (ReadableMap) this.f4030b;
                ReadableMap readableMap2 = (ReadableMap) this.f4031c;
                if (readableMap == null && readableMap2 == null) {
                    c5782l0.m21416g(null);
                    return;
                }
                C6082E c6082e = new C6082E();
                if (readableMap != null) {
                    if (readableMap.hasKey(Scopes.EMAIL)) {
                        c6082e.f34288a = readableMap.getString(Scopes.EMAIL);
                    }
                    if (readableMap.hasKey(NotificationConstants.f19487ID)) {
                        c6082e.f34289b = readableMap.getString(NotificationConstants.f19487ID);
                    }
                    if (readableMap.hasKey("username")) {
                        c6082e.f34290c = readableMap.getString("username");
                    }
                    if (readableMap.hasKey("ip_address")) {
                        c6082e.f34292e = readableMap.getString("ip_address");
                    }
                    if (readableMap.hasKey("segment")) {
                        c6082e.f34291d = readableMap.getString("segment");
                    }
                }
                if (readableMap2 != null) {
                    HashMap map = new HashMap();
                    ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap2.keySetIterator();
                    while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                        String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                        String string = readableMap2.getString(strNextKey);
                        if (string != null) {
                            map.put(strNextKey, string);
                        }
                    }
                    c6082e.f34295h = AbstractC6003a.m21732A(map);
                }
                c5782l0.m21416g(c6082e);
                return;
        }
    }

    @Override // p000.InterfaceC6711qw
    /* renamed from: c */
    public void mo3135c(C0480Hc c0480Hc) {
        C7612Ft0 c7612Ft0 = (C7612Ft0) ((G10) this.f4030b).f3531b;
        C8342Tu0 c8342Tu0 = (C8342Tu0) this.f4031c;
        c7612Ft0.m2814d(c0480Hc, AbstractC11153tN0.m24891c(c8342Tu0, c0480Hc), AbstractC11153tN0.m24897i(c8342Tu0, c0480Hc));
    }

    @Override // com.huawei.hms.rn.push.local.HmsLocalNotificationPicturesLoader.Callback
    public void call(Bitmap bitmap, Bitmap bitmap2, Promise promise) throws JSONException, NumberFormatException {
        ((HmsLocalNotificationController) this.f4030b).lambda$localNotificationNow$0((Bundle) this.f4031c, bitmap, bitmap2, promise);
    }

    @Override // io.sentry.InterfaceC6009d0
    /* renamed from: d */
    public Object mo3252d() {
        C6055k0 c6055k0 = (C6055k0) this.f4031c;
        ((C6052j0) this.f4030b).getClass();
        try {
            try {
                return Integer.valueOf(((C6184a) c6055k0.f34221b).m21899X());
            } catch (Exception unused) {
                return Long.valueOf(((C6184a) c6055k0.f34221b).m21900b0());
            }
        } catch (Exception unused2) {
            return Double.valueOf(((C6184a) c6055k0.f34221b).m21898W());
        }
    }

    /* renamed from: e */
    public C6039i1 m3253e(C6039i1 c6039i1) {
        ((C6120d) this.f4030b).getClass();
        C6102r c6102r = c6039i1.f33418c;
        if (c6102r != null) {
            String str = c6102r.f34430a;
            str.getClass();
            if (str.equals("sentry.java.android.react-native")) {
                c6039i1.m21473a("event.origin", ConstantDeviceInfo.APP_PLATFORM);
                c6039i1.m21473a("event.environment", "java");
            } else if (str.equals("sentry.native.android.react-native")) {
                c6039i1.m21473a("event.origin", ConstantDeviceInfo.APP_PLATFORM);
                c6039i1.m21473a("event.environment", "native");
            }
        }
        C6102r sdkVersion = ((SentryAndroidOptions) this.f4031c).getSdkVersion();
        C6102r c6102r2 = c6039i1.f33418c;
        if (c6102r2 != null && "sentry.javascript.react-native".equals(c6102r2.f34430a) && sdkVersion != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = sdkVersion.f34432c;
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = (CopyOnWriteArraySet) C6059l1.m21830v().f34227b;
            }
            Iterator it = new CopyOnWriteArrayList(copyOnWriteArraySet).iterator();
            while (it.hasNext()) {
                C6105u c6105u = (C6105u) it.next();
                C6059l1.m21830v().m21832o(c6105u.f34444a, c6105u.f34445b);
            }
            CopyOnWriteArraySet copyOnWriteArraySet2 = sdkVersion.f34433d;
            if (copyOnWriteArraySet2 == null) {
                copyOnWriteArraySet2 = (CopyOnWriteArraySet) C6059l1.m21830v().f34226a;
            }
            Iterator it2 = new CopyOnWriteArrayList(copyOnWriteArraySet2).iterator();
            while (it2.hasNext()) {
                C6059l1.m21830v().m21831l((String) it2.next());
            }
            c6039i1.f33418c = c6102r2;
        }
        return c6039i1;
    }

    @Override // p000.InterfaceC11886z71
    public Object execute() {
        switch (this.f4029a) {
            case 16:
                C11677xU0 c11677xU0 = (C11677xU0) ((C8575Yg1) this.f4030b).f14445c;
                c11677xU0.getClass();
                Iterable iterable = (Iterable) this.f4031c;
                if (iterable.iterator().hasNext()) {
                    c11677xU0.m25901m().compileStatement("DELETE FROM events WHERE _id in " + C11677xU0.m25898A(iterable)).execute();
                    break;
                }
                break;
            default:
                C8575Yg1 c8575Yg1 = (C8575Yg1) this.f4030b;
                c8575Yg1.getClass();
                Iterator it = ((HashMap) this.f4031c).entrySet().iterator();
                while (it.hasNext()) {
                    ((C11677xU0) c8575Yg1.f14451i).m25904w(((Integer) r2.getValue()).intValue(), EnumC9921jl0.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        return new C1235Td((String) this.f4030b, ((InterfaceC11832yi0) this.f4031c).mo6077a((Context) c8128Pr0.mo4066a(Context.class)));
    }

    @Override // p000.InterfaceC6227jH
    /* renamed from: h */
    public void mo410h(InterfaceC9347fG0 interfaceC9347fG0) {
        ((InterfaceC6227jH) this.f4030b).mo410h(interfaceC9347fG0);
        ((InterfaceC6227jH) this.f4031c).mo410h(interfaceC9347fG0);
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        Object obj = this.f4031c;
        Object obj2 = this.f4030b;
        switch (this.f4029a) {
            case 13:
                Z61 z61 = (Z61) obj2;
                z61.getClass();
                ((AtomicReference) obj).set(c0300El);
                return "SurfaceRequest-surface-recreation(" + z61.hashCode() + ")";
            case 15:
                Q91 q91 = (Q91) obj2;
                q91.getClass();
                AbstractC7806Jm0.m4412f("TextureViewImpl");
                Surface surface = (Surface) obj;
                q91.f9507h.m9491b(surface, QR1.m6703a(), new WN0(3, c0300El));
                return "provideSurface[request=" + q91.f9507h + " surface=" + surface + "]";
            case 18:
                ((C8215Ri1) obj2).getClass();
                C11303uY0 c11303uY0 = (C11303uY0) obj;
                ((C7872Kt0) c11303uY0.f43134b.f15119g).f42279a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c0300El.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                C8007Ni1 c8007Ni1 = new C8007Ni1(atomicBoolean, c0300El, c11303uY0);
                c0300El.m2374a(new RunnableC8176Qp0(atomicBoolean, c11303uY0, c8007Ni1, 17), QR1.m6703a());
                c11303uY0.f43134b.m9589b(c8007Ni1);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c0300El.hashCode()));
            default:
                C1753aw c1753aw = (C1753aw) obj2;
                c1753aw.getClass();
                ((ExecutorC10151lY0) c1753aw.f16684d).execute(new RunnableC8176Qp0(c1753aw, c0300El, (C0984Pd) obj, 19));
                return "setZoomRatio";
        }
    }

    @Override // p000.InterfaceC8571Ye1
    /* renamed from: i */
    public void mo502i(C11856yu0 c11856yu0) {
        ((ReanimatedModule) this.f4030b).lambda$willDispatchViewUpdates$5((ArrayList) this.f4031c, c11856yu0);
    }

    @Override // p000.InterfaceC9713i70
    /* renamed from: k */
    public void mo504k(InterfaceC9841j70 interfaceC9841j70) {
        switch (this.f4029a) {
            case 2:
                C9108dO1 c9108dO1 = (C9108dO1) this.f4030b;
                c9108dO1.getClass();
                ((InterfaceC9713i70) this.f4031c).mo504k(c9108dO1);
                break;
            default:
                MU0 mu0 = (MU0) this.f4030b;
                mu0.getClass();
                ((InterfaceC9713i70) this.f4031c).mo504k(mu0);
                break;
        }
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        if (!task.mo11144k()) {
            task.mo11141h();
            return;
        }
        AbstractC9757iT0 abstractC9757iT0 = (AbstractC9757iT0) task.mo11142i();
        Activity currentActivity = ((ReactApplicationContext) this.f4030b).getCurrentActivity();
        if (currentActivity != null) {
            C8165Qj1 c8165Qj1 = (C8165Qj1) this.f4031c;
            C7985Mx1 c7985Mx1 = (C7985Mx1) abstractC9757iT0;
            if (c7985Mx1.f7416b) {
                AbstractC9376fU1.m18244e(null);
                return;
            }
            Intent intent = new Intent(currentActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", c7985Mx1.f7415a);
            intent.putExtra("window_flags", currentActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
            intent.putExtra("result_receiver", new ResultReceiverC0237Dl((Handler) c8165Qj1.f9756a, new S81()));
            currentActivity.startActivity(intent);
        }
    }

    @Override // p000.InterfaceC8244Rx0
    public void onFailure(Exception exc) {
        ((C2304d) this.f4030b).m12820a((List) this.f4031c, exc);
    }

    @Override // p000.InterfaceC9179dy0
    public void onSuccess(Object obj) {
        switch (this.f4029a) {
            case 5:
                RemoteConfigModule.getRemoteConfig$lambda$5((C9189e20) this.f4030b, (Promise) this.f4031c, (RemoteConfig) obj);
                break;
            case 8:
                RustorePushModule.checkPushAvailability$lambda$0((Promise) this.f4030b, (RustorePushModule) this.f4031c, (AbstractC1036QS) obj);
                break;
            default:
                RustoreReviewModule.requestReviewFlow$lambda$0((RustoreReviewModule) this.f4030b, (Promise) this.f4031c, (ReviewInfo) obj);
                break;
        }
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        ES1 es1 = (ES1) this.f4030b;
        String str = (String) this.f4031c;
        synchronized (es1) {
            ((C7119x8) es1.f2709c).remove(str);
        }
        return task;
    }

    @Override // p000.InterfaceC11423vU0
    /* renamed from: apply */
    public InterfaceFutureC7800Jj0 mo26597apply(Object obj) {
        switch (this.f4029a) {
            case 14:
                List list = (List) obj;
                ((E71) this.f4030b).getClass();
                Objects.toString(list);
                AbstractC7806Jm0.m4412f("SyncCaptureSessionBase");
                if (list.isEmpty()) {
                    return new F70(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (list.contains(null)) {
                    return new F70(1, new C4169hH((AbstractC4232iH) ((ArrayList) this.f4031c).get(list.indexOf(null)), "Surface closed"));
                }
                return AbstractC8301Sz1.m7484g(list);
            default:
                C7961Ml1 c7961Ml1 = (C7961Ml1) this.f4030b;
                c7961Ml1.getClass();
                ArrayList arrayList = (ArrayList) this.f4031c;
                Object objMo4794w = 100;
                try {
                    objMo4794w = ((C1373Vp) arrayList.get(0)).f12779b.mo4794w(C1373Vp.f12776j);
                } catch (IllegalArgumentException unused) {
                }
                Integer num = (Integer) objMo4794w;
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Object objMo4794w2 = 0;
                try {
                    objMo4794w2 = ((C1373Vp) arrayList.get(0)).f12779b.mo4794w(C1373Vp.f12775i);
                } catch (IllegalArgumentException unused2) {
                }
                Integer num2 = (Integer) objMo4794w2;
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                C8539Xo1 c8539Xo1 = ((C9966k51) c7961Ml1.f7327c.f12875b).f36296s;
                if (c8539Xo1 != null) {
                    return AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C6999vE((C0584JG) c8539Xo1.f13981b, iIntValue, iIntValue2)));
                }
                return new F70(1, new Exception("Failed to take picture: pipeline is not ready."));
        }
    }
}
