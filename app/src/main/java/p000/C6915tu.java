package p000;

/* renamed from: tu */
/* loaded from: classes2.dex */
public final class C6915tu implements InterfaceC6748rW {

    /* renamed from: a */
    public final /* synthetic */ int f43404a;

    /* renamed from: b */
    public final /* synthetic */ Object f43405b;

    public /* synthetic */ C6915tu(int i, Object obj) {
        this.f43404a = i;
        this.f43405b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // p000.InterfaceC6748rW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, p000.InterfaceC1382Vy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.f43404a
            switch(r0) {
                case 0: goto L83;
                case 1: goto L75;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof p000.C11363v11
            if (r0 == 0) goto L18
            r0 = r6
            v11 r0 = (p000.C11363v11) r0
            int r1 = r0.f44089b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f44089b = r1
            goto L1d
        L18:
            v11 r0 = new v11
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.f44088a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f44089b
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            p000.RQ1.m7017d(r6)
            goto L56
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            p000.RQ1.m7017d(r6)
            z41 r5 = (p000.AbstractC11880z41) r5
            boolean r6 = r5 instanceof p000.C10385nN0
            if (r6 != 0) goto L70
            boolean r6 = r5 instanceof p000.C7204yU
            if (r6 != 0) goto L6b
            boolean r6 = r5 instanceof p000.C0013AC
            if (r6 == 0) goto L59
            AC r5 = (p000.C0013AC) r5
            java.lang.Object r5 = r5.f106a
            r0.f44089b = r3
            java.lang.Object r6 = r4.f43405b
            rW r6 = (p000.InterfaceC6748rW) r6
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L56
            goto L58
        L56:
            Tf1 r1 = p000.C8313Tf1.f11463a
        L58:
            return r1
        L59:
            boolean r5 = r5 instanceof p000.C7949Mf1
            if (r5 == 0) goto L65
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        L65:
            sg r5 = new sg
            r5.<init>()
            throw r5
        L6b:
            yU r5 = (p000.C7204yU) r5
            java.lang.Throwable r5 = r5.f46273a
            throw r5
        L70:
            nN0 r5 = (p000.C10385nN0) r5
            java.lang.Throwable r5 = r5.f38298a
            throw r5
        L75:
            AV r5 = (p000.C0032AV) r5
            java.lang.Object r6 = r4.f43405b
            MY0 r6 = (p000.MY0) r6
            java.util.concurrent.atomic.AtomicReference r6 = r6.f7222c
            r6.set(r5)
            Tf1 r5 = p000.C8313Tf1.f11463a
            return r5
        L83:
            com.vk.push.core.DeviceIdRepository$DeviceIdError r5 = (com.vk.push.core.DeviceIdRepository.DeviceIdError) r5
            java.lang.Object r6 = r4.f43405b
            com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase r6 = (com.p019vk.push.core.deviceid.CollectDeviceIdErrorsUseCase) r6
            com.vk.push.core.data.repository.CrashReporterRepository r6 = com.p019vk.push.core.deviceid.CollectDeviceIdErrorsUseCase.access$getCrashSender$p(r6)
            java.lang.Throwable r5 = r5.getException()
            com.vk.push.core.data.repository.IssueKey r0 = com.p019vk.push.core.data.repository.IssueKey.DEVICE_ID_ERROR
            r6.nonFatalReport(r5, r0)
            Tf1 r5 = p000.C8313Tf1.f11463a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6915tu.emit(java.lang.Object, Vy):java.lang.Object");
    }
}
