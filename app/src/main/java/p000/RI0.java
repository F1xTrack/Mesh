package p000;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class RI0 {

    /* renamed from: a */
    public static final ArrayList f10117a = new ArrayList();

    /* renamed from: a */
    public static Uri m6934a(ReactContext reactContext, File file) {
        ArrayList arrayList = f10117a;
        if (arrayList.size() == 0) {
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && arrayList.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith("content://")) {
            return Uri.fromFile(file);
        }
        Uri uriM2663d = null;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                uriM2663d = AbstractC0345FT.m2663d(reactContext, (String) arrayList.get(i), file);
            } catch (Exception e) {
                System.out.println("RNSharePathUtil::compatUriFromFile ERROR " + e.getMessage());
            }
            if (uriM2663d != null) {
                break;
            }
        }
        return uriM2663d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m6935b(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r7 = 0
            DB r8 = new DB     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            android.database.Cursor r9 = r8.mo1583g()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            if (r9 == 0) goto L2e
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            if (r10 == 0) goto L2e
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r9.close()
            return r10
        L29:
            r10 = move-exception
            r7 = r9
            goto L41
        L2c:
            r10 = move-exception
            goto L38
        L2e:
            if (r9 == 0) goto L33
            r9.close()
        L33:
            return r7
        L34:
            r10 = move-exception
            goto L41
        L36:
            r10 = move-exception
            r9 = r7
        L38:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L29
            if (r9 == 0) goto L40
            r9.close()
        L40:
            return r7
        L41:
            if (r7 == 0) goto L46
            r7.close()
        L46:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RI0.m6935b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: c */
    public static String m6936c(Context context, Uri uri, Boolean bool) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                String str = strArrSplit[0];
                if ("primary".equalsIgnoreCase(str) || "0".equalsIgnoreCase(str)) {
                    return "" + (bool.booleanValue() ? context.getCacheDir() : context.getExternalCacheDir()) + "/" + strArrSplit[1];
                }
                if (Core.RAW.equalsIgnoreCase(str)) {
                    return "" + strArrSplit[1];
                }
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("/storage/", str, "/");
                    sbM26240q.append(strArrSplit[1]);
                    return sbM26240q.toString();
                }
            } else {
                if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return "" + documentId.replaceFirst("raw:", "");
                    }
                    return "" + m6935b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                }
                if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    String str2 = strArrSplit2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else if (Core.RAW.equalsIgnoreCase(str2)) {
                        return "" + strArrSplit2[1];
                    }
                    return "" + m6935b(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if (RemoteMessageConst.Notification.CONTENT.equalsIgnoreCase(uri.getScheme())) {
                if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                    return uri.getLastPathSegment();
                }
                return "" + m6935b(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }
}
