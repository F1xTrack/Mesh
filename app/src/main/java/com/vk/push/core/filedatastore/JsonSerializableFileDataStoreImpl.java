package com.vk.push.core.filedatastore;

import android.content.Context;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.core.filedatastore.migration.Migration;
import defpackage.AbstractC3767fP1;
import defpackage.AbstractC7625vY1;
import defpackage.C0027Ac0;
import defpackage.C0183Cc0;
import defpackage.C0261Dc0;
import defpackage.C0417Fc0;
import defpackage.C1091Nt0;
import defpackage.C1339Qy;
import defpackage.C7726w5;
import defpackage.F71;
import defpackage.GK;
import defpackage.InterfaceC1729Vy;
import defpackage.LB;
import defpackage.O90;
import defpackage.QF;
import defpackage.SA1;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/vk/push/core/filedatastore/JsonSerializableFileDataStoreImpl;", "Lcom/vk/push/core/filedatastore/JsonSerializer;", "T", "Lcom/vk/push/core/filedatastore/FileDataStore;", "Landroid/content/Context;", "context", "", "fileName", "Lcom/vk/push/core/filedatastore/JsonDeserializer;", "deserializer", "Lcom/vk/push/core/filedatastore/migration/Migration;", "migration", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashReporterRepository", "", "cacheOnError", "clearOnCorruption", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vk/push/core/filedatastore/JsonDeserializer;Lcom/vk/push/core/filedatastore/migration/Migration;Lcom/vk/push/core/data/repository/CrashReporterRepository;ZZ)V", "data", "write", "(Lcom/vk/push/core/filedatastore/JsonSerializer;LVy;)Ljava/lang/Object;", "read", "(LVy;)Ljava/lang/Object;", "clear", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class JsonSerializableFileDataStoreImpl<T extends JsonSerializer> implements FileDataStore<T> {
    public final String a;
    public final JsonDeserializer b;
    public final Migration c;
    public final CrashReporterRepository d;
    public final boolean e;
    public final boolean f;
    public final C1339Qy g;
    public final C1091Nt0 h;
    public volatile JsonSerializer i;
    public final F71 j;

    public JsonSerializableFileDataStoreImpl(Context context, String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2) {
        O90.f(context, "context");
        O90.f(str, "fileName");
        O90.f(jsonDeserializer, "deserializer");
        O90.f(migration, "migration");
        O90.f(crashReporterRepository, "crashReporterRepository");
        this.a = str;
        this.b = jsonDeserializer;
        this.c = migration;
        this.d = crashReporterRepository;
        this.e = z;
        this.f = z2;
        GK gk = GK.a;
        C1339Qy c1339QyA = AbstractC7625vY1.a(QF.c);
        this.g = c1339QyA;
        this.h = SA1.a();
        this.j = LB.b(new C7726w5(context, 8, this));
        Context applicationContext = context.getApplicationContext();
        O90.e(applicationContext, "context.applicationContext");
        AbstractC3767fP1.b(c1339QyA, null, new C0183Cc0(this, applicationContext, null), 3);
    }

    public static final FileDataSource access$getFileDataSource(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl) {
        return (FileDataSource) jsonSerializableFileDataStoreImpl.j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0016  */
    /* renamed from: access$readUnsafe-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m79access$readUnsafeIoAF18A(com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r5, defpackage.InterfaceC1729Vy r6) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl.m79access$readUnsafeIoAF18A(com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0016  */
    /* renamed from: access$writeUnsafe-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m80access$writeUnsafegIAlus(com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r5, com.vk.push.core.filedatastore.JsonSerializer r6, defpackage.InterfaceC1729Vy r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.C0495Gc0
            if (r0 == 0) goto L16
            r0 = r7
            Gc0 r0 = (defpackage.C0495Gc0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            Gc0 r0 = new Gc0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r5 = r0.c
            com.vk.push.core.filedatastore.JsonSerializer r6 = r0.b
            com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r0 = r0.a
            defpackage.RQ1.d(r7)
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r7 = r7.a
            goto L72
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            defpackage.RQ1.d(r7)
            org.json.JSONObject r7 = r6.toJson()     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r7 = move-exception
            OS0 r7 = defpackage.RQ1.b(r7)
        L49:
            java.lang.Throwable r2 = defpackage.PS0.a(r7)
            if (r2 != 0) goto L92
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            F71 r2 = r5.j
            java.lang.Object r2 = r2.getValue()
            com.vk.push.core.filedatastore.FileDataSource r2 = (com.vk.push.core.filedatastore.FileDataSource) r2
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = "json.toString()"
            defpackage.O90.e(r7, r4)
            r0.a = r5
            r0.b = r6
            r0.c = r5
            r0.f = r3
            java.lang.Object r7 = r2.m78setDatagIAlus(r7, r0)
            if (r7 != r1) goto L71
            goto L9e
        L71:
            r0 = r5
        L72:
            com.vk.push.core.data.repository.IssueKey r1 = com.vk.push.core.data.repository.IssueKey.FILE_DATA_STORE_WRITE_ERROR
            jI r2 = defpackage.C5284jI.H
            r5.getClass()
            boolean r3 = r7 instanceof defpackage.OS0
            if (r3 == 0) goto L8c
            java.lang.Throwable r4 = defpackage.PS0.a(r7)
            java.lang.Object r2 = r2.invoke(r4)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.vk.push.core.data.repository.CrashReporterRepository r5 = r5.d
            r5.nonFatalReport(r2, r1)
        L8c:
            if (r3 != 0) goto L90
            r0.i = r6
        L90:
            r1 = r7
            goto L9e
        L92:
            com.vk.push.core.filedatastore.WriteException r5 = new com.vk.push.core.filedatastore.WriteException
            r6 = 2
            r7 = 0
            r5.<init>(r2, r7, r6, r7)
            OS0 r5 = defpackage.RQ1.b(r5)
            r1 = r5
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl.m80access$writeUnsafegIAlus(com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl, com.vk.push.core.filedatastore.JsonSerializer, Vy):java.lang.Object");
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object clear(InterfaceC1729Vy interfaceC1729Vy) {
        return AbstractC3767fP1.e(this.g.a, new C0027Ac0(this, null), interfaceC1729Vy);
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object read(InterfaceC1729Vy interfaceC1729Vy) {
        return AbstractC3767fP1.e(this.g.a, new C0261Dc0(this, null), interfaceC1729Vy);
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object write(T t, InterfaceC1729Vy interfaceC1729Vy) {
        return AbstractC3767fP1.e(this.g.a, new C0417Fc0(this, t, null), interfaceC1729Vy);
    }
}
