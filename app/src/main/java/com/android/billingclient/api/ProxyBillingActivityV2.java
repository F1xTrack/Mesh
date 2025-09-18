package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.BaseGmsClient;
import p000.AbstractActivityC0499Hv;
import p000.AbstractC1198T2;
import p000.BA1;
import p000.C0507I2;
import p000.C10613p90;
import p000.C1135S2;
import p000.InterfaceC0570J2;
import p000.O90;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC0499Hv {
    private AbstractC1198T2 zza;
    private AbstractC1198T2 zzb;
    private ResultReceiver zzc;
    private ResultReceiver zzd;

    @Override // p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new C1135S2(3), new InterfaceC0570J2() { // from class: com.android.billingclient.api.zzcv
            @Override // p000.InterfaceC0570J2
            public final void onActivityResult(Object obj) {
                this.zza.zza((C0507I2) obj);
            }
        });
        this.zzb = registerForActivityResult(new C1135S2(3), new InterfaceC0570J2() { // from class: com.android.billingclient.api.zzcw
            @Override // p000.InterfaceC0570J2
            public final void onActivityResult(Object obj) {
                this.zza.zzb((C0507I2) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzc = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.zzd = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        BA1.m538e("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.zzc = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            AbstractC1198T2 abstractC1198T2 = this.zza;
            O90.m5968f(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            O90.m5967e(intentSender, "pendingIntent.intentSender");
            abstractC1198T2.mo6082a(new C10613p90(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.zzd = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            AbstractC1198T2 abstractC1198T22 = this.zzb;
            O90.m5968f(pendingIntent2, BaseGmsClient.KEY_PENDING_INTENT);
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            O90.m5967e(intentSender2, "pendingIntent.intentSender");
            abstractC1198T22.mo6082a(new C10613p90(intentSender2, null, 0, 0));
        }
    }

    @Override // p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.zzd;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    public final void zza(C0507I2 c0507i2) {
        Intent intent = c0507i2.f4660b;
        int responseCode = BA1.m536c(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = c0507i2.f4659a;
        finish();
    }

    public final void zzb(C0507I2 c0507i2) {
        Intent intent = c0507i2.f4660b;
        int responseCode = BA1.m536c(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = c0507i2.f4659a;
        if (i != -1 || responseCode != 0) {
            StringBuilder sb = new StringBuilder("External offer dialog finished with resultCode: ");
            sb.append(i);
            sb.append(" and billing's responseCode: ");
            sb.append(responseCode);
        }
        finish();
    }
}
