package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class YO1 {
    /* JADX WARN: Removed duplicated region for block: B:61:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.app.Activity r9, android.net.Uri r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = r10.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equalsIgnoreCase(r0)
            r1 = 0
            if (r0 == 0) goto L6f
            java.lang.String r0 = "com.google.android.apps.photos.content"
            java.lang.String r2 = r10.getAuthority()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.String r9 = r10.getLastPathSegment()
            return r9
        L1e:
            java.lang.String r0 = "_data"
            java.lang.String r2 = "_display_name"
            java.lang.String[] r5 = new java.lang.String[]{r0, r2}
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L68
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L64
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L64
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L46
            r4 = -1
            if (r0 <= r4) goto L49
            java.lang.String r1 = r3.getString(r0)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r9 = move-exception
            r1 = r3
            goto L69
        L49:
            if (r1 == 0) goto L53
            java.lang.String r1 = r3.getString(r0)     // Catch: java.lang.Throwable -> L46
        L4f:
            r3.close()
            goto L67
        L53:
            int r0 = r3.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L46
            java.io.File r9 = e(r9, r0, r10)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L46
            goto L4f
        L64:
            if (r3 == 0) goto L67
            goto L4f
        L67:
            return r1
        L68:
            r9 = move-exception
        L69:
            if (r1 == 0) goto L6e
            r1.close()
        L6e:
            throw r9
        L6f:
            java.lang.String r9 = "file"
            java.lang.String r0 = r10.getScheme()
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L80
            java.lang.String r9 = r10.getPath()
            return r9
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YO1.a(android.app.Activity, android.net.Uri):java.lang.String");
    }

    public static final void b(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f, Integer num3) {
        bottomSheetBehavior.J = false;
        bottomSheetBehavior.D(false);
        if (num != null) {
            bottomSheetBehavior.G(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.F(num2.intValue());
        }
        if (f != null) {
            bottomSheetBehavior.E(f.floatValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.C(num3.intValue());
        }
    }

    public static /* synthetic */ void c(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f, Integer num3, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        b(bottomSheetBehavior, num, num2, f, num3);
    }

    public static final void d(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3) {
        bottomSheetBehavior.J = false;
        bottomSheetBehavior.D(true);
        if (num != null) {
            bottomSheetBehavior.G(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.F(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.l = num3.intValue();
        }
    }

    public static File e(Activity activity, String str, Uri uri) throws IOException {
        String str2 = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str2).mkdir();
        File file = new File(new File(str2), str.substring(str.lastIndexOf(47) + 1));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr, 0, 8192);
                if (i <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            inputStreamOpenInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
}
