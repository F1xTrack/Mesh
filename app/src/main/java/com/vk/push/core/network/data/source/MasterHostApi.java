package com.vk.push.core.network.data.source;

import com.vk.push.common.HostInfoProvider;
import defpackage.AbstractC0485Fz;
import defpackage.C6363ox0;
import defpackage.GK;
import defpackage.O90;
import defpackage.QF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0010J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\rH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/vk/push/core/network/data/source/MasterHostApi;", "", "Lox0;", "okHttpClient", "Lcom/vk/push/common/HostInfoProvider;", "hostInfoProvider", "LFz;", "dispatcher", "<init>", "(Lox0;Lcom/vk/push/common/HostInfoProvider;LFz;)V", "", "", "hostAppInfoList", "LPS0;", "Lcom/vk/push/common/AppInfo;", "getMaster-gIAlu-s", "(Ljava/util/List;LVy;)Ljava/lang/Object;", "getMaster", "installedHostList", "getHostList-gIAlu-s", "getHostList", "getAllExistingHostList-IoAF18A", "(LVy;)Ljava/lang/Object;", "getAllExistingHostList", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MasterHostApi {
    public final C6363ox0 a;
    public final HostInfoProvider b;
    public final AbstractC0485Fz c;

    public MasterHostApi(C6363ox0 c6363ox0, HostInfoProvider hostInfoProvider, AbstractC0485Fz abstractC0485Fz) {
        O90.f(c6363ox0, "okHttpClient");
        O90.f(hostInfoProvider, "hostInfoProvider");
        O90.f(abstractC0485Fz, "dispatcher");
        this.a = c6363ox0;
        this.b = hostInfoProvider;
        this.c = abstractC0485Fz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getAllExistingHostList-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m82getAllExistingHostListIoAF18A(defpackage.InterfaceC1729Vy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C0606Hn0
            if (r0 == 0) goto L13
            r0 = r5
            Hn0 r0 = (defpackage.C0606Hn0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Hn0 r0 = new Hn0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.RQ1.d(r5)
            In0 r5 = new In0
            r2 = 0
            r5.<init>(r4, r2)
            r0.c = r3
            Fz r2 = r4.c
            java.lang.Object r5 = defpackage.AbstractC3767fP1.e(r2, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            PS0 r5 = (defpackage.PS0) r5
            java.lang.Object r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.network.data.source.MasterHostApi.m82getAllExistingHostListIoAF18A(Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getHostList-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m83getHostListgIAlus(java.util.List<java.lang.String> r5, defpackage.InterfaceC1729Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C0762Jn0
            if (r0 == 0) goto L13
            r0 = r6
            Jn0 r0 = (defpackage.C0762Jn0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Jn0 r0 = new Jn0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.RQ1.d(r6)
            Kn0 r6 = new Kn0
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.c = r3
            Fz r5 = r4.c
            java.lang.Object r6 = defpackage.AbstractC3767fP1.e(r5, r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.network.data.source.MasterHostApi.m83getHostListgIAlus(java.util.List, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getMaster-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m84getMastergIAlus(java.util.List<java.lang.String> r5, defpackage.InterfaceC1729Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C0918Ln0
            if (r0 == 0) goto L13
            r0 = r6
            Ln0 r0 = (defpackage.C0918Ln0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Ln0 r0 = new Ln0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.RQ1.d(r6)
            Mn0 r6 = new Mn0
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.c = r3
            Fz r5 = r4.c
            java.lang.Object r6 = defpackage.AbstractC3767fP1.e(r5, r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.network.data.source.MasterHostApi.m84getMastergIAlus(java.util.List, Vy):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MasterHostApi(C6363ox0 c6363ox0, HostInfoProvider hostInfoProvider, AbstractC0485Fz abstractC0485Fz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            GK gk = GK.a;
            abstractC0485Fz = QF.c;
        }
        this(c6363ox0, hostInfoProvider, abstractC0485Fz);
    }
}
