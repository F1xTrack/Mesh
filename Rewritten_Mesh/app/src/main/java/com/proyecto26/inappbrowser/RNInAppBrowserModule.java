package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0749Lu;
import p000.AbstractC1207TB;
import p000.AbstractC1270UB;
import p000.AbstractC1333VB;
import p000.BinderC1144SB;
import p000.C1396WB;
import p000.C1753aw;
import p000.C6741rP;
import p000.C6838sg;
import p000.C7621Fx1;
import p000.C9108dO1;
import p000.InterfaceC9101dL0;
import p000.L51;
import p000.O51;
import p000.OJ1;
import p000.OL0;
import p000.P51;
import p000.R40;
import p000.T40;
import p000.TH0;
import p000.UH0;
import p000.VH0;
import ru.mes.dnevnik.R;

@InterfaceC9101dL0(name = RNInAppBrowserModule.NAME)
/* loaded from: classes2.dex */
public class RNInAppBrowserModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNInAppBrowser";
    private final ReactApplicationContext reactContext;

    public RNInAppBrowserModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public static void onStart(Activity activity) {
        VH0 vh0M8386b = VH0.m8386b();
        vh0M8386b.getClass();
        Context applicationContext = activity.getApplicationContext();
        TH0 th0 = new TH0(vh0M8386b, applicationContext);
        String strM8385a = VH0.m8385a(applicationContext);
        if (strM8385a == null) {
            System.err.println("No browser supported to bind custom tab service");
            return;
        }
        th0.f11286a = applicationContext.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(strM8385a)) {
            intent.setPackage(strM8385a);
        }
        applicationContext.bindService(intent, th0, 33);
    }

    @ReactMethod
    public void close() {
        VH0 vh0M8386b = VH0.m8386b();
        Promise promise = vh0M8386b.f12490a;
        if (promise == null) {
            return;
        }
        if (vh0M8386b.f12492c == null) {
            promise.reject("InAppBrowser", "No activity");
            vh0M8386b.f12490a = null;
            return;
        }
        vh0M8386b.m8389e();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", "dismiss");
        vh0M8386b.f12490a.resolve(writableMapCreateMap);
        vh0M8386b.f12490a = null;
        Activity activity = vh0M8386b.f12492c;
        int i = ChromeTabsManagerActivity.f20229d;
        Intent intent = new Intent(activity, (Class<?>) ChromeTabsManagerActivity.class);
        intent.addFlags(67108864);
        activity.startActivity(intent);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void isAvailable(Promise promise) {
        VH0 vh0M8386b = VH0.m8386b();
        ReactApplicationContext reactApplicationContext = this.reactContext;
        vh0M8386b.getClass();
        boolean z = false;
        List<ResolveInfo> listQueryIntentServices = reactApplicationContext.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            z = true;
        }
        promise.resolve(Boolean.valueOf(z));
    }

    @ReactMethod
    public void mayLaunchUrl(String str, ReadableArray readableArray) {
        C7621Fx1 c7621Fx1 = VH0.m8386b().f12493d;
        if (c7621Fx1 != null) {
            BinderC1144SB binderC1144SB = new BinderC1144SB(new OJ1(11));
            T40 t40 = (T40) c7621Fx1.f3494a;
            C9108dO1 c9108dO1 = null;
            try {
                if (((R40) t40).m6893H(binderC1144SB)) {
                    c9108dO1 = new C9108dO1(t40, binderC1144SB, false, 10);
                }
            } catch (RemoteException unused) {
            }
            if (c9108dO1 != null) {
                ArrayList arrayList = new ArrayList(readableArray.size());
                for (int i = 0; i < readableArray.size(); i++) {
                    String string = readableArray.getString(i);
                    if (string != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(string));
                        arrayList.add(bundle);
                    }
                }
                Uri uri = Uri.parse(str);
                Bundle bundle2 = new Bundle();
                try {
                    ((R40) ((T40) c9108dO1.f26012b)).m6892G((BinderC1144SB) c9108dO1.f26013c, uri, bundle2, arrayList);
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) throws SecurityException {
        ReactApplicationContext reactApplicationContext;
        Bundle bundle;
        Method[] methods;
        Object obj;
        ReactApplicationContext reactApplicationContext2;
        Bundle bundle2;
        Method[] methodArr;
        L51 l51;
        boolean zM10385b;
        List list;
        ReadableMap map;
        boolean z = true;
        Activity currentActivity = getCurrentActivity();
        VH0 vh0M8386b = VH0.m8386b();
        ReactApplicationContext reactApplicationContext3 = this.reactContext;
        vh0M8386b.getClass();
        String string = readableMap.getString("url");
        vh0M8386b.f12492c = currentActivity;
        if (vh0M8386b.f12490a != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("type", "cancel");
            vh0M8386b.f12490a.resolve(writableMapCreateMap);
            vh0M8386b.f12490a = null;
            return;
        }
        vh0M8386b.f12490a = promise;
        if (currentActivity == null) {
            promise.reject("InAppBrowser", "No activity");
            vh0M8386b.f12490a = null;
            return;
        }
        C1396WB c1396wb = new C1396WB();
        vh0M8386b.f12491b = Boolean.FALSE;
        Integer numM8388d = VH0.m8388d(c1396wb, readableMap, "toolbarColor", "setToolbarColor", "toolbar");
        int i = 0;
        if (numM8388d != null) {
            vh0M8386b.f12491b = Boolean.valueOf(AbstractC0749Lu.m5130c(numM8388d.intValue()) > 0.5d);
        }
        VH0.m8388d(c1396wb, readableMap, "secondaryToolbarColor", "setSecondaryToolbarColor", "secondary toolbar");
        VH0.m8388d(c1396wb, readableMap, "navigationBarColor", "setNavigationBarColor", "navigation bar");
        VH0.m8388d(c1396wb, readableMap, "navigationBarDividerColor", "setNavigationBarDividerColor", "navigation bar divider");
        if (readableMap.hasKey("enableDefaultShare") && readableMap.getBoolean("enableDefaultShare")) {
            c1396wb.f13034b = 1;
            ((Intent) c1396wb.f13035c).putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        }
        if (readableMap.hasKey("animations")) {
            ReadableMap map2 = readableMap.getMap("animations");
            int iM8387c = map2.hasKey("startEnter") ? VH0.m8387c(reactApplicationContext3, map2.getString("startEnter")) : -1;
            int iM8387c2 = map2.hasKey("startExit") ? VH0.m8387c(reactApplicationContext3, map2.getString("startExit")) : -1;
            int iM8387c3 = map2.hasKey("endEnter") ? VH0.m8387c(reactApplicationContext3, map2.getString("endEnter")) : -1;
            int iM8387c4 = map2.hasKey("endExit") ? VH0.m8387c(reactApplicationContext3, map2.getString("endExit")) : -1;
            if (iM8387c != -1 && iM8387c2 != -1) {
                c1396wb.f13037e = ActivityOptions.makeCustomAnimation(reactApplicationContext3, iM8387c, iM8387c2);
            }
            if (iM8387c3 != -1 && iM8387c4 != -1) {
                ((Intent) c1396wb.f13035c).putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(reactApplicationContext3, iM8387c3, iM8387c4).toBundle());
            }
        }
        if (readableMap.hasKey("hasBackButton") && readableMap.getBoolean("hasBackButton")) {
            ((Intent) c1396wb.f13035c).putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", BitmapFactory.decodeResource(reactApplicationContext3.getResources(), vh0M8386b.f12491b.booleanValue() ? R.drawable.ic_arrow_back_black : R.drawable.ic_arrow_back_white));
        }
        Intent intent = (Intent) c1396wb.f13035c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", c1396wb.f13033a);
        ((OL0) c1396wb.f13036d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", c1396wb.f13034b);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            String strM7927a = AbstractC1270UB.m7927a();
            if (!TextUtils.isEmpty(strM7927a)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strM7927a);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i2 >= 34) {
            if (((ActivityOptions) c1396wb.f13037e) == null) {
                c1396wb.f13037e = AbstractC1207TB.m7621a();
            }
            AbstractC1333VB.m8324a((ActivityOptions) c1396wb.f13037e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) c1396wb.f13037e;
        Bundle bundle4 = activityOptions != null ? activityOptions.toBundle() : null;
        if (readableMap.hasKey("headers") && (map = readableMap.getMap("headers")) != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            if (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                Bundle bundle5 = new Bundle();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    if (UH0.f11715a[map.getType(strNextKey).ordinal()] == 1) {
                        bundle5.putString(strNextKey, map.getString(strNextKey));
                    }
                }
                intent.putExtra("com.android.browser.headers", bundle5);
            }
        }
        if (readableMap.hasKey("forceCloseOnRedirection") && readableMap.getBoolean("forceCloseOnRedirection")) {
            intent.addFlags(268435456);
        }
        if (!readableMap.hasKey("showInRecents") || !readableMap.getBoolean("showInRecents")) {
            intent.addFlags(8388608);
            intent.addFlags(1073741824);
        }
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", readableMap.hasKey("enableUrlBarHiding") && readableMap.getBoolean("enableUrlBarHiding"));
        try {
            if (readableMap.hasKey("browserPackage")) {
                String string2 = readableMap.getString("browserPackage");
                if (!TextUtils.isEmpty(string2)) {
                    intent.setPackage(string2);
                }
            } else {
                intent.setPackage(VH0.m8385a(vh0M8386b.f12492c));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (C6741rP.m24327b().m24330e(vh0M8386b)) {
            reactApplicationContext = reactApplicationContext3;
            bundle = bundle4;
        } else {
            C6741rP c6741rPM24327b = C6741rP.m24327b();
            c6741rPM24327b.getClass();
            c6741rPM24327b.f41655i.getClass();
            ConcurrentHashMap concurrentHashMap = P51.f8851a;
            List list2 = (List) concurrentHashMap.get(VH0.class);
            if (list2 != null) {
                reactApplicationContext = reactApplicationContext3;
                bundle = bundle4;
                list = list2;
            } else {
                C1753aw c1753awM6227b = P51.m6227b();
                c1753awM6227b.f16687g = VH0.class;
                c1753awM6227b.f16683c = false;
                while (true) {
                    Class cls = (Class) c1753awM6227b.f16687g;
                    if (cls != null) {
                        try {
                            methods = cls.getDeclaredMethods();
                        } catch (Throwable unused) {
                            methods = ((Class) c1753awM6227b.f16687g).getMethods();
                            c1753awM6227b.f16683c = z;
                        }
                        int length = methods.length;
                        while (i < length) {
                            Method method = methods[i];
                            int i3 = length;
                            int modifiers = method.getModifiers();
                            if ((modifiers & 1) == 0 || (modifiers & 5192) != 0) {
                                reactApplicationContext2 = reactApplicationContext3;
                                bundle2 = bundle4;
                                methodArr = methods;
                            } else {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                methodArr = methods;
                                if (parameterTypes.length != z || (l51 = (L51) method.getAnnotation(L51.class)) == null) {
                                    reactApplicationContext2 = reactApplicationContext3;
                                    bundle2 = bundle4;
                                } else {
                                    Class<?> cls2 = parameterTypes[0];
                                    HashMap map3 = (HashMap) c1753awM6227b.f16684d;
                                    bundle2 = bundle4;
                                    Object objPut = map3.put(cls2, method);
                                    if (objPut == null) {
                                        reactApplicationContext2 = reactApplicationContext3;
                                        zM10385b = true;
                                    } else {
                                        reactApplicationContext2 = reactApplicationContext3;
                                        if (objPut instanceof Method) {
                                            if (!c1753awM6227b.m10385b((Method) objPut, cls2)) {
                                                throw new IllegalStateException();
                                            }
                                            map3.put(cls2, c1753awM6227b);
                                        }
                                        zM10385b = c1753awM6227b.m10385b(method, cls2);
                                    }
                                    if (zM10385b) {
                                        ((ArrayList) c1753awM6227b.f16682b).add(new O51(method, cls2, l51.threadMode(), l51.priority(), l51.sticky()));
                                    }
                                }
                            }
                            z = true;
                            i++;
                            length = i3;
                            methods = methodArr;
                            bundle4 = bundle2;
                            reactApplicationContext3 = reactApplicationContext2;
                        }
                        ReactApplicationContext reactApplicationContext4 = reactApplicationContext3;
                        Bundle bundle6 = bundle4;
                        if (c1753awM6227b.f16683c) {
                            obj = null;
                            c1753awM6227b.f16687g = null;
                        } else {
                            Class superclass = ((Class) c1753awM6227b.f16687g).getSuperclass();
                            c1753awM6227b.f16687g = superclass;
                            String name = superclass.getName();
                            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                                obj = null;
                                c1753awM6227b.f16687g = null;
                            } else {
                                obj = null;
                            }
                        }
                        bundle4 = bundle6;
                        reactApplicationContext3 = reactApplicationContext4;
                        i = 0;
                    } else {
                        reactApplicationContext = reactApplicationContext3;
                        bundle = bundle4;
                        ArrayList arrayListM6226a = P51.m6226a(c1753awM6227b);
                        if (arrayListM6226a.isEmpty()) {
                            throw new C6838sg("Subscriber " + VH0.class + " and its super classes have no public methods with the @Subscribe annotation");
                        }
                        concurrentHashMap.put(VH0.class, arrayListM6226a);
                        list = arrayListM6226a;
                    }
                }
            }
            synchronized (c6741rPM24327b) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c6741rPM24327b.m24335j(vh0M8386b, (O51) it.next());
                    }
                } finally {
                }
            }
        }
        intent.setData(Uri.parse(string));
        if (readableMap.hasKey("showTitle")) {
            ((Intent) c1396wb.f13035c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", readableMap.getBoolean("showTitle") ? 1 : 0);
        } else {
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        }
        if (readableMap.hasKey("includeReferrer") && readableMap.getBoolean("includeReferrer")) {
            intent.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + reactApplicationContext.getApplicationContext().getPackageName()));
        }
        Activity activity = vh0M8386b.f12492c;
        int i4 = ChromeTabsManagerActivity.f20229d;
        Intent intent2 = new Intent(activity, (Class<?>) ChromeTabsManagerActivity.class);
        intent2.putExtra("browserIntent", intent);
        activity.startActivity(intent2, bundle);
    }

    @ReactMethod
    public void warmup(Promise promise) {
        boolean zM6894I;
        C7621Fx1 c7621Fx1 = VH0.m8386b().f12493d;
        if (c7621Fx1 != null) {
            try {
                zM6894I = ((R40) ((T40) c7621Fx1.f3494a)).m6894I();
            } catch (RemoteException unused) {
                zM6894I = false;
            }
            promise.resolve(Boolean.valueOf(zM6894I));
        }
        promise.resolve(Boolean.FALSE);
    }
}
