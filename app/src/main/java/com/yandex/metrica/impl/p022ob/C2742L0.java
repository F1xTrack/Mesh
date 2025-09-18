package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.L0 */
/* loaded from: classes2.dex */
public class C2742L0 {
    /* renamed from: a */
    public File m14501a(File file, String str) {
        if (file == null) {
            return null;
        }
        return m14503b(file.getAbsoluteFile(), str);
    }

    /* renamed from: b */
    public File m14502b(Context context) {
        return m14500a(context, "YandexMetricaNativeCrashes");
    }

    /* renamed from: a */
    public File m14499a(Context context) {
        File parentFile;
        if (C2968U2.m15243a(24)) {
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

    /* renamed from: b */
    public File m14503b(File file, String str) {
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }

    /* renamed from: b */
    public String m14504b(Context context, String str) {
        File filesDir;
        if (C2968U2.m15243a(21)) {
            filesDir = context.getNoBackupFilesDir();
        } else {
            filesDir = context.getFilesDir();
        }
        if (filesDir == null) {
            return null;
        }
        return filesDir.getAbsolutePath() + "/" + str;
    }

    /* renamed from: a */
    public File m14500a(Context context, String str) {
        File filesDir;
        if (C2968U2.m15243a(21)) {
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
