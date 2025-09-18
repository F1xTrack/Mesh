package p000;

import android.content.Context;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.filedatastore.JsonDeserializer;
import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.p019vk.push.core.filedatastore.migration.Migration;

/* renamed from: uT */
/* loaded from: classes2.dex */
public final class C6951uT implements InterfaceC11025sN0 {

    /* renamed from: a */
    public final String f43698a;

    /* renamed from: b */
    public final JsonDeserializer f43699b;

    /* renamed from: c */
    public final Migration f43700c;

    /* renamed from: d */
    public final CrashReporterRepository f43701d;

    /* renamed from: e */
    public final boolean f43702e;

    /* renamed from: f */
    public final boolean f43703f;

    /* renamed from: g */
    public volatile JsonSerializableFileDataStoreImpl f43704g;

    public C6951uT(String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2) {
        O90.m5968f(str, "name");
        O90.m5968f(jsonDeserializer, "deserializer");
        O90.m5968f(migration, "migration");
        O90.m5968f(crashReporterRepository, "crashReporterRepository");
        this.f43698a = str;
        this.f43699b = jsonDeserializer;
        this.f43700c = migration;
        this.f43701d = crashReporterRepository;
        this.f43702e = z;
        this.f43703f = z2;
    }

    @Override // p000.InterfaceC11025sN0
    public final Object getValue(Object obj, InterfaceC10293mf0 interfaceC10293mf0) {
        Context context = (Context) obj;
        O90.m5968f(interfaceC10293mf0, "property");
        if (this.f43704g == null) {
            synchronized (this) {
                if (this.f43704g == null) {
                    this.f43704g = new JsonSerializableFileDataStoreImpl(context, this.f43698a, this.f43699b, this.f43700c, this.f43701d, this.f43702e, this.f43703f);
                }
            }
        }
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl = this.f43704g;
        O90.m5965c(jsonSerializableFileDataStoreImpl);
        return jsonSerializableFileDataStoreImpl;
    }
}
