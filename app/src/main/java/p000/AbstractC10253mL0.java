package p000;

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
public abstract class AbstractC10253mL0 {
    /* renamed from: a */
    public static void m22802a(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : fileArrListFiles) {
                m22802a(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete '" + file + "'");
    }

    /* renamed from: b */
    public static String m22803b(ReactApplicationContext reactApplicationContext, String str) {
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : "";
    }

    /* renamed from: c */
    public static HashMap m22804c() {
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

    /* renamed from: d */
    public static String m22805d(String str) {
        return C11277uL0.f43672b.getFilesDir() + "/ReactNativeBlobUtilTmp_" + str;
    }

    /* renamed from: e */
    public static InputStream m22806e(String str) {
        return str.startsWith("bundle-assets://") ? C11277uL0.f43672b.getAssets().open(str.replace("bundle-assets://", "")) : str.startsWith("content://") ? C11277uL0.f43672b.getContentResolver().openInputStream(Uri.parse(str)) : new FileInputStream(new File(AL0.m157b(str)));
    }

    /* renamed from: f */
    public static WritableMap m22807f(String str) throws IOException {
        try {
            String strM157b = AL0.m157b(str);
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (strM157b != null && strM157b.startsWith("bundle-assets://")) {
                String strReplace = strM157b.replace("bundle-assets://", "");
                AssetFileDescriptor assetFileDescriptorOpenFd = C11277uL0.f43672b.getAssets().openFd(strReplace);
                writableMapCreateMap.putString("filename", strReplace);
                writableMapCreateMap.putString("path", strM157b);
                writableMapCreateMap.putString("type", "asset");
                writableMapCreateMap.putString("size", String.valueOf(assetFileDescriptorOpenFd.getLength()));
                writableMapCreateMap.putInt("lastModified", 0);
            } else {
                File file = new File(strM157b);
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
