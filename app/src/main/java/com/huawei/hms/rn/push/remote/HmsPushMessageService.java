package com.huawei.hms.rn.push.remote;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.push.SendException;
import com.huawei.hms.rn.push.logger.HMSLogger;
import com.huawei.hms.rn.push.services.MessagingHeadlessService;
import com.huawei.hms.rn.push.utils.ApplicationUtils;
import defpackage.Q20;

/* loaded from: classes.dex */
public class HmsPushMessageService extends HmsMessageService {
    private final String TAG = "HmsPushMessageService";

    @Override // com.huawei.hms.push.HmsMessageService
    public void onDeletedMessages() {
        try {
            HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onDeletedMessages");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageDelivered(String str, Exception exc) {
        try {
            if (exc == null) {
                HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onMessageDelivered");
                HmsMessagePublisher.sendOnMessageDeliveredEvent(str, 0, "");
            } else {
                HmsMessagePublisher.sendOnMessageDeliveredEvent(str, ((SendException) exc).getErrorCode(), exc.getMessage());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Context applicationContext = getApplicationContext();
        if (ApplicationUtils.isApplicationInForeground(applicationContext)) {
            HMSLogger.getInstance(applicationContext).sendPeriodicEvent("onMessageReceived");
            HmsMessagePublisher.sendMessageReceivedEvent(remoteMessage);
            return;
        }
        try {
            HMSLogger.getInstance(applicationContext).sendPeriodicEvent("onMessageReceived");
            Intent intent = new Intent(applicationContext, (Class<?>) MessagingHeadlessService.class);
            intent.putExtra("msg", remoteMessage);
            if (applicationContext.startService(intent) != null) {
                Q20.acquireWakeLockNow(applicationContext);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageSent(String str) {
        try {
            HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onMessageSent");
            HmsMessagePublisher.sendOnMessageSentEvent(str);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str) {
        try {
            super.onNewToken(str);
            HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onNewToken");
            HmsMessagePublisher.sendOnNewTokenEvent(str);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onSendError(String str, Exception exc) {
        try {
            int errorCode = ((SendException) exc).getErrorCode();
            String message = exc.getMessage();
            HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onSendError");
            HmsMessagePublisher.sendOnMessageSentErrorEvent(str, errorCode, message);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onTokenError(Exception exc) {
        try {
            HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onTokenError");
            HmsMessagePublisher.sendTokenErrorEvent(exc);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onTokenError(Exception exc, Bundle bundle) throws PendingIntent.CanceledException {
        try {
            if (exc instanceof ResolvableApiException) {
                PendingIntent resolution = ((ResolvableApiException) exc).getResolution();
                if (resolution != null) {
                    try {
                        resolution.send();
                    } catch (PendingIntent.CanceledException unused) {
                        HMSLogger.getInstance(getApplicationContext()).sendSingleEvent("onTokenError," + exc.getMessage());
                    }
                } else {
                    Intent resolutionIntent = ((ResolvableApiException) exc).getResolutionIntent();
                    if (resolutionIntent != null) {
                        HMSLogger.getInstance(getApplicationContext()).sendSingleEvent("onTokenError,has resolution by intent");
                        resolutionIntent.setFlags(268435456);
                        getApplicationContext().startActivity(resolutionIntent);
                    }
                }
            }
            HmsMessagePublisher.sendMultiSenderTokenErrorEvent(exc, bundle);
            HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onTokenError");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str, Bundle bundle) {
        try {
            super.onNewToken(str, bundle);
            HmsMessagePublisher.sendOnNewMultiSenderTokenEvent(str, bundle);
            HMSLogger.getInstance(getApplicationContext()).sendPeriodicEvent("onNewToken");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
