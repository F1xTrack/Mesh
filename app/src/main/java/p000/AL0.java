package p000;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class AL0 {
    /* renamed from: a */
    public static void m156a(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", "warn");
        writableMapCreateMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) C11277uL0.f43672b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilMessage", writableMapCreateMap);
    }

    /* renamed from: b */
    public static String m157b(String str) {
        String string;
        Uri uri = null;
        if (str == null) {
            return null;
        }
        if (!str.matches("\\w+\\:.*")) {
            return str;
        }
        if (str.startsWith("file://")) {
            return str.replace("file://", "");
        }
        Uri uri2 = Uri.parse(str);
        if (str.startsWith("bundle-assets://")) {
            return str;
        }
        ReactApplicationContext reactApplicationContext = C11277uL0.f43672b;
        if (!DocumentsContract.isDocumentUri(reactApplicationContext, uri2)) {
            if (RemoteMessageConst.Notification.CONTENT.equalsIgnoreCase(uri2.getScheme())) {
                return "com.google.android.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : AbstractC9358fL1.m18202a(reactApplicationContext, uri2, null, null);
            }
            if ("file".equalsIgnoreCase(uri2.getScheme())) {
                return uri2.getPath();
            }
            return null;
        }
        if ("com.android.externalstorage.documents".equals(uri2.getAuthority())) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri2).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (!"primary".equalsIgnoreCase(strArrSplit[0])) {
                return null;
            }
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return "";
            }
            return externalFilesDir + "/" + strArrSplit[1];
        }
        if ("com.android.providers.downloads.documents".equals(uri2.getAuthority())) {
            try {
                String documentId = DocumentsContract.getDocumentId(uri2);
                if (documentId == null || !documentId.startsWith("raw:/")) {
                    return AbstractC9358fL1.m18202a(reactApplicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), ((documentId == null || !documentId.startsWith("msf:")) ? Long.valueOf(documentId) : Long.valueOf(documentId.split(StringUtils.PROCESS_POSTFIX_DELIMITER)[1])).longValue()), null, null);
                }
                return Uri.parse(documentId).getPath();
            } catch (Exception unused) {
                return null;
            }
        }
        if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
            String[] strArrSplit2 = DocumentsContract.getDocumentId(uri2).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str2 = strArrSplit2[0];
            if ("image".equals(str2)) {
                uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str2)) {
                uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return AbstractC9358fL1.m18202a(reactApplicationContext, uri, "_id=?", new String[]{strArrSplit2[1]});
        }
        if (RemoteMessageConst.Notification.CONTENT.equalsIgnoreCase(uri2.getScheme())) {
            return "com.google.android.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : AbstractC9358fL1.m18202a(reactApplicationContext, uri2, null, null);
        }
        try {
            InputStream inputStreamOpenInputStream = reactApplicationContext.getContentResolver().openInputStream(uri2);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            Cursor cursorQuery = reactApplicationContext.getContentResolver().query(uri2, null, null, null, null);
            cursorQuery.moveToFirst();
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            if (columnIndex >= 0) {
                string = cursorQuery.getString(columnIndex);
                cursorQuery.close();
            } else {
                string = null;
            }
            if (string == null) {
                return null;
            }
            File file = new File(reactApplicationContext.getCacheDir(), string);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (inputStreamOpenInputStream.read(bArr) > 0) {
                fileOutputStream.write(bArr);
            }
            fileOutputStream.close();
            inputStreamOpenInputStream.close();
            return file.getAbsolutePath();
        } catch (Exception e) {
            m156a(e.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m158c(String str, String str2) {
        return str2.equalsIgnoreCase("ascii") ? str.getBytes(Charset.forName("US-ASCII")) : str2.toLowerCase(Locale.ROOT).contains("base64") ? Base64.decode(str, 2) : str2.equalsIgnoreCase("utf8") ? str.getBytes(Charset.forName("UTF-8")) : str.getBytes(Charset.forName("US-ASCII"));
    }
}
