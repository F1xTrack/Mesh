package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.DoNotInline;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22265bv = {1, 0, 3}, m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m22267d2 = {"Lcom/yandex/metrica/impl/ob/Xn;", "", "Landroid/content/pm/PackageManager;", "packageManager", "", "packageName", "a", "(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m22268k = 1, m22269mv = {1, 1, 15})
@TargetApi(30)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.Xn */
/* loaded from: classes2.dex */
public final class C3064Xn {

    /* renamed from: a */
    public static final C3064Xn f22835a = new C3064Xn();

    private C3064Xn() {
    }

    /* renamed from: a */
    public static final String m15441a(PackageManager packageManager, String packageName) throws PackageManager.NameNotFoundException {
        InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
        O90.m5967e(installSourceInfo, "packageManager.getInstallSourceInfo(packageName)");
        return installSourceInfo.getInstallingPackageName();
    }
}
