package com.vk.push.core.deviceid;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import com.vk.push.core.deviceid.generator.DeviceIdUUIDGenerator;
import com.vk.push.core.deviceid.storage.DeviceIdFileDataSource;
import com.vk.push.core.filedatastore.FileDataSource;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/vk/push/core/deviceid/DeviceIdRepositoryProvider;", "", "Landroid/content/Context;", "context", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/DeviceIdRepository;", "initIfRequired", "(Landroid/content/Context;Lcom/vk/push/common/Logger;)Lcom/vk/push/core/DeviceIdRepository;", "getInstance", "()Lcom/vk/push/core/DeviceIdRepository;", "instance", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdRepositoryProvider {
    public static final DeviceIdRepositoryProvider INSTANCE = new DeviceIdRepositoryProvider();
    public static volatile DeviceIdRepositoryImpl a;

    public final DeviceIdRepository getInstance() {
        DeviceIdRepositoryImpl deviceIdRepositoryImpl = a;
        if (deviceIdRepositoryImpl != null) {
            return deviceIdRepositoryImpl;
        }
        throw new IllegalStateException("DeviceIdProvider was not initialized!");
    }

    public final DeviceIdRepository initIfRequired(Context context, Logger logger) {
        O90.f(context, "context");
        O90.f(logger, "logger");
        DeviceIdRepository deviceIdRepositoryProvider = a;
        if (deviceIdRepositoryProvider == null) {
            synchronized (this) {
                try {
                    if (a == null) {
                        a = new DeviceIdRepositoryImpl(new DeviceIdFileDataSource(new FileDataSource(context, DeviceIdFileDataSource.DEVICE_ID_FILE_NAME, null, 4, null)), new DeviceIdRemoteDataSource(context), new DeviceIdUUIDGenerator(), null, logger, 8, null);
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
