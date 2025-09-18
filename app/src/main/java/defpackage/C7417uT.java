package defpackage;

import android.content.Context;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.migration.Migration;

/* renamed from: uT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7417uT implements InterfaceC7018sN0 {
    public final String a;
    public final JsonDeserializer b;
    public final Migration c;
    public final CrashReporterRepository d;
    public final boolean e;
    public final boolean f;
    public volatile JsonSerializableFileDataStoreImpl g;

    public C7417uT(String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2) {
        O90.f(str, "name");
        O90.f(jsonDeserializer, "deserializer");
        O90.f(migration, "migration");
        O90.f(crashReporterRepository, "crashReporterRepository");
        this.a = str;
        this.b = jsonDeserializer;
        this.c = migration;
        this.d = crashReporterRepository;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.InterfaceC7018sN0
    public final Object getValue(Object obj, InterfaceC5927mf0 interfaceC5927mf0) {
        Context context = (Context) obj;
        O90.f(interfaceC5927mf0, "property");
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = new JsonSerializableFileDataStoreImpl(context, this.a, this.b, this.c, this.d, this.e, this.f);
                }
            }
        }
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl = this.g;
        O90.c(jsonSerializableFileDataStoreImpl);
        return jsonSerializableFileDataStoreImpl;
    }
}
