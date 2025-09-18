package com.vk.push.core.deviceid.generator;

import com.vk.push.core.deviceid.DeviceIdGenerator;
import defpackage.O90;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/deviceid/generator/DeviceIdUUIDGenerator;", "Lcom/vk/push/core/deviceid/DeviceIdGenerator;", "()V", "generateDeviceId", "", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdUUIDGenerator implements DeviceIdGenerator {
    @Override // com.vk.push.core.deviceid.DeviceIdGenerator
    public String generateDeviceId() {
        String string = UUID.randomUUID().toString();
        O90.e(string, "randomUUID().toString()");
        return string;
    }
}
