package defpackage;

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
public abstract class AbstractC7900x01 {
    public static final LinkedList a;
    public static InterfaceC8404zf b;
    public static ComponentName c;

    static {
        LinkedList linkedList = new LinkedList();
        a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AbstractC4099h9.class);
        linkedList.add(J40.class);
        linkedList.add(C1022Mw0.class);
        linkedList.add(AbstractC3784fV0.class);
        linkedList.add(C1860Xp1.class);
        linkedList.add(C4027gm1.class);
        linkedList.add(C1158Op1.class);
        linkedList.add(TP.class);
    }

    public static void a(ReactApplicationContext reactApplicationContext, int i) throws C7710w01 {
        InterfaceC8404zf interfaceC8404zf;
        if (b == null) {
            Intent launchIntentForPackage = reactApplicationContext.getPackageManager().getLaunchIntentForPackage(reactApplicationContext.getPackageName());
            if (launchIntentForPackage == null) {
                reactApplicationContext.getPackageName();
                throw new C7710w01("No default launcher available");
            }
            c = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            Iterator<ResolveInfo> it = reactApplicationContext.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.packageName;
                Iterator it2 = a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    try {
                        interfaceC8404zf = (InterfaceC8404zf) ((Class) it2.next()).newInstance();
                    } catch (Exception unused) {
                        interfaceC8404zf = null;
                    }
                    if (interfaceC8404zf != null && interfaceC8404zf.b().contains(str)) {
                        b = interfaceC8404zf;
                        break;
                    }
                }
                if (b != null) {
                    break;
                }
            }
            if (b == null) {
                String str2 = Build.MANUFACTURER;
                if (str2.equalsIgnoreCase("ZUK")) {
                    b = new C1860Xp1();
                } else if (str2.equalsIgnoreCase("OPPO")) {
                    C1022Mw0 c1022Mw0 = new C1022Mw0();
                    c1022Mw0.a = -1;
                    b = c1022Mw0;
                } else if (str2.equalsIgnoreCase("VIVO")) {
                    b = new C4027gm1();
                } else if (str2.equalsIgnoreCase("ZTE")) {
                    b = new C1158Op1();
                } else {
                    b = new DefaultBadger();
                }
            }
        }
        try {
            b.a(reactApplicationContext, c, i);
        } catch (Exception e) {
            throw new C7710w01("Unable to execute badge", e);
        }
    }
}
