package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractActivityC11909zJ0;
import p000.AbstractC3982eJ;
import p000.C10189lr0;
import p000.C10885rH0;
import p000.EnumC10629pH0;
import p000.InterfaceC9101dL0;
import p000.PA0;

@InterfaceC9101dL0(name = "RNCWebViewModule")
/* loaded from: classes2.dex */
public class RNCWebViewModule extends ReactContextBaseJavaModule {
    private final C10885rH0 mRNCWebViewModuleImpl;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new C10885rH0(reactApplicationContext);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.m24248b(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebViewModule";
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        C10885rH0 c10885rH0 = this.mRNCWebViewModuleImpl;
        ReactApplicationContext reactApplicationContext = c10885rH0.f41410a;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z = AbstractC3982eJ.m17899a(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z) {
            ComponentCallbacks2 currentActivity2 = reactApplicationContext.getCurrentActivity();
            if (currentActivity2 == null) {
                throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
            }
            if (!(currentActivity2 instanceof PA0)) {
                throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
            }
            ((AbstractActivityC11909zJ0) ((PA0) currentActivity2)).m26369k(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, new C10189lr0((Object) c10885rH0, (Serializable) str, (Object) str2, 22));
        }
        return z;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        this.mRNCWebViewModuleImpl.getClass();
        promise.resolve(Boolean.TRUE);
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.f41411b = request;
    }

    @ReactMethod
    public void shouldStartLoadWithLockIdentifier(boolean z, double d) {
        this.mRNCWebViewModuleImpl.getClass();
        AtomicReference atomicReferenceM23961a = C10885rH0.f41409g.m23961a(Double.valueOf(d));
        if (atomicReferenceM23961a != null) {
            synchronized (atomicReferenceM23961a) {
                try {
                    atomicReferenceM23961a.set(z ? EnumC10629pH0.f39998c : EnumC10629pH0.f39997b);
                    atomicReferenceM23961a.notify();
                } finally {
                }
            }
        }
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        String mimeTypeFromExtension;
        Intent intentM24251f;
        Intent intentM24252g;
        C10885rH0 c10885rH0 = this.mRNCWebViewModuleImpl;
        c10885rH0.f41412c = valueCallback;
        Activity currentActivity = c10885rH0.f41410a.getCurrentActivity();
        String mimeTypeFromExtension2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            String strReplace = str.replace(".", "");
            mimeTypeFromExtension2 = strReplace != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace) : null;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension2);
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        ArrayList arrayList = new ArrayList();
        if (str.matches("\\.\\w+")) {
            String strReplace2 = str.replace(".", "");
            mimeTypeFromExtension = strReplace2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace2) : null;
        } else {
            mimeTypeFromExtension = str;
        }
        if ((mimeTypeFromExtension.isEmpty() || mimeTypeFromExtension.toLowerCase().contains("image")) && (intentM24251f = c10885rH0.m24251f()) != null) {
            arrayList.add(intentM24251f);
        }
        if (str.matches("\\.\\w+")) {
            String strReplace3 = str.replace(".", "");
            str = strReplace3 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace3) : null;
        }
        if ((str.isEmpty() || str.toLowerCase().contains("video")) && (intentM24252g = c10885rH0.m24252g()) != null) {
            arrayList.add(intentM24252g);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean startPhotoPickerIntent(android.webkit.ValueCallback<android.net.Uri[]> r10, java.lang.String[] r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            rH0 r0 = r9.mRNCWebViewModuleImpl
        */
        //  java.lang.String r1 = "*/*"
        /*
            r0.f41413d = r10
            com.facebook.react.bridge.ReactApplicationContext r10 = r0.f41410a
            android.app.Activity r2 = r10.getCurrentActivity()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "android.permission.CAMERA"
            android.app.Activity r10 = r10.getCurrentActivity()
            android.content.pm.PackageManager r5 = r10.getPackageManager()
            r6 = 0
            android.content.Context r7 = r10.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            r8 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            java.lang.String[] r5 = r5.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            boolean r5 = r5.contains(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            if (r5 == 0) goto L3d
            int r10 = p000.AbstractC3982eJ.m17899a(r10, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            if (r10 == 0) goto L3d
            goto L83
        L3d:
            java.lang.String[] r10 = p000.C10885rH0.m24247c(r11)
            java.lang.Boolean r4 = p000.C10885rH0.m24246a(r1, r10)
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L57
            java.lang.String r4 = "image"
            java.lang.Boolean r10 = p000.C10885rH0.m24246a(r4, r10)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L60
        L57:
            android.content.Intent r6 = r0.m24251f()
            if (r6 == 0) goto L60
            r3.add(r6)
        L60:
            java.lang.String[] r10 = p000.C10885rH0.m24247c(r11)
            java.lang.Boolean r4 = p000.C10885rH0.m24246a(r1, r10)
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L7a
            java.lang.String r4 = "video"
            java.lang.Boolean r10 = p000.C10885rH0.m24246a(r4, r10)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L83
        L7a:
            android.content.Intent r10 = r0.m24252g()
            if (r10 == 0) goto L83
            r3.add(r10)
        L83:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.CHOOSER"
            r10.<init>(r0)
            if (r13 == 0) goto L8d
            goto Lbe
        L8d:
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.GET_CONTENT"
            r13.<init>(r0)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r13.addCategory(r0)
            r13.setType(r1)
            java.lang.String[] r11 = p000.C10885rH0.m24247c(r11)
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r13.putExtra(r0, r11)
            java.lang.String r11 = "android.intent.extra.ALLOW_MULTIPLE"
            r13.putExtra(r11, r12)
            java.lang.String r11 = "android.intent.extra.INTENT"
            r10.putExtra(r11, r13)
            r11 = 0
            android.os.Parcelable[] r11 = new android.os.Parcelable[r11]
            java.lang.Object[] r11 = r3.toArray(r11)
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            java.lang.String r12 = "android.intent.extra.INITIAL_INTENTS"
            r10.putExtra(r12, r11)
            r6 = r10
        Lbe:
            r10 = 1
            if (r6 == 0) goto Lce
            android.content.pm.PackageManager r11 = r2.getPackageManager()
            android.content.ComponentName r11 = r6.resolveActivity(r11)
            if (r11 == 0) goto Lce
            r2.startActivityForResult(r6, r10)
        Lce:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.startPhotoPickerIntent(android.webkit.ValueCallback, java.lang.String[], boolean, boolean):boolean");
    }
}
