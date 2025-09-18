package com.p019vk.push.core.deviceid;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.DeviceIdRepository;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import kotlin.Metadata;
import p000.AbstractC9366fP1;
import p000.C0399GK;
import p000.C6978uu;
import p000.ExecutorC1023QF;
import p000.InterfaceC0754Lz;
import p000.O90;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lcom/vk/push/core/deviceid/CollectDeviceIdErrorsUseCase;", "", "Lcom/vk/push/core/DeviceIdRepository;", "repository", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/common/Logger;", "logger", "LLz;", "scope", "<init>", "(Lcom/vk/push/core/DeviceIdRepository;Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/common/Logger;LLz;)V", "LTf1;", "invoke", "()V", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CollectDeviceIdErrorsUseCase {

    /* renamed from: a */
    public final DeviceIdRepository f20360a;

    /* renamed from: b */
    public final CrashReporterRepository f20361b;

    /* renamed from: c */
    public final Logger f20362c;

    /* renamed from: d */
    public final InterfaceC0754Lz f20363d;

    public CollectDeviceIdErrorsUseCase(DeviceIdRepository deviceIdRepository, CrashReporterRepository crashReporterRepository, Logger logger, InterfaceC0754Lz interfaceC0754Lz) {
        O90.m5968f(deviceIdRepository, "repository");
        O90.m5968f(crashReporterRepository, "crashSender");
        O90.m5968f(logger, "logger");
        O90.m5968f(interfaceC0754Lz, "scope");
        this.f20360a = deviceIdRepository;
        this.f20361b = crashReporterRepository;
        this.f20362c = logger;
        this.f20363d = interfaceC0754Lz;
    }

    public final void invoke() {
        C0399GK c0399gk = C0399GK.f3694a;
        AbstractC9366fP1.m18230b(this.f20363d, ExecutorC1023QF.f9548c, new C6978uu(this, null), 2);
    }
}
