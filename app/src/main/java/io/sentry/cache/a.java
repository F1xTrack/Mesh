package io.sentry.cache;

import io.sentry.C5119e;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Charset a = Charset.forName("UTF-8");

    public static void a(SentryAndroidOptions sentryAndroidOptions, String str, String str2) {
        File file;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, "Deleting %s from scope cache", str2);
            if (file3.delete()) {
                return;
            }
            sentryAndroidOptions.getLogger().k(EnumC5148n1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
        }
    }

    public static Object b(D1 d1, String str, String str2, Class cls, C5119e c5119e) {
        File file;
        String cacheDirPath = d1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            file = new File(cacheDirPath, str);
            file.mkdirs();
        }
        if (file == null) {
            d1.getLogger().k(EnumC5148n1.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file2 = new File(file, str2);
        if (file2.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), a));
                try {
                    if (c5119e == null) {
                        Object objB = d1.getSerializer().b(bufferedReader, cls);
                        bufferedReader.close();
                        return objB;
                    }
                    Object objD = d1.getSerializer().d(bufferedReader, cls, c5119e);
                    bufferedReader.close();
                    return objD;
                } finally {
                }
            } catch (Throwable th) {
                d1.getLogger().c(EnumC5148n1.ERROR, th, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            d1.getLogger().k(EnumC5148n1.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static void c(D1 d1, Object obj, String str, String str2) {
        File file;
        String cacheDirPath = d1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            d1.getLogger().k(EnumC5148n1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            d1.getLogger().k(EnumC5148n1.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file3.delete()) {
                d1.getLogger().k(EnumC5148n1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, a));
                try {
                    d1.getSerializer().e(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            d1.getLogger().c(EnumC5148n1.ERROR, th, "Error persisting entity: %s", str2);
        }
    }
}
