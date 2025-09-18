package com.p019vk.push.core.filedatastore.migration;

import android.content.Context;
import com.p019vk.push.common.utils.FileExtensionKt;
import java.util.List;
import kotlin.Metadata;
import p000.InterfaceC1382Vy;
import p000.InterfaceC4039fD;
import p000.InterfaceC6497nZ;
import p000.LC0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00142\u0006\u0010\u0010\u001a\u00020\tH\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m22267d2 = {"Lcom/vk/push/core/filedatastore/migration/PreferenceDataStoreByKeyMigration;", "T", "Lcom/vk/push/core/filedatastore/migration/Migration;", "", "preferenceName", "", "LLC0;", "keysToMigrate", "Lkotlin/Function1;", "Landroid/content/Context;", "LfD;", "LGt0;", "commonDataStoreProvider", "transform", "<init>", "(Ljava/lang/String;Ljava/util/List;LnZ;LnZ;)V", "context", "", "shouldMigrate", "(Landroid/content/Context;LVy;)Ljava/lang/Object;", "LPS0;", "migrate-gIAlu-s", "migrate", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PreferenceDataStoreByKeyMigration<T> implements Migration<T> {

    /* renamed from: a */
    public final String f20429a;

    /* renamed from: b */
    public final List f20430b;

    /* renamed from: c */
    public final InterfaceC6497nZ f20431c;

    /* renamed from: d */
    public final InterfaceC6497nZ f20432d;

    public PreferenceDataStoreByKeyMigration(String str, List<? extends LC0> list, InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2) {
        O90.m5968f(str, "preferenceName");
        O90.m5968f(list, "keysToMigrate");
        O90.m5968f(interfaceC6497nZ, "commonDataStoreProvider");
        O90.m5968f(interfaceC6497nZ2, "transform");
        this.f20429a = str;
        this.f20430b = list;
        this.f20431c = interfaceC6497nZ;
        this.f20432d = interfaceC6497nZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m13741a(p000.InterfaceC4039fD r5, p000.InterfaceC1382Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.FC0
            if (r0 == 0) goto L13
            r0 = r6
            FC0 r0 = (p000.FC0) r0
            int r1 = r0.f3089c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3089c = r1
            goto L18
        L13:
            FC0 r0 = new FC0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3087a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f3089c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.RQ1.m7017d(r6)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000.RQ1.m7017d(r6)
            pW r5 = r5.getData()     // Catch: java.lang.Throwable -> L27
            r0.f3089c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = p000.AbstractC10084l12.m22336b(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L41
            return r1
        L41:
            Gt0 r6 = (p000.C7664Gt0) r6     // Catch: java.lang.Throwable -> L27
            java.util.Map r5 = r6.m3185a()     // Catch: java.lang.Throwable -> L27
            java.util.Set r5 = r5.keySet()     // Catch: java.lang.Throwable -> L27
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L27
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L27
            goto L59
        L55:
            OS0 r5 = p000.RQ1.m7015b(r5)
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = r5 instanceof p000.OS0
            if (r0 == 0) goto L60
            r5 = r6
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration.m13741a(fD, Vy):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m13742b(p000.InterfaceC4039fD r5, p000.InterfaceC1382Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.GC0
            if (r0 == 0) goto L13
            r0 = r6
            GC0 r0 = (p000.GC0) r0
            int r1 = r0.f3642d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3642d = r1
            goto L18
        L13:
            GC0 r0 = new GC0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3640b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f3642d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration r5 = r0.f3639a
            p000.RQ1.m7017d(r6)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r5 = move-exception
            goto L7a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            pW r5 = r5.getData()     // Catch: java.lang.Throwable -> L29
            r0.f3639a = r4     // Catch: java.lang.Throwable -> L29
            r0.f3642d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = p000.AbstractC10084l12.m22336b(r5, r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            Gt0 r6 = (p000.C7664Gt0) r6     // Catch: java.lang.Throwable -> L29
            java.util.Map r6 = r6.m3185a()     // Catch: java.lang.Throwable -> L29
            java.util.Set r6 = r6.keySet()     // Catch: java.lang.Throwable -> L29
            boolean r0 = r6 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L29
            r1 = 0
            if (r0 == 0) goto L5d
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L5d
        L5b:
            r3 = r1
            goto L75
        L5d:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L29
        L61:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L29
            LC0 r0 = (p000.LC0) r0     // Catch: java.lang.Throwable -> L29
            java.util.List r2 = r5.f20430b     // Catch: java.lang.Throwable -> L29
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L61
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L29
            goto L7e
        L7a:
            OS0 r5 = p000.RQ1.m7015b(r5)
        L7e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = r5 instanceof p000.OS0
            if (r0 == 0) goto L85
            r5 = r6
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration.m13742b(fD, Vy):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:39:0x00ba, B:41:0x00c2, B:21:0x004a, B:35:0x00a7, B:24:0x0058, B:31:0x0080, B:27:0x0062), top: B:45:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.p019vk.push.core.filedatastore.migration.Migration
    /* renamed from: migrate-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo26675migrategIAlus(android.content.Context r10, p000.InterfaceC1382Vy r11) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration.mo26675migrategIAlus(android.content.Context, Vy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.filedatastore.migration.Migration
    public Object shouldMigrate(Context context, InterfaceC1382Vy interfaceC1382Vy) {
        return FileExtensionKt.existsSafe(DataStoreMigrationKt.access$getFileToMigrate(context, this.f20429a)) ? m13742b((InterfaceC4039fD) this.f20431c.invoke(context), interfaceC1382Vy) : Boolean.FALSE;
    }
}
