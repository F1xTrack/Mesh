package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.AbstractC8091Oy1;
import p000.BA1;
import p000.C7519Dy1;
import p000.C7729Hz1;
import p000.EnumC10768qM1;
import p000.N12;

@UsedByReflection("PlatformActivityProxy")
@zzi
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
    static final String KEY_PRICE_CHANGE_RESULT_RECEIVER = "result_receiver";
    private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
    private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;
    private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
    private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
    private static final String TAG = "ProxyBillingActivity";
    private ResultReceiver inAppMessageResultReceiver;
    private boolean isFlowFromFirstPartyClient;
    private ResultReceiver priceChangeResultReceiver;
    private boolean sendCancelledBroadcastIfFinished;

    private Intent makeAlternativeBillingIntent(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        EnumC10768qM1 enumC10768qM1Zza = zzbx.zza(intent.getAction());
        C7519Dy1 c7519Dy1 = AbstractC8091Oy1.f8764b;
        Object[] objArr = {enumC10768qM1Zza};
        N12.m5522b(1, objArr);
        intent.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", zzbx.zze(3, new C7729Hz1(1, objArr)).m1587b());
        return intent;
    }

    private Intent makePurchasesUpdatedIntent() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        EnumC10768qM1 enumC10768qM1Zza = zzbx.zza(intent.getAction());
        C7519Dy1 c7519Dy1 = AbstractC8091Oy1.f8764b;
        Object[] objArr = {enumC10768qM1Zza};
        N12.m5522b(1, objArr);
        intent.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", zzbx.zze(3, new C7729Hz1(1, objArr)).m1587b());
        return intent;
    }

    @Override // android.app.Activity
    @zzi
    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intentMakePurchasesUpdatedIntent;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW) {
            int responseCode = BA1.m536c(intent, TAG).getResponseCode();
            if (i2 == -1 && responseCode == 0) {
                responseCode = 0;
            }
            ResultReceiver resultReceiver = this.priceChangeResultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(responseCode, intent != null ? intent.getExtras() : null);
            } else {
                if (intent == null) {
                    intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentMakePurchasesUpdatedIntent = makeAlternativeBillingIntent(string);
                        intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                        intentMakePurchasesUpdatedIntent.putExtras(intent.getExtras());
                        intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                } else {
                    intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                    intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
                    intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(6);
                    builderNewBuilder.setDebugMessage("An internal error occurred.");
                    intentMakePurchasesUpdatedIntent.putExtra("FAILURE_LOGGING_PAYLOAD", zzbx.zzb(22, 2, builderNewBuilder.build()).m1587b());
                    intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                if (i == REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW) {
                    intentMakePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentMakePurchasesUpdatedIntent);
            }
        } else if (i == 101) {
            int i3 = BA1.f614a;
            int i4 = (intent == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
            if (resultReceiver2 != null) {
                resultReceiver2.send(i4, intent != null ? intent.getExtras() : null);
            }
        } else {
            int i5 = BA1.f614a;
        }
        this.sendCancelledBroadcastIfFinished = false;
        finish();
    }

    @Override // android.app.Activity
    @zzi
    public void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            BA1.m538e(TAG, "Launching Play Store billing flow from savedInstanceState");
            this.sendCancelledBroadcastIfFinished = bundle.getBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, false);
            if (bundle.containsKey(KEY_PRICE_CHANGE_RESULT_RECEIVER)) {
                this.priceChangeResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER);
            } else if (bundle.containsKey(KEY_IN_APP_MESSAGE_RESULT_RECEIVER)) {
                this.inAppMessageResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
            }
            this.isFlowFromFirstPartyClient = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        BA1.m538e(TAG, "Launching Play Store billing flow");
        int i = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.isFlowFromFirstPartyClient = true;
                i = REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.priceChangeResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_PRICE_CHANGE_RESULT_RECEIVER);
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.inAppMessageResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
            i = 101;
        } else {
            pendingIntent = null;
        }
        int i2 = i;
        try {
            this.sendCancelledBroadcastIfFinished = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            int i3 = BA1.f614a;
            ResultReceiver resultReceiver = this.priceChangeResultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                    if (this.isFlowFromFirstPartyClient) {
                        intentMakePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
                    intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentMakePurchasesUpdatedIntent);
                }
            }
            this.sendCancelledBroadcastIfFinished = false;
            finish();
        }
    }

    @Override // android.app.Activity
    @zzi
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.sendCancelledBroadcastIfFinished) {
            Intent intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
            intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 1);
            intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentMakePurchasesUpdatedIntent);
        }
    }

    @Override // android.app.Activity
    @zzi
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.priceChangeResultReceiver;
        if (resultReceiver != null) {
            bundle.putParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
        if (resultReceiver2 != null) {
            bundle.putParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER, resultReceiver2);
        }
        bundle.putBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, this.sendCancelledBroadcastIfFinished);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
    }
}
