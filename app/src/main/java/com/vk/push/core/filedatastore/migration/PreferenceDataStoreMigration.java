package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import com.vk.push.common.utils.FileExtensionKt;
import defpackage.AbstractC3758fM1;
import defpackage.BP0;
import defpackage.C3513e41;
import defpackage.C3808fd0;
import defpackage.HE0;
import defpackage.InterfaceC1729Vy;
import defpackage.InterfaceC5927mf0;
import defpackage.InterfaceC6099nZ;
import defpackage.KC0;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lcom/vk/push/core/filedatastore/migration/PreferenceDataStoreMigration;", "T", "Lcom/vk/push/core/filedatastore/migration/Migration;", "", "preferenceName", "Lkotlin/Function1;", "LGt0;", "transform", "<init>", "(Ljava/lang/String;LnZ;)V", "Landroid/content/Context;", "context", "", "shouldMigrate", "(Landroid/content/Context;LVy;)Ljava/lang/Object;", "LPS0;", "migrate-gIAlu-s", "migrate", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public class PreferenceDataStoreMigration<T> implements Migration<T> {
    public static final /* synthetic */ InterfaceC5927mf0[] d = {BP0.a.g(new HE0("preferencesDataStore", "getPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", PreferenceDataStoreMigration.class))};
    public final String a;
    public final InterfaceC6099nZ b;
    public final KC0 c;

    public PreferenceDataStoreMigration(String str, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(str, "preferenceName");
        O90.f(interfaceC6099nZ, "transform");
        this.a = str;
        this.b = interfaceC6099nZ;
        this.c = AbstractC3758fM1.b(str, new C3513e41(C3808fd0.w));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration r5, android.content.Context r6, defpackage.InterfaceC1729Vy r7) {
        /*
            boolean r0 = r7 instanceof defpackage.JC0
            if (r0 == 0) goto L13
            r0 = r7
            JC0 r0 = (defpackage.JC0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            JC0 r0 = new JC0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration r5 = r0.b
            android.content.Context r6 = r0.a
            defpackage.RQ1.d(r7)     // Catch: java.lang.Throwable -> L2b
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
            defpackage.RQ1.d(r7)
            KC0 r7 = r5.c     // Catch: java.lang.Throwable -> L2b
            mf0[] r2 = com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration.d     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            r2 = r2[r4]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.getValue(r6, r2)     // Catch: java.lang.Throwable -> L2b
            fD r7 = (defpackage.InterfaceC3729fD) r7     // Catch: java.lang.Throwable -> L2b
            pW r7 = r7.getData()     // Catch: java.lang.Throwable -> L2b
            r0.a = r6     // Catch: java.lang.Throwable -> L2b
            r0.b = r5     // Catch: java.lang.Throwable -> L2b
            r0.e = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = defpackage.AbstractC5615l12.b(r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L56
            return r1
        L56:
            Gt0 r7 = (defpackage.C0546Gt0) r7     // Catch: java.lang.Throwable -> L2b
            nZ r0 = r5.b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r0.invoke(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.a     // Catch: java.lang.Throwable -> L2b
            java.io.File r5 = com.vk.push.core.filedatastore.migration.DataStoreMigrationKt.access$getFileToMigrate(r6, r5)     // Catch: java.lang.Throwable -> L2b
            r5.delete()     // Catch: java.lang.Throwable -> L2b
            goto L6c
        L68:
            OS0 r7 = defpackage.RQ1.b(r5)
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration.a(com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration, android.content.Context, Vy):java.lang.Object");
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    /* renamed from: migrate-gIAlu-s */
    public Object mo81migrategIAlus(Context context, InterfaceC1729Vy interfaceC1729Vy) {
        return a(this, context, interfaceC1729Vy);
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    public Object shouldMigrate(Context context, InterfaceC1729Vy interfaceC1729Vy) {
        return Boolean.valueOf(FileExtensionKt.existsSafe(DataStoreMigrationKt.access$getFileToMigrate(context, this.a)));
    }
}
