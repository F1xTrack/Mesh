package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: f8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3714f8 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static InterfaceC0660If0 a(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap = a;
        InterfaceC0660If0 interfaceC0660If0 = (InterfaceC0660If0) concurrentHashMap.get(packageName);
        if (interfaceC0660If0 != null) {
            return interfaceC0660If0;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            packageInfo = null;
        }
        C1958Yw0 c1958Yw0 = new C1958Yw0(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        InterfaceC0660If0 interfaceC0660If02 = (InterfaceC0660If0) concurrentHashMap.putIfAbsent(packageName, c1958Yw0);
        return interfaceC0660If02 == null ? c1958Yw0 : interfaceC0660If02;
    }
}
