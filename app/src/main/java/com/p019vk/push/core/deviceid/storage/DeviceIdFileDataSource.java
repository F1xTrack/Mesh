package com.p019vk.push.core.deviceid.storage;

import com.p019vk.push.core.deviceid.DeviceIdDataSource;
import com.p019vk.push.core.filedatastore.FileDataSource;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m22267d2 = {"Lcom/vk/push/core/deviceid/storage/DeviceIdFileDataSource;", "Lcom/vk/push/core/deviceid/DeviceIdDataSource;", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "<init>", "(Lcom/vk/push/core/filedatastore/FileDataSource;)V", "LPS0;", "", "getDeviceId-IoAF18A", "(LVy;)Ljava/lang/Object;", "getDeviceId", "deviceId", "LTf1;", "setDeviceId-gIAlu-s", "(Ljava/lang/String;LVy;)Ljava/lang/Object;", "setDeviceId", "Companion", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdFileDataSource implements DeviceIdDataSource {
    public static final String DEVICE_ID_FILE_NAME = "device_id.txt";

    /* renamed from: a */
    public final FileDataSource f20378a;

    public DeviceIdFileDataSource(FileDataSource fileDataSource) {
        O90.m5968f(fileDataSource, "fileDataSource");
        this.f20378a = fileDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.p019vk.push.core.deviceid.DeviceIdReadOnlyDataSource
    /* renamed from: getDeviceId-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo26668getDeviceIdIoAF18A(p000.InterfaceC1382Vy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.C4171hJ
            if (r0 == 0) goto L13
            r0 = r5
            hJ r0 = (p000.C4171hJ) r0
            int r1 = r0.f28374c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28374c = r1
            goto L18
        L13:
            hJ r0 = new hJ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28372a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f28374c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r5)
            PS0 r5 = (p000.PS0) r5
            java.lang.Object r5 = r5.f9075a
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p000.RQ1.m7017d(r5)
            r0.f28374c = r3
            com.vk.push.core.filedatastore.FileDataSource r5 = r4.f20378a
            java.lang.Object r5 = r5.m26671getDataIoAF18A(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.deviceid.storage.DeviceIdFileDataSource.mo26668getDeviceIdIoAF18A(Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.p019vk.push.core.deviceid.DeviceIdDataSource
    /* renamed from: setDeviceId-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo26667setDeviceIdgIAlus(java.lang.String r5, p000.InterfaceC1382Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C4234iJ
            if (r0 == 0) goto L13
            r0 = r6
            iJ r0 = (p000.C4234iJ) r0
            int r1 = r0.f29070c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29070c = r1
            goto L18
        L13:
            iJ r0 = new iJ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f29068a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f29070c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r5 = r6.f9075a
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            r0.f29070c = r3
            com.vk.push.core.filedatastore.FileDataSource r6 = r4.f20378a
            java.lang.Object r5 = r6.m26672setDatagIAlus(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.deviceid.storage.DeviceIdFileDataSource.mo26667setDeviceIdgIAlus(java.lang.String, Vy):java.lang.Object");
    }
}
