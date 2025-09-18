package ru.rustore.sdk.activitylauncher;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Lru/rustore/sdk/activitylauncher/RuStoreActivityLauncher;", "Landroid/app/Activity;", "<init>", "()V", "sdk-public-activitylauncher_release"}, m22268k = 1, m22269mv = {1, 7, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RuStoreActivityLauncher extends Activity {

    /* renamed from: b */
    public static final /* synthetic */ int f42135b = 0;

    /* renamed from: a */
    public ResultReceiver f42136a;

    /* renamed from: a */
    public final void m24539a(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.f42136a;
        if (resultReceiver == null) {
            O90.m5977o("resultReceiver");
            throw null;
        }
        resultReceiver.send(i, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            m24539a(i2, intent != null ? intent.getExtras() : null);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        Object parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        O90.m5967e(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER", ResultReceiver.class);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.f42136a = (ResultReceiver) parcelableExtra;
        if (bundle == null) {
            Intent intent2 = getIntent();
            O90.m5967e(intent2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (i >= 33) {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.class);
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT");
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            try {
                startIntentSenderForResult(((PendingIntent) parcelableExtra2).getIntentSender(), 0, null, 0, 0, 0);
            } catch (ActivityNotFoundException unused) {
                m24539a(2, null);
            } catch (IntentSender.SendIntentException unused2) {
                m24539a(9901, null);
            } catch (Exception unused3) {
                m24539a(9902, null);
            }
        }
    }
}
