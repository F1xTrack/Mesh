package ru.ok.tracer.disk.usage;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DiskUsageWorker$config$2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public static final DiskUsageWorker$config$2 INSTANCE = new DiskUsageWorker$config$2();

    public DiskUsageWorker$config$2() {
        super(0);
    }

    @Override // defpackage.InterfaceC5908mZ
    public final DiskUsageConfiguration invoke() {
        return DiskUsageConfiguration.INSTANCE.get$tracer_disk_usage_release();
    }
}
