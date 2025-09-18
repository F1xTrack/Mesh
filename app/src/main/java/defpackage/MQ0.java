package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MQ0 {
    public final String a;
    public final Bundle b;
    public final HashSet c;

    public MQ0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput a(MQ0 mq0) {
        mq0.getClass();
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(RNPushNotification.KEY_TEXT_REPLY).setLabel(mq0.a).setChoices(null).setAllowFreeFormInput(true).addExtras(mq0.b);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = mq0.c.iterator();
            while (it.hasNext()) {
                KQ0.d(builderAddExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            LQ0.b(builderAddExtras, 0);
        }
        return builderAddExtras.build();
    }
}
