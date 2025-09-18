package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: Ev, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395Ev extends Z2 {
    public final /* synthetic */ AbstractActivityC0629Hv h;

    public C0395Ev(AbstractActivityC0629Hv abstractActivityC0629Hv) {
        this.h = abstractActivityC0629Hv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Z2
    public final void b(int i, L2 l2, Object obj) {
        Bundle bundle;
        O90.f(l2, "contract");
        AbstractActivityC0629Hv abstractActivityC0629Hv = this.h;
        K2 k2B = l2.b(abstractActivityC0629Hv, obj);
        if (k2B != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC6690qf(this, i, k2B, 5));
            return;
        }
        Intent intentA = l2.a(abstractActivityC0629Hv, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            O90.c(extras);
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(abstractActivityC0629Hv.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                abstractActivityC0629Hv.startActivityForResult(intentA, i, bundle);
                return;
            }
            C6404p90 c6404p90 = (C6404p90) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                O90.c(c6404p90);
                abstractActivityC0629Hv.startIntentSenderForResult(c6404p90.a, i, c6404p90.b, c6404p90.c, c6404p90.d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC6690qf(this, i, e, 6));
                return;
            }
        }
        String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                throw new IllegalArgumentException(AbstractC1705Vq.l(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr[i3] = stringArrayExtra[i4];
                    i3++;
                }
            }
        }
        if (abstractActivityC0629Hv instanceof D2) {
        }
        A2.b(abstractActivityC0629Hv, stringArrayExtra, i);
    }
}
