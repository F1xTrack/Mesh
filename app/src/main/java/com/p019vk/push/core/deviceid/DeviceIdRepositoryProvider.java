package com.p019vk.push.core.deviceid;

import android.content.Context;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.DeviceIdRepository;
import com.p019vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import com.p019vk.push.core.deviceid.generator.DeviceIdUUIDGenerator;
import com.p019vk.push.core.deviceid.storage.DeviceIdFileDataSource;
import com.p019vk.push.core.filedatastore.FileDataSource;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/deviceid/DeviceIdRepositoryProvider;", "", "Landroid/content/Context;", "context", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/DeviceIdRepository;", "initIfRequired", "(Landroid/content/Context;Lcom/vk/push/common/Logger;)Lcom/vk/push/core/DeviceIdRepository;", "getInstance", "()Lcom/vk/push/core/DeviceIdRepository;", "instance", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdRepositoryProvider {
    public static final DeviceIdRepositoryProvider INSTANCE = new DeviceIdRepositoryProvider();

    /* renamed from: a */
    public static volatile DeviceIdRepositoryImpl f20373a;

    public final DeviceIdRepository getInstance() {
        DeviceIdRepositoryImpl deviceIdRepositoryImpl = f20373a;
        if (deviceIdRepositoryImpl != null) {
            return deviceIdRepositoryImpl;
        }
        throw new IllegalStateException("DeviceIdProvider was not initialized!");
    }

    public final DeviceIdRepository initIfRequired(Context context, Logger logger) {
        O90.m5968f(context, "context");
        O90.m5968f(logger, "logger");
        DeviceIdRepository deviceIdRepositoryProvider = f20373a;
        if (deviceIdRepositoryProvider == null) {
            synchronized (this) {
                try {
                    if (f20373a == null) {
                        f20373a = new DeviceIdRepositoryImpl(new DeviceIdFileDataSource(new FileDataSource(context, DeviceIdFileDataSource.DEVICE_ID_FILE_NAME, null, 4, null)), new DeviceIdRemoteDataSource(context), new DeviceIdUUIDGenerator(), null, logger, 8, null);
                    }
                    deviceIdRepositoryProvider = INSTANCE.getInstance();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return deviceIdRepositoryProvider;
    }
}
