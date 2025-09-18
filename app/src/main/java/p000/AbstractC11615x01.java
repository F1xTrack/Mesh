package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.LinkedList;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;

/* renamed from: x01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11615x01 {

    /* renamed from: a */
    public static final LinkedList f45254a;

    /* renamed from: b */
    public static InterfaceC7278zf f45255b;

    /* renamed from: c */
    public static ComponentName f45256c;

    static {
        LinkedList linkedList = new LinkedList();
        f45254a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AbstractC4161h9.class);
        linkedList.add(J40.class);
        linkedList.add(C7982Mw0.class);
        linkedList.add(AbstractC9377fV0.class);
        linkedList.add(C8541Xp1.class);
        linkedList.add(C9540gm1.class);
        linkedList.add(C8073Op1.class);
        linkedList.add(AbstractC1221TP.class);
    }

    /* renamed from: a */
    public static void m25732a(ReactApplicationContext reactApplicationContext, int i) throws C11488w01 {
        InterfaceC7278zf interfaceC7278zf;
        if (f45255b == null) {
            Intent launchIntentForPackage = reactApplicationContext.getPackageManager().getLaunchIntentForPackage(reactApplicationContext.getPackageName());
            if (launchIntentForPackage == null) {
                reactApplicationContext.getPackageName();
                throw new C11488w01("No default launcher available");
            }
            f45256c = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            Iterator<ResolveInfo> it = reactApplicationContext.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.packageName;
                Iterator it2 = f45254a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    try {
                        interfaceC7278zf = (InterfaceC7278zf) ((Class) it2.next()).newInstance();
                    } catch (Exception unused) {
                        interfaceC7278zf = null;
                    }
                    if (interfaceC7278zf != null && interfaceC7278zf.mo5480b().contains(str)) {
                        f45255b = interfaceC7278zf;
                        break;
                    }
                }
                if (f45255b != null) {
                    break;
                }
            }
            if (f45255b == null) {
                String str2 = Build.MANUFACTURER;
                if (str2.equalsIgnoreCase("ZUK")) {
                    f45255b = new C8541Xp1();
                } else if (str2.equalsIgnoreCase("OPPO")) {
                    C7982Mw0 c7982Mw0 = new C7982Mw0();
                    c7982Mw0.f7408a = -1;
                    f45255b = c7982Mw0;
                } else if (str2.equalsIgnoreCase("VIVO")) {
                    f45255b = new C9540gm1();
                } else if (str2.equalsIgnoreCase("ZTE")) {
                    f45255b = new C8073Op1();
                } else {
                    f45255b = new DefaultBadger();
                }
            }
        }
        try {
            f45255b.mo5479a(reactApplicationContext, f45256c, i);
        } catch (Exception e) {
            throw new C11488w01("Unable to execute badge", e);
        }
    }
}
