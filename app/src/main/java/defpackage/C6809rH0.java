package defpackage;

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
public final class C6809rH0 implements ActivityEventListener {
    public static final C6619qH0 g = new C6619qH0();
    public final ReactApplicationContext a;
    public DownloadManager.Request b;
    public ValueCallback c;
    public ValueCallback d;
    public File e;
    public File f;

    public C6809rH0(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public static Boolean a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String[] c(String[] strArr) {
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

    public final void b(String str) {
        ReactApplicationContext reactApplicationContext = this.a;
        try {
            ((DownloadManager) reactApplicationContext.getSystemService("download")).enqueue(this.b);
            Toast.makeText(reactApplicationContext, str, 1).show();
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    public final File d(int i) {
        String str;
        String str2;
        int iX = AbstractC8235ym.x(i);
        if (iX == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (iX != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        String.valueOf(System.currentTimeMillis());
        return File.createTempFile(str, str2, this.a.getExternalFilesDir(null));
    }

    public final Uri e(File file) {
        ReactApplicationContext reactApplicationContext = this.a;
        return FT.d(reactApplicationContext, reactApplicationContext.getPackageName() + ".fileprovider", file);
    }

    public final Intent f() {
        Intent intent;
        Throwable e;
        try {
            File fileD = d(2);
            this.e = fileD;
            Uri uriE = e(fileD);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", uriE);
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

    public final Intent g() {
        Intent intent;
        Throwable e;
        try {
            File fileD = d(3);
            this.f = fileD;
            Uri uriE = e(fileD);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", uriE);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6809rH0.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
