package com.vk.push.core.deviceid;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.CrashReporterRepository;
import defpackage.AbstractC3767fP1;
import defpackage.C7498uu;
import defpackage.GK;
import defpackage.InterfaceC0952Lz;
import defpackage.O90;
import defpackage.QF;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/deviceid/CollectDeviceIdErrorsUseCase;", "", "Lcom/vk/push/core/DeviceIdRepository;", "repository", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/common/Logger;", "logger", "LLz;", "scope", "<init>", "(Lcom/vk/push/core/DeviceIdRepository;Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/common/Logger;LLz;)V", "LTf1;", "invoke", "()V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CollectDeviceIdErrorsUseCase {
    public final DeviceIdRepository a;
    public final CrashReporterRepository b;
    public final Logger c;
    public final InterfaceC0952Lz d;

    public CollectDeviceIdErrorsUseCase(DeviceIdRepository deviceIdRepository, CrashReporterRepository crashReporterRepository, Logger logger, InterfaceC0952Lz interfaceC0952Lz) {
        O90.f(deviceIdRepository, "repository");
        O90.f(crashReporterRepository, "crashSender");
        O90.f(logger, "logger");
        O90.f(interfaceC0952Lz, "scope");
        this.a = deviceIdRepository;
        this.b = crashReporterRepository;
        this.c = logger;
        this.d = interfaceC0952Lz;
    }

    public final void invoke() {
        GK gk = GK.a;
        AbstractC3767fP1.b(this.d, QF.c, new C7498uu(this, null), 2);
    }
}
