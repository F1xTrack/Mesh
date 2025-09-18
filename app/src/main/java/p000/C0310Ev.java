package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: Ev */
/* loaded from: classes.dex */
public final class C0310Ev extends AbstractC1576Z2 {

    /* renamed from: h */
    public final /* synthetic */ AbstractActivityC0499Hv f2958h;

    public C0310Ev(AbstractActivityC0499Hv abstractActivityC0499Hv) {
        this.f2958h = abstractActivityC0499Hv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC1576Z2
    /* renamed from: b */
    public final void mo2446b(int i, AbstractC0696L2 abstractC0696L2, Object obj) {
        Bundle bundle;
        O90.m5968f(abstractC0696L2, "contract");
        AbstractActivityC0499Hv abstractActivityC0499Hv = this.f2958h;
        C0633K2 c0633k2Mo4867b = abstractC0696L2.mo4867b(abstractActivityC0499Hv, obj);
        if (c0633k2Mo4867b != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC6694qf(this, i, c0633k2Mo4867b, 5));
            return;
        }
        Intent intentMo4866a = abstractC0696L2.mo4866a(abstractActivityC0499Hv, obj);
        if (intentMo4866a.getExtras() != null) {
            Bundle extras = intentMo4866a.getExtras();
            O90.m5965c(extras);
            if (extras.getClassLoader() == null) {
                intentMo4866a.setExtrasClassLoader(abstractActivityC0499Hv.getClassLoader());
            }
        }
        if (intentMo4866a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentMo4866a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo4866a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo4866a.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo4866a.getAction())) {
                abstractActivityC0499Hv.startActivityForResult(intentMo4866a, i, bundle);
                return;
            }
            C10613p90 c10613p90 = (C10613p90) intentMo4866a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                O90.m5965c(c10613p90);
                abstractActivityC0499Hv.startIntentSenderForResult(c10613p90.f39868a, i, c10613p90.f39869b, c10613p90.f39870c, c10613p90.f39871d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC6694qf(this, i, e, 6));
                return;
            }
        }
        String[] stringArrayExtra = intentMo4866a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                throw new IllegalArgumentException(AbstractC1374Vq.m8593l(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
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
        if (abstractActivityC0499Hv instanceof InterfaceC0192D2) {
        }
        AbstractC0003A2.m28b(abstractActivityC0499Hv, stringArrayExtra, i);
    }
}
