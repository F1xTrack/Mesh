package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public class L0 {
    public File a(File file, String str) {
        if (file == null) {
            return null;
        }
        return b(file.getAbsoluteFile(), str);
    }

    public File b(Context context) {
        return a(context, "YandexMetricaNativeCrashes");
    }

    public File a(Context context) {
        File parentFile;
        if (U2.a(24)) {
            parentFile = context.getDataDir();
        } else {
            File filesDir = context.getFilesDir();
            parentFile = filesDir == null ? null : filesDir.getParentFile();
        }
        if (parentFile == null) {
            return null;
        }
        File file = new File(parentFile, "lib");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File b(File file, String str) {
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }

    public String b(Context context, String str) {
        File filesDir;
        if (U2.a(21)) {
            filesDir = context.getNoBackupFilesDir();
        } else {
            filesDir = context.getFilesDir();
        }
        if (filesDir == null) {
            return null;
        }
        return filesDir.getAbsolutePath() + "/" + str;
    }

    public File a(Context context, String str) {
        File filesDir;
        if (U2.a(21)) {
            filesDir = context.getNoBackupFilesDir();
        } else {
            filesDir = context.getFilesDir();
        }
        if (filesDir == null) {
            return null;
        }
        return new File(filesDir, str);
    }
}
