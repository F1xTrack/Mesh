package com.vk.push.core.utils;

import defpackage.AbstractC1963Yy;
import defpackage.AbstractC5615l12;
import defpackage.C1518Tf1;
import defpackage.C4111hD;
import defpackage.EnumC1030Mz;
import defpackage.InterfaceC1729Vy;
import defpackage.InterfaceC3729fD;
import defpackage.InterfaceC6472pW;
import defpackage.InterfaceC6853rW;
import defpackage.InterfaceC7940xD;
import defpackage.LC0;
import defpackage.NC0;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a;\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a3\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "LfD;", "LGt0;", "LLC0;", "key", "getValue", "(LfD;LLC0;LVy;)Ljava/lang/Object;", "defaultSavedValue", "(LfD;LLC0;Ljava/lang/Object;LVy;)Ljava/lang/Object;", "value", "LTf1;", "setValue", "LpW;", "getValueFlow", "(LfD;LLC0;)LpW;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DataStoreExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object getValue(defpackage.InterfaceC3729fD r4, defpackage.LC0 r5, T r6, defpackage.InterfaceC1729Vy r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C3920gD
            if (r0 == 0) goto L13
            r0 = r7
            gD r0 = (defpackage.C3920gD) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gD r0 = new gD
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.RQ1.d(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.RQ1.d(r7)
            r0.a = r6
            r0.c = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.utils.DataStoreExtensionsKt.getValue(fD, LC0, java.lang.Object, Vy):java.lang.Object");
    }

    public static final <T> InterfaceC6472pW getValueFlow(InterfaceC3729fD interfaceC3729fD, final LC0 lc0) {
        O90.f(interfaceC3729fD, "<this>");
        O90.f(lc0, "key");
        final InterfaceC6472pW data = interfaceC3729fD.getData();
        return new InterfaceC6472pW() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LTf1;", "emit", "(Ljava/lang/Object;LVy;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC6853rW {
                public final /* synthetic */ InterfaceC6853rW a;
                public final /* synthetic */ LC0 b;

                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @InterfaceC7940xD(c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2", f = "DataStoreExtensions.kt", l = {223}, m = "emit")
                /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC1963Yy {
                    public /* synthetic */ Object a;
                    public int b;

                    public AnonymousClass1(InterfaceC1729Vy interfaceC1729Vy) {
                        super(interfaceC1729Vy);
                    }

                    @Override // defpackage.AbstractC1594Uf
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC6853rW interfaceC6853rW, LC0 lc0) {
                    this.a = interfaceC6853rW;
                    this.b = lc0;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // defpackage.InterfaceC6853rW
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.InterfaceC1729Vy r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1 r0 = (com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1 r0 = new com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        Mz r1 = defpackage.EnumC1030Mz.a
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        defpackage.RQ1.d(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        defpackage.RQ1.d(r6)
                        Gt0 r5 = (defpackage.C0546Gt0) r5
                        LC0 r6 = r4.b
                        java.lang.Object r5 = r5.b(r6)
                        r0.b = r3
                        rW r6 = r4.a
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        Tf1 r5 = defpackage.C1518Tf1.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, Vy):java.lang.Object");
                }
            }

            @Override // defpackage.InterfaceC6472pW
            public Object collect(InterfaceC6853rW interfaceC6853rW, InterfaceC1729Vy interfaceC1729Vy) {
                Object objCollect = data.collect(new AnonymousClass2(interfaceC6853rW, lc0), interfaceC1729Vy);
                return objCollect == EnumC1030Mz.a ? objCollect : C1518Tf1.a;
            }
        };
    }

    public static final <T> Object setValue(InterfaceC3729fD interfaceC3729fD, LC0 lc0, T t, InterfaceC1729Vy interfaceC1729Vy) {
        Object objA = interfaceC3729fD.a(new NC0(new C4111hD(t, lc0, null), null), interfaceC1729Vy);
        return objA == EnumC1030Mz.a ? objA : C1518Tf1.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1] */
    public static final <T> Object getValue(InterfaceC3729fD interfaceC3729fD, final LC0 lc0, InterfaceC1729Vy interfaceC1729Vy) {
        final InterfaceC6472pW data = interfaceC3729fD.getData();
        return AbstractC5615l12.c(new InterfaceC6472pW() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LTf1;", "emit", "(Ljava/lang/Object;LVy;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC6853rW {
                public final /* synthetic */ InterfaceC6853rW a;
                public final /* synthetic */ LC0 b;

                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @InterfaceC7940xD(c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2", f = "DataStoreExtensions.kt", l = {223}, m = "emit")
                /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC1963Yy {
                    public /* synthetic */ Object a;
                    public int b;

                    public AnonymousClass1(InterfaceC1729Vy interfaceC1729Vy) {
                        super(interfaceC1729Vy);
                    }

                    @Override // defpackage.AbstractC1594Uf
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC6853rW interfaceC6853rW, LC0 lc0) {
                    this.a = interfaceC6853rW;
                    this.b = lc0;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // defpackage.InterfaceC6853rW
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.InterfaceC1729Vy r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1 r0 = (com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1 r0 = new com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        Mz r1 = defpackage.EnumC1030Mz.a
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        defpackage.RQ1.d(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        defpackage.RQ1.d(r6)
                        Gt0 r5 = (defpackage.C0546Gt0) r5
                        LC0 r6 = r4.b
                        java.lang.Object r5 = r5.b(r6)
                        r0.b = r3
                        rW r6 = r4.a
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        Tf1 r5 = defpackage.C1518Tf1.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, Vy):java.lang.Object");
                }
            }

            @Override // defpackage.InterfaceC6472pW
            public Object collect(InterfaceC6853rW interfaceC6853rW, InterfaceC1729Vy interfaceC1729Vy2) {
                Object objCollect = data.collect(new AnonymousClass2(interfaceC6853rW, lc0), interfaceC1729Vy2);
                return objCollect == EnumC1030Mz.a ? objCollect : C1518Tf1.a;
            }
        }, interfaceC1729Vy);
    }
}
