package io.sentry.android.core.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c {
    public static final c b = new c();
    public final ArrayList a = new ArrayList();

    public final synchronized ArrayList a() {
        if (!this.a.isEmpty()) {
            return this.a;
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
                        String strC = io.sentry.config.a.C(file2);
                        if (strC != null) {
                            this.a.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.a;
    }
}
