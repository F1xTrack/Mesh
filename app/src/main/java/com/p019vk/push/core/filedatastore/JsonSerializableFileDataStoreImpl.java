package com.p019vk.push.core.filedatastore;

import android.content.Context;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.filedatastore.JsonSerializer;
import com.p019vk.push.core.filedatastore.migration.Migration;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.AbstractC11432vY1;
import p000.AbstractC9366fP1;
import p000.C0399GK;
import p000.C1068Qy;
import p000.C7053w5;
import p000.C7318Ac0;
import p000.C7422Cc0;
import p000.C7474Dc0;
import p000.C7578Fc0;
import p000.C8028Nt0;
import p000.ExecutorC1023QF;
import p000.F71;
import p000.InterfaceC1382Vy;
import p000.O90;
import p000.SA1;

@Metadata(m22266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m22267d2 = {"Lcom/vk/push/core/filedatastore/JsonSerializableFileDataStoreImpl;", "Lcom/vk/push/core/filedatastore/JsonSerializer;", "T", "Lcom/vk/push/core/filedatastore/FileDataStore;", "Landroid/content/Context;", "context", "", "fileName", "Lcom/vk/push/core/filedatastore/JsonDeserializer;", "deserializer", "Lcom/vk/push/core/filedatastore/migration/Migration;", "migration", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashReporterRepository", "", "cacheOnError", "clearOnCorruption", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vk/push/core/filedatastore/JsonDeserializer;Lcom/vk/push/core/filedatastore/migration/Migration;Lcom/vk/push/core/data/repository/CrashReporterRepository;ZZ)V", "data", "write", "(Lcom/vk/push/core/filedatastore/JsonSerializer;LVy;)Ljava/lang/Object;", "read", "(LVy;)Ljava/lang/Object;", "clear", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JsonSerializableFileDataStoreImpl<T extends JsonSerializer> implements FileDataStore<T> {

    /* renamed from: a */
    public final String f20413a;

    /* renamed from: b */
    public final JsonDeserializer f20414b;

    /* renamed from: c */
    public final Migration f20415c;

    /* renamed from: d */
    public final CrashReporterRepository f20416d;

    /* renamed from: e */
    public final boolean f20417e;

    /* renamed from: f */
    public final boolean f20418f;

    /* renamed from: g */
    public final C1068Qy f20419g;

    /* renamed from: h */
    public final C8028Nt0 f20420h;

    /* renamed from: i */
    public volatile JsonSerializer f20421i;

    /* renamed from: j */
    public final F71 f20422j;

    public JsonSerializableFileDataStoreImpl(Context context, String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2) {
        O90.m5968f(context, "context");
        O90.m5968f(str, "fileName");
        O90.m5968f(jsonDeserializer, "deserializer");
        O90.m5968f(migration, "migration");
        O90.m5968f(crashReporterRepository, "crashReporterRepository");
        this.f20413a = str;
        this.f20414b = jsonDeserializer;
        this.f20415c = migration;
        this.f20416d = crashReporterRepository;
        this.f20417e = z;
        this.f20418f = z2;
        C0399GK c0399gk = C0399GK.f3694a;
        C1068Qy c1068QyM25444a = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        this.f20419g = c1068QyM25444a;
        this.f20420h = SA1.m7187a();
        this.f20422j = AbstractC0705LB.m4915b(new C7053w5(context, 8, this));
        Context applicationContext = context.getApplicationContext();
        O90.m5967e(applicationContext, "context.applicationContext");
        AbstractC9366fP1.m18230b(c1068QyM25444a, null, new C7422Cc0(this, applicationContext, null), 3);
    }

    public static final FileDataSource access$getFileDataSource(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl) {
        return (FileDataSource) jsonSerializableFileDataStoreImpl.f20422j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0016  */
    /* renamed from: access$readUnsafe-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m26673access$readUnsafeIoAF18A(com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r5, p000.InterfaceC1382Vy r6) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl.m26673access$readUnsafeIoAF18A(com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0016  */
    /* renamed from: access$writeUnsafe-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m26674access$writeUnsafegIAlus(com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r5, com.p019vk.push.core.filedatastore.JsonSerializer r6, p000.InterfaceC1382Vy r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof p000.C7630Gc0
            if (r0 == 0) goto L16
            r0 = r7
            Gc0 r0 = (p000.C7630Gc0) r0
            int r1 = r0.f3822f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3822f = r1
            goto L1b
        L16:
            Gc0 r0 = new Gc0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f3820d
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f3822f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r5 = r0.f3819c
            com.vk.push.core.filedatastore.JsonSerializer r6 = r0.f3818b
            com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r0 = r0.f3817a
            p000.RQ1.m7017d(r7)
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r7 = r7.f9075a
            goto L72
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            p000.RQ1.m7017d(r7)
            org.json.JSONObject r7 = r6.toJson()     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r7 = move-exception
            OS0 r7 = p000.RQ1.m7015b(r7)
        L49:
            java.lang.Throwable r2 = p000.PS0.m6365a(r7)
            if (r2 != 0) goto L92
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            F71 r2 = r5.f20422j
            java.lang.Object r2 = r2.getValue()
            com.vk.push.core.filedatastore.FileDataSource r2 = (com.p019vk.push.core.filedatastore.FileDataSource) r2
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = "json.toString()"
            p000.O90.m5967e(r7, r4)
            r0.f3817a = r5
            r0.f3818b = r6
            r0.f3819c = r5
            r0.f3822f = r3
            java.lang.Object r7 = r2.m26672setDatagIAlus(r7, r0)
            if (r7 != r1) goto L71
            goto L9e
        L71:
            r0 = r5
        L72:
            com.vk.push.core.data.repository.IssueKey r1 = com.p019vk.push.core.data.repository.IssueKey.FILE_DATA_STORE_WRITE_ERROR
            jI r2 = p000.C6228jI.f35026H
            r5.getClass()
            boolean r3 = r7 instanceof p000.OS0
            if (r3 == 0) goto L8c
            java.lang.Throwable r4 = p000.PS0.m6365a(r7)
            java.lang.Object r2 = r2.invoke(r4)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.vk.push.core.data.repository.CrashReporterRepository r5 = r5.f20416d
            r5.nonFatalReport(r2, r1)
        L8c:
            if (r3 != 0) goto L90
            r0.f20421i = r6
        L90:
            r1 = r7
            goto L9e
        L92:
            com.vk.push.core.filedatastore.WriteException r5 = new com.vk.push.core.filedatastore.WriteException
            r6 = 2
            r7 = 0
            r5.<init>(r2, r7, r6, r7)
            OS0 r5 = p000.RQ1.m7015b(r5)
            r1 = r5
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl.m26674access$writeUnsafegIAlus(com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl, com.vk.push.core.filedatastore.JsonSerializer, Vy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.filedatastore.FileDataStore
    public Object clear(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.f20419g.f9874a, new C7318Ac0(this, null), interfaceC1382Vy);
    }

    @Override // com.p019vk.push.core.filedatastore.FileDataStore
    public Object read(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.f20419g.f9874a, new C7474Dc0(this, null), interfaceC1382Vy);
    }

    @Override // com.p019vk.push.core.filedatastore.FileDataStore
    public Object write(T t, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.f20419g.f9874a, new C7578Fc0(this, t, null), interfaceC1382Vy);
    }
}
