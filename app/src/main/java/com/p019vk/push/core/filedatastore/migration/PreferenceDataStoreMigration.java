package com.p019vk.push.core.filedatastore.migration;

import android.content.Context;
import com.p019vk.push.common.utils.FileExtensionKt;
import kotlin.Metadata;
import p000.AbstractC9360fM1;
import p000.BP0;
import p000.C9196e41;
import p000.C9393fd0;
import p000.HE0;
import p000.InterfaceC10293mf0;
import p000.InterfaceC1382Vy;
import p000.InterfaceC6497nZ;
import p000.KC0;
import p000.O90;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m22267d2 = {"Lcom/vk/push/core/filedatastore/migration/PreferenceDataStoreMigration;", "T", "Lcom/vk/push/core/filedatastore/migration/Migration;", "", "preferenceName", "Lkotlin/Function1;", "LGt0;", "transform", "<init>", "(Ljava/lang/String;LnZ;)V", "Landroid/content/Context;", "context", "", "shouldMigrate", "(Landroid/content/Context;LVy;)Ljava/lang/Object;", "LPS0;", "migrate-gIAlu-s", "migrate", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public class PreferenceDataStoreMigration<T> implements Migration<T> {

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC10293mf0[] f20433d = {BP0.f799a.mo3851g(new HE0("preferencesDataStore", "getPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", PreferenceDataStoreMigration.class))};

    /* renamed from: a */
    public final String f20434a;

    /* renamed from: b */
    public final InterfaceC6497nZ f20435b;

    /* renamed from: c */
    public final KC0 f20436c;

    public PreferenceDataStoreMigration(String str, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(str, "preferenceName");
        O90.m5968f(interfaceC6497nZ, "transform");
        this.f20434a = str;
        this.f20435b = interfaceC6497nZ;
        this.f20436c = AbstractC9360fM1.m18222b(str, new C9196e41(C9393fd0.f27297w));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m13743a(com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreMigration r5, android.content.Context r6, p000.InterfaceC1382Vy r7) {
        /*
            boolean r0 = r7 instanceof p000.JC0
            if (r0 == 0) goto L13
            r0 = r7
            JC0 r0 = (p000.JC0) r0
            int r1 = r0.f5380e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5380e = r1
            goto L18
        L13:
            JC0 r0 = new JC0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5378c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f5380e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration r5 = r0.f5377b
            android.content.Context r6 = r0.f5376a
            p000.RQ1.m7017d(r7)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r5 = move-exception
            goto L68
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p000.RQ1.m7017d(r7)
            KC0 r7 = r5.f20436c     // Catch: java.lang.Throwable -> L2b
            mf0[] r2 = com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreMigration.f20433d     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            r2 = r2[r4]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.getValue(r6, r2)     // Catch: java.lang.Throwable -> L2b
            fD r7 = (p000.InterfaceC4039fD) r7     // Catch: java.lang.Throwable -> L2b
            pW r7 = r7.getData()     // Catch: java.lang.Throwable -> L2b
            r0.f5376a = r6     // Catch: java.lang.Throwable -> L2b
            r0.f5377b = r5     // Catch: java.lang.Throwable -> L2b
            r0.f5380e = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = p000.AbstractC10084l12.m22336b(r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L56
            return r1
        L56:
            Gt0 r7 = (p000.C7664Gt0) r7     // Catch: java.lang.Throwable -> L2b
            nZ r0 = r5.f20435b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r0.invoke(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.f20434a     // Catch: java.lang.Throwable -> L2b
            java.io.File r5 = com.p019vk.push.core.filedatastore.migration.DataStoreMigrationKt.access$getFileToMigrate(r6, r5)     // Catch: java.lang.Throwable -> L2b
            r5.delete()     // Catch: java.lang.Throwable -> L2b
            goto L6c
        L68:
            OS0 r7 = p000.RQ1.m7015b(r5)
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreMigration.m13743a(com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration, android.content.Context, Vy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.filedatastore.migration.Migration
    /* renamed from: migrate-gIAlu-s */
    public Object mo26675migrategIAlus(Context context, InterfaceC1382Vy interfaceC1382Vy) {
        return m13743a(this, context, interfaceC1382Vy);
    }

    @Override // com.p019vk.push.core.filedatastore.migration.Migration
    public Object shouldMigrate(Context context, InterfaceC1382Vy interfaceC1382Vy) {
        return Boolean.valueOf(FileExtensionKt.existsSafe(DataStoreMigrationKt.access$getFileToMigrate(context, this.f20434a)));
    }
}
