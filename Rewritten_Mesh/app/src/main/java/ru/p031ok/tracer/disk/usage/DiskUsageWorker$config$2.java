package ru.p031ok.tracer.disk.usage;

import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m22267d2 = {"<anonymous>", "Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DiskUsageWorker$config$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    public static final DiskUsageWorker$config$2 INSTANCE = new DiskUsageWorker$config$2();

    public DiskUsageWorker$config$2() {
        super(0);
    }

    @Override // p000.InterfaceC6434mZ
    public final DiskUsageConfiguration invoke() {
        return DiskUsageConfiguration.INSTANCE.get$tracer_disk_usage_release();
    }
}
