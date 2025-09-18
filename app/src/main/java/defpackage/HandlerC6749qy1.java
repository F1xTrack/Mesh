package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;

/* renamed from: qy1 */
/* loaded from: classes.dex */
public final class HandlerC6749qy1 extends HandlerC7197tJ0 {
    public final /* synthetic */ QT0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6749qy1(QT0 qt0, Looper looper) {
        super(looper, 4);
        this.b = qt0;
        Looper.getMainLooper();
    }

    @Override // defpackage.HandlerC7197tJ0, android.os.Handler
    public final void handleMessage(Message message) {
        QT0 qt0 = this.b;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new FC1());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C6801rE1) {
                        qt0.g = (C6801rE1) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        qt0.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = QT0.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        qt0.d(extras, strGroup);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
                    synchronized (qt0.a) {
                        int i = 0;
                        while (true) {
                            try {
                                L01 l01 = qt0.a;
                                if (i < l01.c) {
                                    qt0.d(intent2.getExtras(), (String) l01.i(i));
                                    i++;
                                }
                            } finally {
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                    strSubstring = strSubstring.substring(1);
                }
                qt0.d(intent2.putExtra("error", strSubstring).getExtras(), str);
            }
        }
    }
}
