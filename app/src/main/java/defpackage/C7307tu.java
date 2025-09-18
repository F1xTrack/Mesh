package defpackage;

/* renamed from: tu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7307tu implements InterfaceC6853rW {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C7307tu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.InterfaceC6853rW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, defpackage.InterfaceC1729Vy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L83;
                case 1: goto L75;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof defpackage.C7523v11
            if (r0 == 0) goto L18
            r0 = r6
            v11 r0 = (defpackage.C7523v11) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.b = r1
            goto L1d
        L18:
            v11 r0 = new v11
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            defpackage.RQ1.d(r6)
            goto L56
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.RQ1.d(r6)
            z41 r5 = (defpackage.AbstractC8295z41) r5
            boolean r6 = r5 instanceof defpackage.C6064nN0
            if (r6 != 0) goto L70
            boolean r6 = r5 instanceof defpackage.C8181yU
            if (r6 != 0) goto L6b
            boolean r6 = r5 instanceof defpackage.AC
            if (r6 == 0) goto L59
            AC r5 = (defpackage.AC) r5
            java.lang.Object r5 = r5.a
            r0.b = r3
            java.lang.Object r6 = r4.b
            rW r6 = (defpackage.InterfaceC6853rW) r6
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L56
            goto L58
        L56:
            Tf1 r1 = defpackage.C1518Tf1.a
        L58:
            return r1
        L59:
            boolean r5 = r5 instanceof defpackage.C0972Mf1
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
            yU r5 = (defpackage.C8181yU) r5
            java.lang.Throwable r5 = r5.a
            throw r5
        L70:
            nN0 r5 = (defpackage.C6064nN0) r5
            java.lang.Throwable r5 = r5.a
            throw r5
        L75:
            AV r5 = (defpackage.AV) r5
            java.lang.Object r6 = r4.b
            MY0 r6 = (defpackage.MY0) r6
            java.util.concurrent.atomic.AtomicReference r6 = r6.c
            r6.set(r5)
            Tf1 r5 = defpackage.C1518Tf1.a
            return r5
        L83:
            com.vk.push.core.DeviceIdRepository$DeviceIdError r5 = (com.vk.push.core.DeviceIdRepository.DeviceIdError) r5
            java.lang.Object r6 = r4.b
            com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase r6 = (com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase) r6
            com.vk.push.core.data.repository.CrashReporterRepository r6 = com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase.access$getCrashSender$p(r6)
            java.lang.Throwable r5 = r5.getException()
            com.vk.push.core.data.repository.IssueKey r0 = com.vk.push.core.data.repository.IssueKey.DEVICE_ID_ERROR
            r6.nonFatalReport(r5, r0)
            Tf1 r5 = defpackage.C1518Tf1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7307tu.emit(java.lang.Object, Vy):java.lang.Object");
    }
}
