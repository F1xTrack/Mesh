package com.yandex.metrica.impl.p022ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import java.util.Iterator;
import java.util.UUID;
import p000.AbstractC4025f;
import p000.AbstractC4088g;

/* renamed from: com.yandex.metrica.impl.ob.A0 */
/* loaded from: classes2.dex */
public class C2467A0 {

    /* renamed from: a */
    private final Context f20827a;

    /* renamed from: b */
    private final b f20828b;

    /* renamed from: com.yandex.metrica.impl.ob.A0$a */
    public static class a {

        /* renamed from: a */
        public final long f20829a;

        /* renamed from: b */
        public final long f20830b;

        public a(long j, long j2) {
            this.f20829a = j;
            this.f20830b = j2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.A0$b */
    public static class b {
    }

    public C2467A0(Context context) {
        this(context, new b());
    }

    /* renamed from: a */
    public a m13838a() {
        long j;
        long totalBytes = 0;
        if (!C2968U2.m15243a(26)) {
            if (C2968U2.m15243a(18)) {
                try {
                    this.f20828b.getClass();
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    long blockSizeLong = statFs.getBlockSizeLong();
                    return new a((statFs.getBlockCountLong() * blockSizeLong) / 1024, (statFs.getAvailableBlocksLong() * blockSizeLong) / 1024);
                } catch (Throwable unused) {
                    return new a(0L, 0L);
                }
            }
            try {
                this.f20828b.getClass();
                long blockSize = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
                return new a((r0.getBlockCount() * blockSize) / 1024, (r0.getAvailableBlocks() * blockSize) / 1024);
            } catch (Throwable unused2) {
                return new a(0L, 0L);
            }
        }
        StorageStatsManager storageStatsManagerM18123f = AbstractC4025f.m18123f(this.f20827a.getSystemService("storagestats"));
        StorageManager storageManager = (StorageManager) this.f20827a.getSystemService("storage");
        if (storageManager == null || storageStatsManagerM18123f == null) {
            j = 0;
        } else {
            Iterator it = storageManager.getStorageVolumes().iterator();
            long freeBytes = 0;
            while (it.hasNext()) {
                try {
                    String uuid = AbstractC4088g.m18358k(it.next()).getUuid();
                    UUID uuidFromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                    totalBytes += storageStatsManagerM18123f.getTotalBytes(uuidFromString);
                    freeBytes += storageStatsManagerM18123f.getFreeBytes(uuidFromString);
                } catch (Throwable unused3) {
                }
            }
            long j2 = totalBytes;
            totalBytes = freeBytes;
            j = j2;
        }
        return new a(j / 1024, totalBytes / 1024);
    }

    public C2467A0(Context context, b bVar) {
        this.f20827a = context;
        this.f20828b = bVar;
    }
}
