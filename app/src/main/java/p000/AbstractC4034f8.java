package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: f8 */
/* loaded from: classes.dex */
public abstract class AbstractC4034f8 {

    /* renamed from: a */
    public static final ConcurrentHashMap f27084a = new ConcurrentHashMap();

    /* renamed from: a */
    public static InterfaceC7740If0 m18192a(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap = f27084a;
        InterfaceC7740If0 interfaceC7740If0 = (InterfaceC7740If0) concurrentHashMap.get(packageName);
        if (interfaceC7740If0 != null) {
            return interfaceC7740If0;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            packageInfo = null;
        }
        C8606Yw0 c8606Yw0 = new C8606Yw0(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        InterfaceC7740If0 interfaceC7740If02 = (InterfaceC7740If0) concurrentHashMap.putIfAbsent(packageName, c8606Yw0);
        return interfaceC7740If02 == null ? c8606Yw0 : interfaceC7740If02;
    }
}
