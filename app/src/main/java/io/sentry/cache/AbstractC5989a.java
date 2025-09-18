package io.sentry.cache;

import io.sentry.C5759D1;
import io.sentry.C6012e;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: io.sentry.cache.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5989a {

    /* renamed from: a */
    public static final Charset f34096a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m21704a(SentryAndroidOptions sentryAndroidOptions, String str, String str2) {
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
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Deleting %s from scope cache", str2);
            if (file3.delete()) {
                return;
            }
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static Object m21705b(C5759D1 c5759d1, String str, String str2, Class cls, C6012e c6012e) {
        File file;
        String cacheDirPath = c5759d1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            file = new File(cacheDirPath, str);
            file.mkdirs();
        }
        if (file == null) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file2 = new File(file, str2);
        if (file2.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), f34096a));
                try {
                    if (c6012e == null) {
                        Object objMo21458b = c5759d1.getSerializer().mo21458b(bufferedReader, cls);
                        bufferedReader.close();
                        return objMo21458b;
                    }
                    Object objMo21460d = c5759d1.getSerializer().mo21460d(bufferedReader, cls, c6012e);
                    bufferedReader.close();
                    return objMo21460d;
                } finally {
                }
            } catch (Throwable th) {
                c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    /* renamed from: c */
    public static void m21706c(C5759D1 c5759d1, Object obj, String str, String str2) {
        File file;
        String cacheDirPath = c5759d1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file3.delete()) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f34096a));
                try {
                    c5759d1.getSerializer().mo21461e(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Error persisting entity: %s", str2);
        }
    }
}
