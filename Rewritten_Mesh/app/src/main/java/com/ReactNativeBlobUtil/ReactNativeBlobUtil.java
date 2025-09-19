package com.ReactNativeBlobUtil;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p000.AL0;
import p000.AbstractC0852NX;
import p000.AbstractC10253mL0;
import p000.AbstractC11920zO1;
import p000.AbstractC7222ym;
import p000.AsyncTaskC9997kL0;
import p000.C10910rT1;
import p000.C11277uL0;
import p000.C11405vL0;
import p000.C11913zL0;
import p000.RunnableC10637pL0;
import p000.RunnableC11021sL0;
import p000.RunnableC11149tL0;
import p000.RunnableC11786yL0;
import p000.RunnableC1192Sx;
import p000.RunnableC6704qp;
import p000.RunnableC8756ah0;

/* loaded from: classes.dex */
public class ReactNativeBlobUtil extends ReactContextBaseJavaModule {
    private final C11277uL0 delegate;

    public ReactNativeBlobUtil(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new C11277uL0(reactApplicationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:4:0x000b, B:6:0x0013, B:10:0x003d, B:12:0x004d, B:15:0x0070, B:16:0x0074, B:19:0x0090, B:18:0x007f, B:13:0x0057, B:9:0x001b), top: B:23:0x000b, inners: #1 }] */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void actionViewIntent(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.facebook.react.bridge.Promise r12) {
        /*
            r8 = this;
            uL0 r0 = r8.delegate
            r0.getClass()
            java.lang.String r0 = "No app installed for "
            java.lang.String r1 = "file://"
            if (r9 == 0) goto L1b
            java.lang.String r2 = "content://"
            boolean r2 = r9.startsWith(r2)     // Catch: java.lang.Exception -> L18
            if (r2 == 0) goto L1b
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> L18
            goto L3d
        L18:
            r9 = move-exception
            goto L9e
        L1b:
            com.facebook.react.bridge.ReactApplicationContext r2 = p000.C11277uL0.f43672b     // Catch: java.lang.Exception -> L18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L18
            r3.<init>()     // Catch: java.lang.Exception -> L18
            com.facebook.react.bridge.ReactApplicationContext r4 = p000.C11277uL0.f43672b     // Catch: java.lang.Exception -> L18
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L18
            r3.append(r4)     // Catch: java.lang.Exception -> L18
            java.lang.String r4 = ".provider"
            r3.append(r4)     // Catch: java.lang.Exception -> L18
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L18
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L18
            r4.<init>(r9)     // Catch: java.lang.Exception -> L18
            android.net.Uri r2 = p000.AbstractC0345FT.m2663d(r2, r3, r4)     // Catch: java.lang.Exception -> L18
        L3d:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> L18
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L18
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L18
            r5 = 1
            r6 = 24
            r7 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 < r6) goto L57
            r3.setDataAndType(r2, r10)     // Catch: java.lang.Exception -> L18
            r3.setFlags(r5)     // Catch: java.lang.Exception -> L18
            r3.addFlags(r7)     // Catch: java.lang.Exception -> L18
            goto L6e
        L57:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L18
            r2.<init>(r1)     // Catch: java.lang.Exception -> L18
            r2.append(r9)     // Catch: java.lang.Exception -> L18
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Exception -> L18
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> L18
            android.content.Intent r9 = r3.setDataAndType(r9, r10)     // Catch: java.lang.Exception -> L18
            r9.setFlags(r7)     // Catch: java.lang.Exception -> L18
        L6e:
            if (r11 == 0) goto L74
            android.content.Intent r3 = android.content.Intent.createChooser(r3, r11)     // Catch: java.lang.Exception -> L18
        L74:
            com.facebook.react.bridge.ReactApplicationContext r9 = p000.C11277uL0.f43672b     // Catch: java.lang.Exception -> L18 android.content.ActivityNotFoundException -> L7f
            r9.startActivity(r3)     // Catch: java.lang.Exception -> L18 android.content.ActivityNotFoundException -> L7f
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L18 android.content.ActivityNotFoundException -> L7f
            r12.resolve(r9)     // Catch: java.lang.Exception -> L18 android.content.ActivityNotFoundException -> L7f
            goto L90
        L7f:
            java.lang.String r9 = "ENOAPP"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L18
            r11.<init>(r0)     // Catch: java.lang.Exception -> L18
            r11.append(r10)     // Catch: java.lang.Exception -> L18
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Exception -> L18
            r12.reject(r9, r10)     // Catch: java.lang.Exception -> L18
        L90:
            p000.C11277uL0.f43675e = r5     // Catch: java.lang.Exception -> L18
            rL0 r9 = new rL0     // Catch: java.lang.Exception -> L18
            r10 = 0
            r9.<init>(r10, r12)     // Catch: java.lang.Exception -> L18
            com.facebook.react.bridge.ReactApplicationContext r10 = p000.C11277uL0.f43672b     // Catch: java.lang.Exception -> L18
            r10.addLifecycleEventListener(r9)     // Catch: java.lang.Exception -> L18
            goto La7
        L9e:
            java.lang.String r10 = "EUNSPECIFIED"
            java.lang.String r9 = r9.getLocalizedMessage()
            r12.reject(r10, r9)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.ReactNativeBlobUtil.actionViewIntent(java.lang.String, java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        this.delegate.getClass();
        DownloadManager downloadManager = (DownloadManager) C11277uL0.f43672b.getSystemService("download");
        if (readableMap == null || !readableMap.hasKey("path")) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload config or path missing.");
            return;
        }
        String strM157b = AL0.m157b(readableMap.getString("path"));
        if (strM157b == null) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload can not resolve URI:" + readableMap.getString("path"));
        } else {
            try {
                downloadManager.addCompletedDownload(readableMap.hasKey("title") ? readableMap.getString("title") : "", readableMap.hasKey("description") ? readableMap.getString("description") : "", true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, strM157b, Long.valueOf(AbstractC10253mL0.m22807f(strM157b).getString("size")).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
                promise.resolve(null);
            } catch (Exception e) {
                promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
            }
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        this.delegate.getClass();
        try {
            RunnableC11786yL0.m26133a(str);
            callback.invoke(null, str);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) throws IOException {
        this.delegate.getClass();
        try {
            HashMap map = C11913zL0.f46794d;
            OutputStream outputStream = ((C11913zL0) map.get(str)).f46797c;
            map.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[PHI: r2 r7 r8
  0x0078: PHI (r2v5 android.content.ContentResolver) = 
  (r2v10 android.content.ContentResolver)
  (r2v11 android.content.ContentResolver)
  (r2v12 android.content.ContentResolver)
 binds: [B:3:0x0020, B:14:0x004b, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r7v4 android.net.Uri) = (r7v14 android.net.Uri), (r7v15 android.net.Uri), (r7v16 android.net.Uri) binds: [B:3:0x0020, B:14:0x004b, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r8v3 java.lang.String) = (r8v19 java.lang.String), (r8v20 java.lang.String), (r8v21 java.lang.String) binds: [B:3:0x0020, B:14:0x004b, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:18:0x0078). Please report as a decompilation issue!!! */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void copyToInternal(java.lang.String r7, java.lang.String r8, com.facebook.react.bridge.Promise r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.ReactNativeBlobUtil.copyToInternal(java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void copyToMediaStore(ReadableMap readableMap, String str, String str2, Promise promise) throws IOException {
        this.delegate.getClass();
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
            return;
        }
        if (str2 == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid path");
            return;
        }
        C10910rT1 c10910rT1 = new C10910rT1(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder"));
        int iM5775x = AbstractC0852NX.m5775x(str);
        ReactApplicationContext reactApplicationContext = C11277uL0.f43672b;
        Uri uriM26431b = AbstractC11920zO1.m26431b(c10910rT1, iM5775x);
        if (uriM26431b == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        } else if (AbstractC11920zO1.m26432f(uriM26431b, str2, false, promise, C11277uL0.f43672b)) {
            promise.resolve(uriM26431b.toString());
        }
    }

    @ReactMethod
    /* renamed from: cp */
    public void m10873cp(String str, String str2, Callback callback) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC1192Sx(str, str2, callback, 11));
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Promise promise) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC6704qp(str, str2, str3, promise, 3));
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC1192Sx(str, readableArray, promise, 10));
    }

    @ReactMethod
    public void createMediaFile(ReadableMap readableMap, String str, Promise promise) throws IOException {
        this.delegate.getClass();
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
        }
        C10910rT1 c10910rT1 = new C10910rT1(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder"));
        int iM5775x = AbstractC0852NX.m5775x(str);
        ReactApplicationContext reactApplicationContext = C11277uL0.f43672b;
        Uri uriM26431b = AbstractC11920zO1.m26431b(c10910rT1, iM5775x);
        if (uriM26431b != null) {
            promise.resolve(uriM26431b.toString());
        } else {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        }
    }

    @ReactMethod
    /* renamed from: df */
    public void m10874df(Callback callback) {
        this.delegate.getClass();
        C11277uL0.f43674d.execute(new RunnableC8756ah0(1, callback));
    }

    @ReactMethod
    public void enableProgressReport(String str, int i, int i2) {
        this.delegate.getClass();
        RunnableC11786yL0.f46196y.put(str, new C11405vL0(i, i2));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i, int i2) {
        this.delegate.getClass();
        RunnableC11786yL0.f46197z.put(str, new C11405vL0(i, i2));
    }

    @ReactMethod
    public void exists(String str, Callback callback) throws IOException {
        this.delegate.getClass();
        if (str != null && str.startsWith("bundle-assets://")) {
            try {
                C11277uL0.f43672b.getAssets().openFd(str.replace("bundle-assets://", ""));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
                return;
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
                return;
            }
        }
        String strM157b = AL0.m157b(str);
        if (strM157b == null) {
            Boolean bool2 = Boolean.FALSE;
            callback.invoke(bool2, bool2);
        } else {
            callback.invoke(Boolean.valueOf(new File(strM157b).exists()), Boolean.valueOf(new File(strM157b).isDirectory()));
        }
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        C11277uL0 c11277uL0 = this.delegate;
        c11277uL0.getClass();
        new RunnableC11786yL0(readableMap, str, str2, str3, readableMap2, str4, null, c11277uL0.f43677a, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        C11277uL0 c11277uL0 = this.delegate;
        c11277uL0.getClass();
        new RunnableC11786yL0(readableMap, str, str2, str3, readableMap2, null, readableArray, c11277uL0.f43677a, callback).run();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getBlob(java.lang.String r6, java.lang.String r7, com.facebook.react.bridge.Promise r8) throws java.io.IOException {
        /*
            r5 = this;
            uL0 r0 = r5.delegate
            r0.getClass()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r0 = "Read only "
            com.facebook.react.bridge.ReactApplicationContext r1 = p000.C11277uL0.f43672b
            android.content.Context r1 = r1.getApplicationContext()
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.io.InputStream r6 = r1.openInputStream(r6)     // Catch: java.io.IOException -> L42
            int r1 = r6.available()     // Catch: java.io.IOException -> L42
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L42
            int r3 = r6.read(r2)     // Catch: java.io.IOException -> L42
            r6.close()     // Catch: java.io.IOException -> L42
            if (r3 >= r1) goto L44
            java.lang.String r6 = "EUNSPECIFIED"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L42
            r7.<init>(r0)     // Catch: java.io.IOException -> L42
            r7.append(r3)     // Catch: java.io.IOException -> L42
            java.lang.String r0 = " bytes of "
            r7.append(r0)     // Catch: java.io.IOException -> L42
            r7.append(r1)     // Catch: java.io.IOException -> L42
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> L42
            r8.reject(r6, r7)     // Catch: java.io.IOException -> L42
            goto L99
        L42:
            r6 = move-exception
            goto L96
        L44:
            java.lang.String r6 = r7.toLowerCase()     // Catch: java.io.IOException -> L42
            int r7 = r6.hashCode()     // Catch: java.io.IOException -> L42
            r0 = 1
            r3 = -1396204209(0xffffffffacc79d4f, float:-5.673385E-12)
            r4 = 0
            if (r7 == r3) goto L63
            r3 = 93106001(0x58caf51, float:1.3229938E-35)
            if (r7 == r3) goto L59
            goto L6d
        L59:
            java.lang.String r7 = "ascii"
            boolean r6 = r6.equals(r7)     // Catch: java.io.IOException -> L42
            if (r6 == 0) goto L6d
            r6 = r0
            goto L6e
        L63:
            java.lang.String r7 = "base64"
            boolean r6 = r6.equals(r7)     // Catch: java.io.IOException -> L42
            if (r6 == 0) goto L6d
            r6 = r4
            goto L6e
        L6d:
            r6 = -1
        L6e:
            if (r6 == 0) goto L8d
            if (r6 == r0) goto L7b
            java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L42
            r6.<init>(r2)     // Catch: java.io.IOException -> L42
            r8.resolve(r6)     // Catch: java.io.IOException -> L42
            goto L99
        L7b:
            com.facebook.react.bridge.WritableArray r6 = com.facebook.react.bridge.Arguments.createArray()     // Catch: java.io.IOException -> L42
        L7f:
            if (r4 >= r1) goto L89
            r7 = r2[r4]     // Catch: java.io.IOException -> L42
            r6.pushInt(r7)     // Catch: java.io.IOException -> L42
            int r4 = r4 + 1
            goto L7f
        L89:
            r8.resolve(r6)     // Catch: java.io.IOException -> L42
            goto L99
        L8d:
            r6 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r2, r6)     // Catch: java.io.IOException -> L42
            r8.resolve(r6)     // Catch: java.io.IOException -> L42
            goto L99
        L96:
            r6.printStackTrace()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.ReactNativeBlobUtil.getBlob(java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        HashMap map2 = new HashMap();
        File filesDir = reactApplicationContext.getFilesDir();
        map2.put("DocumentDir", filesDir != null ? filesDir.getAbsolutePath() : "");
        File cacheDir = reactApplicationContext.getCacheDir();
        map2.put("CacheDir", cacheDir != null ? cacheDir.getAbsolutePath() : "");
        map2.put("DCIMDir", AbstractC10253mL0.m22803b(reactApplicationContext, Environment.DIRECTORY_DCIM));
        map2.put("PictureDir", AbstractC10253mL0.m22803b(reactApplicationContext, Environment.DIRECTORY_PICTURES));
        map2.put("MusicDir", AbstractC10253mL0.m22803b(reactApplicationContext, Environment.DIRECTORY_MUSIC));
        map2.put("DownloadDir", AbstractC10253mL0.m22803b(reactApplicationContext, Environment.DIRECTORY_DOWNLOADS));
        map2.put("MovieDir", AbstractC10253mL0.m22803b(reactApplicationContext, Environment.DIRECTORY_MOVIES));
        map2.put("RingtoneDir", AbstractC10253mL0.m22803b(reactApplicationContext, Environment.DIRECTORY_RINGTONES));
        if (Environment.getExternalStorageState().equals("mounted")) {
            map2.put("SDCardDir", AbstractC10253mL0.m22803b(reactApplicationContext, null));
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            if (externalFilesDir == null || externalFilesDir.getParentFile() == null) {
                map2.put("SDCardApplicationDir", "");
            } else {
                map2.put("SDCardApplicationDir", externalFilesDir.getParentFile().getAbsolutePath());
            }
        } else {
            map2.put("SDCardDir", "");
            map2.put("SDCardApplicationDir", "");
        }
        map2.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        map2.put("LibraryDir", "");
        map2.put("ApplicationSupportDir", "");
        map.putAll(map2);
        getReactApplicationContext();
        map.putAll(AbstractC10253mL0.m22804c());
        return map;
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        this.delegate.getClass();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        C11277uL0.f43676f.put(99900, promise);
        C11277uL0.f43672b.startActivityForResult(intent, 99900, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativeBlobUtil";
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        this.delegate.getClass();
        ReactApplicationContext reactApplicationContext = C11277uL0.f43672b;
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
        } catch (Exception e) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        this.delegate.getClass();
        ReactApplicationContext reactApplicationContext = C11277uL0.f43672b;
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getAbsolutePath());
        } catch (Exception e) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC1192Sx(str, str2, promise, 9));
    }

    @ReactMethod
    /* renamed from: ls */
    public void m10875ls(String str, Promise promise) {
        this.delegate.getClass();
        try {
            String strM157b = AL0.m157b(str);
            File file = new File(strM157b);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + strM157b + "'");
                return;
            }
            if (!file.isDirectory()) {
                promise.reject("ENOTDIR", "Not a directory '" + strM157b + "'");
                return;
            }
            String[] list = new File(strM157b).list();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str2 : list) {
                writableArrayCreateArray.pushString(str2);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        this.delegate.getClass();
        new AsyncTaskC9997kL0(0, callback).execute(AL0.m157b(str));
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        this.delegate.getClass();
        String strM157b = AL0.m157b(str);
        File file = new File(strM157b);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.isDirectory() ? "Folder" : "File");
            sb.append(" '");
            sb.append(strM157b);
            sb.append("' already exists");
            promise.reject("EEXIST", sb.toString());
            return;
        }
        try {
            if (file.mkdirs()) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + strM157b + "'");
        } catch (Exception e) {
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    @ReactMethod
    /* renamed from: mv */
    public void m10876mv(String str, String str2, Callback callback) {
        this.delegate.getClass();
        String strM157b = AL0.m157b(str);
        String strM157b2 = AL0.m157b(str2);
        File file = new File(strM157b);
        if (!file.exists()) {
            callback.invoke(AbstractC7222ym.m26234k("Source file at path `", strM157b, "` does not exist"));
            return;
        }
        try {
            File file2 = new File(strM157b2);
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                callback.invoke("mv failed because the destination directory doesn't exist");
                return;
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (file.renameTo(file2)) {
                callback.invoke(new Object[0]);
            } else {
                callback.invoke("mv failed for unknown reasons");
            }
        } catch (Exception e) {
            callback.invoke(e.toString());
        }
    }

    @ReactMethod
    public void readFile(String str, String str2, boolean z, Promise promise) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC11021sL0(str, str2, z, promise, 0));
    }

    @ReactMethod
    public void readStream(String str, String str2, int i, int i2, String str3) {
        this.delegate.getClass();
        C11277uL0.f43674d.execute(new RunnableC10637pL0(C11277uL0.f43672b, str, str2, i, i2, str3));
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        this.delegate.getClass();
        new AsyncTaskC9997kL0(1, callback).execute(readableArray);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC1192Sx(readableArray, C11277uL0.f43672b, callback, 12));
    }

    @ReactMethod
    public void slice(String str, String str2, int i, int i2, Promise promise) throws IOException {
        this.delegate.getClass();
        try {
            String strM157b = AL0.m157b(str2);
            if (!str.startsWith("content://") && new File(AL0.m157b(str)).isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            InputStream inputStreamM22806e = AbstractC10253mL0.m22806e(str);
            if (inputStreamM22806e == null) {
                promise.reject("ENOENT", "No such file '" + str + "'");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(strM157b));
            int iSkip = (int) inputStreamM22806e.skip(i);
            if (iSkip != i) {
                promise.reject("EUNSPECIFIED", "Skipped " + iSkip + " instead of the specified " + i + " bytes");
                return;
            }
            byte[] bArr = new byte[10240];
            int i3 = i2 - i;
            while (i3 > 0) {
                int i4 = inputStreamM22806e.read(bArr, 0, 10240);
                if (i4 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, Math.min(i3, i4));
                i3 -= i4;
            }
            inputStreamM22806e.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            promise.resolve(strM157b);
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        this.delegate.getClass();
        try {
            String strM157b = AL0.m157b(str);
            WritableMap writableMapM22807f = AbstractC10253mL0.m22807f(strM157b);
            if (writableMapM22807f == null) {
                callback.invoke("failed to stat path `" + strM157b + "` because it does not exist or it is not a folder", null);
            } else {
                callback.invoke(null, writableMapM22807f);
            }
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        this.delegate.getClass();
        try {
            AbstractC10253mL0.m22802a(new File(AL0.m157b(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) throws IOException {
        this.delegate.getClass();
        try {
            OutputStream outputStream = ((C11913zL0) C11913zL0.f46794d.get(str)).f46797c;
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) throws IOException {
        this.delegate.getClass();
        C11913zL0 c11913zL0 = (C11913zL0) C11913zL0.f46794d.get(str);
        try {
            c11913zL0.f46797c.write(AL0.m158c(str2, c11913zL0.f46796b));
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z, boolean z2, Promise promise) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC11149tL0(str, str2, str3, z, z2, promise));
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z, Promise promise) {
        this.delegate.getClass();
        C11277uL0.f43673c.execute(new RunnableC11021sL0(str, readableArray, z, promise, 1));
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z, Callback callback) {
        this.delegate.getClass();
        C11913zL0 c11913zL0 = new C11913zL0(C11277uL0.f43672b);
        String strM157b = AL0.m157b(str);
        String str3 = strM157b != null ? strM157b : str;
        try {
            File file = new File(str3);
            File parentFile = file.getParentFile();
            if (strM157b == null || file.exists()) {
                if (file.isDirectory()) {
                    callback.invoke("EISDIR", "Expecting a file but '" + str3 + "' is a directory");
                    return;
                }
            } else {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str3 + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    callback.invoke("ENOENT", "File '" + str3 + "' does not exist and could not be created");
                    return;
                }
            }
            OutputStream outputStreamOpenOutputStream = (strM157b == null || !str3.startsWith("bundle-assets://")) ? strM157b == null ? C11277uL0.f43672b.getContentResolver().openOutputStream(Uri.parse(str3)) : new FileOutputStream(str3, z) : C11277uL0.f43672b.getAssets().openFd(str3.replace("bundle-assets://", "")).createOutputStream();
            c11913zL0.f46796b = str2;
            String string = UUID.randomUUID().toString();
            C11913zL0.f46794d.put(string, c11913zL0);
            c11913zL0.f46797c = outputStreamOpenOutputStream;
            callback.invoke(null, null, string);
        } catch (Exception e) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Failed to create write stream at path `", str3, "`; ");
            sbM26240q.append(e.getLocalizedMessage());
            callback.invoke("EUNSPECIFIED", sbM26240q.toString());
        }
    }

    @ReactMethod
    public void writeToMediaFile(String str, String str2, boolean z, Promise promise) {
        this.delegate.getClass();
        if (AbstractC11920zO1.m26432f(Uri.parse(str), str2, z, promise, C11277uL0.f43672b)) {
            promise.resolve("Success");
        }
    }
}
