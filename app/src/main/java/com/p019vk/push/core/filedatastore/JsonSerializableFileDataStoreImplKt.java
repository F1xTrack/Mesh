package com.p019vk.push.core.filedatastore;

import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.filedatastore.migration.Migration;
import kotlin.Metadata;
import p000.C4162hA;
import p000.C6951uT;
import p000.InterfaceC11025sN0;
import p000.O90;

@Metadata(m22266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\r\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lcom/vk/push/core/filedatastore/JsonSerializer;", "T", "", "name", "Lcom/vk/push/core/filedatastore/JsonDeserializer;", "deserializer", "Lcom/vk/push/core/filedatastore/migration/Migration;", "migration", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashReporterRepository", "", "cacheOnError", "clearOnCorruption", "LsN0;", "Landroid/content/Context;", "Lcom/vk/push/core/filedatastore/FileDataStore;", "fileDataStore", "(Ljava/lang/String;Lcom/vk/push/core/filedatastore/JsonDeserializer;Lcom/vk/push/core/filedatastore/migration/Migration;Lcom/vk/push/core/data/repository/CrashReporterRepository;ZZ)LsN0;", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class JsonSerializableFileDataStoreImplKt {
    public static final <T extends JsonSerializer> InterfaceC11025sN0 fileDataStore(String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2) {
        O90.m5968f(str, "name");
        O90.m5968f(jsonDeserializer, "deserializer");
        O90.m5968f(migration, "migration");
        O90.m5968f(crashReporterRepository, "crashReporterRepository");
        return new C6951uT(str, jsonDeserializer, migration, crashReporterRepository, z, z2);
    }

    public static /* synthetic */ InterfaceC11025sN0 fileDataStore$default(String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            migration = Migration.INSTANCE.noMigration$core_release();
        }
        Migration migration2 = migration;
        if ((i & 8) != 0) {
            crashReporterRepository = new C4162hA(1);
        }
        CrashReporterRepository crashReporterRepository2 = crashReporterRepository;
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = true;
        }
        return fileDataStore(str, jsonDeserializer, migration2, crashReporterRepository2, z3, z2);
    }
}
