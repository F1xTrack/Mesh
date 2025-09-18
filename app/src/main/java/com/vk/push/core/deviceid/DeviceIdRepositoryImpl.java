package com.vk.push.core.deviceid;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import defpackage.AbstractC0485Fz;
import defpackage.AbstractC3767fP1;
import defpackage.C1091Nt0;
import defpackage.C6051nJ;
import defpackage.C6183o01;
import defpackage.EnumC7274tj;
import defpackage.GK;
import defpackage.InterfaceC1729Vy;
import defpackage.InterfaceC6472pW;
import defpackage.O90;
import defpackage.QF;
import defpackage.SA1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/vk/push/core/deviceid/DeviceIdRepositoryImpl;", "Lcom/vk/push/core/DeviceIdRepository;", "Lcom/vk/push/core/deviceid/DeviceIdDataSource;", "localDataSource", "Lcom/vk/push/core/deviceid/DeviceIdReadOnlyDataSource;", "remoteDataSource", "Lcom/vk/push/core/deviceid/DeviceIdGenerator;", "generator", "LFz;", "dispatcher", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(Lcom/vk/push/core/deviceid/DeviceIdDataSource;Lcom/vk/push/core/deviceid/DeviceIdReadOnlyDataSource;Lcom/vk/push/core/deviceid/DeviceIdGenerator;LFz;Lcom/vk/push/common/Logger;)V", "", "getDeviceId", "(LVy;)Ljava/lang/Object;", "LpW;", "Lcom/vk/push/core/DeviceIdRepository$DeviceIdError;", "i", "LpW;", "getErrorsFlow", "()LpW;", "errorsFlow", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdRepositoryImpl implements DeviceIdRepository {

    @Deprecated
    public static final String DEFAULT_DEVICE_ID = "default_device_id";

    @Deprecated
    public static final int ERROR_BUFFER_SIZE = 5;
    public final DeviceIdDataSource a;
    public final DeviceIdReadOnlyDataSource b;
    public final DeviceIdGenerator c;
    public final AbstractC0485Fz d;
    public final Logger e;
    public volatile String f;
    public final C1091Nt0 g;
    public final C6183o01 h;
    public final C6183o01 i;

    public DeviceIdRepositoryImpl(DeviceIdDataSource deviceIdDataSource, DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource, DeviceIdGenerator deviceIdGenerator, AbstractC0485Fz abstractC0485Fz, Logger logger) {
        O90.f(deviceIdDataSource, "localDataSource");
        O90.f(deviceIdReadOnlyDataSource, "remoteDataSource");
        O90.f(deviceIdGenerator, "generator");
        O90.f(abstractC0485Fz, "dispatcher");
        O90.f(logger, "logger");
        this.a = deviceIdDataSource;
        this.b = deviceIdReadOnlyDataSource;
        this.c = deviceIdGenerator;
        this.d = abstractC0485Fz;
        this.e = logger.createLogger("DeviceIdRepository");
        this.f = DEFAULT_DEVICE_ID;
        this.g = SA1.a();
        C6183o01 c6183o01 = new C6183o01(5, 5, EnumC7274tj.a);
        this.h = c6183o01;
        this.i = c6183o01;
    }

    public static final boolean access$canUseCache(DeviceIdRepositoryImpl deviceIdRepositoryImpl) {
        return !O90.a(deviceIdRepositoryImpl.f, DEFAULT_DEVICE_ID);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$generateDeviceId(com.vk.push.core.deviceid.DeviceIdRepositoryImpl r12, defpackage.InterfaceC1729Vy r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof defpackage.C5860mJ
            if (r0 == 0) goto L16
            r0 = r13
            mJ r0 = (defpackage.C5860mJ) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            mJ r0 = new mJ
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r12 = r0.a
            defpackage.RQ1.d(r13)
            goto L9c
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.RQ1.d(r13)
            com.vk.push.core.deviceid.DeviceIdGenerator r13 = r12.c
            java.lang.String r13 = r13.generateDeviceId()
            o01 r2 = r12.h
            monitor-enter(r2)
            long r4 = r2.l()     // Catch: java.lang.Throwable -> L70
            int r6 = r2.j     // Catch: java.lang.Throwable -> L70
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L70
            long r4 = r4 + r6
            long r6 = r2.h     // Catch: java.lang.Throwable -> L70
            long r4 = r4 - r6
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L70
            if (r4 != 0) goto L53
            MN r4 = defpackage.MN.a     // Catch: java.lang.Throwable -> L70
            monitor-exit(r2)
            goto L74
        L53:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.Object[] r6 = r2.g     // Catch: java.lang.Throwable -> L70
            defpackage.O90.c(r6)     // Catch: java.lang.Throwable -> L70
            r7 = 0
        L5e:
            if (r7 >= r4) goto L72
            long r8 = r2.h     // Catch: java.lang.Throwable -> L70
            long r10 = (long) r7     // Catch: java.lang.Throwable -> L70
            long r8 = r8 + r10
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L70
            int r9 = r6.length     // Catch: java.lang.Throwable -> L70
            int r9 = r9 - r3
            r8 = r8 & r9
            r8 = r6[r8]     // Catch: java.lang.Throwable -> L70
            r5.add(r8)     // Catch: java.lang.Throwable -> L70
            int r7 = r7 + 1
            goto L5e
        L70:
            r12 = move-exception
            goto La0
        L72:
            monitor-exit(r2)
            r4 = r5
        L74:
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L9e
            o01 r12 = r12.h
            com.vk.push.core.DeviceIdRepository$DeviceIdError r2 = new com.vk.push.core.DeviceIdRepository$DeviceIdError
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = "Device id new value "
            java.lang.String r5 = defpackage.AbstractC8235ym.v(r5, r13)
            r4.<init>(r5)
            java.lang.String r5 = "DeviceId: corrupted, generating new"
            r2.<init>(r4, r5)
            r0.a = r13
            r0.d = r3
            java.lang.Object r12 = r12.emit(r2, r0)
            if (r12 != r1) goto L9b
            goto L9f
        L9b:
            r12 = r13
        L9c:
            r1 = r12
            goto L9f
        L9e:
            r1 = r13
        L9f:
            return r1
        La0:
            monitor-exit(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.deviceid.DeviceIdRepositoryImpl.access$generateDeviceId(com.vk.push.core.deviceid.DeviceIdRepositoryImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$saveToLocal(com.vk.push.core.deviceid.DeviceIdRepositoryImpl r8, java.lang.String r9, defpackage.InterfaceC1729Vy r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.C6242oJ
            if (r0 == 0) goto L16
            r0 = r10
            oJ r0 = (defpackage.C6242oJ) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            oJ r0 = new oJ
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L4d
            if (r2 == r3) goto L3a
            if (r2 != r5) goto L32
            java.lang.Object r8 = r0.b
            com.vk.push.core.deviceid.DeviceIdRepositoryImpl r9 = r0.a
            defpackage.RQ1.d(r10)
            goto L92
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.b
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            com.vk.push.core.deviceid.DeviceIdRepositoryImpl r8 = r0.a
            defpackage.RQ1.d(r10)
            PS0 r10 = (defpackage.PS0) r10
            java.lang.Object r10 = r10.a
        L48:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            goto L5f
        L4d:
            defpackage.RQ1.d(r10)
            r0.a = r8
            r0.b = r9
            r0.e = r3
            com.vk.push.core.deviceid.DeviceIdDataSource r10 = r8.a
            java.lang.Object r10 = r10.mo73setDeviceIdgIAlus(r9, r0)
            if (r10 != r1) goto L48
            goto Lab
        L5f:
            boolean r2 = r8 instanceof defpackage.OS0
            if (r2 != 0) goto L6f
            com.vk.push.common.Logger r8 = r9.e
            java.lang.String r9 = "Device id saved, value = "
            java.lang.String r9 = defpackage.AbstractC8235ym.v(r9, r10)
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r9, r4, r5, r4)
            goto La9
        L6f:
            o01 r10 = r9.h
            com.vk.push.core.DeviceIdRepository$DeviceIdError r2 = new com.vk.push.core.DeviceIdRepository$DeviceIdError
            java.lang.Throwable r3 = defpackage.PS0.a(r8)
            if (r3 != 0) goto L80
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r6 = "Unknown exception"
            r3.<init>(r6)
        L80:
            java.lang.String r6 = "DeviceId: failed to save to local"
            r2.<init>(r3, r6)
            r0.a = r9
            r0.b = r8
            r0.e = r5
            java.lang.Object r10 = r10.emit(r2, r0)
            if (r10 != r1) goto L92
            goto Lab
        L92:
            com.vk.push.common.Logger r9 = r9.e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Device id cannot be saved locally, error = "
            r10.<init>(r0)
            java.lang.Throwable r8 = defpackage.PS0.a(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r8, r4, r5, r4)
        La9:
            Tf1 r1 = defpackage.C1518Tf1.a
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.deviceid.DeviceIdRepositoryImpl.access$saveToLocal(com.vk.push.core.deviceid.DeviceIdRepositoryImpl, java.lang.String, Vy):java.lang.Object");
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public Object getDeviceId(InterfaceC1729Vy interfaceC1729Vy) {
        return AbstractC3767fP1.e(this.d, new C6051nJ(this, null), interfaceC1729Vy);
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public InterfaceC6472pW getErrorsFlow() {
        return this.i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceIdRepositoryImpl(DeviceIdDataSource deviceIdDataSource, DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource, DeviceIdGenerator deviceIdGenerator, AbstractC0485Fz abstractC0485Fz, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            GK gk = GK.a;
            abstractC0485Fz = QF.c;
        }
        this(deviceIdDataSource, deviceIdReadOnlyDataSource, deviceIdGenerator, abstractC0485Fz, logger);
    }
}
