package com.oblador.storereview;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p000.AbstractC8037Nx1;
import p000.AbstractC9376fU1;
import p000.C10909rT0;
import p000.C11364v12;
import p000.C8165Qj1;
import p000.C8763ak1;
import p000.C9450g32;
import p000.C9629hT0;
import p000.H30;
import p000.KO1;
import p000.S81;
import p000.ZH1;

/* loaded from: classes2.dex */
public class StoreReviewModule extends ReactContextBaseJavaModule {
    public StoreReviewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNStoreReview";
    }

    @ReactMethod
    public void requestReview() {
        C9450g32 c9450g32M18243d;
        String str;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Context applicationContext = reactApplicationContext.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = reactApplicationContext;
        }
        C8165Qj1 c8165Qj1 = new C8165Qj1(new KO1(applicationContext));
        KO1 ko1 = (KO1) c8165Qj1.f9757b;
        C10909rT0 c10909rT0 = KO1.f6059c;
        c10909rT0.m24361q("requestInAppReview (%s)", ko1.f6061b);
        if (ko1.f6060a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                C10909rT0.m24352s((String) c10909rT0.f41672a, "Play Store app is either not installed or not the official version", objArr);
            }
            Locale locale = Locale.getDefault();
            HashMap map = AbstractC8037Nx1.f8144a;
            if (map.containsKey(-1)) {
                str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) AbstractC8037Nx1.f8145b.get(-1)) + ")";
            } else {
                str = "";
            }
            c9450g32M18243d = AbstractC9376fU1.m18243d(new C9629hT0(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str))));
        } else {
            S81 s81 = new S81();
            C11364v12 c11364v12 = ko1.f6060a;
            ZH1 zh1 = new ZH1(ko1, s81, s81, 0);
            synchronized (c11364v12.f44097f) {
                c11364v12.f44096e.add(s81);
                s81.f10598a.mo11135b(new C8763ak1(c11364v12, 7, s81));
            }
            synchronized (c11364v12.f44097f) {
                try {
                    if (c11364v12.f44102k.getAndIncrement() > 0) {
                        C10909rT0 c10909rT02 = c11364v12.f44093b;
                        Object[] objArr2 = new Object[0];
                        if (Log.isLoggable("PlayCore", 3)) {
                            C10909rT0.m24352s((String) c10909rT02.f41672a, "Already connected to the service.", objArr2);
                        } else {
                            c10909rT02.getClass();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c11364v12.m25306a().post(new ZH1(c11364v12, s81, zh1, 1));
            c9450g32M18243d = s81.f10598a;
        }
        c9450g32M18243d.mo11135b(new H30(reactApplicationContext, 12, c8165Qj1));
    }
}
