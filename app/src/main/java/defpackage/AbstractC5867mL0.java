package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Environment;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: mL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5867mL0 {
    public static void a(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete '" + file + "'");
    }

    public static String b(ReactApplicationContext reactApplicationContext, String str) {
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : "";
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        map.put("LegacyDCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        map.put("LegacyPictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        map.put("LegacyMusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        map.put("LegacyDownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        map.put("LegacyMovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        map.put("LegacyRingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals("mounted")) {
            map.put("LegacySDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            map.put("LegacySDCardDir", "");
        }
        return map;
    }

    public static String d(String str) {
        return C7394uL0.b.getFilesDir() + "/ReactNativeBlobUtilTmp_" + str;
    }

    public static InputStream e(String str) {
        return str.startsWith("bundle-assets://") ? C7394uL0.b.getAssets().open(str.replace("bundle-assets://", "")) : str.startsWith("content://") ? C7394uL0.b.getContentResolver().openInputStream(Uri.parse(str)) : new FileInputStream(new File(AL0.b(str)));
    }

    public static WritableMap f(String str) throws IOException {
        try {
            String strB = AL0.b(str);
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (strB != null && strB.startsWith("bundle-assets://")) {
                String strReplace = strB.replace("bundle-assets://", "");
                AssetFileDescriptor assetFileDescriptorOpenFd = C7394uL0.b.getAssets().openFd(strReplace);
                writableMapCreateMap.putString("filename", strReplace);
                writableMapCreateMap.putString("path", strB);
                writableMapCreateMap.putString("type", "asset");
                writableMapCreateMap.putString("size", String.valueOf(assetFileDescriptorOpenFd.getLength()));
                writableMapCreateMap.putInt("lastModified", 0);
            } else {
                File file = new File(strB);
                if (!file.exists()) {
                    return null;
                }
                writableMapCreateMap.putString("filename", file.getName());
                writableMapCreateMap.putString("path", file.getPath());
                writableMapCreateMap.putString("type", file.isDirectory() ? "directory" : "file");
                writableMapCreateMap.putString("size", String.valueOf(file.length()));
                writableMapCreateMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return writableMapCreateMap;
        } catch (Exception unused) {
            return null;
        }
    }
}
