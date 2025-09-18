package p000;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MQ0 {

    /* renamed from: a */
    public final String f7154a;

    /* renamed from: b */
    public final Bundle f7155b;

    /* renamed from: c */
    public final HashSet f7156c;

    public MQ0(String str, Bundle bundle, HashSet hashSet) {
        this.f7154a = str;
        this.f7155b = bundle;
        this.f7156c = hashSet;
    }

    /* renamed from: a */
    public static RemoteInput m5362a(MQ0 mq0) {
        mq0.getClass();
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(RNPushNotification.KEY_TEXT_REPLY).setLabel(mq0.f7154a).setChoices(null).setAllowFreeFormInput(true).addExtras(mq0.f7155b);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = mq0.f7156c.iterator();
            while (it.hasNext()) {
                KQ0.m4637d(builderAddExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            LQ0.m4970b(builderAddExtras, 0);
        }
        return builderAddExtras.build();
    }
}
