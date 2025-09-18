package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.AbstractC0638K7;
import p000.C7881Kx1;
import p000.C9092dG1;
import p000.C9110dP1;
import p000.DA1;
import p000.I22;
import p000.InterfaceC8859bU1;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    public static volatile AppMeasurement f18045b;

    /* renamed from: a */
    public final AbstractC0638K7 f18046a;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mAppId;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mOrigin;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mTriggerEventName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public Object mValue;
    }

    public AppMeasurement(C9110dP1 c9110dP1) {
        this.f18046a = new DA1(c9110dP1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurement getInstance(Context context) {
        if (f18045b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f18045b == null) {
                        InterfaceC8859bU1 interfaceC8859bU1 = (InterfaceC8859bU1) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (interfaceC8859bU1 != null) {
                            f18045b = new AppMeasurement(interfaceC8859bU1);
                        } else {
                            f18045b = new AppMeasurement(C9110dP1.m17588a(context, new C9092dG1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f18045b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f18046a.mo1574e(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f18046a.mo1572c(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f18046a.mo1573d(str);
    }

    @Keep
    public long generateEventId() {
        return this.f18046a.zzf();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f18046a.zzg();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo1577h = this.f18046a.mo1577h(str, str2);
        ArrayList arrayList = new ArrayList(listMo1577h == null ? 0 : listMo1577h.size());
        for (Bundle bundle : listMo1577h) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            Preconditions.checkNotNull(bundle);
            conditionalUserProperty.mAppId = (String) I22.m3735c(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) I22.m3735c(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) I22.m3735c(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = I22.m3735c(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) I22.m3735c(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) I22.m3735c(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) I22.m3735c(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) I22.m3735c(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) I22.m3735c(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) I22.m3735c(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) I22.m3735c(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) I22.m3735c(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) I22.m3735c(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) I22.m3735c(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) I22.m3735c(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) I22.m3735c(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f18046a.mo1578m();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f18046a.zzi();
    }

    @Keep
    public String getGmpAppId() {
        return this.f18046a.mo1579n();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(String str) {
        return this.f18046a.mo1571b(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f18046a.mo1575f(str, str2, z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f18046a.mo1576g(str, str2, bundle);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            I22.m3736d(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f18046a.zza(bundle);
    }

    public AppMeasurement(InterfaceC8859bU1 interfaceC8859bU1) {
        this.f18046a = new C7881Kx1(interfaceC8859bU1);
    }
}
