package com.p019vk.push.core.deviceid.contentprovider;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.p019vk.push.core.deviceid.DeviceIdReadOnlyDataSource;
import com.p019vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m22267d2 = {"Lcom/vk/push/core/deviceid/contentprovider/DeviceIdRemoteDataSource;", "Lcom/vk/push/core/deviceid/DeviceIdReadOnlyDataSource;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LPS0;", "", "getDeviceId-IoAF18A", "(LVy;)Ljava/lang/Object;", "getDeviceId", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdRemoteDataSource implements DeviceIdReadOnlyDataSource {

    @Deprecated
    public static final long QUERY_TIMEOUT_MS = 10000;

    /* renamed from: a */
    public final Context f20374a;

    public DeviceIdRemoteDataSource(Context context) {
        O90.m5968f(context, "context");
        this.f20374a = context;
    }

    public static final boolean access$hasProvider(DeviceIdRemoteDataSource deviceIdRemoteDataSource, PackageInfo packageInfo) {
        deviceIdRemoteDataSource.getClass();
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        if (providerInfoArr == null) {
            return false;
        }
        for (ProviderInfo providerInfo : providerInfoArr) {
            String str = providerInfo.authority;
            DeviceIdUriMatcher.Companion companion = DeviceIdUriMatcher.INSTANCE;
            String str2 = providerInfo.packageName;
            O90.m5967e(str2, "it.packageName");
            if (O90.m5963a(str, companion.getAuthority(str2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Uri m13737b(String str) {
        Uri uriBuild = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(DeviceIdUriMatcher.INSTANCE.getAuthority(str)).build();
        O90.m5967e(uriBuild, "Builder().scheme(\"conten…ty))\n            .build()");
        return uriBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0079 A[PHI: r4 r7
  0x0079: PHI (r4v4 java.lang.String) = (r4v12 java.lang.String), (r4v8 java.lang.String) binds: [B:86:0x0085, B:79:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r7v4 android.database.Cursor) = (r7v3 android.database.Cursor), (r7v10 android.database.Cursor) binds: [B:86:0x0085, B:79:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m13738a(java.lang.String r6, p000.InterfaceC1382Vy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C6292kJ
            if (r0 == 0) goto L13
            r0 = r7
            kJ r0 = (p000.C6292kJ) r0
            int r1 = r0.f36420d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36420d = r1
            goto L18
        L13:
            kJ r0 = new kJ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f36418b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f36420d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource r6 = r0.f36417a
            p000.RQ1.m7017d(r7)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            goto L5a
        L2a:
            r6 = move-exception
            goto L7f
        L2c:
            r7 = r4
            goto L85
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            p000.RQ1.m7017d(r7)
            android.net.Uri r6 = m13737b(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            com.vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher$Companion r7 = com.p019vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher.INSTANCE     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            android.net.Uri r6 = android.net.Uri.withAppendedPath(r6, r7)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            lJ r7 = new lJ     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r0.f36417a = r5     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r0.f36420d = r3     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = p000.GY1.m3082a(r2, r7, r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r7 != r1) goto L59
            return r1
        L59:
            r6 = r5
        L5a:
            android.database.Cursor r7 = (android.database.Cursor) r7     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r6.getClass()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            if (r7 != 0) goto L62
            goto L77
        L62:
            r7.moveToFirst()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            com.vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher$Companion r6 = com.p019vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher.INSTANCE     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            java.lang.String r6 = r6.getVirtualColumnName()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            int r6 = r7.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            r0 = -1
            if (r6 != r0) goto L73
            goto L77
        L73:
            java.lang.String r4 = r7.getString(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
        L77:
            if (r7 == 0) goto L88
        L79:
            r7.close()
            goto L88
        L7d:
            r6 = move-exception
            r4 = r7
        L7f:
            if (r4 == 0) goto L84
            r4.close()
        L84:
            throw r6
        L85:
            if (r7 == 0) goto L88
            goto L79
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource.m13738a(java.lang.String, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007a A[Catch: all -> 0x002b, TRY_ENTER, TryCatch #0 {all -> 0x002b, blocks: (B:49:0x0027, B:66:0x009f, B:57:0x0072, B:60:0x007a, B:63:0x008d, B:56:0x0039), top: B:72:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x009c -> B:66:0x009f). Please report as a decompilation issue!!! */
    @Override // com.p019vk.push.core.deviceid.DeviceIdReadOnlyDataSource
    /* renamed from: getDeviceId-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo26668getDeviceIdIoAF18A(p000.InterfaceC1382Vy r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000.C6229jJ
            if (r0 == 0) goto L13
            r0 = r8
            jJ r0 = (p000.C6229jJ) r0
            int r1 = r0.f35055e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35055e = r1
            goto L18
        L13:
            jJ r0 = new jJ
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f35053c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f35055e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.util.Iterator r2 = r0.f35052b
            com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource r4 = r0.f35051a
            p000.RQ1.m7017d(r8)     // Catch: java.lang.Throwable -> L2b
            goto L9f
        L2b:
            r8 = move-exception
            goto La5
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            p000.RQ1.m7017d(r8)
            android.content.Context r8 = r7.f20374a     // Catch: java.lang.Throwable -> L2b
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L2b
            r2 = 8
            java.util.List r8 = r8.getInstalledPackages(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "context.packageManager.g…ageManager.GET_PROVIDERS)"
            p000.O90.m5967e(r8, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2b
            M8 r8 = p000.AbstractC7167xu.m25992t(r8)     // Catch: java.lang.Throwable -> L2b
            z r2 = new z     // Catch: java.lang.Throwable -> L2b
            r4 = 13
            r2.<init>(r4, r7)     // Catch: java.lang.Throwable -> L2b
            xU r4 = new xU     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r8, r3, r2)     // Catch: java.lang.Throwable -> L2b
            com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1 r8 = new com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L2b
            r8.<init>()     // Catch: java.lang.Throwable -> L2b
            fU r2 = new fU     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r4, r8)     // Catch: java.lang.Throwable -> L2b
            jI r8 = p000.C6228jI.f35037o     // Catch: java.lang.Throwable -> L2b
            Ac1 r8 = p000.AbstractC9639hY0.m18833l(r2, r8)     // Catch: java.lang.Throwable -> L2b
            zc1 r2 = new zc1     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2b
            r4 = r7
        L72:
            boolean r8 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = ""
            if (r8 == 0) goto La4
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2b
            android.content.Context r6 = r4.f20374a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L2b
            boolean r6 = p000.O90.m5963a(r8, r6)     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L8d
            return r5
        L8d:
            java.lang.String r5 = "packageName"
            p000.O90.m5967e(r8, r5)     // Catch: java.lang.Throwable -> L2b
            r0.f35051a = r4     // Catch: java.lang.Throwable -> L2b
            r0.f35052b = r2     // Catch: java.lang.Throwable -> L2b
            r0.f35055e = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r4.m13738a(r8, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L9f
            return r1
        L9f:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L72
            return r8
        La4:
            return r5
        La5:
            OS0 r8 = p000.RQ1.m7015b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource.mo26668getDeviceIdIoAF18A(Vy):java.lang.Object");
    }
}
