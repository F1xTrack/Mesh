package ru.rustore.sdk.pushclient.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.data.repository.MetadataConsts;
import com.p019vk.push.core.data.repository.MetadataRepositoryImplKt;
import com.p019vk.push.core.data.source.ManifestDataSource;
import com.p019vk.push.core.domain.repository.MetadataRepository;
import kotlin.Metadata;
import p000.A61;
import p000.AbstractC10834qt1;
import p000.AbstractC11374v51;
import p000.C0827N8;
import p000.C10909rT0;
import p000.C4042fG;
import p000.C4049fN;
import p000.C9432fw1;
import p000.GQ0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Lru/rustore/sdk/pushclient/provider/RuStorePushClientInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "client_release"}, m22268k = 1, m22269mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RuStorePushClientInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        O90.m5968f(context, "context");
        O90.m5968f(providerInfo, "info");
        if ("ru.rustore.sdk.pushclient.rustorepushclientinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        O90.m5968f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        O90.m5968f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        O90.m5968f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z = true;
        Context context = getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext == null) {
            return false;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        O90.m5967e(packageManager, "context.packageManager");
        String packageName = applicationContext.getPackageName();
        O90.m5967e(packageName, "context.packageName");
        MetadataRepository MetadataRepository = MetadataRepositoryImplKt.MetadataRepository(new ManifestDataSource(packageManager, packageName));
        if (MetadataRepository.getString(MetadataConsts.PROJECT_ID_KEY) != null && (!AbstractC11374v51.m25328C(r6))) {
            Application application = (Application) applicationContext.getApplicationContext();
            if (application == null) {
                throw new IllegalStateException("applicationContext must be not null");
            }
            C4042fG c4042fG = new C4042fG("RuStorePushClient");
            C10909rT0 c10909rT0 = new C10909rT0(application);
            C9432fw1 c9432fw1 = new C9432fw1(application, c4042fG);
            A61 a61 = new A61(c10909rT0, c9432fw1);
            C0827N8 c0827n8 = new C0827N8(MetadataRepository, a61, c4042fG);
            Logger logger = AbstractC10834qt1.f41236a;
            GQ0 gq0 = new GQ0(c0827n8, c4042fG);
            String string = MetadataRepository.getString(MetadataConsts.PROJECT_ID_KEY);
            if (string == null) {
                Logger.DefaultImpls.info$default((Logger) c0827n8.f7524c, "Auto init RuStorePushClient was skipped", null, 2, null);
                z = false;
            } else {
                String string2 = MetadataRepository.getString(MetadataConsts.PARAMS_CLASS_KEY);
                if (string2 != null) {
                    try {
                        Class.forName(string2, false, C9432fw1.class.getClassLoader()).getDeclaredConstructor(Context.class).newInstance(application);
                    } catch (Throwable th) {
                        if (th instanceof NoSuchMethodException ? true : th instanceof SecurityException) {
                            throw new IllegalStateException(string2.concat(" class must have a once constructor which accepts Context as the only parameter"), th);
                        }
                        ((C4042fG) c9432fw1.f27505b).warn("Error while trying instantiate class ".concat(string2), th);
                    }
                }
                C4049fN.m18224n((Application) ((C10909rT0) a61.f73b).f41672a, string, new C4042fG("RuStorePushClient"), null, null, false, null, null);
            }
            Logger.DefaultImpls.info$default((Logger) gq0.f3735b, "Auto init RuStorePushClient is successful = " + z, null, 2, null);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        O90.m5968f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        O90.m5968f(uri, "uri");
        return 0;
    }
}
