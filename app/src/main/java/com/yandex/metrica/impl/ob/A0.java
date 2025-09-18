package com.yandex.metrica.impl.ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import defpackage.AbstractC3685f;
import defpackage.AbstractC3876g;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes2.dex */
public class A0 {
    private final Context a;
    private final b b;

    public static class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public static class b {
    }

    public A0(Context context) {
        this(context, new b());
    }

    public a a() {
        long j;
        long totalBytes = 0;
        if (!U2.a(26)) {
            if (U2.a(18)) {
                try {
                    this.b.getClass();
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    long blockSizeLong = statFs.getBlockSizeLong();
                    return new a((statFs.getBlockCountLong() * blockSizeLong) / 1024, (statFs.getAvailableBlocksLong() * blockSizeLong) / 1024);
                } catch (Throwable unused) {
                    return new a(0L, 0L);
                }
            }
            try {
                this.b.getClass();
                long blockSize = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
                return new a((r0.getBlockCount() * blockSize) / 1024, (r0.getAvailableBlocks() * blockSize) / 1024);
            } catch (Throwable unused2) {
                return new a(0L, 0L);
            }
        }
        StorageStatsManager storageStatsManagerF = AbstractC3685f.f(this.a.getSystemService("storagestats"));
        StorageManager storageManager = (StorageManager) this.a.getSystemService("storage");
        if (storageManager == null || storageStatsManagerF == null) {
            j = 0;
        } else {
            Iterator it = storageManager.getStorageVolumes().iterator();
            long freeBytes = 0;
            while (it.hasNext()) {
                try {
                    String uuid = AbstractC3876g.k(it.next()).getUuid();
                    UUID uuidFromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                    totalBytes += storageStatsManagerF.getTotalBytes(uuidFromString);
                    freeBytes += storageStatsManagerF.getFreeBytes(uuidFromString);
                } catch (Throwable unused3) {
                }
            }
            long j2 = totalBytes;
            totalBytes = freeBytes;
            j = j2;
        }
        return new a(j / 1024, totalBytes / 1024);
    }

    public A0(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }
}
