package com.p019vk.push.core.utils;

import kotlin.Metadata;
import p000.AbstractC10084l12;
import p000.AbstractC1571Yy;
import p000.C4165hD;
import p000.C8313Tf1;
import p000.EnumC0817Mz;
import p000.InterfaceC1382Vy;
import p000.InterfaceC4039fD;
import p000.InterfaceC6622pW;
import p000.InterfaceC6748rW;
import p000.InterfaceC7124xD;
import p000.LC0;
import p000.NC0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a;\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a3\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m22267d2 = {"T", "LfD;", "LGt0;", "LLC0;", "key", "getValue", "(LfD;LLC0;LVy;)Ljava/lang/Object;", "defaultSavedValue", "(LfD;LLC0;Ljava/lang/Object;LVy;)Ljava/lang/Object;", "value", "LTf1;", "setValue", "LpW;", "getValueFlow", "(LfD;LLC0;)LpW;", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DataStoreExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object getValue(p000.InterfaceC4039fD r4, p000.LC0 r5, T r6, p000.InterfaceC1382Vy r7) {
        /*
            boolean r0 = r7 instanceof p000.C4102gD
            if (r0 == 0) goto L13
            r0 = r7
            gD r0 = (p000.C4102gD) r0
            int r1 = r0.f27612c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27612c = r1
            goto L18
        L13:
            gD r0 = new gD
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27611b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f27612c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.f27610a
            p000.RQ1.m7017d(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p000.RQ1.m7017d(r7)
            r0.f27610a = r6
            r0.f27612c = r3
            java.lang.Object r7 = getValue(r4, r5, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            if (r7 != 0) goto L42
            goto L43
        L42:
            r6 = r7
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.utils.DataStoreExtensionsKt.getValue(fD, LC0, java.lang.Object, Vy):java.lang.Object");
    }

    public static final <T> InterfaceC6622pW getValueFlow(InterfaceC4039fD interfaceC4039fD, final LC0 lc0) {
        O90.m5968f(interfaceC4039fD, "<this>");
        O90.m5968f(lc0, "key");
        final InterfaceC6622pW data = interfaceC4039fD.getData();
        return new InterfaceC6622pW() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1

            @Metadata(m22266d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m22267d2 = {"T", "R", "value", "LTf1;", "emit", "(Ljava/lang/Object;LVy;)Ljava/lang/Object;", "<anonymous>"}, m22268k = 3, m22269mv = {1, 7, 1})
            /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2 */
            public static final class C24282<T> implements InterfaceC6748rW {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC6748rW f20596a;

                /* renamed from: b */
                public final /* synthetic */ LC0 f20597b;

                @Metadata(m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
                @InterfaceC7124xD(m25814c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2", m25815f = "DataStoreExtensions.kt", m25816l = {223}, m25817m = "emit")
                /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC1571Yy {

                    /* renamed from: a */
                    public /* synthetic */ Object f20598a;

                    /* renamed from: b */
                    public int f20599b;

                    public AnonymousClass1(InterfaceC1382Vy interfaceC1382Vy) {
                        super(interfaceC1382Vy);
                    }

                    @Override // p000.AbstractC1300Uf
                    public final Object invokeSuspend(Object obj) {
                        this.f20598a = obj;
                        this.f20599b |= Integer.MIN_VALUE;
                        return C24282.this.emit(null, this);
                    }
                }

                public C24282(InterfaceC6748rW interfaceC6748rW, LC0 lc0) {
                    this.f20596a = interfaceC6748rW;
                    this.f20597b = lc0;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p000.InterfaceC6748rW
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, p000.InterfaceC1382Vy r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.p019vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1.C24282.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1 r0 = (com.p019vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1.C24282.AnonymousClass1) r0
                        int r1 = r0.f20599b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f20599b = r1
                        goto L18
                    L13:
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1 r0 = new com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f20598a
                        Mz r1 = p000.EnumC0817Mz.f7418a
                        int r2 = r0.f20599b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        p000.RQ1.m7017d(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        p000.RQ1.m7017d(r6)
                        Gt0 r5 = (p000.C7664Gt0) r5
                        LC0 r6 = r4.f20597b
                        java.lang.Object r5 = r5.m3186b(r6)
                        r0.f20599b = r3
                        rW r6 = r4.f20596a
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        Tf1 r5 = p000.C8313Tf1.f11463a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1.C24282.emit(java.lang.Object, Vy):java.lang.Object");
                }
            }

            @Override // p000.InterfaceC6622pW
            public Object collect(InterfaceC6748rW interfaceC6748rW, InterfaceC1382Vy interfaceC1382Vy) {
                Object objCollect = data.collect(new C24282(interfaceC6748rW, lc0), interfaceC1382Vy);
                return objCollect == EnumC0817Mz.f7418a ? objCollect : C8313Tf1.f11463a;
            }
        };
    }

    public static final <T> Object setValue(InterfaceC4039fD interfaceC4039fD, LC0 lc0, T t, InterfaceC1382Vy interfaceC1382Vy) {
        Object objMo2067a = interfaceC4039fD.mo2067a(new NC0(new C4165hD(t, lc0, null), null), interfaceC1382Vy);
        return objMo2067a == EnumC0817Mz.f7418a ? objMo2067a : C8313Tf1.f11463a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1] */
    public static final <T> Object getValue(InterfaceC4039fD interfaceC4039fD, final LC0 lc0, InterfaceC1382Vy interfaceC1382Vy) {
        final InterfaceC6622pW data = interfaceC4039fD.getData();
        return AbstractC10084l12.m22337c(new InterfaceC6622pW() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1

            @Metadata(m22266d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m22267d2 = {"T", "R", "value", "LTf1;", "emit", "(Ljava/lang/Object;LVy;)Ljava/lang/Object;", "<anonymous>"}, m22268k = 3, m22269mv = {1, 7, 1})
            /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2 */
            public static final class C24272<T> implements InterfaceC6748rW {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC6748rW f20589a;

                /* renamed from: b */
                public final /* synthetic */ LC0 f20590b;

                @Metadata(m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
                @InterfaceC7124xD(m25814c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2", m25815f = "DataStoreExtensions.kt", m25816l = {223}, m25817m = "emit")
                /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC1571Yy {

                    /* renamed from: a */
                    public /* synthetic */ Object f20591a;

                    /* renamed from: b */
                    public int f20592b;

                    public AnonymousClass1(InterfaceC1382Vy interfaceC1382Vy) {
                        super(interfaceC1382Vy);
                    }

                    @Override // p000.AbstractC1300Uf
                    public final Object invokeSuspend(Object obj) {
                        this.f20591a = obj;
                        this.f20592b |= Integer.MIN_VALUE;
                        return C24272.this.emit(null, this);
                    }
                }

                public C24272(InterfaceC6748rW interfaceC6748rW, LC0 lc0) {
                    this.f20589a = interfaceC6748rW;
                    this.f20590b = lc0;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p000.InterfaceC6748rW
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, p000.InterfaceC1382Vy r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.p019vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1.C24272.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1 r0 = (com.p019vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1.C24272.AnonymousClass1) r0
                        int r1 = r0.f20592b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f20592b = r1
                        goto L18
                    L13:
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1 r0 = new com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f20591a
                        Mz r1 = p000.EnumC0817Mz.f7418a
                        int r2 = r0.f20592b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        p000.RQ1.m7017d(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        p000.RQ1.m7017d(r6)
                        Gt0 r5 = (p000.C7664Gt0) r5
                        LC0 r6 = r4.f20590b
                        java.lang.Object r5 = r5.m3186b(r6)
                        r0.f20592b = r3
                        rW r6 = r4.f20589a
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        Tf1 r5 = p000.C8313Tf1.f11463a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1.C24272.emit(java.lang.Object, Vy):java.lang.Object");
                }
            }

            @Override // p000.InterfaceC6622pW
            public Object collect(InterfaceC6748rW interfaceC6748rW, InterfaceC1382Vy interfaceC1382Vy2) {
                Object objCollect = data.collect(new C24272(interfaceC6748rW, lc0), interfaceC1382Vy2);
                return objCollect == EnumC0817Mz.f7418a ? objCollect : C8313Tf1.f11463a;
            }
        }, interfaceC1382Vy);
    }
}
