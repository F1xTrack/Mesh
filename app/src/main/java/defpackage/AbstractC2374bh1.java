package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: bh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2374bh1 {
    public static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static String a(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!RemoteMessageConst.Notification.CONTENT.equals(b(uri))) {
            if ("file".equals(b(uri))) {
                return uri.getPath();
            }
            return null;
        }
        boolean z = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            documentId.getClass();
            Uri uri3 = z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            uri3.getClass();
            str = "_id=?";
            uri2 = uri3;
            strArr = new String[]{documentId.split(StringUtils.PROCESS_POSTFIX_DELIMITER)[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{"_data"}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data")) != -1) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
            } finally {
                cursorQuery.close();
            }
        }
        return cursorQuery != null ? string : string;
    }

    public static String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean c(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean d(Uri uri) {
        String strB = b(uri);
        return "https".equals(strB) || "http".equals(strB);
    }
}
