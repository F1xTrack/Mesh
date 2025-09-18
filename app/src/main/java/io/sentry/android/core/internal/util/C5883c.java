package io.sentry.android.core.internal.util;

import io.sentry.config.AbstractC6003a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.internal.util.c */
/* loaded from: classes2.dex */
public final class C5883c {

    /* renamed from: b */
    public static final C5883c f33752b = new C5883c();

    /* renamed from: a */
    public final ArrayList f33753a = new ArrayList();

    /* renamed from: a */
    public final synchronized ArrayList m21582a() {
        if (!this.f33753a.isEmpty()) {
            return this.f33753a;
        }
        File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        for (File file : fileArrListFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String strM21734C = AbstractC6003a.m21734C(file2);
                        if (strM21734C != null) {
                            this.f33753a.add(Integer.valueOf((int) (Long.parseLong(strM21734C.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f33753a;
    }
}
