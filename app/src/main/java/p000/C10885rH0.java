package p000;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;

/* renamed from: rH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10885rH0 implements ActivityEventListener {

    /* renamed from: g */
    public static final C10757qH0 f41409g = new C10757qH0();

    /* renamed from: a */
    public final ReactApplicationContext f41410a;

    /* renamed from: b */
    public DownloadManager.Request f41411b;

    /* renamed from: c */
    public ValueCallback f41412c;

    /* renamed from: d */
    public ValueCallback f41413d;

    /* renamed from: e */
    public File f41414e;

    /* renamed from: f */
    public File f41415f;

    public C10885rH0(ReactApplicationContext reactApplicationContext) {
        this.f41410a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    /* renamed from: a */
    public static Boolean m24246a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: c */
    public static String[] m24247c(String[] strArr) {
        String str;
        if (strArr.length != 0) {
            if (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0) {
                String[] strArr2 = new String[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    if (str2.matches("\\.\\w+")) {
                        String strReplace = str2.replace(".", "");
                        String mimeTypeFromExtension = strReplace != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace) : null;
                        if (mimeTypeFromExtension != null) {
                            strArr2[i] = mimeTypeFromExtension;
                        } else {
                            strArr2[i] = str2;
                        }
                    } else {
                        strArr2[i] = str2;
                    }
                }
                return strArr2;
            }
        }
        return new String[]{"*/*"};
    }

    /* renamed from: b */
    public final void m24248b(String str) {
        ReactApplicationContext reactApplicationContext = this.f41410a;
        try {
            ((DownloadManager) reactApplicationContext.getSystemService("download")).enqueue(this.f41411b);
            Toast.makeText(reactApplicationContext, str, 1).show();
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* renamed from: d */
    public final File m24249d(int i) {
        String str;
        String str2;
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (iM26247x != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        String.valueOf(System.currentTimeMillis());
        return File.createTempFile(str, str2, this.f41410a.getExternalFilesDir(null));
    }

    /* renamed from: e */
    public final Uri m24250e(File file) {
        ReactApplicationContext reactApplicationContext = this.f41410a;
        return AbstractC0345FT.m2663d(reactApplicationContext, reactApplicationContext.getPackageName() + ".fileprovider", file);
    }

    /* renamed from: f */
    public final Intent m24251f() {
        Intent intent;
        Throwable e;
        try {
            File fileM24249d = m24249d(2);
            this.f41414e = fileM24249d;
            Uri uriM24250e = m24250e(fileM24249d);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", uriM24250e);
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e3) {
                e = e3;
                e.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e4) {
            intent = null;
            e = e4;
        }
        return intent;
    }

    /* renamed from: g */
    public final Intent m24252g() {
        Intent intent;
        Throwable e;
        try {
            File fileM24249d = m24249d(3);
            this.f41415f = fileM24249d;
            Uri uriM24250e = m24250e(fileM24249d);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", uriM24250e);
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e3) {
                e = e3;
                e.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e4) {
            intent = null;
            e = e4;
        }
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    @Override // com.facebook.react.bridge.ActivityEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(android.app.Activity r7, int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10885rH0.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
